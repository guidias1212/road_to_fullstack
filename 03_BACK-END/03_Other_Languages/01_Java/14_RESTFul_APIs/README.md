# 3.3.1.14) RESTful APIs

Representational state transfer (REST) is a software architectural style that defines a set of constraints to be used for creating Web services. Web services that conform to the REST architectural style, called RESTful Web services (RWS), provide interoperability between computer systems on the Internet. RESTful Web services allow the requesting systems to access and manipulate textual representations of Web resources by using a uniform and predefined set of stateless operations. Other kinds of Web services, such as SOAP Web services, expose their own arbitrary sets of operations.

<details open>
<summary>Table of Contents</summary>
<br>

[The API we will develop](#h1)

[Project Structure](#h2)

[Creating the model (JPA Entity)](#h3)

[Creating the JPA Repository](#h4)

[Creating the Controller](#h5)

[Retrieve All Contacts (GET /contacts)](#h6)

[Retrieve a Contact by ID (GET /contacts/{id})](#h7)

[Create a new Contact (POST /contacts)](#h8)

[Update a Contact (PUT /contacts)](#h9)

[Remove a Contact (DELETE /contacts/{id})](#h10)

[Initializing the MySQL database](#h11)

[Configuring MySQL Database](#h12)

[Testing the APIs](#h13)

[USEFUL LINKS](#h14)

</details>

Spring Boot provides a very good support to building RESTful Web Services for enterprise applications.

To start, bootstrap a Maven project on:

https://start.spring.io/

With the following setup:

-------------

* **Project:** Maven

* **Language:** Java

* **Spring Boot:** 2.1.7

* **Project Metadata**
	* **Group:** com.RESTful
	* **Artifact:** RESTfulApp
	* **Options**
		* **Name:** RESTfulApp
		* **Description:** Demo project for building a RESTful API with Spring Boot
		* **Package Name:** com.RESTful.RESTfulApp
		* **Packaging:** War
		* **Java:** 12

* **Dependencies:** Spring Data JPA

-------------

<a name="h1"/>

**The API we will develop:**

We will create a Contact Resource exposing three services using RESTFul URIs and HTTP methods:

* Retrieve all contacts - @GetMapping(“/contacts)

* Get details of specific contact - @GetMapping(“/contacts/{id}”)

* Delete a contact - @DeleteMapping(“/contacts/{id}”)

* Create a new contact - @PostMapping(“/contacts)

* Update existing contact details - @PutMapping(“/contacts/{id}”)

<a name="h2"/>

**Project Structure:**

The following screenshot shows the structure of the project we will create:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/RESTful_Project.png)

<a name="h3"/>

**Creating the model (JPA Entity):**

The first class we will create is the JPA Entity. We will create a class Contact with a primary key id:
```
@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private String phone;
	  
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public String getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
```

<a name="h4"/>

**Creating the JPA Repository:**

To easily access the methods to manipulate the Contact table, we just need to create an interface that extends JpaRepository passing the class that represents our model and the type of the primary key as generic arguments:
```
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> { }
```

The JpaRepository interface provides a simple and easy way to access all the CRUD operations.

<a name="h5"/>

**Creating the Controller:**

To access our data, we will also need a Controller:
```
@RestController
@RequestMapping({"/contacts"})
public class ContactController {

  private ContactRepository repository;

  ContactController(ContactRepository contactRepository) {
      this.repository = contactRepository;
  }

  // CRUD methods here
}
```

The **@RestController** annotation contains the **@Controller** and **@ResponseBody** annotations. The **@Controller** annotation represents a class with endpoints and the **@ResponseBody** indicates indicates a method return value should be bound to the web response body.

The **@RequestMapping("/contacts")** indicates that the url of the API in this controller will start with /contacts, so we will be able to access http://localhost:8080/contacts as our endpoint.

Please note we are not using the **@Autowired** annotation to automatically inject the repository. We are using dependency injection through the constructor as it is a recommended best practice.

<a name="h6"/>

**Retrieve All Contacts (GET /contacts):**

```
@GetMapping
public List findAll(){
  return repository.findAll();
}
```

The findAll method is going to retrieve all the records from the database (select * from contact).

As this is a RESTful API, we can omit the **@RequestMapping(value="/contacts", method=RequestMethod.GET)** and simply use **@GetMapping**.

<a name="h7"/>

**Retrieve a Contact by ID (GET /contacts/{id}):**

```
@GetMapping(path = {"/{id}"})
public ResponseEntity<Contact> findById(@PathVariable long id){
  return repository.findById(id)
          .map(record -> ResponseEntity.ok().body(record))
          .orElse(ResponseEntity.notFound().build());
}
```

The **@PathVariable** annotation binds the method parameter id with the path variable \{id}.

we will go to the database and will try to retrieve the contact (select * from contact where id = ?). If a contact is found, we return it (HTTP 200 - OK), else, we return HTTP 404 -Not Found.

<a name="h8"/>

**Create a new Contact (POST /contacts):**

```
@PostMapping
public Contact create(@RequestBody Contact contact){
    return repository.save(contact);
}
```

The **@RequestBody** annotation indicates a method parameter should be bound to the body of the web request. This means the method expects the following content from que request (in JSON format):
```
{
    "name": "Java",
    "email": "java@email.com",
    "phone": "(111) 111-1111"
}
```

Spring will automatically parse the request and create a variable of type Contact with its contents. Then, it will save it. The id of the contact will be null, therefore the save method will perform an insert into the Contact table.

<a name="h9"/>

**Update a Contact (PUT /contacts):**

```
@PutMapping(value="/{id}")
  public ResponseEntity<Contact> update(@PathVariable("id") long id,
                                        @RequestBody Contact contact){
    return repository.findById(id)
        .map(record -> {
            record.setName(contact.getName());
            record.setEmail(contact.getEmail());
            record.setPhone(contact.getPhone());
            Contact updated = repository.save(record);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
  }
```

In order to update a contact, we need to inform its ID in the path variable. We also need to pass the updated contact.

Next, we will try to find the contact to be updated. If the contact is found, we update the values from the record from the database with the values passed as parameter to the method and save it. In this case, as the record exists, an update statement will performed in the contact table. We also return the updated contact. In case the contact is not found, it returns HTTP 404.

<a name="h10"/>

**Remove a Contact (DELETE /contacts/{id}):**

```
@DeleteMapping(path ={"/{id}"})
  public ResponseEntity<?> delete(@PathVariable("id") long id) {
    return repository.findById(id)
        .map(record -> {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
  }
```

To remove a contact, we first need to retrieve it from the database. In case it is found, we delete it passing its ID and return HTTP 200 to indicate the deletion was performed successfully. In case the contact is not found, we return HTTP 404.

<a name="h11"/>

**Initializing the MySQL database:**

As a last step, we are going to create a MySQL contact table in the restfulapp database:
```
CREATE TABLE `restfulapp`.`contact` (
  `id` INT(11) NOT NULL **AUTO_INCREMENT**,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
```

<a name="h12"/>

**Configuring MySQL Database:**

In order for our code to be able to connect to a MySQL database, we also need to inform the connection details. We are going to add these details inside /RESTfulApp/src/main/resources/application.properties:
```
## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url=jdbc:mysql://localhost:3306/restfulapp?useTimezone=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=adminadmin

# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
```

<a name="h13"/>

**Testing the APIs:**

We can test the API using Postman.

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/postman_POST.png)

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/postman_GETall.png)

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/postman_GETone.png)

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/postman_PUT.png)

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/postman_DELETE.png)

<a name="h14"/>

**USEFUL LINKS**

**REST Wikipedia:**

https://en.wikipedia.org/wiki/Representational_state_transfer

**RESTful API with Spring Boot:**

https://loiane.com/2019/01/crud-rest-api-using-spring-boot-2-hibernate-jpa-and-mysql/

https://www.tutorialspoint.com/spring_boot/spring_boot_building_restful_web_services.htm

**Postman:**

https://www.getpostman.com/
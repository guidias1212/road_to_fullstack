# 3.3.1.12) No SQL Database

NoSQL databases are built to allow the insertion of data without a predefined schema. That makes it easy to make significant application changes in real-time, without worrying about service interruptions – which means development is faster, code integration is more reliable, and less database administrator time is needed.

MongoDB is a cross-platform document-oriented database program. Classified as a NoSQL database program, MongoDB uses JSON-like documents with schema. MongoDB is developed by MongoDB Inc.

<details open>
<summary>Table of Contents</summary>
<br>

[Terminology](#h1)

[Sample Document](#h2)

[Advantages](#h3)

[Data Modeling](#h4)

[USEFUL LINKS](#hx)

</details>

<a name="h1"/>

**Terminology:**

* **Database:** Database is a physical container for collections. Each database gets its own set of files on the file system. A single MongoDB server typically has multiple databases.

* **Collection:** Collection is a group of MongoDB documents. It is the equivalent of an RDBMS table. A collection exists within a single database. Collections do not enforce a schema. Documents within a collection can have different fields. Typically, all documents in a collection are of similar or related purpose.

* **Document:** A document is a set of key-value pairs. Documents have dynamic schema. Dynamic schema means that documents in the same collection do not need to have the same set of fields or structure, and common fields in a collection's documents may hold different types of data.

| **RDBMS** | **MongoDB** |
| --- | --- |
| Database | Database |
| Table | Collection |
| Tuple/Row | Document |
| column | Field |
| Table Join | Embedded Documents |
| Primary Key | Primary Key (Default key _id provided by mongodb itself) |


<a name="h2"/>

**Sample Document:**

Following example shows the document structure of a blog site, which is simply a comma separated key value pair:
```
{
   _id: ObjectId(7df78ad8902c)
   title: 'MongoDB Overview', 
   description: 'MongoDB is no sql database',
   by: 'Guilherme Dias',
   url: 'http://www.github.com',
   tags: ['mongodb', 'database', 'NoSQL'],
   likes: 100, 
   comments: [	
      {
         user:'user1',
         message: 'My first comment',
         dateCreated: new Date(2011,1,20,2,15),
         like: 0 
      },
      {
         user:'user2',
         message: 'My second comments',
         dateCreated: new Date(2011,1,25,7,45),
         like: 5
      }
   ]
}
```

_id is a 12 bytes hexadecimal number which assures the uniqueness of every document. You can provide _id while inserting the document. If you don’t provide then MongoDB provides a unique id for every document. These 12 bytes first 4 bytes for the current timestamp, next 3 bytes for machine id, next 2 bytes for process id of MongoDB server and remaining 3 bytes are simple incremental VALUE.

<a name="h3"/>

**Advantages:**

Any relational database has a typical schema design that shows number of tables and the relationship between these tables. While in MongoDB, there is no concept of relationship.

Advantages of MongoDB over RDBMS:

* Schema less − MongoDB is a document database in which one collection holds different documents. Number of fields, content and size of the document can differ from one document to another.

* Structure of a single object is clear.

* No complex joins.

* Deep query-ability. MongoDB supports dynamic queries on documents using a document-based query language that's nearly as powerful as SQL.

* Tuning.

* Ease of scale-out − MongoDB is easy to scale.

* Conversion/mapping of application objects to database objects not needed.

* Uses internal memory for storing the (windowed) working set, enabling faster access of data.

Where to Use MongoDB?

* Big Data

* Content Management and Delivery

* Mobile and Social Infrastructure

* User Data Management

* Data Hub

<a name="h4"/>

**Data Modeling:**

Data in MongoDB has a flexible schema.documents in the same collection. They do not need to have the same set of fields or structure, and common fields in a collection’s documents may hold different types of data.

Some considerations while designing Schema in MongoDB:

* Design your schema according to user requirements.

* Combine objects into one document if you will use them together. Otherwise separate them (but make sure there should not be need of joins).

* Duplicate the data (but limited) because disk space is cheap as compare to compute time.

* Do joins while write, not on read.

* Optimize your schema for most frequent use cases.

* Do complex aggregation in the schema.

Example:

Suppose a client needs a database design for his blog/website and see the differences between RDBMS and MongoDB schema design. Website has the following requirements.

* Every post has the unique title, description and url.

* Every post can have one or more tags.

* Every post has the name of its publisher and total number of likes.

* Every post has comments given by users along with their name, message, data-time and likes.

* On each post, there can be zero or more comments.

In RDBMS schema, design for above requirements will have minimum three tables:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/rdbms.png)

<a name="hx"/>

**USEFUL LINKS**

**MongoDB Environment Setup:**

https://www.tutorialspoint.com/mongodb/mongodb_environment.htm

**MongoDB Wiki and History:**

https://en.wikipedia.org/wiki/MongoDB

**MongoDB tutorial:**

https://www.tutorialspoint.com/mongodb/index.htm

**NoSQL:**

https://www.mongodb.com/nosql-inline
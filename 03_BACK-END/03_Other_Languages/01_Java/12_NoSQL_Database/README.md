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

[Create Database](#h5)

[Drop Database](#h6)

[Create Collection](#h7)

[Drop Collection](#h8)

[Data Types](#h9)

[Insert Document](#h10)

[Query Document](#11)

[Update Document](#h12)

[Delete Document](#h13)

[Projection](#h14)

[Limiting Records](#h15)

[Sorting Records](#h16)

[Indexing](#h17)

[Aggregation](#h18)

[Replication](#h19)

[Sharding](#h20)

[Create Backup](#h21)

[Deployment](#h22)

[Java](#h23)

[Relationships](#h24)

[Database References](#h25)

[Covered Queries](#h26)

[Analyzing Queries](#h27)

[Atomic Operations](#h28)

[Advanced Indexing](#h29)

[Indexing Limitations](#h30)

[ObjectId](#h31)

[Map Reduce](#h32)

[Text Search](#h33)

[Regular Expression](#h34)

[GridFS](#h35)

[Capped Collections](#h36)

[Auto-Increment Sequence](#h37)

[USEFUL LINKS](#h38)

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

While in MongoDB schema, design will have one collection post and the following structure:
```
{
   _id: POST_ID
   title: TITLE_OF_POST, 
   description: POST_DESCRIPTION,
   by: POST_BY,
   url: URL_OF_POST,
   tags: [TAG1, TAG2, TAG3],
   likes: TOTAL_LIKES, 
   comments: [	
      {
         user:'COMMENT_BY',
         message: TEXT,
         dateCreated: DATE_TIME,
         like: LIKES 
      },
      {
         user:'COMMENT_BY',
         message: TEXT,
         dateCreated: DATE_TIME,
         like: LIKES
      }
   ]
}
```

So while showing the data, in RDBMS you need to join three tables and in MongoDB, data will be shown from one collection only.

```
{
   _id: POST_ID
   title: TITLE_OF_POST, 
   description: POST_DESCRIPTION,
   by: POST_BY,
   url: URL_OF_POST,
   tags: [TAG1, TAG2, TAG3],
   likes: TOTAL_LIKES, 
   comments: [	
      {
         user:'COMMENT_BY',
         message: TEXT,
         dateCreated: DATE_TIME,
         like: LIKES 
      },
      {
         user:'COMMENT_BY',
         message: TEXT,
         dateCreated: DATE_TIME,
         like: LIKES
      }
   ]
}
```

So while showing the data, in RDBMS you need to join three tables and in MongoDB, data will be shown from one collection only.

<a name="h5"/>

**Create Database:**

The **use** Command

MongoDB use DATABASE_NAME is used to create database. The command will create a new database if it doesn't exist, otherwise it will return the existing database:
```
use DATABASE_NAME
```

To check your currently selected database, use the command **db**:
```
db
```

If you want to check your databases list, use the command **show dbs**:
```
show dbs
```

To display database, you need to insert at least one document into it.

In MongoDB default database is test. If you didn't create any database, then collections will be stored in test database.

<a name="h6"/>

**Drop Database:**

MongoDB **db.dropDatabase()** command is used to drop a existing database:
```
db.dropDatabase()
```

This will delete the selected database. If you have not selected any database, then it will delete default 'test' database.

Example:

First, check the list of available databases by using the command, show dbs.
```
>show dbs
local      0.78125GB
mydb       0.23012GB
test       0.23012GB
>
```

If you want to delete new database <mydb>:
```
>use mydb
switched to db mydb
>db.dropDatabase()
>{ "dropped" : "mydb", "ok" : 1 }
>
```

Now check list of databases:
```
>show dbs
local      0.78125GB
test       0.23012GB
>
```

<a name="h7"/>

**Create Collection:**

MongoDB **db.createCollection(name, options)** is used to create collection.
```
db.createCollection(name, options)
```

In the command, name is name of collection to be created. Options is a document and is used to specify configuration of collection.

| **Parameter** | **Type** | **Description** |
| --- | --- | --- |
| Name | String | Name of the collection to be created |
| Options | Document | (Optional) Specify options about memory size and indexing |


Options parameter is optional, so you need to specify only the name of the collection. Following is the list of options you can use:

| **Field** | **Type** | **Description** |
| --- | --- | --- |
| capped | Boolean | (Optional) If true, enables a capped collection. Capped collection is a fixed size collection that automatically overwrites its oldest entries when it reaches its maximum size. If you specify true, you need to specify size parameter also. |
| autoIndexId | Boolean | (Optional) If true, automatically create index on _id field.s Default value is false. |
| size | number | (Optional) Specifies a maximum size in bytes for a capped collection. If capped is true, then you need to specify this field also. |
| max | number | (Optional) Specifies the maximum number of documents allowed in the capped collection. |

<a name="h8"/>

**Drop Collection:**

<a name="h9"/>

**Data Types:**

<a name="h10"/>

**Insert Document:**

<a name="h11"/>

**Query Document:**

<a name="h12"/>

**Update Document:**

<a name="h13"/>

**Delete Document:**

<a name="h14"/>

**Projection:**

<a name="h15"/>

**Limiting Records:**

<a name="h16"/>

**Sorting Records:**

<a name="h17"/>

**Indexing:**

<a name="h18"/>

**Aggregation:**

<a name="h19"/>

**Replication:**

<a name="h20"/>

**Sharding:**

<a name="h21"/>

**Create Backup:**

<a name="h22"/>

**Deployment:**

<a name="h23"/>

**Java:**

<a name="h24"/>

**Relationships:**

<a name="h25"/>

**Database References:**

<a name="h26"/>

**Covered Queries:**

<a name="h27"/>

**Analyzing Queries:**

<a name="h28"/>

**Atomic Operations:**

<a name="h29"/>

**Advanced Indexing:**

<a name="h30"/>

**Indexing Limitations:**

<a name="h31"/>

**ObjectId:**

<a name="h32"/>

**Map Reduce:**

<a name="h33"/>

**Text Search:**

<a name="h34"/>

**Regular Expression:**

<a name="h35"/>

**GridFS:**

<a name="h36"/>

**Capped Collections:**

<a name="h37"/>

**Auto-Increment Sequence:**

<a name="h38"/>

**USEFUL LINKS**

**MongoDB Environment Setup:**

https://www.tutorialspoint.com/mongodb/mongodb_environment.htm

**MongoDB Wiki and History:**

https://en.wikipedia.org/wiki/MongoDB

**MongoDB tutorial:**

https://www.tutorialspoint.com/mongodb/index.htm

**NoSQL:**

https://www.mongodb.com/nosql-inline
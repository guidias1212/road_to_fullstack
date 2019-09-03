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

While inserting the document, MongoDB first checks size field of capped collection, then it checks max field.

Basic syntax of createCollection() method without options:
```
>use test
switched to db test
>db.createCollection("mycollection")
{ "ok" : 1 }
>
```

You can check the created collection by using the command show collections:
```
>show collections
mycollection
system.indexes
```

The following example shows the syntax of createCollection() method with few important options:
```
>db.createCollection("mycol", { capped : true, autoIndexId : true, size : 
   6142800, max : 10000 } )
{ "ok" : 1 }
>
```

In MongoDB, you don't need to create collection. MongoDB creates collection automatically, when you insert some document:
```
>db.COLLECTION_NAME.insert({"name" : "COLLECTION_NAME"})
>show collections
mycol
mycollection
system.indexes
COLLECTION_NAME
>
```

<a name="h8"/>

**Drop Collection:**

MongoDB's **db.collection.drop()** is used to drop a collection from the database:
```
db.COLLECTION_NAME.drop()
```

Example

First, check the available collections into your database mydb.
```
>use mydb
switched to db mydb
>show collections
mycol
mycollection
system.indexes
COLLECTION_NAME
>
```

Now drop the collection with the name COLLECTION_NAME:
```
>db.COLLECTION_NAME.drop()
true
>
```

Again check the list of collections into database:
```
>show collections
mycol
system.indexes
tutorialspoint
>
```

drop() method will return true, if the selected collection is dropped successfully, otherwise it will return false.

<a name="h9"/>

**Data Types:**

MongoDB supports many datatypes. Some of them are:

* **String** − This is the most commonly used datatype to store the data. String in MongoDB must be UTF-8 valid.

* **Integer** − This type is used to store a numerical value. Integer can be 32 bit or 64 bit depending upon your server.

* **Boolean** − This type is used to store a boolean (true/ false) value.

* **Double** − This type is used to store floating point values.

* **Min/ Max keys** − This type is used to compare a value against the lowest and highest BSON elements.

* **Arrays** − This type is used to store arrays or list or multiple values into one key.

* **Timestamp** − ctimestamp. This can be handy for recording when a document has been modified or added.

* **Object** − This datatype is used for embedded documents.

* **Null** − This type is used to store a Null value.

* **Symbol** − This datatype is used identically to a string; however, it's generally reserved for languages that use a specific symbol type.

* **Date** − This datatype is used to store the current date or time in UNIX time format. You can specify your own date time by creating object of Date and passing day, month, year into it.

* **Object ID** − This datatype is used to store the document’s ID.

* **Binary data** − This datatype is used to store binary data.

* **Code** − This datatype is used to store JavaScript code into the document.

* **Regular expression** − This datatype is used to store regular expression.

<a name="h10"/>

**Insert Document:**

To insert data into MongoDB collection, you need to use MongoDB's **insert()** or **save()** method:
```
db.COLLECTION_NAME.insert(document)
```

Example:
```
>db.mycol.insert({
   _id: ObjectId(7df78ad8902c),
   title: 'MongoDB Overview', 
   description: 'MongoDB is no sql database',
   by: 'Guilherme Dias',
   url: 'http://www.github.com',
   tags: ['mongodb', 'database', 'NoSQL'],
   likes: 100
})
```

Here mycol is our collection name. If the collection doesn't exist in the database, then MongoDB will create this collection and then insert a document into it.

In the inserted document, if we don't specify the _id parameter, then MongoDB assigns a unique ObjectId for this document.

To insert multiple documents in a single query, you can pass an array of documents in insert() command:
```
>db.post.insert([
   {
      title: 'MongoDB Overview', 
      description: 'MongoDB is no sql database',
      by: 'Guilherme Dias',
      url: 'http://www.github.com',
      tags: ['mongodb', 'database', 'NoSQL'],
      likes: 100
   },
	
   {
      title: 'NoSQL Database', 
      description: "NoSQL database doesn't have tables",
      by: 'Guilherme Dias',
      url: 'http://www.github.com',
      tags: ['mongodb', 'database', 'NoSQL'],
      likes: 20, 
      comments: [	
         {
            user:'user1',
            message: 'My first comment',
            dateCreated: new Date(2013,11,10,2,35),
            like: 0 
         }
      ]
   }
])
```

To insert the document you can use db.post.save(document) also. If you don't specify _id in the document then save() method will work same as insert() method. If you specify _id then it will replace whole data of document containing _id as specified in save() method.

<a name="h11"/>

**Query Document:**

To query data from MongoDB collection, you need to use MongoDB's **find()** method:
```
db.COLLECTION_NAME.find()
```

**find()** method will display all the documents in a non-structured way.

To display the results in a formatted way, you can use **pretty()** method:
```
db.mycol.find().pretty()
```

Example:
```
>db.mycol.find().pretty()
{
   "_id": ObjectId(7df78ad8902c),
   "title": "MongoDB Overview", 
   "description": "MongoDB is no sql database",
   "by": "tutorials point",
   "url": "http://www.tutorialspoint.com",
   "tags": ["mongodb", "database", "NoSQL"],
   "likes": "100"
}
>
```

Apart from find() method, there is **findOne()** method, that returns only one document.

RDBMS Where Clause Equivalents in MongoDB

To query the document on the basis of some condition, you can use following operations:

| **Operation** | **Syntax** | **Example** | **RDBMS Equivalent** |
| --- | --- | --- | --- |
| Equality | {<key>:<value>} | db.mycol.find({"by":"guilherme dias"}).pretty() | where by = 'guilherme dias' |
| Less Than | {<key>:{$lt:<value>}} | db.mycol.find({"likes":{$lt:50}}).pretty() | where likes < 50 |
| Less Than Equals | {<key>:{$lte:<value>}} | db.mycol.find({"likes":{$lte:50}}).pretty() | where likes <= 50 |
| Greater Than | {<key>:{$gt:<value>}} | db.mycol.find({"likes":{$gt:50}}).pretty() | where likes > 50 |
| Greater Than Equals | {<key>:{$gte:<value>}} | db.mycol.find({"likes":{$gte:50}}).pretty() | where likes >= 50 |
| Not Equals | {<key>:{$ne:<value>}} | db.mycol.find({"likes":{$ne:50}}).pretty() | where likes != 50 |


**AND** in MongoDB

Syntax:

In the **find()** method, if you pass multiple keys by separating them by ',' then MongoDB treats it as **AND** condition:
```
>db.mycol.find(
   {
      $and: [
         {key1: value1}, {key2:value2}
      ]
   }
).pretty()
```

Example:

Following example will show all the tutorials written by 'guilherme dias' and whose title is 'MongoDB Overview':
```
>db.mycol.find({$and:[{"by":"guilherme dias"},{"title": "MongoDB Overview"}]}).pretty() {
   "_id": ObjectId(7df78ad8902c),
   "title": "MongoDB Overview", 
   "description": "MongoDB is no sql database",
   "by": "guilherme dias",
   "url": "http://www.github.com",
   "tags": ["mongodb", "database", "NoSQL"],
   "likes": "100"
}
```

For the above given example, equivalent where clause will be ' where by = 'guilherme dias' AND title = 'MongoDB Overview' '. You can pass any number of key, value pairs in find clause.

**OR** in MongoDB

Syntax:

To query documents based on the OR condition, you need to use $or keyword:
```
>db.mycol.find(
   {
      $or: [
         {key1: value1}, {key2:value2}
      ]
   }
).pretty()
```

Example:

Following example will show all the tutorials written by 'guilherme dias' or whose title is 'MongoDB Overview'.
```
>db.mycol.find({$or:[{"by":"guilherme dias"},{"title": "MongoDB Overview"}]}).pretty()
{
   "_id": ObjectId(7df78ad8902c),
   "title": "MongoDB Overview", 
   "description": "MongoDB is no sql database",
   "by": "guilherme dias",
   "url": "http://www.github.com",
   "tags": ["mongodb", "database", "NoSQL"],
   "likes": "100"
}
>
```

Using AND and OR Together

Example:

The following example will show the documents that have likes greater than 10 and whose title is either 'MongoDB Overview' or by is 'guilherme dias'. Equivalent SQL where clause is 'where likes>10 AND (by = 'tutorials point' OR title = 'MongoDB Overview')'
```
>db.mycol.find({"likes": {$gt:10}, $or: [{"by": "tutorials point"},
   {"title": "MongoDB Overview"}]}).pretty()
{
   "_id": ObjectId(7df78ad8902c),
   "title": "MongoDB Overview", 
   "description": "MongoDB is no sql database",
   "by": "tutorials point",
   "url": "http://www.tutorialspoint.com",
   "tags": ["mongodb", "database", "NoSQL"],
   "likes": "100"
}
>
```

<a name="h12"/>

**Update Document:**

MongoDB's **update()** and **save()** methods are used to update document into a collection. The **update()** method updates the values in the existing document while the **save()** method replaces the existing document with the document passed in **save()** method:
```
db.COLLECTION_NAME.update(SELECTION_CRITERIA, UPDATED_DATA)
```

Example
Consider the mycol collection has the following data:
```
{ "_id" : ObjectId(5983548781331adf45ec5), "title":"MongoDB Overview"}
{ "_id" : ObjectId(5983548781331adf45ec6), "title":"NoSQL Overview"}
{ "_id" : ObjectId(5983548781331adf45ec7), "title":"Java Overview"}
```

The following example will set the new title 'New MongoDB Tutorial' of the documents whose title is 'MongoDB Overview':
```
>db.mycol.update({'title':'MongoDB Overview'},{$set:{'title':'New MongoDB Tutorial'}})
>db.mycol.find()
{ "_id" : ObjectId(5983548781331adf45ec5), "title":"New MongoDB Tutorial"}
{ "_id" : ObjectId(5983548781331adf45ec6), "title":"NoSQL Overview"}
{ "_id" : ObjectId(5983548781331adf45ec7), "title":"Java Overview"}
>
```

By default, MongoDB will update only a single document. To update multiple documents, you need to set a parameter 'multi' to true:
```
>db.mycol.update({'title':'MongoDB Overview'},
   {$set:{'title':'New MongoDB Tutorial'}},{multi:true})
```

MongoDB **save()** Method:

The **save()** method replaces the existing document with the new document passed in the save() method:
```
db.COLLECTION_NAME.save({_id:ObjectId(),NEW_DATA})
```

Example:

Following example will replace the document with the _id '5983548781331adf45ec5':
```
>db.mycol.save(
   {
      "_id" : ObjectId(5983548781331adf45ec5), "title":"Guilherme Dias New Topic",
      "by":"Guilherme Dias"
   }
)
>db.mycol.find()
{ "_id" : ObjectId(5983548781331adf45ec5), "title":"Guilherme Dias New Topic",
   "by":"Tutorials Point"}
{ "_id" : ObjectId(5983548781331adf45ec6), "title":"NoSQL Overview"}
{ "_id" : ObjectId(5983548781331adf45ec7), "title":"Guilherme Dias Overview"}
>
```

<a name="h13"/>

**Delete Document:**

MongoDB's **remove()** method is used to remove a document from the collection. **remove()** method accepts two parameters. One is deletion criteria and second is justOne flag:

* **deletion criteria** − (Optional) deletion criteria according to documents will be removed.

* **justOne** − (Optional) if set to true or 1, then remove only one document.
```
>db.COLLECTION_NAME.remove(DELLETION_CRITTERIA)
```

Example:

Consider the mycol collection has the following data:
```
{ "_id" : ObjectId(5983548781331adf45ec5), "title":"MongoDB Overview"}
{ "_id" : ObjectId(5983548781331adf45ec6), "title":"NoSQL Overview"}
{ "_id" : ObjectId(5983548781331adf45ec7), "title":"Guilherme Dias Overview"}
```

Following example will remove all the documents whose title is 'MongoDB Overview'.
```
>db.mycol.remove({'title':'MongoDB Overview'})
>db.mycol.find()
{ "_id" : ObjectId(5983548781331adf45ec6), "title":"NoSQL Overview"}
{ "_id" : ObjectId(5983548781331adf45ec7), "title":"Guilherme Dias Overview"}
>
```

Remove Only One:

If there are multiple records and you want to delete only the first record, then set **justOne** parameter in **remove()** method:
```
>db.COLLECTION_NAME.remove(DELETION_CRITERIA,1)
```

Remove All Documents:

If you don't specify deletion criteria, then MongoDB will delete whole documents from the collection. This is equivalent of SQL's truncate command:
```
>db.mycol.remove({})
>db.mycol.find()
>
```

<a name="h14"/>

**Projection:**

In MongoDB, projection means selecting only the necessary data rather than selecting whole of the data of a document. If a document has 5 fields and you need to show only 3, then select only 3 fields from them.

MongoDB's **find()** method accepts second optional parameter that is list of fields that you want to retrieve. In MongoDB, when you execute **find()** method, then it displays all fields of a document. To limit this, you need to set a list of fields with value 1 or 0. 1 is used to show the field while 0 is used to hide the fields.
```
>db.COLLECTION_NAME.find({},{KEY:1})
```

Example:

Consider the collection mycol has the following data:
```
{ "_id" : ObjectId(5983548781331adf45ec5), "title":"MongoDB Overview"}
{ "_id" : ObjectId(5983548781331adf45ec6), "title":"NoSQL Overview"}
{ "_id" : ObjectId(5983548781331adf45ec7), "title":"Guilherme Dias Overview"}
```

Following example will display the title of the document while querying the document.
```
>db.mycol.find({},{"title":1,_id:0})
{"title":"MongoDB Overview"}
{"title":"NoSQL Overview"}
{"title":"Guilherme Dias Overview"}
>
```

Note that the _id field is always displayed while executing find() method, if you don't want this field, then you need to set it as 0.

<a name="h15"/>

**Limiting Records:**

To limit the records in MongoDB, you need to use **limit()** method. The method accepts one number type argument, which is the number of documents that you want to be displayed:
```
>db.COLLECTION_NAME.find().limit(NUMBER)
```

Example:

Consider the collection myycol has the following data:
```
{ "_id" : ObjectId(5983548781331adf45ec5), "title":"MongoDB Overview"}
{ "_id" : ObjectId(5983548781331adf45ec6), "title":"NoSQL Overview"}
{ "_id" : ObjectId(5983548781331adf45ec7), "title":"Guilherme Dias Overview"}
```

Following example will display only two documents while querying the document:
```
>db.mycol.find({},{"title":1,_id:0}).limit(2)
{"title":"MongoDB Overview"}
{"title":"NoSQL Overview"}
>
```

If you don't specify the number argument in limit() method then it will display all documents from the collection.

MongoDB Skip() Method

Apart from **limit()** method, there is one more method **skip()** which also accepts number type argument and is used to skip the number of documents.

The basic syntax of skip() method is as follows:
```
>db.COLLECTION_NAME.find().limit(NUMBER).skip(NUMBER)
```

Example:

Following example will display only the second document:
```
>db.mycol.find({},{"title":1,_id:0}).limit(1).skip(1)
{"title":"NoSQL Overview"}
>
```

Please note, the default value in skip() method is 0.

<a name="h16"/>

**Sorting Records:**

To sort documents in MongoDB, you need to use **sort()** method. The method accepts a document containing a list of fields along with their sorting order. To specify sorting order 1 and -1 are used. 1 is used for ascending order while -1 is used for descending order.
```
>db.COLLECTION_NAME.find().sort({KEY:1})
```

Example:

Consider the collection myycol has the following data:
```
{ "_id" : ObjectId(5983548781331adf45ec5), "title":"MongoDB Overview"}
{ "_id" : ObjectId(5983548781331adf45ec6), "title":"NoSQL Overview"}
{ "_id" : ObjectId(5983548781331adf45ec7), "title":"Tutorials Point Overview"}
```

Following example will display the documents sorted by title in the descending order:
```
>db.mycol.find({},{"title":1,_id:0}).sort({"title":-1})
{"title":"Guilherme Dias Overview"}
{"title":"NoSQL Overview"}
{"title":"MongoDB Overview"}
>
```

Please note, if you don't specify the sorting preference, then sort() method will display the documents in ascending order.

<a name="h17"/>

**Indexing:**

Indexes support the efficient resolution of queries. Without indexes, MongoDB must scan every document of a collection to select those documents that match the query statement. This scan is highly inefficient and require MongoDB to process a large volume of data.

Indexes are special data structures, that store a small portion of the data set in an easy-to-traverse form. The index stores the value of a specific field or set of fields, ordered by the value of the field as specified in the index.

To create an index you need to use **ensureIndex()** method of MongoDB.
```
>db.COLLECTION_NAME.ensureIndex({KEY:1})
```

Here key is the name of the field on which you want to create index and 1 is for ascending order. To create index in descending order you need to use -1.

Example:
```
>db.mycol.ensureIndex({"title":1})
>
```

In **ensureIndex()** method you can pass multiple fields, to create index on multiple fields.
```
>db.mycol.ensureIndex({"title":1,"description":-1})
>
```

**ensureIndex()** method also accepts list of options (which are optional):
| **Parameter** | **Type** | **Description** |
| --- | --- | --- |
| background | Boolean | Builds the index in the background so that building an index does not block other database activities. Specify true to build in the background. The default value is false. |
| unique | Boolean | Creates a unique index so that the collection will not accept insertion of documents where the index key or keys match an existing value in the index. Specify true to create a unique index. The default value is false. |
| name | string | The name of the index. If unspecified, MongoDB generates an index name by concatenating the names of the indexed fields and the sort order. |
| dropDups | Boolean | Creates a unique index on a field that may have duplicates. MongoDB indexes only the first occurrence of a key and removes all documents from the collection that contain subsequent occurrences of that key. Specify true to create unique index. The default value is false. |
| sparse | Boolean | If true, the index only references documents with the specified field. These indexes use less space but behave differently in some situations (particularly sorts). The default value is false. |
| expireAfterSeconds | integer | Specifies a value, in seconds, as a TTL to control how long MongoDB retains documents in this collection. |
| v | index version | The index version number. The default index version depends on the version of MongoDB running when creating the index. |
| weights | document | The weight is a number ranging from 1 to 99,999 and denotes the significance of the field relative to the other indexed fields in terms of the score. |
| default_language | string | For a text index, the language that determines the list of stop words and the rules for the stemmer and tokenizer. The default value is english. |
| language_override | string | For a text index, specify the name of the field in the document that contains, the language to override the default language. The default value is language. |

<a name="h18"/>

**Aggregation:**

Aggregations operations process data records and return computed results. Aggregation operations group values from multiple documents together, and can perform a variety of operations on the grouped data to return a single result. In SQL count() and with group by is an equivalent of mongodb aggregation.

For the aggregation in MongoDB, you should use **aggregate()** method.
```
>db.COLLECTION_NAME.aggregate(AGGREGATE_OPERATION)
```

Example:

In the collection you have the following data:
```
{
   _id: ObjectId(7df78ad8902c)
   title: 'MongoDB Overview', 
   description: 'MongoDB is no sql database',
   by_user: 'Guilherme Dias',
   url: 'http://www.github.com',
   tags: ['mongodb', 'database', 'NoSQL'],
   likes: 100
},
{
   _id: ObjectId(7df78ad8902d)
   title: 'NoSQL Overview', 
   description: 'No sql database is very fast',
   by_user: 'Guilherme Dias',
   url: 'http://www.github.com',
   tags: ['mongodb', 'database', 'NoSQL'],
   likes: 10
},
{
   _id: ObjectId(7df78ad8902e)
   title: 'Neo4j Overview', 
   description: 'Neo4j is no sql database',
   by_user: 'Neo4j',
   url: 'http://www.neo4j.com',
   tags: ['neo4j', 'database', 'NoSQL'],
   likes: 750
},
```

Now from the above collection, if you want to display a list stating how many tutorials are written by each user, then you will use the following **aggregate()** method:
```
> db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$sum : 1}}}])
{
   "result" : [
      {
         "_id" : "Guilherme Dias",
         "num_tutorial" : 2
      },
      {
         "_id" : "Neo4j",
         "num_tutorial" : 1
      }
   ],
   "ok" : 1
}
>
```

Sql equivalent query for the above use case will be **SELECT by_user, count() FROM mycol GROUP by by_user**.

In the above example, we have grouped documents by field by_user and on each occurrence of by_user previous value of sum is incremented. Following is a list of available aggregation expressions:

| **Expression** | **Description** | **Example** |
| --- | --- | --- |
| $sum | Sums up the defined value from all documents in the collection. | db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$sum : "$likes"}}}]) |
| $avg | Calculates the average of all given values from all documents in the collection. | db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$avg : "$likes"}}}]) |
| $min | Gets the minimum of the corresponding values from all documents in the collection. | db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$min : "$likes"}}}]) |
| $max | Gets the maximum of the corresponding values from all documents in the collection. | db.mycol.aggregate([{$group : {_id : "$by_user", num_tutorial : {$max : "$likes"}}}]) |
| $push | Inserts the value to an array in the resulting document. | db.mycol.aggregate([{$group : {_id : "$by_user", url : {$push: "$url"}}}]) |
| $addToSet | 	Inserts the value to an array in the resulting document but does not create duplicates. | db.mycol.aggregate([{$group : {_id : "$by_user", url : {$addToSet : "$url"}}}]) |
| $first | Gets the first document from the source documents according to the grouping. Typically this makes only sense together with some previously applied “$sort”-stage. | db.mycol.aggregate([{$group : {_id : "$by_user", first_url : {$first : "$url"}}}]) |
| $last | Gets the last document from the source documents according to the grouping. Typically this makes only sense together with some previously applied “$sort”-stage. | db.mycol.aggregate([{$group : {_id : "$by_user", last_url : {$last : "$url"}}}]) |

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
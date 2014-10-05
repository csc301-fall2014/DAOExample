# Data Access Object

This repo is an example of the DAO (Data Access Object) design pattern in the context of Exercise 1.
It is very similar to what we talked about in class during week 4.


## DAO

We use the DAO pattern when:
 * We want to use multiple data storages.
 * We want to write code that will work for all of them.

That is, we abstract the details of the underlying data storage, and define a unified way of accessing the data.

-----

In class, I talked about in-memory vs. remote-database DAO implementation.
In this example, I chose to implement something a little simpler:
 1. In-memory DAO - Keeps everything in memory.
 2. Local-file DAO - Data is saved/loaded to/from a local file.




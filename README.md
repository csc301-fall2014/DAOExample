# Data Access Object

This repo is an example of the DAO (Data Access Object) design pattern in the context of Exercise 1.
It is very similar to what we talked about in class on Sept 29.


## DAO

We use the DAO pattern when:
 * We want to use multiple data storages.
 * We want to write code that will work for all of them.

That is, we abstract the details of the underlying data storage, and define a unified way of accessing the data.

-----

In class, I talked about in-memory vs. database DAO implementation.
In this example, I chose to implement something a little simpler:
 1. In-memory DAO - Keeps everything in memory.    
    _Note:_ This class is not fully implemented, because there is another section of the course that is still working on exercise 1.
 2. Local-file DAO - Data is saved/loaded to/from a local file.




This is a simple web application showing how to configure spring-mvc and spring-data.

There is a simple login functionality, if the user credentials are correct, the user is
forwarded to a home page where a list of all his orders are shown in a html table.

The database is very simple: users and orders, every users may have many orders.

The database is created at every application deploy, due to the configuration of the HibernateJpaVendorAdapter, 
change the datasouce properties bean defined in jpaContext.xml to use a database of your choice.

In my case, I use mysql running on port 3306, with the user root and password root (I know ... bad idea:)), 
with a schema named firstspringmvc.

To deploy and use the demo:
1. create an empty schema in your database
2. change the datasource properties defined in jpaContext.xml
3. manually insert some records in the two tables, after deploy of the application




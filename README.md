# StockArchives

This repository is a back-end system of pseudo web application develpoed for displaying best performing stocks from stock archival.

User can search the best performing stocks based on given date ranges. User can also see the history of stock prices of days in given date 
ranges.

This back-end system exposes REST based API end-points (Search and Symbol) to communicate.

The entireback-end is divided into 4 major tiers.
1. Application Layer: This is the layer where API request first hitsfrom clients.
2. Business Layer: This tier contains The resource classes of all end-points which is core of REST architecture.
3. Data Access Layer: The dedicated tier for all database operations.
4. Presentation layer: This tier is a collection of response classes for all end-points.

Built using:

Java, NetBeans IDE with GlassFissh server 4.1.1, 
JDBC, JSON, MS-SQL.

# CSE3146 - Advanced Java Programming
## Module 4: Distributed Programming with Servlets and JSP

### Repository Structure

```
advanced-java/
├── Lab-Q1-Registration/       # Student Registration with MySQL
├── Lab-Q2-ReceiveData/        # Reading HTTP Request Parameters
├── Lab-Q3-Factorial/          # Factorial Computation via Servlet
└── PPT-Examples/
    ├── UnamePasswordServlet/  # GenericServlet POST example
    ├── ColorGetServlet/       # HttpServlet GET example
    └── AddCookieServlet/      # Cookie creation via POST
```

### Prerequisites
- Apache Tomcat 9+
- MySQL 8.0+ (for Lab Q1)
- Eclipse IDE with Dynamic Web Project support
- `servlet-api.jar` from Tomcat lib
- `mysql-connector-j.jar` (for Lab Q1)

### Setup
1. Import each folder as a **Dynamic Web Project** in Eclipse
2. Add `servlet-api.jar` to Build Path
3. For Lab Q1, run the SQL script in `sql/create_table.sql` and update DB credentials in `Register.java`
4. Deploy to Tomcat and run

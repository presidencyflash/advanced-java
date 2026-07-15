-- Create the student database
CREATE DATABASE IF NOT EXISTS student;
USE student;

-- Create the registration table
CREATE TABLE REGISTERUSER (
    NAME    VARCHAR(100) PRIMARY KEY,
    PASS    VARCHAR(50),
    EMAIL   VARCHAR(100),
    COUNTRY VARCHAR(20)
);

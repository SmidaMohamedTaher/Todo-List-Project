DROP DATABASE IF EXISTS Dolist;
CREATE DATABASE Dolist;
USE Dolist;

CREATE TABLE task (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(30) NOT NULL ,
                      description VARCHAR(1000),
                      dueDate DATE,
                      status ENUM('completed', 'not completed', 'abandoned') NOT NULL
);

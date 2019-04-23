Hướng dẫn build spring boot với docker
===========================

# I. Giới thiệu tổng quan

  - Project Web demo

  - Java 1.8, PHP 7, Mysql 5, C#/.NET MVC 5

  - Back end:
    
    + Rest API: Java - Product API, C# - Account API

    + Front-end: Angular 7

  - Database: Mysql, SQLServer

  - Framework: Spring boot, JPA, Laravel

# II. Các thông số

  1. Tạo cơ sở dữ liệu.
    
    - SQLServer:

      + host: sqlserver_product_host

      + user: mssql_root

      + password: Abcdabcd1

      + database: sqlserver_product_host 

      + 1 table: `create table product(code varchar(10), name varchar(100), price int)`

      + port: 1433

    - MySQL:

      + host: mysql_account_host

      + user: mysql_root

      + password: Abcdabcd1

      + database: mysql_account_db

      + 1 table: `create table account(username varchar(100), password varchar(100))`

      + port: 3306

  2. Tạo web app:

    - Admin: Chức năng thêm product. (Express NodeJs), port: 9000

    - Restful API: Login, Show list product (JPA). (Spring boot), port: 8080

    - Front end: Hiển thị danh sách product, Đăng nhập (Angular), port: 4200
  
# III. Tiến hành cài đặt

    /home/thuong/Dropbox/Company/Learn_Docker/TH1_SpringBoot.md
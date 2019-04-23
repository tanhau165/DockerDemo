FROM mysql:5.7

ENV MYSQL_ROOT_PASSWORD test123
ENV MYSQL_DATABASE mysql_product_db
ENV MYSQL_USER mysql_root
ENV MYSQL_PASSWORD Abcdabcd1

ADD create-product-table.sql /docker-entrypoint-initdb.d

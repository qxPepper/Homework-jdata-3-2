select o.product_name from ORDERS_17 o join CUSTOMERS_17 c on c.id = o.customer_id where name = :name;
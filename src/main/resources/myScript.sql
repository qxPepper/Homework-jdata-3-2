select o.product_name, c.name
from ORDERS_10 o
         join CUSTOMERS_10 c on c.id = o.customer_id
where name = :name;
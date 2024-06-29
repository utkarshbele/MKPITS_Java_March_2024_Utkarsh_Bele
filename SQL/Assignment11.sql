#Create following Tables insert data
#Customer - Customer_Id, Name, Address, City
#Supplier - Supplier_Id, Name, Address, City
#ProductMaster - Product_Id, Name, Price, QOH
#Sale - Sale_Id, Product_id, Customer_id, Quantity, Date
#Purchase - Purchase_Id, Product_id, Customer_id, Quantity, Date

use myshop;
select * from sales;
alter table customer add constraint primary key (customer_id);
alter table customer add constraint unique (customer_name);
alter table supplier add constraint primary key (supplier_id);
alter table supplier add constraint unique (supplier_name);
alter table productmaster add constraint primary key (product_id);
alter table productmaster modify product_name varchar(70) not null;
alter table productmaster add constraint check (price>0);
alter table productmaster add constraint check (quantity_in_stock>=0);
alter table productmaster add constraint foreign key (supplier_id) references supplier(supplier_id);
alter table sales add constraint primary key (sales_id);
alter table sales add constraint foreign key (product_id) references productmaster(product_id);
alter table sales add constraint foreign key (customer_id) references customer(customer_id); 
alter table purchase add constraint primary key (purchase_id);
alter table purchase add constraint foreign key (product_id) references productmaster(product_id); 
alter table purchase add constraint foreign key (supplier_id) references supplier(supplier_id); 
alter table purchase add constraint check(datediff(current_date,purchase_date)>=0);
select * from purchase;

#Problem 1
#**Problem Statement**: Retrieve the names and addresses of all suppliers in 'Los Angeles'.
#**Expected Result**:
```
| Name             | Address            |
|------------------|--------------------|
| ABC Supplies     | 123 Main Street    |
| LA Wholesale     | 456 Sunset Blvd    |
```
select supplier_id, supplier_name, address from supplier where city="Los Angeles";

### Problem 2
**Problem Statement**: Find the total quantity of products sold.
**Expected Result**:
```
| Total_Quantity_Sold |
|---------------------|
| 2450                |
```
select sum(quantity_sold) as Total_Quantity_Sold from sales;

### Problem 3
**Problem Statement**: List all purchases of product ID 'P001' sorted by date in ascending order.
**Expected Result**:
```
| Purchase_Id | Product_id | Customer_id | Quantity | Date       |
|-------------|------------|-------------|----------|------------|
| 1001        | P001       | C123        | 50       | 2024-05-01 |
| 1002        | P001       | C124        | 30       | 2024-05-05 |
```
select purchase_id from purchase where product_id=101 order by purchase_date;

### Problem 4
**Problem Statement**: Find the names of products that have been sold more than 100 times.
**Expected Result**:
```
| Name          |
|---------------|
| Widget A      |
| Gadget B      |
```
select product_id from sales where quantity_sold>100;

### Problem 5
**Problem Statement**: Retrieve the product ID and name of the product with the highest price.
**SQL Query**:
**Expected Result**:
```
| Product_Id | Name          |
|------------|---------------|
| P009       | Luxury Item   |
```
select product_id, product_name from productmaster where price=(select max(price) from productmaster);

### Problem 6
**Problem Statement**: Find the average price of products in the product master.
**Expected Result**:
```
| Avg_Product_Price |
|-------------------|
| 299.50            |
```
select avg(price) from productmaster;

### Problem 7
**Problem Statement**: List the product IDs that have not been sold.
**Expected Result**:
```
| Product_Id |
|------------|
| P003       |
| P007       |
```
select product_id from productmaster where product_id not in (select distinct product_id from sales);

### Problem 8
**Problem Statement**: Retrieve the total number of sales made in the month of June 2024.
**Expected Result**:
```
| Total_Sales |
|-------------|
| 150         |
```
select count(sales_id) from sales where month(sale_date)='June';

### Problem 9
**Problem Statement**: Find the quantity on hand (QOH) of the product with product ID 'P005'.
**Expected Result**:
```
| QOH  |
|------|
| 120  |
```
select quantity_in_stock from productmaster where product_id=105;


### Problem 10
**Problem Statement**: List the names and total quantities purchased of products that have been purchased more than 200.
**Expected Result**:
```
| Name          | Total_Quantity_Purchased |
|---------------|--------------------------|
| Widget A      | 350                      |
| Gadget B      | 220                      |

select pm.product_name, sum(p.quantity_purchased) as 'Total_Quantity_Purchased' from purchase p join productmaster pm on 
p.product_id=pm.product_id group by pm.product_id having sum(quantity_purchased)>200;
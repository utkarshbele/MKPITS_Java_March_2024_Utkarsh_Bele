Create following tables and insert data
Account - Account_No, Name, Address, City, Balance
Transactions - Account_No, Amount, Transaction_Type, Date

use bankdb;

Try following queries
### Problem 1
**Problem Statement**: Retrieve the names and addresses of all account holders in 'New York'.
select name,address from accountholdermaster where city="New York";  

### Problem 2
**Problem Statement**: Find the total balance of all accounts.
select accno, sum(balance) from accountholdermaster group by accno;

### Problem 3
**Problem Statement**: List all transactions of account number '1' sorted by date in descending order.
select id,date,accno from transactions where accno=1 order by date desc;

### Problem 4
**Problem Statement**: Find the names of account holders who have made a transaction greater than $500.
select distinct name from accountholdermaster join transactions on accountholdermaster.accno=transactions.accno where amount>500.00;

### Problem 5
**Problem Statement**: Retrieve the account number and balance of the account with the highest balance.
select accno, max(amount) from transactions group by accno having max(amount);

### Problem 6
**Problem Statement**: Find the average transaction amount for 'Debit' transactions.
**Expected Result**:
```
| Avg_Debit_Amount |
|------------------|
| 150.75           |
```
select avg(amount) from transactions where transaction_type="withdrawal";

### Problem 7
**Problem Statement**: List the account numbers that have not made any transactions.
**Expected Result**:
```
| Account_No |
|------------|
| 11223      |
| 33445      |
```
select accno from accountholdermaster where accno not in (select accno from transactions); 

### Problem 8
**Problem Statement**: Retrieve the total number of transactions made in the month of May 2024.
```
**Expected Result**:
```
| Total_Transactions |
|--------------------|
| 75                 |
```
select count(id) as 'Total_Transaction' from transactions where month(date)='May';

### Problem 9
**Problem Statement**: Find the balance of the account with account number '5'.
**Expected Result**:
```
| Balance |
|---------|
| 3500    |
```
select balance from accountholdermaster where accno=5; 

### Problem 10
**Problem Statement**: List the names and total transaction amounts of account holders who have made transactions totaling more than $1000.
**Expected Result**:
```
| Name          | Total_Amount |
|---------------|--------------|
| John Doe      | 1500         |
| Emily Davis   | 1200         |
```
select accountholdermaster.name,accountholdermaster.accno, sum(transactions.amount) as 'total amount' from accountholdermaster 
join transactions on accountholdermaster.accno=transactions.accno where amount>1000.00 
group by accountholdermaster.name,accountholdermaster.accno;
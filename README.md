# This project is for the creation of accounts and the transfer of money between accounts. It is built using Java with the Spring Boot framework.

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/it21374838/DialogAxiataProject.git
cd DialogProject

```
**4. Run the application**

```bash
mvn spring-boot:run
```
## To check the APIs using Postman
POST-  http://localhost:8080/api/accounts
{
    "accountNumber": "A",
    "balance": 1000.00
}
{
    "accountNumber":"B",
    "balance": 500.00
}
POST - http://localhost:8080/api/transfers
{
    "sourceAccountNumber":"A",
    "destinationAccountNumber":"B",
    "amount": 100.00
}



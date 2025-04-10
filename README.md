🏦 Spring JPA Banking Application
A simple yet functional Banking Application built using Spring Boot, Spring Data JPA, and H2 Database, demonstrating essential banking operations such as account creation, balance inquiry, deposits, withdrawals, and fund transfers.

🚀 Features
Create a new bank account

Deposit money into an account

Withdraw money from an account

Transfer funds between accounts

Check account balance

View transaction history

Built-in H2 in-memory database for easy testing

RESTful API structure using Spring Boot

JPA/Hibernate for ORM with auto schema generation

🛠️ Technologies Used
Java 17+

Spring Boot

Spring Data JPA

H2 Database

Lombok

Maven

📂 Project Structure
graphql
Copy
Edit
spring-jpa-banking-app/
├── controller/         # REST Controllers
├── entity/             # Entity classes (Account, Transaction)
├── repository/         # Spring Data JPA Repositories
├── service/            # Business logic and services
├── dto/                # Data Transfer Objects
├── exception/          # Custom exception handling
└── BankingAppApplication.java # Main class
🧪 Running the App
✅ Prerequisites
Java 17+

Maven

🏃‍♂️ Steps to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/hamie-kalhoro/spring-jpa-banking-app.git
cd spring-jpa-banking-app
Build and run the application:

bash
Copy
Edit
mvn spring-boot:run
Access H2 Console (for testing/debugging):

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

📬 API Endpoints
Method	Endpoint	Description
POST	/api/accounts	Create a new account
GET	/api/accounts/{id}	Get account details
POST	/api/accounts/{id}/deposit	Deposit funds
POST	/api/accounts/{id}/withdraw	Withdraw funds
POST	/api/accounts/transfer	Transfer funds between accounts
📌 API accepts and returns JSON objects.

🔐 Error Handling
Custom exceptions for common errors (e.g., insufficient balance, invalid account)

Global exception handler returns meaningful error messages with HTTP status codes

📸 Example Request
Transfer Funds:

json
Copy
Edit
POST /api/accounts/transfer

{
  "fromAccountId": 1,
  "toAccountId": 2,
  "amount": 100.00
}
🤝 Contributing
Contributions are welcome! If you'd like to improve something, feel free to fork this repo, make changes, and submit a pull request.

📄 License
This project is open source and available.

👨‍💻 Author
Hamie Kalhoro
🔗 GitHub Profile

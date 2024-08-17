# E-Commerce Microservices Project

This project is a part of an E-Commerce application that focuses on managing products. It is built using Spring Boot and MongoDB, following a microservices architecture. The primary service implemented in this project is the **Product Service**, which allows you to perform operations related to products, such as creating and retrieving product details.

## Features

### 1. Product Management

- **Create Product**: Add new products to the MongoDB database.
- **Retrieve All Products**: Fetch and display all products stored in the database.

### 2. Microservices Architecture

This project is structured as a microservice that interacts with other services in the E-Commerce platform. The service currently implemented is:

- **Product Service**: Manages product-related operations.

## Project Structure

E_Commerce
└───Microservices
├───controller
│ └───ProductController.java
├───dto
│ ├───ProductRequest.java
│ └───ProductResponse.java
├───model
│ └───Product.java
├───repository
│ └───ProductRepository.java
└───service
└───ProductService.java


- **controller**: Contains the REST controllers that handle incoming HTTP requests.
- **dto**: Contains Data Transfer Objects (DTOs) used for transferring data between layers.
- **model**: Contains the data model that is persisted in MongoDB.
- **repository**: Contains the repository interfaces that handle data access.
- **service**: Contains the business logic for handling product-related operations.

## How to Use

### 1. Clone the Repository

```bash
git clone https://github.com/bot69dude/MicroServices.git
cd MicroServices
```

### 2. Run the Application

Ensure you have the required dependencies installed and your MongoDB instance running. You can start the Spring Boot application by running:

```bash
./gradlew bootRun
```

### 3. Create a Product
You can create a new product by making a POST request to the /api/product endpoint:

```bash
curl -X POST http://localhost:8080/api/product \
-H 'Content-Type: application/json' \
-d '{
  "name": "Sample Product",
  "description": "This is a sample product.",
  "price": 120000
}'
```

### 4. Retrieve All Products
You can retrieve a list of all products by making a GET request to the /api/product endpoint:

```bash
curl -X GET http://localhost:8080/api/product
```

### Technologies Used:

Spring Boot: For building the microservices.
MongoDB: For storing product data.
Lombok: For reducing boilerplate code in DTOs and models.
Gradle: For managing project dependencies and building the application.

### Future Enhancements:

Implement additional services such as Order Service, Inventory Service, and Notification Service.
Add endpoints to update and delete products.
Integrate with other microservices in the E-Commerce platform.
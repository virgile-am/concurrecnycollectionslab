# Concurrency and Multithreading in Spring Boot

## Project Overview
This Spring Boot application demonstrates the concepts of concurrency and multithreading in Java. It includes examples of using Java concurrency utilities, concurrent collections, and performance benchmarking.

## Objectives
- Understand concurrency and multithreading
- Explore Java concurrency utilities and collections
- Benchmark performance between concurrent and non-concurrent collections

## Project Structure
- `src/main/java/com/concurrecnycollectionslab/concurrencylab`: Main application package
    - `ConcurrencylabApplication.java`: Main entry point
    - `service`: Contains services for concurrency and performance
    - `controller`: REST controller for API endpoints
    - `util`: Utility class for task creation

## Endpoints
1. `GET /concurrency/demo-concurrency`: Demonstrates concurrency using `ExecutorService`
2. `GET /concurrency/demo-multithreading`: Demonstrates multithreading using `Thread`
3. `GET /concurrency/demo-concurrent-collections`: Demonstrates usage of concurrent collections
4. `GET /concurrency/compare-performance`: Benchmarks performance of `ArrayList` vs. `CopyOnWriteArrayList`

## How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/virgile-am/concurrencylab.git
   ```

2. **Navigate to Project Directory**
   ```bash
   cd concurrencylab
   ```

3. **Build and Run the Application**
    - Using Maven:
      ```bash
      mvn spring-boot:run
      ```
 

4. **Test Endpoints Using Postman**
    - Open Postman and use the following URLs:
        - `http://localhost:8080/concurrency/demo-concurrency`
        - `http://localhost:8080/concurrency/demo-multithreading`
        - `http://localhost:8080/concurrency/demo-concurrent-collections`
        - `http://localhost:8080/concurrency/compare-performance`
### Pdf Document
[_Concurrency and Multithreading.pdf](docs%2F_Concurrency%20and%20Multithreading.pdf)
🎓 Student Management System
A simple REST API for managing students built with Spring Boot.


📖 About Project
This project allows you to manage student data using HTTP requests.  
You can create, view, update, and delete students.


🚀 Features
- Get all students  
- Add a new student  
- Update student information  
- Delete student  


🛠️ Technologies
- Java  
- Spring Boot  
- Maven  


🔗 API Endpoints
| Method | Endpoint       | Description      |
| ------ | -------------- | ---------------- |
| GET    | /students      | Get all students |
| POST   | /students      | Add student      |
| PUT    | /students/{id} | Update student   |
| DELETE | /students/{id} | Delete student   |

🧪 Example Response
[
  {
    "id": 1,
    "name": "Jamilya",
    "age": 17
  }
]

📸 Testing
Tested using Postman.


🏗️ Project Structure
controller → handles HTTP requests
service → business logic
model → Student class


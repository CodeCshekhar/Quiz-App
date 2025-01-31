# Interactive Quiz Application

A full-stack quiz application built with Spring Boot and HTML/CSS/JavaScript that allows users to take timed quizzes with multiple-choice questions.
There is a problem while showing question text help me when Youre ready to collaborate with this......
## 📸 Application Preview

### Welcome Screen
![Screenshot 2025-01-31 123037](https://github.com/user-attachments/assets/1f6924a9-a852-43b7-80e6-d9db993e76f6)
*The initial screen where users can start the quiz*

### Quiz Interface
![Screenshot 2025-01-31 123042](https://github.com/user-attachments/assets/75527082-83de-4d0d-aa43-4bd622c7c61c)
*Quiz interface showing question, timer, and multiple choice options*

### Results Display
![Screenshot 2025-01-31 123104](https://github.com/user-attachments/assets/9ee50df7-a806-48df-a85e-27bd9964ab61)
*Final results screen showing score and statistics*

## Features

- 📝 Multiple choice questions with timed responses
- ⏱️ Dynamic timer for each question
- 🎯 Immediate feedback on answer selection
- 📊 Score tracking and final results
- 💾 Database persistence for quiz questions
- 🔄 API endpoint integration
- 📱 Responsive design
- 🎨 Modern and clean user interface

## Technologies Used

### Backend
- Java 11
- Spring Boot 2.7.9
- Spring Data JPA
- MySQL Database
- Maven
- RESTful API
- Swagger UI for API documentation

### Frontend
- HTML5
- CSS3
- JavaScript (Vanilla)
- Responsive Design

## Project Structure

```
quiz-application/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/quiz/app/
│   │   │       ├── controller/
│   │   │       │   └── QuizController.java
│   │   │       ├── model/
│   │   │       │   └── Question.java
│   │   │       ├── repository/
│   │   │       │   └── QuestionRepository.java
│   │   │       ├── service/
│   │   │       │   └── QuizService.java
│   │   │       └── QuizApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       │   ├── index.html
│   │       │   ├── styles.css
│   │       │   └── script.js
│   │       └── sql/
│   │           ├── schema.sql
│   │           └── data.sql
│   └── test/
├── screenshots/
│   ├── welcome-screen.png
│   ├── quiz-interface.png
│   └── results-screen.png
├── pom.xml
└── README.md
```

## Prerequisites

- Java JDK 11 or higher
- Maven 3.6 or higher
- MySQL 8.0 or higher
- Git

## Setup and Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/quiz-application.git
   cd quiz-application
   ```

2. **Database Setup**
   ```bash
   mysql -u root -p
   source src/main/resources/sql/schema.sql
   source src/main/resources/sql/data.sql
   ```

3. **Configure Application Properties**
   
   Update `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/quiz_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. **Build the Application**
   ```bash
   mvn clean install
   ```

5. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

6. **Access the Application**
   - Frontend: Open `http://localhost:8080` in your browser
   - API Documentation: Open `http://localhost:8080/swagger-ui/` in your browser

## Features in Detail

### Quiz Flow
1. User clicks "Start Quiz" button
2. Questions are fetched from the backend
3. Timer starts for each question
4. User selects an answer
5. Immediate feedback is provided
6. Next question is presented
7. Final score is displayed at the end

### Scoring System
- Correct answers: +1 point
- Incorrect answers: 0 points
- Final score displayed as percentage

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Future Enhancements

- [ ] User authentication and profiles
- [ ] Different quiz categories
- [ ] Difficulty levels
- [ ] Leaderboard system
- [ ] Quiz creation interface
- [ ] Performance analytics
- [ ] Social sharing features

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

- Spring Boot Documentation
- MySQL Documentation
- Stack Overflow Community

## Contact

Your Name - [@yourusername](https://twitter.com/yourusername)

Project Link: [https://github.com/yourusername/quiz-application](https://github.com/yourusername/quiz-application)

---
**Note:** To add your screenshots:
1. Create a `screenshots` directory in your project root
2. Take screenshots of your application at different stages
3. Save the screenshots with the corresponding names shown above
4. Update the image paths in this README
5. Add appropriate descriptions for each screenshot

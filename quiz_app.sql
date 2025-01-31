CREATE DATABASE IF NOT EXISTS quiz_app;
CREATE DATABASE quiz_app;
drop database quiz_app;
USE quiz_app;

CREATE TABLE question (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    question_text VARCHAR(255) NOT NULL
);

CREATE TABLE answer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    answer_text VARCHAR(255) NOT NULL,
    correct BOOLEAN NOT NULL,
    question_id BIGINT,
    FOREIGN KEY (question_id) REFERENCES question(id)
);

package ru.otus.spring01.rymar.services;/*
 *
 *autor Sergey on 02.12.2018 15:28
 */

import ru.otus.spring01.rymar.domain.Student;

public interface StudentService {
    Student getStudent(String fName, String lName, int numOfQuestions);
}

package ru.otus.spring01.rymar.dao;/*
 *
 *autor Sergey on 02.12.2018 15:47
 */

import ru.otus.spring01.rymar.domain.Student;

public interface StudentDao {
    Student getStudent(String firstName,String secondName,int numOfQuestions);
}

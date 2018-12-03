package ru.otus.spring01.rymar.dao;/*
 *
 *autor Sergey on 02.12.2018 18:56
 */


import ru.otus.spring01.rymar.domain.Student;

import java.util.Arrays;

public class StudentDaoImpl implements StudentDao {

    private Student student;

    public Student getStudent(String firstName, String secondName, int numOfQuestions) {
        this.student.setFirstName(firstName);
        this.student.setSecondName(secondName);
        this.student.setAnsvers(new String[numOfQuestions]);
        return student;
    }

    public void setStudent(Student student) {
        this.student=student;
    }
}

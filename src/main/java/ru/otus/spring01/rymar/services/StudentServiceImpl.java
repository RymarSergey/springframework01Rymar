package ru.otus.spring01.rymar.services;/*
 *
 *autor Sergey on 02.12.2018 22:25
 */

import lombok.AllArgsConstructor;
import ru.otus.spring01.rymar.dao.StudentDao;
import ru.otus.spring01.rymar.domain.Student;

@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    public Student getStudent(String fName, String lName, int numOfQuestions){
        return studentDao.getStudent(fName,lName,numOfQuestions);
    }

}

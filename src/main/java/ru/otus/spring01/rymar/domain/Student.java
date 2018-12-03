package ru.otus.spring01.rymar.domain;
/*
 *
 *autor Sergey on 02.12.2018 14:20
 */


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    //
    private String firstName;
    private String secondName;
    private String[] ansvers/*=new boolean[NUMBER_OF_QUESTIONS]*/;

    public Student(String thisFirstName,String thisSecondName,int numOfQuestion){
        firstName=thisFirstName;
        secondName=thisSecondName;
        ansvers=new String[numOfQuestion];
    }

    public void setAnsver(int questionNumber,String verdict) {

        ansvers[questionNumber]=verdict;
    }

}

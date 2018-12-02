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
    private  final int NUMBER_OF_QUESTIONS = 5;
    private String firstName;
    private String secondName;
    boolean[] ansvers=new boolean[NUMBER_OF_QUESTIONS];

    void setAnsver(int questionNumber, boolean ansver) {
        ansvers[questionNumber]=ansver;
    }

}

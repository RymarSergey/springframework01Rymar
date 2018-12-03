package ru.otus.spring01.rymar.domain;
/*
 *
 *autor Sergey on 02.12.2018 15:06
 */


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Question {
    private int questionIndex;
    private String[] ansvers;
    private String question;
    private String rightAnsver;

    public Question() {

    }
}

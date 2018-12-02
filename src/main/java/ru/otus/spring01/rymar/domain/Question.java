package ru.otus.spring01.rymar.domain;/*
 *
 *autor Sergey on 02.12.2018 15:06
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Question {
    private int questioIindex;
    private String question;
    private int rightAnsverIndex;

}

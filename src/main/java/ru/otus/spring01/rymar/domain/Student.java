package ru.otus.spring01.rymar.domain;/*
 *
 *autor Sergey on 02.12.2018 14:20
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String firstName;
    private String secondName;
    boolean[] ansvers=new boolean[5];

}

package ru.otus.spring01.rymar.services;/*
 *
 *autor Sergey on 02.12.2018 15:34
 */

import ru.otus.spring01.rymar.domain.Question;

public interface QuestionService {
    /*String  showQuestion(int numOfQuestion);
    boolean isAnsverCorect(String ansver);
    String[] showAnsver(int numOfQuestion);*/
    Question getQuestionByIndex(int index);
}

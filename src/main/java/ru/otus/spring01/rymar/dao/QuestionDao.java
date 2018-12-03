package ru.otus.spring01.rymar.dao;/*
 *
 *autor Sergey on 02.12.2018 15:47
 */

import ru.otus.spring01.rymar.domain.Question;

public interface QuestionDao {
    Question findQuestionByIndex(int questioIindex);

}

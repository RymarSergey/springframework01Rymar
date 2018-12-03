package ru.otus.spring01.rymar.services;/*
 *
 *autor Sergey on 02.12.2018 20:36
 */

import lombok.AllArgsConstructor;
import ru.otus.spring01.rymar.dao.QuestionDao;
import ru.otus.spring01.rymar.domain.Question;


@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private QuestionDao dao;

    /*public String  showQuestion(int numOfQuestion) {
        return dao.findQuestionByIndex(numOfQuestion).getQuestion();
    }

    public boolean isAnsverCorect(String ansver) {
        return false;
    }
    public String[] showAnsver(int numOfQuestion){
        return dao.findQuestionByIndex(numOfQuestion).getAnsvers();
    }
*/
    public Question getQuestionByIndex(int index) {
        return dao.findQuestionByIndex(index);
    }
}

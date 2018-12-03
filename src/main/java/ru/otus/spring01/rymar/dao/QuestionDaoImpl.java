package ru.otus.spring01.rymar.dao;/*
 *
 *autor Sergey on 02.12.2018 18:55
 */


import com.opencsv.CSVReader;
import ru.otus.spring01.rymar.domain.Question;

import java.io.FileReader;
import java.io.IOException;


public class QuestionDaoImpl implements QuestionDao {
    private Question question;

    public Question findQuestionByIndex(int questionIndex) {
        String csvFile = "G:\\OTUS\\Spring\\1\\springframework01Rymar\\src\\main\\resources\\questions.csv";
        int count=0;
        try {
            CSVReader reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (count==questionIndex){
                    question.setQuestion(line[0]);
                    question.setAnsvers(new String[]{line[1],line[2]});
                    question.setRightAnsver(line[3]);
                    question.setQuestionIndex(count);
                }
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return question;
    }


    public void setQuestion(Question question) {
        this.question = question;
    }
}

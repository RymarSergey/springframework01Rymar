import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring01.rymar.domain.Question;
import ru.otus.spring01.rymar.domain.Student;
import ru.otus.spring01.rymar.services.QuestionService;
import ru.otus.spring01.rymar.services.StudentService;

import java.util.Scanner;

public class Main {
    private static final int NUMBER_OF_QUESTIONS = 5;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Scanner scan = new Scanner(System.in);
        System.out.println("ведите имя и фамилию :");
        String firstName = scan.next();
        String secondName = scan.next();

        StudentService studentService = context.getBean(StudentService.class);
        Student student = studentService.getStudent(firstName, secondName, NUMBER_OF_QUESTIONS);

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            QuestionService questionService = context.getBean(QuestionService.class);
            Question question = questionService.getQuestionByIndex(i);
            System.out.println("вопрос номер " + (i + 1));
            System.out.println(question.getQuestion());
            System.out.println("Варианты ответа:");
            System.out.println("1)" + question.getAnsvers()[0]);
            System.out.println("2)" + question.getAnsvers()[1]);

            Scanner scanAnsver = new Scanner(System.in);
            System.out.println("введите ответ");

            String ansver = scanAnsver.next();
            if (ansver.equals(question.getRightAnsver()) ) {
                student.setAnsver(i, "верно");
            } else {
                student.setAnsver(i, "неверно");
            }

        }
        System.out.println("Результат:");
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println((i + 1) + ")" + student.getAnsvers()[i]);
        }
        context.close();
    }


}

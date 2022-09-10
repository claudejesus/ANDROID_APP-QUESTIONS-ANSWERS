package com.example.quizandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_bank);
    }
    private static List<QuestionsList> javaquestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList(question: "What is the size of int variable?", option1: "16 bit", option2: "8 bit", option3: "32 bit", option4: "16 bit" answer ="32 bit", userSelectedAnswer: "");
        final QuestionsList question2 = new QuestionsList(question: "What is the default value of boolean variable?", option1: "true", option2: "false", option3: "null", option4: "not defined", answer: "false", userSelectedAnswer: "");
        final QuestionsList question3 = new QuestionsList(question: "What is the following is the default value of an instance variable?", option1: "Depends upon the type of variable", option2: "null", option3: "0", option4: "not defined", answer: "false", userSelectedAnswer: "");
        final QuestionsList question4 = new QuestionsList(question: "Which is reserved word in the java programming language?", option1: "method", option2: "native", option3: "reference", option4: "array", answer: "native", userSelectedAnswer: "");
        final QuestionsList question5 = new QuestionsList(question: "Which of the following is NOT a keywords or reserved word in java?", option1: "if", option2: "then",option3: "goto", option4: "while", answer: "then", userSelectedAnswer: "");
        final QuestionsList question6 = new QuestionsList(question: "Which is the valid declaretion within an interface definition ?", option1: "public double methoda();", option2: "public final double methoda();", option3: "static void methoda(double d1);", option4: "protected void methoda(double d1);", answer: "public double methoda();", userSelectedAnswer: "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    private static List<QuestionsList> phpquestions() {
        final List<QuestionsLists> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList(question: "What does php stand for?", option1: "Professional Home Page", option2: "Hypertext Proprossor", option3: "Pretext Hypertext Processor", option4: "Preprocessor Home Page" answer ="Hypertext Preprossor", userSelectedAnswer: "");
        final QuestionsList question2 = new QuestionsList(question: "Who is the father of php?", option1: "Rasmus Lerdorf", option2: "Niyigaba Claude", option3: "sabine", option4: "List barely", answer: "sabine", userSelectedAnswer: "");
        final QuestionsList question3 = new QuestionsList(question: "php files have a default file extension of.", option1: ".html", option2: ".php", option3: ".xml", option4: ".json", answer: ".PHP", userSelectedAnswer: "");
        final QuestionsList question4 = new QuestionsList(question: "A PHP script should start with ____ and with _______:", option1: "< PHP >>", option2: "<php />", option3: "< ? ? >", option4: "< ? PHP ? >", answer: "< ?php ? >", userSelectedAnswer: "");
        final QuestionsList question5 = new QuestionsList(question: "which version of PHP introduced Try/catch Exception?", option1: "PHP 5", option2: "PHP 5",option3: "PHP 6", option4: "PHP 5.3", answer: "PHP 5", userSelectedAnswer: "");
        final QuestionsList question6 = new QuestionsList(question: "If $a = 12 what will be returned when ($a == 12) ? 5 : 1 is executed?", option1: "12", option2: "1", option3: "5", option4: "error", answer: "5", userSelectedAnswer: "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    private static List<QuestionsList> htmlquestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList(question: "What does php stand for?", option1: "hyper text markup language", option2: "high text markup language", option3: "hyper Tabular markup language", option4: "none of these" answer ="Hyper Text Markup Language", userSelectedAnswer: "");
        final QuestionsList question2 = new QuestionsList(question: "Which of tht following tag is used to mark abegining of html", option1: "<TD>", option2: "<br>", option3: "<P>", option4: "<TR>", answer: "false", userSelectedAnswer: "");
        final QuestionsList question3 = new QuestionsList(question: "form which tag descriptive list starts ?", option1: "<LL>", option2: "<DD>", option3: "DL", option4: "<DS>", answer: "<DL", userSelectedAnswer: "");
        final QuestionsList question4 = new QuestionsList(question: "correct HTML tag for the largest heading is", option1: "<head>>", option2: "<large>", option3: "reference", option4: "<heading>", answer: "<h1>", userSelectedAnswer: "");
        final QuestionsList question5 = new QuestionsList(question: "the attribute of <form> tag", option1: "Method", option2: "action",option3: "both (3)&(b)", option4: "while", answer: "tBoth (a)&(b)", userSelectedAnswer: "");
        final QuestionsList question6 = new QuestionsList(question: "Markup tag tell the web browser", option1: "how to organise the page", option2: "How to display the page", option3: "how to display message box on page", option4: "None of these", answer: "How to display the pade", userSelectedAnswer: "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    private static List<QuestionsList> androidquestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList(question: "Select a component whch is NOT part of Android architecture", option1: "android framework", option2: "library", option3: "Linux kernel", option4: "Android Document" answer ="Linux kernel", userSelectedAnswer: "");
        final QuestionsList question2 = new QuestionsList(question: "A _________make a specicific set of the application data available to other applications", option1: "content provider", option2: "Broadcast recievers", option3: "Intent", option4: "None of these", answer: "Content provider", userSelectedAnswer: "");
        final QuestionsList question3 = new QuestionsList(question: "Which among thse are Not  a part of Android's native libraries?", option1: "webkit", option2: "driver", option3: "openGL", option4: "SQLite", answer: "Dalvik", userSelectedAnswer: "");
        final QuestionsList question4 = new QuestionsList(question: "During an activity", option1: "onStop()", option2: "onStart()", option3: "onCreate()", option4: "onRestore()", answer: "onCreate()", userSelectedAnswer: "");
        final QuestionsList question5 = new QuestionsList(question: "what activity method you use to retrieve", option1: "findViewByReference(int id", option2: "findviewById(in id)",option3: "findviewById(in id)", option4: "RetriveResourceById(in id)", answer: "findviewById(in id)", userSelectedAnswer: "");
        final QuestionsList question6 = new QuestionsList(question: "the requests from content provider", option1: "onCreate", option2: "onSelect", option3: "ContentResolver", option4: "onClicke", answer: "ContentResolvere", userSelectedAnswer: "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    public static List<QuestionsList> getQuetions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "java":
                return javaquestions();
            case "php":
                return phpquestions();
            case "android":
                return androidquestions();
            default:
                return htmlquestions();
        }
    }


}
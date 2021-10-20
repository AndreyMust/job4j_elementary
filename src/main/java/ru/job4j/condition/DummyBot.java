package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String res = "Это ставит меня в тупик. Задайте другой вопрос.";

        if (question.equals("Привет, Бот.")) {
           res = "Привет, умник.";
        } else if (question.equals("Пока.")) {
            res = "До скорой встречи.";
        }
        return res;
    }
}

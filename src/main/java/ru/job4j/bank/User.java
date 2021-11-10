package ru.job4j.bank;

import java.util.Objects;

/**  Класс предназначен для работы с данными пользователя:
 * паспортом и именем пользователя
 * @author Мустафин
 * @version 1.0
 */
public class User {
    private String passport;
    private String username;

    /** публичный метод User
     * Задаем приватным полям значения
     * @param passport номер паспорта
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /** Метод возвращает
     * @return номер паспорта
     */
    public String getPassport() {
        return passport;
    }

    /** Метод задает
     * @param passport номер паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /** Метод возвращает
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /** Метод задает
     * @param username имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}

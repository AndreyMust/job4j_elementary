package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс предназначен для работы с балансом счета и реквизитами
 * @author А. Мустафин
 * @version 1.0
 * */

public class Account {
    private String requisite;
    private double balance;

    /** конструктор Account
     *
     * @param requisite реквизит
     * @param balance баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /** Метод возвращает реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /** Метод возвращает баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /** Метод устанавливает баланс счета
     *
     * @param balance баланс счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}

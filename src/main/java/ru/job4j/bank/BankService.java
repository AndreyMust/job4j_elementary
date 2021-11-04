package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**   Метод добавляет Счет для пользователя.
     *
     * @param passport - номер паспорта
     * @param account - счет для добавления
     *  Проверяет, что такого счета еще нет у данного пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user: users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account acc : users.get(user)) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

    /**Этот метод производит перевод денег со счета на счет
     *
     * @param srcPassport   - отправитель
     * @param srcRequisite  - счет отправителя
     * @param destPassport  - получатель
     * @param destRequisite - счет получателя
     * @param amount        - сумма
     * @return              - результат
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accSrc = findByRequisite(srcPassport, srcRequisite);
        Account accDst = findByRequisite(destPassport, destRequisite);
        if (accDst != null && accSrc != null && accSrc.getBalance() >= amount) {
            accDst.setBalance(accDst.getBalance() + amount);
            accSrc.setBalance(accDst.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        System.out.println(bank.users);
        System.out.println(bank.findByRequisite("3434", "5546"));
        System.out.println(bank.findByRequisite("3434", "5547"));
    }
}

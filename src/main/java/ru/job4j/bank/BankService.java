package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковских операций
 * @author Мустафин
 * @version 1.0
 * */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /** Метод добавляет пару user и accounts в коллекцию HashMap, если ее там нет.
     * @param user данные пользователя
     */
    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**   Метод добавляет Счет для пользователя.
     * @param passport - номер паспорта
     * @param account - счет для добавления
     *  Проверяет, что такого счета еще нет у данного пользователя
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /** Метод занимается поиском паспорта в списке
     * @param passport по номеру паспорта в коллекции HashMap
     * @return первый номер паспорта, который совпал
     */
    public Optional<User> findByPassportOld(String passport) {
        for (User user: users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(p -> p.getPassport().equals(passport))
                .findFirst();
    }

    /** Этот метод находит паспорт по пользователя
     * @param passport номер паспорта
     * @param requisite реквизиты
     *
     *по номеру паспорта находим пользователя.
     *Далее, находим есть ли нужный счет у данного поьзователя
     * @return Возвращаем первое совпадение
     */
    public Optional<Account>  findByRequisiteOld(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            for (Account acc : users.get(user)) {
                if (acc.getRequisite().equals(requisite)) {
                    return Optional.of(acc);
                }
            }
        }
        return Optional.empty();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(acc -> acc.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
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
        Optional<Account> accSrc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accDst = findByRequisite(destPassport, destRequisite);
        if (accSrc.isPresent() && accDst.isPresent() && accSrc.get().getBalance() >= amount) {
            accDst.get().setBalance(accDst.get().getBalance() + amount);
            accSrc.get().setBalance(accSrc.get().getBalance() - amount);
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

package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rst = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rst = user;
                System.out.println("rst = " + rst.getUsername() + " Login = " + login);
            }
        }
        if (rst == null) {
            throw new UserNotFoundException("User " + login + " not found");
        }
        return rst;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User " + user.getUsername() + " access denied");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("User + " + user.getUsername()
                    + " must be 3 symbols and more");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
        User[] usersCatch = {
                new User("Albert", false),
                new User("101", true)
        };
        try {
            User usersA = findUser(usersCatch, "Albert");
            if (validate(usersA)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            System.out.println(ui.getMessage());
        } catch (UserNotFoundException un) {
            System.out.println(un.getMessage());
        }
    }
}

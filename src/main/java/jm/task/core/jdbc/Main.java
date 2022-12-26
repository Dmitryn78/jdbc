package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванович", (byte) 23);
        System.out.println("User с именем – Иван добавлен в базу данных ");
        userService.saveUser("Петр", "Петрович", (byte) 33);
        System.out.println("User с именем – Петр добавлен в базу данных ");
        userService.saveUser("Николай", "Николаевич", (byte) 43);
        System.out.println("User с именем – Николай добавлен в базу данных ");
        userService.saveUser("Сергей", "Сергеевич", (byte) 53);
        System.out.println("User с именем – Сергей добавлен в базу данных ");

        List<User> listUsers = userService.getAllUsers();
        listUsers.forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();


        // реализуйте алгоритм здесь
    }
}

package ClassWork.work_29_04_24.Task2;

import java.util.HashMap;
import java.util.Scanner;


public class UserOptions {

    HashMap<String, User[]> userinfo;

    Scanner scanner = new Scanner(System.in);

    public UserOptions(){
        this.userinfo = new HashMap<>();
    }

    public void userRegistration(String email, String name, String password){
        User[] user = {new User(email, name, password)};
        userinfo.put(email, user);
    }

    public void userLogIn (String email, String password) {
        if (userinfo.containsKey(email)) {
            User[] users = userinfo.get(email);
            if (password.equals(users[0].password)) {
                System.out.println("Здравствуйте " +  users[1].name   + "!");
            } else {
                System.out.println("Неверный логин или пароль");
            }
        } else {
            System.out.println("Неверный логин или пароль");
        }
    }

    public void changePassword(String email, String password){
        if (userinfo.containsKey(email)) {
            User[] users = userinfo.get(email);
            if (password.equals(users[0].password)) {
                System.out.println("Введите новый пароль: ");
                users[0].password = scanner.nextLine();
                System.out.println("Вы успешно изменили пароль");

            }
        }
    }
}

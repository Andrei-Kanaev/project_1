package ClassWork.work_29_04_24.Task2;

public class User {

    String name;
    String password;
    String email;

    public User( String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String toString(){
        return
                "Имя пользователя" + name + " " +
                        "Пароль" + password + " " +
                        "email" + email + " ";
    }
}

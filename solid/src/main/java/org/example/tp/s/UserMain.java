package org.example.tp.s;

public class UserMain {

    public static void main(String[] args) {
        User userSucces = new User("john_doe", "Password123");
        LoginUser loginUser = new LoginUser();
        loginUser.loginUser(userSucces);

        User userFail = new User("john_doe", "pa");
        loginUser.loginUser(userFail);
    }
}

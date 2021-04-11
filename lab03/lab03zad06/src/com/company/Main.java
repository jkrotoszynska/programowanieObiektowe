package com.company;
import java.util.Scanner;
public class Main {

    private static User[] users = {
            new User("admin", "haslo", "token"),
            new User("helper", "hp", "---"),
            new User("ania", "kwiecien", "sekret"),
            new User("adam", "mojehaslo", "token"),
            new User("mama", "hasl", "sekrecik")
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean authenticated = false;

        while (!authenticated){
            System.out.println("Podaj nazwę użytkownika: ");
            String username = scanner.nextLine();
            System.out.println("Podaj hasło: ");
            String password = scanner.nextLine();

            for (int i = 0; i < users.length; i++){
                User user = users[i];
                if (user.authenticate(username, password)) {
                    System.out.println("Witaj, " + username + "!");
                    authenticated = true;
                    break;
                }
            }
        }

    }
}

class User{
    private String username;
    private String password;
    private String secret;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public User(String un, String pw){
        username = un;
        password = pw;
        secret = "---";

    }

    public User(String un, String pw, String sc){
        username = un;
        password = pw;
        secret = sc;
    }

    public boolean authenticate(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }

    public boolean authenticate(String sec){
        if (secret == sec && sec != "---"){
            return true;
        }
        else{
            return false;
        }
    }


}

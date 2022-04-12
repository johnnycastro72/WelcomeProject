package com.sofka.welcome;

import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        User user = new User();
        System.out.println("Nombre de usuario: ");
        user.setUserName(userInput.nextLine());
        System.out.println("Celular: ");
        user.setUserPhone(userInput.nextLine());
        System.out.println("Edad: ");
        user.setUserAge(userInput.nextInt());

        System.out.println(user);
    }
}

class User {
    private String userName = "";
    private String userPhone = "";
    private Integer userAge = 0;

    public User() {
    }

    public User(String userName, String userPhone, Integer userAge) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {

        return "Bienvenido señor " + this.getUserName() + ", es un placer para nosotros contar con una persona de "
                + this.getUserAge().toString() + " años.\nPróximamente nos comunicaremos con usted al número "
                + this.getUserPhone() + ".\nFeliz día";
    }
}
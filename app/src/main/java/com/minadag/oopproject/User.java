package com.minadag.oopproject;

public class User {

    // property
    String name;
    String job;

    // Constructor


    public User(String nameInput, String jobInput) {
        this.name = nameInput;
        this.job = jobInput;

        System.out.println("User Created"); // her bir kullanıcı oluşruulduğunda kullanıcı oluşturuldu yazar
    }
}

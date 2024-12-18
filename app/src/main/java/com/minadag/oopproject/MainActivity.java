package com.minadag.oopproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

       /*
        User myUser = new User();
        myUser.name = "Mina";

        User myJob = new User();
        myJob.job = "student";
        */

        User myUser = new User("mina", "student");
       //  System.out.println(myUser);

        CarModel carName = new CarModel("audi", 2024, "black");

         /*
         carName.year = 2023; // Private yapıldığında değiştirilemedigi icin hata verecek
        System.out.println(carName.year);
          */
        System.out.println(carName.getName());  // audi cıktısını verir
        carName.setName("BMW"); // set ile isim degistirdik
        System.out.println(carName.getName());

        // inheritance

        CarPlateNo minadag = new CarPlateNo("BMW",2024,"balck");

        System.out.println(minadag.plate());
        System.out.println(minadag.getName());

        //Pholymorphizm

        // static pholymorphizm

        Mathematics sumTest = new Mathematics();
        System.out.println(sumTest.sum());
        System.out.println(sumTest.sum(5,6));
        System.out.println(sumTest.sum(5, 6, 4));

        // dynamic pholymorphism

        Animals myAnimal = new Animals();
        myAnimal.sing();

        Dog pufy = new Dog();
        pufy.sing();
        pufy.text();

    }
}
package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int age = 20; //вызвали 2 метода
        int temp = 5;

        System.out.println(nameOfMetod(temp, age)); //вызвали 5 разных различными входными данными (аргументами)
        System.out.println(nameOfMetod(20, 6));
        System.out.println(nameOfMetod(20, 7));
        System.out.println(nameOfMetod(-40, 6));
        System.out.println(nameOfMetod(25, 54));
        System.out.println(nameOfMetod(23, 45));


        System.out.println(generateRandomAge()); // вызвали метод



    }


    private static String nameOfMetod(int temp, int age){
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30){
            return "можно идти гулять";
        }else if (age > 0 && age <=20 && temp >= 0 && temp <= 28){
            return "Можно идти гулять";
        }
        else if (age >= 45 && temp >= -10 && temp <= 25){
            return "Можно идти гулять";
        }else
            return "Оставайся дома";
    }
    public static int generateRandomAge(){ // без входяшими параментами
        Random as = new Random();
        int wertyuio = as.nextInt(70)+ 1;
        return wertyuio;

    }
}
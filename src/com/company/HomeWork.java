/**
 *  Java 1. HomeWork 1
 *
 * @author Yuri
 * @version 12.01.2022 - 13.01.2022
 */
package com.company;

public class HomeWork {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSing(){
        int a = -5;
        int b = 7;
        int sum = a+b;
        if(sum>=0){
            System.out.println("Сумма положительная"); }
        else {
            System.out.println("Сумма отрицательная");}
    }

    static void printColor(){
        int value = (int)(Math.random()*100);
        if(value<=0){
            System.out.println("Красный");
        } else if (value>0 && value<100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    static void compareNumbers(){
        int a = 10;
        int b = 12;
        System.out.println(a>=b? "a>=b" : "a<b");
    }

}

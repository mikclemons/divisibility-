package com.company;


public class Main {

    public static void main(String[] args) {
        int number = 1;
        for(int i = 1; i < 20; i++){
            if(number % i != 0){
                i = 0;
                number++;
            }
        }
        System.out.println(number);
    }
}

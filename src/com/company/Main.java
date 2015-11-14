package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj wartosc w st. C");
        Scanner wej = new Scanner(System.in); //prosi o podanie liczby
        double c;
        c = wej.nextInt();
        double f=c*1.8+32;
        System.out.println(f);
        // write your code here
    }
}
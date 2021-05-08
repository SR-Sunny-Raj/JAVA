package com.SRaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your Name and Age -: ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine() + "! you are " + input.nextInt() + " years old !");
    }
}

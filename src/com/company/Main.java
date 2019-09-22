package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the Hindi number");
        System.out.println("Enter the Marathi number");
        System.out.println("Enter the science number");
        System.out.println("Enter the English number");
        System.out.println("Enter the geography number");

        int a =100;
        int b = 500;
        
        Scanner obj = new Scanner(System.in);
        int Hindi = obj.nextInt();
        int Marathi= obj.nextInt();
        int science= obj.nextInt();
        int English= obj.nextInt();
        int geography= obj.nextInt();

        double percentage = (Hindi+Marathi+science+English+geography)*(a)/b;

        System.out.println("The percentage calculation is: "+percentage);






    }
}

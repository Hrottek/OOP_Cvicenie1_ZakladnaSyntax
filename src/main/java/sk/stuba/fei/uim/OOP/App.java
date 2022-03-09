package sk.stuba.fei.uim.OOP;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        int a =  (int)(Math.random() * 999);
        int b = (int)(Math.random() * 999);

        if(a < b)
            System.out.println("0");

        else
            System.out.println("1");
        System.out.print("Hodnota A je:");
        System.out.println(a);
        System.out.print("Hodnota B je:");
        System.out.print(b);
    }

}

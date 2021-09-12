package org.itstep;

import javax.swing.*;
import java.util.Scanner;

public class ez {
    public static void main(String[] args) {
        //Запрашивать в цикле у пользователя имя, пока оно не станет непустым
        Scanner scanner = new Scanner(System.in);
        String name= "";
        while (name.isBlank()){
            System.out.println("Enter your name");
            name=scanner.nextLine();
        }
        System.out.println("Your name is"+name);
    }
}

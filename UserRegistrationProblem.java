package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fist name:- ");
        String name = sc.next();
        Pattern pattern = Pattern.compile("^[A-Z]?[a-z]{3,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
    }


}

package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fist name:- ");
        String name = sc.next();
        System.out.print("Enter Last name:- ");
        String lname = sc.next();
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(name);
        Matcher matcher1 = pattern.matcher(lname);
        if (matcher.matches()&& matcher1.matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
        System.out.print("Enter Email id:- ");
        String Email = sc.next();
        Pattern pattern3 = Pattern.compile("^[0-9a-zA-Z]+([a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$");
        Matcher matcher3 = pattern3.matcher(Email);
        if(matcher3.matches()){
            System.out.println("valid");
        }
        else {
            System.out.println("Invalid");
        }

        System.out.print("Enter Mobile number:- ");
        String mobileNumber = sc.next();
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher4 = pattern4.matcher(mobileNumber);
        if(matcher4.matches()){
            System.out.println("valid");
        }
        else {
            System.out.println("Invalid");
        }


        System.out.print("Enter Mobile Password:- ");
        String password = sc.next();
        Pattern pattern5 = Pattern.compile("^[a-z]{8}$");
        Matcher matcher5 = pattern5.matcher(password);
        if(matcher5.matches()){
            System.out.println("valid");
        }
        else {
            System.out.println("Invalid");
        }
        Pattern pattern6 = Pattern.compile("^[A-Za-z]{8,}$");
        Matcher matcher6 = pattern.matcher("mySecretPassword");
        if (matcher.matches())
            System.out.println("valid password_rule1");
        else
            System.out.println("Invalid password)rule1");
        //uc7
        //rule3: minimum 8 chracters with atleat 1 capital chracter and 1 numeric word
        Pattern pattern7 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9]).{8,}$");
        Matcher matcher7 = pattern7.matcher("PPPass8word");
        if (matcher7.matches())
            System.out.println("valid password_rule3");
        else
            System.out.println("Invalid password_rule3");

        //uc8
        //rule4: minimum 8 chracters with atleat 1 capital chracter and 1 numeric word
        // and one special chracter
        Pattern pattern8 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9])(?=.*[\\W_]).{8,}$");
        Matcher matcher8 = pattern8.matcher("PPPass8*word");
        if (matcher8.matches())
            System.out.println("valid password_rule4");
        else
            System.out.println("Invalid password_rule4");

        //uc9
        //  1. abc@yahoo.com,
        //• 2. abc-100@yahoo.com,
        //• 3. abc.100@yahoo.com
        //• 2. abc111@abc.com,
        //• 4. abc-100@abc.net,
        //• 5. abc.100@abc.com.au
        //• 6. abc@1.com,
        //• 7. abc@gmail.com.com
        //• 8. abc+100@gmail.com
        String text = "Here are some sample email addresses:"+
                "        //  1. abc@yahoo.com,\n" +
                "        //• 2. abc-100@yahoo.com,\n" +
                "        //• 3. abc.100@yahoo.com\n" +
                "        //• 4. abc111@abc.com,\n" +
                "        //• 5. abc-100@abc.net,\n" +
                "        //• 6. abc.100@abc.com.au\n" +
                "        //• 7. abc@1.com,\n" +
                "        //• 8. abc@gmail.com.com\n" +
                "        //• 9. abc+100@gmail.com";

        // Define the regular expression to match email addresses
        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

        // Create a Pattern object from the regular expression
        Pattern pattern9 = Pattern.compile(emailPattern);

        // Use a Matcher object to find all occurrences of the pattern in the text
        Matcher matcher9 = pattern9.matcher(text);

        // Iterate over the matches and print each email address
        System.out.println("Valid email are : ");
        while (matcher9.find()) {
            String email = matcher9.group();
            System.out.println(email);
    }
}
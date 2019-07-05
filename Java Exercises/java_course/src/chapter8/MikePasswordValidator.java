package chapter8;

/*
* Validate the complexity of a proposed password by assuring it meets these rules:
*  is at least 8 characters long
*  contains an uppercase letter
*  not contain the username
*  not the same as the old password
*/

import java.util.Scanner;

public class MikePasswordValidator {

    public static final int minPasswordLength = 8;


    public static void main(String args[]){


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String userName = input.next();

        System.out.println("Please enter your old password: ");
        String oldPassword = input.next();

        System.out.println("Please enter your new password: ");
        String newPassword = input.next();

        input.close();

        //validateLength(newPassword);
        //validateUpperCase(newPassword);
        //checkForUsername(userName, newPassword);
        checkForOldPassword(oldPassword, newPassword);

    }

    public static void validateLength(String text){

        if(text.length() >= minPasswordLength){
            System.out.println("Your password meets the length requirements.");
        }else{
            System.out.println("Your password does not meet the length requirements.");

        }
    }

    public static void validateUpperCase(String text){
        boolean containsUpperCase = false;
        for (int i = 0; i < text.length(); i++){
            if (Character.isUpperCase(text.charAt(i))){
                containsUpperCase = true;
                break;
            }//else containsUpperCase = false;

            }
            if(containsUpperCase == true){
                System.out.println("Your password meets the upper case requirements.");
            }else{
                 System.out.println("Your password does not meet the upper case requirements.");
            }
    }

    public static void checkForUsername(String userName, String newPassword){

        if(newPassword.contains(userName)){
            System.out.println("Your password can't contain your username.");
        }else{
            System.out.println("Your password does not contain your username.");
        }
    }

    public static void checkForOldPassword(String oldPassword, String newPassword){

        if(oldPassword.equals(newPassword)){
            System.out.println("Your new password can't be the same as your old password");
        }else{
            System.out.println("Your new password is not the same as your old password");
        }
    }
}

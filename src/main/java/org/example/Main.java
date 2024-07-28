package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        if(StringUtils.isBlank(str)){
            System.out.println("string is blank");
        }else{
            System.out.println("String is not blank");
        }
        sc.close();
    }
}
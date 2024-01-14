/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gradecalculator;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class GradeCalculator {
    
    public static void main(String[] args){
        
        //Create a Scanner object to read the keyboard input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the student's score: ");
        
        //Read the input score
        int score = scanner.nextInt();
        
        //Close the scanner to prevent resource leak
        scanner.close();
        
        //Determine the grade based on the score
        char grade = 0;
        
        if (score >= 90 && score <= 100){
            grade = 'A';
        }
        else if (score >= 80 && score < 90) {
            grade = 'B';
        }
        else if (score >= 70 && score < 80) {
            grade = 'C';
        }
        else if (score >= 60 && score < 70) {
            grade = 'D';
        }
        else if (score >= 0 && score < 60) {
            grade = 'F';
        }
        else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            return;
        }
        
        // Print the calculated grade
        System.out.println("The student's grade is: " + grade);
    }
}

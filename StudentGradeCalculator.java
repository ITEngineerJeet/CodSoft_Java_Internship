/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgradecalculator;

/**
 *
 * @author HP
 */

import java.util.*;

class Report {
    int s1, s2, s3, s4, s5;
    float avg;
    int percent; // Changed to int for percentage
    Scanner sc = new Scanner(System.in);
    
    void getMarks() {
        System.out.print("Enter the Mark of the Subject1 : ");
        s1 = sc.nextInt();
        System.out.print("Enter the Mark of the Subject2 : ");
        s2 = sc.nextInt();
        System.out.print("Enter the Mark of the Subject3 : ");
        s3 = sc.nextInt();
        System.out.print("Enter the Mark of the Subject4 : ");
        s4 = sc.nextInt();
        System.out.print("Enter the Mark of the Subject5 : ");
        s5 = sc.nextInt();
    }
    
    float getAverage() {
        avg = (s1 + s2 + s3 + s4 + s5) / 5.0f; // Calculate average as float
        return avg;
    }
    
    void getGrades() {
        // Display grade for each subject
        System.out.println("Grades for Individual Subjects:");
        System.out.println("Subject1: " + getGrade(s1));
        System.out.println("Subject2: " + getGrade(s2));
        System.out.println("Subject3: " + getGrade(s3));
        System.out.println("Subject4: " + getGrade(s4));
        System.out.println("Subject5: " + getGrade(s5));
    }
    
    String getGrade(int marks) {
        // Assign grades based on marks
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    
    int getPercent() {
        percent = (int)(avg * 100); // Calculate percentage as integer
        return percent;
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Report r = new Report();
        char choice;

        do {
            System.out.println("The Student Grade Calculator");
            System.out.println("1. Get the Total Marks of 5 Subjects ");
            System.out.println("2. Get the Average Marks of 5 Subjects ");
            System.out.println("3. Get the Grade of Individual Subjects ");
            System.out.println("4. Get the Percentage of the Student ");
            System.out.print("Enter Your Choice : ");
            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    r.getMarks();
                    break;
                case 2:
                    float a = r.getAverage();
                    System.out.println("The Average Marks is : " + a);
                    break;
                case 3:
                    r.getGrades();
                    break;
                case 4:
                    int p = r.getPercent();
                    System.out.println("The Percentage Marks is : " + p);
                    break;
                default:
                    System.out.println("INVALID CHOICE!!!!");
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while(choice == 'y' || choice == 'Y');

        System.out.println("Program terminated.");
    }
}

/* Output of this Code 
The Student Grade Calculator
1. Get the Total Marks of 5 Subjects 
2. Get the Average Marks of 5 Subjects 
3. Get the Grade of Individual Subjects 
4. Get the Percentage of the Student 
Enter Your Choice : 1
Enter the Mark of the Subject1 : 85
Enter the Mark of the Subject2 : 90
Enter the Mark of the Subject3 : 65
Enter the Mark of the Subject4 : 78
Enter the Mark of the Subject5 : 55
Do you want to continue? (y/n): y
The Student Grade Calculator
1. Get the Total Marks of 5 Subjects 
2. Get the Average Marks of 5 Subjects 
3. Get the Grade of Individual Subjects 
4. Get the Percentage of the Student 
Enter Your Choice : 2
The Average Marks is : 74.6
Do you want to continue? (y/n): y
The Student Grade Calculator
1. Get the Total Marks of 5 Subjects 
2. Get the Average Marks of 5 Subjects 
3. Get the Grade of Individual Subjects 
4. Get the Percentage of the Student 
Enter Your Choice : 3
Grades for Individual Subjects:
Subject1: A
Subject2: A+
Subject3: C
Subject4: B
Subject5: D
Do you want to continue? (y/n): y
The Student Grade Calculator
1. Get the Total Marks of 5 Subjects 
2. Get the Average Marks of 5 Subjects 
3. Get the Grade of Individual Subjects 
4. Get the Percentage of the Student 
Enter Your Choice : 4
The Percentage Marks is : 74.60
Do you want to continue? (y/n): n
Program terminated.
*/
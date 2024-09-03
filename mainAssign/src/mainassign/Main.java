/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainassign;

import java.util.Scanner;

public class Main 
{
    public void main() 
    { 
        Student student = new Student() ;
        Scanner Input = new Scanner(System.in) ;
        int stdId ;
        String stdName ;
        int stdAge ;
        String stdEmail ;
        String stdCourse ;
        int LOOP = 0 ;
        int menuOne ;
        int menuTwo ;
        int STUDENTCOUNTER = 0 ;
        int age = 1 ;
        int search ;
        int searchDelete ;
        
        System.out.print("How many students are there total in ABC College: ") ;
        int totalStudents = Input.nextInt() ;
        student.Student(totalStudents);
        System.out.println("STUDENT MANAGEMENT APLLICATION") ;
        System.out.println("");
        
        
        while (LOOP == 0)
        {
            System.out.print("\nEnter (1) to launch menu or any other key to exit \n");
            menuOne = Input.nextInt() ;
            if (menuOne == 1)
            {
                System.out.println("\nPlease select one of the following menu items: ");
                System.out.println("(1) Capture a new student. ");
                System.out.println("(2) Search for a student. ");
                System.out.println("(3) Delete a student. ");
                System.out.println("(4) Print student report. ");
                System.out.println("(5) Exit Application. ");
                System.out.print("Option: ") ;
                menuTwo = Input.nextInt() ;
                if (menuTwo == 1)
                {
                    System.out.print("\nCAPTURE A NEW STUDENT") ;
                    System.out.print("\n*");
                    System.out.print("\nEnter the student id: ");
                    stdId = Input.nextInt() ;
                    student.setId(STUDENTCOUNTER, stdId);
                    System.out.print("Enter the student name: ");
                    stdName = Input.next() ;
                    student.setName(age, stdName);
                    System.out.print("Enter the student age: ");
                    stdAge = Input.nextInt() ;
                    while (age == 1)
                    {
                        age = student.studentAge(stdAge, STUDENTCOUNTER, age) ;
                        if (age == 1)
                        {
                            stdAge = Input.nextInt() ;
                        }
                        student.setAge(STUDENTCOUNTER, stdAge);
                    }
                    System.out.print("Enter the student email: ");
                    stdEmail = Input.next() ;
                    student.setEmail(STUDENTCOUNTER, stdEmail);
                    System.out.print("Enter the student course: ");
                    stdCourse = Input.next() ;
                    student.setCourse(STUDENTCOUNTER, stdCourse);
                    student.saveStudent(stdId, stdName, stdAge, stdEmail, stdCourse, STUDENTCOUNTER) ;
                    System.out.print("Details successfully saved!");
                    STUDENTCOUNTER = STUDENTCOUNTER + 1 ;
                }
                if (menuTwo == 2)
                {
                    System.out.print("\nEnter the student id to search: ") ;
                    search = Input.nextInt() ;
                    System.out.print("\n-----------------------------------------") ;
                    student.searchStudent(STUDENTCOUNTER, search) ;
                }
                if (menuTwo == 3)
                {
                    String choice ;
                    System.out.print("\nEnter the student id to delete: ") ;
                    searchDelete = Input.nextInt() ;
                    System.out.print("Are you sure you want to delete student " + searchDelete + " from the sysstem? Yes (y) to delete. ") ;
                    choice = Input.next() ;
                    student.deleteStudent(STUDENTCOUNTER, choice, searchDelete) ;
                }
                if (menuTwo == 4)
                {
                    student.studentReport(STUDENTCOUNTER) ;
                }
                if (menuTwo == 5)
                {
                    LOOP = student.exitStudentApplication() ;
                }
            }
            else
            {
                LOOP = 1 ;
            }        
        
       }
 }
}
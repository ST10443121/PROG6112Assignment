/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainassign;

import java.util.Scanner;

public class Student 
{
    int [] stdId = null;
    String [] stdName = null;
    int [] stdAge = null;
    String [] stdEmail = null;
    String [] stdCourse = null;
    private int searcher ;
    
    public void Student(int totalStudents)
    {
        stdId = new int[totalStudents] ;
        stdName = new String[totalStudents] ;
        stdAge = new int[totalStudents] ;
        stdEmail = new String[totalStudents] ;
        stdCourse = new String[totalStudents] ;
    }
    
    public boolean saveStudent(int studId, String studName, int studAge, String studEmail, String studCourse, int counter)
    {
        stdId[counter] = studId ;
        stdName[counter] = studName ;
        stdAge[counter] = studAge ;
        stdEmail[counter] = studEmail ;
        stdCourse[counter] = studCourse ;
        return true ;
    }
    public void searchStudent(int counter, int searcher)
    {
        int idFinder = 0 ;
        for (int x = 0; x < counter; x++)
        {
            if (stdId[x] == searcher)
            {
                System.out.print("\nSTUDENT ID: " + stdId[x]) ;
                System.out.print("\nSTUDENT NAME: " + stdName[x]) ;
                System.out.print("\nSTUDENT AGE: " + stdAge[x]) ;
                System.out.print("\nSTUDENT EMAIL: " + stdEmail[x]) ;
                System.out.print("\nSTUDENT COURSE: " + stdCourse[x]) ;
                idFinder = idFinder + 1 ;
            }
        }
        if (idFinder < 1) 
            {
                System.out.print("\nStudent with student id: " + searcher + " was not found!");
            }
        System.out.print("\n-----------------------------------------") ;
    }
    public void deleteStudent(int counter, String choice, int search)
    {
        int idFinder = 0 ;
        if (choice.equals("y"))
        {
            System.out.print("\n-----------------------------------------") ;
            for (int x = 0; x < counter; x++)
            {
                if (stdId[x] == search)
                {
                    stdId[x] = 0 ;
                    stdName[x] = "DELETED" ;
                    stdAge[x] = 0 ;
                    stdEmail[x] = "DELETED" ;
                    stdCourse[x] = "DELETED" ;
                    System.out.print("\nStudent with student Id: " + search + " WAS deleted") ;
                    idFinder = idFinder + 1 ;
                }
            }
            if (idFinder < 1) 
            {
                System.out.print("\nStudent with student id: " + searcher + " was not found!");
            }
        }
        System.out.print("\n-----------------------------------------") ;
    }
    public void studentReport(int counter)
    {
        int y = 1 ;
        for (int x = 0; x < counter; x++)
        {
            System.out.print("\nSTUDENT " + y) ;
            System.out.print("\n-----------------------------------------") ;
            System.out.print("\nSTUDENT ID: " + stdId[x]) ;
            System.out.print("\nSTUDENT NAME: " + stdName[x]) ;
            System.out.print("\nSTUDENT AGE: " + stdAge[x]) ;
            System.out.print("\nSTUDENT EMAIL: " + stdEmail[x]) ;
            System.out.print("\nSTUDENT COURSE: " + stdCourse[x]) ;
            System.out.print("\n-----------------------------------------") ;
            y = y + 1 ;
        }
    }
    public int exitStudentApplication()
    {
        return 1 ;
    }
    
    public int studentAge(int studAge, int counter, int ages)
    {
        if (studAge >= 16)
            {
                return 0 ;
            }
            else 
            {
                System.out.print("\nYou have entered a incorrect student age!!!") ;
                System.out.print("\nPlease re-enter the student age >> ");
            }
        return 1 ;
    }
    
    public void setAge(int counter, int ager)
    {
        stdAge[counter] = ager ;
    }
    public void setName(int counter, String namer)
    {
        stdName[counter] = namer ;
    }
    public void setEmail(int counter, String emailer)
    {
        stdEmail[counter] = emailer ;
    }
    public void setCourse(int counter, String courser)
    {
        stdCourse[counter] = courser ;
    }
    public void setId(int counter, int Id)
    {
        stdId[counter]=Id;

    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mainassign;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thato Mthembu
 */
public class StudentTest {
    
  @Test
    public void testSaveStudent() 
    {
        Student obj = new Student() ;
        obj.Student(1);
        obj.setAge(0, 18);
        obj.setCourse(0, "disd");
        obj.setEmail(0, "polo@me.com");
        obj.setId(0, 1478);
        obj.setName(0, "Samuel");
    }

    @Test
    public void testSearchStudent() 
    {
        Student obj = new Student() ;
        obj.Student(1);
        obj.setAge(0, 18);
        obj.setCourse(0, "disd");
        obj.setEmail(0, "polo@me.com");
        obj.setId(0, 1478);
        obj.setName(0, "Samuel");
        
        
        obj.searchStudent(0, 1478);
    }
    @Test
    public void testSearchStudent_StudentNotFound() 
    {
        Student obj = new Student() ;
        obj.Student(1);
        obj.setAge(0, 18);
        obj.setCourse(0, "disd");
        obj.setEmail(0, "polo@me.com");
        obj.setId(0, 1478);
        obj.setName(0, "Samuel");
        
        
        obj.searchStudent(0, 1596);
    }

    @Test
    public void testDeleteStudent() 
    {
        Student obj = new Student() ;
        obj.Student(1);
        obj.setAge(0, 18);
        obj.setCourse(0, "disd");
        obj.setEmail(0, "polo@me.com");
        obj.setId(0, 1478);
        obj.setName(0, "Samuel");
        
        obj.deleteStudent(1, "y", 1478);
    }
    @Test
    public void testDeleteStudent_StudentNotFound() 
    {
        Student obj = new Student() ;
        obj.Student(1);
        obj.setAge(0, 18);
        obj.setCourse(0, "disd");
        obj.setEmail(0, "polo@me.com");
        obj.setId(0, 1478);
        obj.setName(0, "Samuel");
        
        obj.deleteStudent(1, "y", 8546);
    }

    @Test
    public void testStudentReport() 
    {
        Student obj = new Student() ;
        obj.Student(2);
        obj.setAge(0, 18);
        obj.setCourse(0, "disd");
        obj.setEmail(0, "polo@me.com");
        obj.setId(0, 1478);
        obj.setName(0, "Samuel");
        
        obj.setAge(1, 19);
        obj.setCourse(1, "disd");
        obj.setEmail(1, "kia@me.com");
        obj.setId(1, 1981);
        obj.setName(1, "picanto");
        
        obj.studentReport(2);
    }
    @Test
    public void testStudentAge_StudentAgeValid()
    {
        Student obj = new Student() ;
        obj.Student(1);
        
        obj.studentAge(18, 0, 1) ;
    }
    @Test
    public void testStudentAge_StudentAgeInvalid()
    {
        Student obj = new Student() ;
        obj.Student(1);
        
        obj.studentAge(12, 0, 1) ;
    }
    @Test
    public void testStudentAge_StudentAgeInvalidCharacter()
    {
        Student obj = new Student() ;
        obj.Student(1);
        

}

}
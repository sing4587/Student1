/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamental;

/**
 *
 * @author mehta
 */
public class StudentTester {
    public static void main(String[] args)
    {
        Student1 s1=new Student1();
        s1.setName("Hamza");
        
        //Array of Student
        Student1[] s=new Student1[5];
        s[0]=s1;
        
         Student1 s2=new Student1();
        s2.setName("Jatin");
        s[1]=s2;
        
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        
    }
}

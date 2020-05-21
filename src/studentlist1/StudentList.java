/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist1;

/**
 *
 * @author josh_
 */
public class StudentList
{
    public static void main(String[] args)
    {
        Student[] sList = new Student[5];
        
        for(int i = 0; i <= sList.length - 1; i++)
        {
            sList[i] = new Student();
            sList[i].setName("Student " + (i+1));
        }
        
        for(Student s:sList)
        {
            System.out.println("Student name is: "+ s.getName());
            
        }
    }
}

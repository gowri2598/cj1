package com.crio.session2.activity1;

import ch.qos.logback.core.joran.conditional.ElseAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
 
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student st1,Student st2) {
        // TODO Auto-generated method stub
        if(st1.age == st2.age)
            return 0;
        else if(st1.age > st2.age)
            return 1;
        else 
            return -1;
    }
}

class RollComparator implements Comparator<Student>{
    @Override
    public int compare(Student st1,Student st2) {
        // TODO Auto-generated method stub
        if(st1.rollNo == st2.rollNo)
            return 0;
        else if(st1.rollNo > st2.rollNo)
            return 1;
        else 
            return -1;
    }
}

public class Student //implements Comparable<Student>
{  
    int rollNo;  
    String name;  
    int age;  
    Student(int rollno,String name,int age)
    {  
        this.rollNo=rollno;  
        this.name=name;  
        this.age=age;  
    } 
/*
    @Override
    public int compareTo(Student st) {
        // TODO Auto-generated method stub
        if(rollNo == st.rollNo)
            return 0;
        else if(rollNo > st.rollNo)
            return 1;
        else 
            return -1;
    } */

    public static void main(String args[])
    {  
        ArrayList<Student> listOfStudent = new ArrayList<Student>();  
        listOfStudent.add(new Student(10,"Ravi",26));  
        listOfStudent.add(new Student(21,"kant",27));  
        listOfStudent.add(new Student(2,"kamboj",20));  
        
		// Sort list of student objects on basis of rollNo
        //bubbleSort(listOfStudent);
        //Collections.sort(listOfStudent);
        Collections.sort(listOfStudent,new RollComparator());
		// Print sorted result
        for(Student student:listOfStudent)
        {  
            System.out.println("RollNo of Student = "+student.rollNo);
            System.out.println("Age of Student = "+student.age);
            System.out.println("Name of Student = "+student.name);
        }
    }
    
    public static void bubbleSort(ArrayList<Student> students){
       // Complete the function
       Boolean swapFlag=true;
       while(swapFlag){
        swapFlag=false;
        for(int i=0;i<students.size()-1;i++)
        {
            int res=students.get(i).compareRollNo(students.get(i+1));
            if(res>0)
            {
                Student temp=students.get(i);
                students.set(i,students.get(i+1));
                students.set(i+1,temp);
                swapFlag=true;
            }
        }
       }
    }

    private int compareRollNo(Student student) {
        // Make use of it in bubbleSort as a comparing indicator
        if(rollNo == student.rollNo)
            return 0;
        else if(rollNo > student.rollNo)
            return 1;
        else 
            return -1;
    }

    
}
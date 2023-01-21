/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.maps;

import bean.Student;
import bean.Teacher;
import java.util.HashMap;

/**
 *
 * @author Umman Hasan
 */
public class Maps
{

    public static void main(String[] args) {
        HashMap<Teacher, Student> students = new HashMap<>(); 
        Teacher teacher = new Teacher(1, "Sarkhan", "Rasullu");
        Teacher teacher2 = new Teacher(2, "Sarkhan2", "Rasullu2");
        
        //put methodu eyni key olanda kohne value-ni silir , yeni value -ni yazir
        students.put(teacher, new Student(1, "Eldar", "Novruzov"));//inikas
        students.put(teacher2, new Student(2, "Umman", "Hasanov"));//inikas
        
        System.out.println("get is called");
        students.get(teacher2);// evvel == , sonra ise .equals ile yoxlayir
        
//        String value = students.get(1);
//        System.out.println("key=1, value=" +value);
    }
}

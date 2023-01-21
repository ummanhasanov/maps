/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {
//        HashMap<Teacher, Student> students = new HashMap<>();//unsorted
        Map<Teacher, Student> students = new TreeMap<>();// sorted
        Teacher teacher = new Teacher(1, "Sarkhan", "Rasullu");
        Teacher teacher2 = new Teacher(2, "Sarkhan2", "Rasullu2");
        Teacher teacher3 = new Teacher(3, "Sarkhan3", "Rasullu3");

        //put methodu eyni key olanda kohne value-ni silir , yeni value -ni yazir
        students.put(teacher, new Student(1, "Eldar", "Novruzov"));//inikas
        students.put(teacher2, new Student(2, "Umman", "Hasanov"));//inikas
        students.put(teacher3, new Student(3, "Nergiz", "Yusifli"));//inikas

        System.out.println(students.keySet());
        System.out.println(students.values());
    }
}

package bean.treemap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Umman Hasan
 */
public class Teacher extends Person implements Comparable<Teacher>
{

    public Teacher(int ID, String name, String surname) {
        super(ID, name, surname);
    }

//    @Override
//    public int hashCode() {
//        System.out.println("teacher hashcode=" + super.getName());
//        return 1;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("equals called" + obj);
//        return super.equals(obj);
//    }

    @Override
    public int compareTo(Teacher o) {

        if (this.getID() > o.getID()) {
            return 1;
        } else if (this.getID() == o.getID()) {
            return 0;
        } else {
            return -1;
        }
    }

}

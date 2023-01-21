package bean;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Umman Hasan
 */
public class Teacher extends Person
{

    public Teacher(int ID, String name, String surname) {
        super(ID, name, surname);
    }

    @Override
    public int hashCode() {
        System.out.println("teacher hashcode="+super.getName());
        return 1;
    }
    @Override
    public boolean equals(Object obj){
        System.out.println("equals called"+ obj);
        return super.equals(obj);
    }

}

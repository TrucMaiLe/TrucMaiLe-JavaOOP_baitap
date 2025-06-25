package JAVAOOP_BAI2.company;

import JAVAOOP_BAI2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person=new Person("Mai", 25, "Nữ","Đà Lạt","123456");
        System.out.println("Name: " +person.name);
        System.out.println("Age: " +person.age);
        System.out.println("Gender: " +person.gender);
//        System.out.println("Adress: " +person.adress);//ko phai public nen ko goi dc
//        System.out.println("Phone: " +person.phone);//ko phai public nen ko goi dc


    }
}

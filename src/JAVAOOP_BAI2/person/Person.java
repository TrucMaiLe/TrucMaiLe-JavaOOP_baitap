package JAVAOOP_BAI2.person;

public class Person {
     public String name;
    public  int age;
    public   String gender;
     String adress;
     String phone;
    public Person(String name, int age, String gender,String adress, String phone){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.adress=adress;
        this.phone=phone;

    }

    public void getInfo(String name, int age, String gender,String adress, String phone){
        System.out.println("Họ và tên: " +name);
        System.out.println("Tuổi: " +age);
        System.out.println("Giới tính: " +gender);
        System.out.println("Địa chỉ: " +adress);
        System.out.println("Số điện thoại: " +phone);
    }
}

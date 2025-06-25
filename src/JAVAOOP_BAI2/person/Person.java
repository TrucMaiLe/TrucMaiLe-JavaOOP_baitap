package JAVAOOP_BAI2.person;

public class Person {
     String name;
     int age;
     String gender;
     String adress;
     String phone;
    public Person(String name, int age, String gender,String adress, String phone){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.adress=adress;
        this.phone=phone;
        //in ra thông tin
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Adress: " +adress);
        System.out.println("Phone: " +phone);
    }
    public Person(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        //In thông tin
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
    }
     void getInfo(String name, int age, String gender,String adress, String phone){
        System.out.println("Họ và tên: " +name);
        System.out.println("Tuổi: " +age);
        System.out.println("Giới tính: " +gender);
        System.out.println("Địa chỉ: " +adress);
        System.out.println("Số điện thoại: " +phone);
    }
}

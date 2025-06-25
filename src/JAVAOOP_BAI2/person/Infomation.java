package JAVAOOP_BAI2.person;

public class Infomation {
    public static void main(String[] args) {
        Person person=new Person("Mai", 25, "Nữ","Đà Lạt","123456");
        System.out.println("================================================");
        person.getInfo("Lê Thị Trúc Mai",26,"Nữ","Lâm Đồng","0123456789");
    }
}

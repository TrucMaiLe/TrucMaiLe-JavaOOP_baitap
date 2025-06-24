package JAVAOOP_BAI1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NhanVien {
    //Lưu từng  thong tin nhân viên
void name(String name){
    System.out.println("Tên Nhân Viên là: " +name);
}void age(int age){
        System.out.println("Tuổi nhân viên là: "+age);

    }void adress(String adress){
        System.out.println("Địa chỉ nhân viên là: "+adress);
    }
    //hàm lưu 1 loạt thông tin nhân viên
    List<String> thongtinNhanVien(String name, int age, String adress){
    List<String> InfoNhanVien=new ArrayList<>(Arrays.asList(name,String.valueOf(age),adress));
    return InfoNhanVien;
    }
}

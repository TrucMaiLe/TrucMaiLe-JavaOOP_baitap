package JAVAOOP_BAI1;

import java.util.List;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanvien=new NhanVien();
        System.out.println("Thông tin nhân viên 1: ");
        nhanvien.name("Trúc Mai");
        nhanvien.age(25);
        nhanvien.adress("Đức Trọng, Lâm Đồng");
        System.out.println("==================================");
        System.out.println("Thông tin nhân viên 2: "+nhanvien.thongtinNhanVien("Ngọc",
                26,
                "Đà Lạt"));
    }
}

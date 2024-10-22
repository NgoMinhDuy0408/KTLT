package buoi2;

import java.util.Scanner;

public class Duy110186 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 5.5;

        String tenLop = "GD24A"; 
        System.out.println("Xin chào các bạn tân sinh viên lớp " + tenLop);
        System.out.println("Xin chào các bạn tân sinh viên lớp \"" + tenLop + "\"");
        System.out.println("Giá trị của num1 là " + num1);
        System.out.println("Giá trị của num2 là " + num2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("GD24A");
        String tenLopNhap = scanner.nextLine();
        System.out.println("Xin chào các bạn tân sinh viên");
        System.out.println("lớp " + tenLopNhap);

        System.out.println("110186:");
        int soSinhVien = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("STT\tHỌ VÀ TÊN\tLỚP");
        for (int i = 1; i <= soSinhVien; i++) {
            System.out.print(i + "\t");
            System.out.print("Họ và tên " + i + "\t");
            System.out.println(tenLopNhap);
        }

        scanner.close();
    }
}
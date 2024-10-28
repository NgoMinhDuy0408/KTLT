import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin trường hợp 1
        System.out.println("Nhập họ và tên:");
        String hoTen1 = scanner.nextLine();
        
        System.out.println("Nhập ngày sinh:");
        String ngaySinh1 = scanner.nextLine();
        
        System.out.println("Nhập điểm tổng kết:");
        String diemTongKet1Str = scanner.nextLine();
        
        System.out.println("Nhập tuổi:");
        String tuoi1Str = scanner.nextLine();
        
        // Chuyển đổi kiểu dữ liệu
        float diemTongKet1 = Float.parseFloat(diemTongKet1Str);
        int tuoi1 = Integer.parseInt(tuoi1Str);
        
        // Hiển thị thông tin
        System.out.println("-----THÔNG TIN SINH VIÊN (Trường hợp 1)-----");
        System.out.println("Họ và tên: " + hoTen1 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh1 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet1 + " (Float)");
        System.out.println("Tuổi: " + tuoi1 + " (Int)");
        System.out.println("-----HẾT-----");

       
        // Nhập thông tin trường hợp 2
        System.out.println("Nhập họ và tên:");
        String hoTen2 = scanner.nextLine();
        
        System.out.println("Nhập ngày sinh:");
        String ngaySinh2 = scanner.nextLine();
        
        System.out.println("Nhập điểm tổng kết:");
        Float diemTongKet2 = scanner.nextFloat();
        
        System.out.println("Nhập tuổi:");
        int tuoi2 = scanner.nextInt();
        
        // Hiển thị thông tin
        System.out.println("-----THÔNG TIN SINH VIÊN (Trường hợp 2)-----");
        System.out.println("Họ và tên: " + hoTen2 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh2 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet2 + " (String)");
        System.out.println("Tuổi: " + tuoi2 + " (String)");
        System.out.println("-----HẾT-----");
        
        scanner.close();
    
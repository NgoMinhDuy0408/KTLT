public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int max = (a > b) ? a : b;
        System.out.println("Giá trị lớn nhất: " + max);
        int min = (a < b) ? a : b;
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}
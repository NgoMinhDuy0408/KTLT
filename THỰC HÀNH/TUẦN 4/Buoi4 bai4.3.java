public class Buoi4 {
    public static void bai4_3() {
        int arr1[][] = new int[2][3];
        int i = 0, j = 0;
        System.out.printf("Phần tử thứ nhất arr1[%d][%d]", i, j);
        System.out.printf("\nPhần tử thứ hai arr1[%d][%d]", i, j = j + 1);
        System.out.printf("\nPhần tử thứ ba arr1[%d][%d]", i, j = j + 1);
        System.out.printf("\nPhần tử thứ tư arr1[%d][%d]", i = i + 1, j = 0);
        System.out.printf("\nPhần tử thứ năm arr1[%d][%d]", i, j = j + 1);
        System.out.printf("\nPhần tử thứ sáu arr1[%d][%d]", i, j = j + 1);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        bai4_3();
    }
    }
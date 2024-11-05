package buoi4;

public class cau1 {
    public static void bai4_1(){
        int arr[] = {3, 5, 8, 10, 14, 25};  
        for (int i = 0; i < arr.length; i++) { 
            System.out.printf("Phan tu thu %d arr[%d] = %d\n", i+1, i, arr[i]);
    }
}

public static void bai4_2(){
    String nguHanh[] = { "kim", "moc", "thuy", "hoa", "tho" };
    for (int i = 0; i < nguHanh.length; i++) { 
        System.out.printf("Phan tu thu %d nguHanh[%d] = %s\n", i+1, i, nguHanh[i]);
    }
}

public static void bai4_3(){
    int arr1[][] = new int[2][3];  
    for (int i = 0; i < arr1.length; i++) { 
        for (int j = 0; j < arr1[i].length; j++) { 
            System.out.printf("Phan tu thu %d arr1[%d][%d]\n", i * arr1[i].length + j + 1, i, j); 
        } 
    }
}

public static void bai4_4(){
    int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } }; int count = 1; 
     for (int i = 0; i < arr2.length; i++) { 
        for (int j = 0; j < arr2[i].length; j++) { 
        System.out.printf("Phan tu thu %d arr2[%d][%d] = %d\n", count++, i, j, arr2[i][j]);
        } 
    } 
}
    
public static void main(String[] args) {
    bai4_1();
    bai4_2();
    bai4_3();
    bai4_4();
}
}

/**
 * Java_Level 1 HomeWork_3
 * 
 * @autor Roman Ukolov
 * @version 15.02.2022 - 16.02.2022
 */
 
 import java.util.Arrays;
 
 
class HomeWork_3 {
    public static void main(String[] args) {
        reverseArray();
        emptyArray();
        upgradeArray();
        squarArray();
        int[] arrData = returnArray(15, 5);
        System.out.println(Arrays.toString(arrData));
    }
    
    static void reverseArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Original array:" + " " +Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0)? 1 : 0;
        }
        System.out.println("Invert array:" + "   " +Arrays.toString(arr));
        System.out.println();
    }
    
    static void emptyArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    
    static void upgradeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    
    static void squarArray() {
        int[][] arr = new int [5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == arr[i].length - i - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static int[] returnArray(int len, int initialValue) {
        int[] arr = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
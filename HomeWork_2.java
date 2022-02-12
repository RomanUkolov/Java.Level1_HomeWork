/**
 * Java_Level 1 HomeWork_2
 * 
 * @autor Roman Ukolov
 * @version 12.02.2022
 */
 
class HomeWork_2 {
    public static void main (String[] args) {
        boolean result = CheckNumberSum (11, 8);
        System.out.println(result);
    }
    
    static boolean CheckNumberSum (int a, int b) {
        return a + b >=10 && a + b <= 20;
    }
}

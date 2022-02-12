/**
 * Java_Level 1 HomeWork_2
 * 
 * @autor Roman Ukolov
 * @version 12.02.2022
 */
 
class HomeWork_2 {
    public static void main (String[] args) {
        boolean result = CheckNumberSum (11, 8);
        System.out.println("Check - " + result);
        PositiveOrNegative (-10);
        boolean res2 = NegativeNumber (-5);
        System.out.println("Result - " + res2);
        RepeatWord ("Hello", 3);
    }
    
    static boolean CheckNumberSum (int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void PositiveOrNegative ( int i) {
        System.out.println(i >= 0? "Number is positive" : "Number is negative");
    }
    
    static boolean NegativeNumber (int i) {
        return i <= 0;
    }
    
    static void RepeatWord (String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}

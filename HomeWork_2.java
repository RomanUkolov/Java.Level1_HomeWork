/**
 * Java_Level 1 HomeWork_2
 * 
 * @autor Roman Ukolov
 * @version 12.02.2022
 */
 
class HomeWork_2 {
    public static void main (String[] args) {
        boolean result = checkNumberSum (11, 8);
        System.out.println("Check - " + result);
        positiveOrNegative (-10);
        boolean res2 = negativeNumber (-5);
        System.out.println("Result - " + res2);
        repeatWord ("Hello", 3);
    }
    
    static boolean checkNumberSum (int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void positiveOrNegative ( int i) {
        System.out.println(i >= 0? "Number is positive" : "Number is negative");
    }
    
    static boolean negativeNumber (int i) {
        return i <= 0;
    }
    
    static void repeatWord (String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}

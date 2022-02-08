class HomeWork_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    public static void printThreeWords() {
    
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    
    }
    
    public static void checkSumSign() {
        int a = 5;
        int b = 7;
        //if (a+b>=0) {
            //System.out.println("The sum is positive");
        //} else {
           // System.out.println("The sum is negative");
        //}
        System.out.println(a+b>=0? "The sum is positive" : "The sum is negative");       
    } 
    
    public static void printColor() {
        int value = 55;
        
        if (value <= 0) {
            System.out.println("'Red color'");
        }
        if (value > 0 && value <= 100) {
            System.out.println("'Yellow color'");
        }
        if (value > 100) {
            System.out.println("'Green color'");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        System.out.println(a>=b? "a>=b" : "a<b");
    }
        
}
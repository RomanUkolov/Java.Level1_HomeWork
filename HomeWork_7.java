/**
 * Java_Level 1 HomeWork_7
 * 
 * @autor Roman Ukolov
 * @version 01.03.2022 
 *
 */
 
class HomeWork_7 {
    public static void main (String[] args) {
        Cat[] cats = {
            new Cat("Murzic", 10),
            new Cat("Barsik", 10),
            new Cat("Tom", 15)
        };
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        Plate plate = new Plate(25);
        System.out.println("Full " + plate);
        System.out.println();
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(plate);
        }
        System.out.println();
        plate.addFood(20);
        System.out.println(plate);
        System.out.println();
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(plate);
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }
    
    void eat(Plate plate) {
        if ((plate.getFood() > appetite) && (fullness == false)) {
            plate.decreaseFood(appetite);
            fullness = true;
            System.out.println("Cat: " + name + ", appetite:" + appetite + ",fullness: " + fullness);
        } else {System.out.println("Cat: " + name + ", appetite:" + appetite + ",fullness: " + fullness);
        }
    }
    
    @Override
    public String toString() {
        return "Cat: " + name + ", appetite:" + appetite + ",fullness: " + fullness;
    }
}

class Plate {
    private int food;
    
    Plate(int food) {
        this.food = food;
    }
    
    void decreaseFood(int food) {
        if(this.food >= food) {
        this.food -= food;
        }
    }
    
    int getFood() {
        return food;
    }
    
    void addFood(int food) {
        this.food += food;
    }
    
    @Override
    public String toString() {
        return "Plate: " + food;
    } 
}
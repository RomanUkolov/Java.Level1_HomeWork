/**
 * Java_Level 1 HomeWork_6
 * 
 * @autor Roman Ukolov
 * @version 25.02.2022
 */
 
class HomeWork_6 {
    public static void main (String[] args) {
        IAnimal[] animals = {
            new Cat("Murzic", 200, 0),
            new Dog("Polkan", 500, 10)
        };
        for (IAnimal animal : animals) {
            System.out.println(animal);
            animal.run(510);
            animal.run(250);
            animal.run(150);
            System.out.println();
            animal.swim(5);
            System.out.println();
            animal.swim(15);
            
        }
    }
}

interface IAnimal {
    public void swim(int dist);
    public void run(int dist);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    
    Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }
    

    public void run(int dist) { 
        if (maxRun >= dist) {
            System.out.println(name + " run " + dist + " m.");
        } else {
        System.out.println(name + " can't run so far.");
        }
    }
    
    public void swim(int dist) { 
        if (maxSwim >= dist) {
            System.out.println(name + " swim " + dist + " m.");
        } else {
        System.out.println(name + " can't swim so far.");
        }
    }
       
    @Override
    public String toString() {
        return name + ", " + maxRun + ", " + maxSwim;
    }
}

class Cat extends Animal {
    Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
    
    @Override
    public void swim(int dist) {
        System.out.println("Cat's no swim");
    }
}

class Dog extends Animal {
    Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
}

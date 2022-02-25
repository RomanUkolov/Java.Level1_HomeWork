/**
 * Java_Level 1 HomeWork_5
 * 
 * @autor Roman Ukolov
 * @version 24.02.2022
 */
 
class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int income;
    private int age;
    
    Person(String name, String position, String email, String phone, int income, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.income = income;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + income + ", " + age;
    }
}
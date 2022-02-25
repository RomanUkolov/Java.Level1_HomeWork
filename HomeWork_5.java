/**
 * Java_Level 1 HomeWork_5
 * 
 * @autor Roman Ukolov
 * @version 23.02.2022
 */
 
class HomeWork_5 {
    public static void main (String[] args) {
        Person[] persArray = new Person[5];
            persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",50000,41);
            persArray[1] = new Person("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314",50000,32);
            persArray[2] = new Person("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315",10000,43);
            persArray[3] = new Person("Pupkina Nadegda", "EnvelopeLicker", "pupkina@mailbox.com", "892312316",5000,18);
            persArray[4] = new Person("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317",3000,21);
            
        for (Person person : persArray) {
            if (person.getAge() > 40) 
                System.out.println(person);
        }
    }
}
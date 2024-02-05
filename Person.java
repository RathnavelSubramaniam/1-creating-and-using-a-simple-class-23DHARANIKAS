public class Person {
     String firstName;
     String lastName;
     int age;
     Person(){
        firstName="";
        lastName="";
        age=0;
     } 
     Person(String fName, String lName, int a) {
        firstName = fName;
        lastName = lName;
        age = a;
    }
     String FullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 30);
        Person person2 = new Person("Alice", "Smith", 25);
        System.out.println("Person 1: " + person1.FullName() );
        System.out.println("Person 2: " + person2.FullName());
        double averageAge = (person1.age + person2.age) / 2.0;
        System.out.println("Average Age: " + averageAge);
    }
}
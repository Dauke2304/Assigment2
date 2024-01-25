import java.util.ArrayList;
import java.util.Collections;// Comparable interface
public class Main {

    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();

        // Add some employees and students to the list
        peopleList.add(new Employee("Dauletkhan", "Bulanbaev", "teacher", 270450.78));
        peopleList.add(new Student("Jon", "Wick", 2.41));
        peopleList.add(new Student("Tony", "Stark", 3.11));
        peopleList.add(new Employee("Thor", "ThunderGod", "Hero", 500000.00));
        peopleList.add(new Employee("Kayrat", "Nurtas", "Singer", 1200000.00));

        // Sort the list based on payment amount using Collections.sort
        Collections.sort(peopleList);

        // Print the data
        printData(peopleList);
    }



    public static void printData(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}

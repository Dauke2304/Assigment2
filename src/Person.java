public class Person implements Payable,  Comparable<Person> {//Person is a superclass, Student and Employee are subclasses
    private static int next_Id = 1;//static counter of id
    private int id;// id of created object
    private String name;// Name of person
    private String surname;// Surname

    public Person() {
        this.id = next_Id++;
    }//no argument constructor that counts id

    public Person(String name, String surname) {// Parametrized constructor where Person gets value
        this();//calls no argument constructor
        this.name = name;
        this.surname = surname;
    }
    public String toString(){
        return id + ". " + name + " "+ surname;
    }//to string method outputs all information of object

    public double getPaymentAmount() {
        return 0.0;
    }
    @Override
    public int compareTo(Person person) {//comparing the payment if first greater returns positive, if equal zero, if less negative
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
    public int getId() {
        return id;
    }// there are getter and setters
    public String getPosition() {
        return "Person";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}


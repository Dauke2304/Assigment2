
public class Student extends Person {//it means Student is a subclass of Person and there is no need adding new fields like name,surname,id e.t
    private double gpa;// unique field of Student
    public Student(){//no argument constructor
    }
    public Student(String name, String surname, double gpa) {//Parametrized constructor where Student gets value
    super(name,surname);//calls super class constructor that gets a value of id,name and surname
    this.gpa =gpa;// gpa field gets value
    }
    @Override//it means the superclass method calls and works same, but with Employee's unique value.
    public String toString(){
        return super.toString()+"\nGpa: "+gpa;
    }
    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00 : 0.00;
    }
    public double getGpa() {
        return gpa;
    }//getters and setters

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}


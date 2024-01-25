public class Employee extends Person {// it means Employee is a subclass of Person and there is no need adding new fields like name,surname,id e.t
    private String position;//2 unique fields of Employee
    private double salary;

    public Employee(){
        super();//no argument constructor
    }
    public Employee(String name, String surname, String position, double salary){//Parametrized constructor where Employee gets value
        super(name,surname);//calls super class constructor that gets a value of id,name and surname
        this.position = position;
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }//getters and setters

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getPaymentAmount() {
        return salary;
    }
@Override// it means the superclass method calls and works same, but with Employee's unique value.
    public String toString(){
        return super.toString()+ "\nPosition: "+ position+"\nSalary: "+salary;
    }
}

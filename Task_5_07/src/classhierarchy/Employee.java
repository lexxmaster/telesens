package classhierarchy;

import java.util.Calendar;
import java.util.Date;

public abstract class Employee{
    private Citizen citizen;
    private String position;

    public Employee(Citizen citizen, String position){
        this.citizen = citizen;
        this.position = position;
    }

    public Employee(String name, Calendar birthdate, String country, String position){
        citizen = new Citizen(name, birthdate, country);
        this.position = position;
    }

    @Override
    public String toString(){
        return citizen.toString() + " position: " + position;
    }
    abstract public double calculateMonthSalary();
}

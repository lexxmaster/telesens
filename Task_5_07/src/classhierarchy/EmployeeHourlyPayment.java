package classhierarchy;

public class EmployeeHourlyPayment extends Employee{
    int hourlyRate, workedHours;

    public EmployeeHourlyPayment(Citizen citizen, String position) {
        super(citizen, position);
    }

    public void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    public void setWorkedHours(int workedHours){
        this.workedHours = workedHours;
    }

    @Override
    public double calculateMonthSalary() {
        return hourlyRate * workedHours;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

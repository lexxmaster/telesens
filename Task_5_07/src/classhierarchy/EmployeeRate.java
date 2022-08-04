package classhierarchy;

public class EmployeeRate extends Employee{
    private int rate, awardPercent;

    public EmployeeRate(Citizen citizen, String position, int rate, int awardPercent) {
        super(citizen, position);
        this.rate = rate;
        this.awardPercent = awardPercent;
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public double calculateMonthSalary() {
        return rate * (1 + awardPercent/100);
    }
}

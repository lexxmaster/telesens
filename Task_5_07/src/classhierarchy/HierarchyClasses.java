package classhierarchy;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class HierarchyClasses {
    public static void main(String[] args) {
        Employee[] arrEmp = new Employee[2];

        //Calendar birthday1 = new GregorianCalendar();
        Citizen citizen1 = new Citizen("Vasiliy Alibabaevich", new GregorianCalendar(1980, 9, 12), "Livia");
        EmployeeRate firstEmp = new EmployeeRate(citizen1, "boss", 1500,10);

        Citizen citizen2 = new Citizen("Bohdan Khmelnytskyi", new GregorianCalendar(1596, 1, 6), "Ukraine");
        EmployeeHourlyPayment secondEmp = new EmployeeHourlyPayment(citizen2, "hetman");

        secondEmp.setHourlyRate(50);
        secondEmp.setWorkedHours(150);

        arrEmp[0] = firstEmp;
        arrEmp[1] = secondEmp;

        for (Employee emp:arrEmp
             ) {
            System.out.println(emp);
            System.out.println("Salary: " + emp.calculateMonthSalary());
        }
    }
}

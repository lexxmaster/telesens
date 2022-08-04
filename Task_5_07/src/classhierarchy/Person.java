package classhierarchy;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import static java.util.Calendar.*;

public class Person {
    private String name;
    private Calendar birthdate;
    int age;
    //private enum sex{};

    public Person(String name, Calendar birthdate){
        this.name = name;
        this.birthdate = birthdate;
        Calendar currDate = Calendar.getInstance();

        age = currDate.get(YEAR) - birthdate.get(YEAR);
    }

    public void updateAge(){
        Calendar currDate = Calendar.getInstance(); //new Date(System.currentTimeMillis());
        age = currDate.get(YEAR) - birthdate.get(YEAR);
    }

    @Override
    public String toString(){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        return "name: " + name + " birthdate: " + format1.format(birthdate.getTime()) + " age: " + age;
    }


}


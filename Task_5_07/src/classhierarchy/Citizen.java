package classhierarchy;

import java.util.Calendar;
import java.util.Date;

public class Citizen extends Person{
    private String country;

    public Citizen(String name, Calendar  birthdate, String country) {
        super(name, birthdate);
        this.country = country;
    }

    @Override
    public String toString(){
        return super.toString() + " country: " + country;
    }
}

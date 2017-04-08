package Voyages;

import java.sql.Time;
import java.util.Date;

public class Vol extends Voyage {
    public Vol(String id, Time hDep, Time hArr, Date date) {
        super(id, hDep, hArr, date);
    }
}
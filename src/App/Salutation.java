package App;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Salutation {
    public static void main(String[] args) {
        String name = "joão";
        String temp;
        Locale brasil = new Locale("pt","BR");
        String week = LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        int hours = LocalDateTime.now().getHour();

        if (hours >= 6 && hours < 12){
            temp = "moring";
        } else if (hours >= 12 && hours < 18) {
            temp = "afternom";
        }else if (hours >= 18 && hours < 24) {
            temp = "Night";
        } else {
            temp = "dawn";
        }

        System.out.printf("Hello, %s. today is %s, good %s",name,week,temp);
    }
}

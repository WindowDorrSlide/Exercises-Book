package Kap4;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class birthday {
    public static void main(String[] args) {
        String birthday = JOptionPane.showInputDialog("When is your Birthday DD-MM-YY");

        DateFormat df = new SimpleDateFormat("dd-MM-yy");
        LocalDateTime today = LocalDateTime.now();
        String date = df.format(today);

        if (birthday.equals(date))    {
            JOptionPane.showMessageDialog(null, "Happy birthday!!!");
        }

    }
}

package Kap4;

import javax.swing.*;

public class genderconfirm {
    public static void main(String[] args) {
        String gender = JOptionPane.showInputDialog("Gender kille/tjej");
        int personnummer = Integer.parseInt(JOptionPane.showInputDialog("Social Security Number"));

        int gender_int = 0;
        if (gender.equals("kille")) {
            gender_int = 1;
        } else if (!gender.equals("tjej")) {
            System.exit(0);
        }

        int secondtolast = (personnummer / 10) % 10;

        JOptionPane.showMessageDialog(null, secondtolast % 2 == gender_int );
    }
}

package Kap4;
import javax.swing.*;
public class mobiloperatör {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        int minutes = Integer.parseInt(JOptionPane.showInputDialog("How many minutes per month?"));

        if (minutes < 33) {
            JOptionPane.showMessageDialog(null, "Kontant är bästa valet för dig");
        } else if (minutes < 66) {
            JOptionPane.showMessageDialog(null, "Normal är bästa valet för dig");
        } else  {
            JOptionPane.showMessageDialog(null, "Plus är bäst för dig");
        }

        System.exit(1);
    }
}

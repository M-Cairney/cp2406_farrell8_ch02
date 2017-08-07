import javax.swing.*;

/**
 * Created by Jc260799 on 7/08/17.
 */
public class QuartsToGallons {

    public static void main(String[] args) {

        String quartsString;
        int quarts;

        quartsString = JOptionPane.showInputDialog(null, "Enter number of Quarts needed: ", "Quarts",
                JOptionPane.INFORMATION_MESSAGE);
        quarts = Integer.parseInt(quartsString);

        JOptionPane.showMessageDialog(null, "A job that needs " + quarts + " quarts requires "
                + (quarts / 4) + " gallons plus " + (quarts % 4) + " quarts");
    }
}

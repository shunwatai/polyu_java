import javax.swing.*;

class Temp{
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, "This program is used to convert celsius to fahrenheit.");

        double c,f;
        String input;

        input = JOptionPane.showInputDialog(null, "Enter the celsius: ", JOptionPane.QUESTION_MESSAGE);
        c = Double.parseDouble(input);

        f = 1.8 * c + 32;
        JOptionPane.showMessageDialog(null, "Coverted Temp in fahrenheit: " + f, "Temp in Fahrenheit",JOptionPane.INFORMATION_MESSAGE);

    }
}

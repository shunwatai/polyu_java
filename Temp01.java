import javax.swing.*;

class Temp01{
    public static void main(String arg[]){
        double cel,fah;
        String input;
        
        input = JOptionPane.showInputDialog(null, "cel: ");
        cel = Double.parseDouble(input);
        
        fah = 1.8 * cel + 32;
        JOptionPane.showMessageDialog(null, "converted: " + fah);
    }
}

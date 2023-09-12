import javax.swing.JOptionPane;

public class GUI{
    public static void main(String args[]){

        String name = JOptionPane.showInputDialog("Enter ur name:");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter ur Age"));
        JOptionPane.showMessageDialog(null,"U are :"+age+"years old");

        double height = Double.parsedouble(JOptionPane.showInputDialog("Enter ur Age"));
        JOptionPane.showMessageDialog(null,"U are :"+age+"years old");
    }
}
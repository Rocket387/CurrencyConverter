import javax.swing.*;

public class Function {

    //catches string values when entered (should only be numbers entered into the program)
    public boolean check(String input){
        try{
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public void poundsToDollar(double inputToDouble ){
        double Doll = inputToDouble * 1.21;
        JOptionPane.showMessageDialog(null, "Amount of Dollars: " +Doll+"dollars");
    }

    public void poundsToEURO(double inputToDouble ){
        double EURO = inputToDouble * 1.117;
        JOptionPane.showMessageDialog(null, "Amount of EURO: " +EURO+"euros");
    }

    public void poundsToYEN(double inputToDouble ){
        double YEN = inputToDouble * 180.59;
        JOptionPane.showMessageDialog(null, "Amount of JPY: " +YEN+"YEN");
    }


}

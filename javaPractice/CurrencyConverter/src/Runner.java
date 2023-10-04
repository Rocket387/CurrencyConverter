import javax.swing.*;

public class Runner {
    public static void main(String[] args) {

        Function f = new Function();
        Object[] option1 = {"DOLLARS", "EURO", "YEN", "Quit"};
        Object[] option2 = {"Try Again", "Quit"};

        while(true) {

            String input = JOptionPane.showInputDialog(null, "Enter value: ");
            System.out.println(input);

            //calls check method in function
            if (f.check(input) == true) {
                //converting input into a double
                double inputToDouble = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null, "Choose which currency you " +
                        "would like to convert", "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, option1, option1[3]);

                if(choice1 == 0){
                    f.poundsToDollar(inputToDouble);

                    int choice2 = JOptionPane.showOptionDialog(null, "What would you like to do?"
                            , "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){

                    } else {
                        break;
                    }
                } if (choice1 == 1) {
                    f.poundsToEURO(inputToDouble);

                    int choice2 = JOptionPane.showOptionDialog(null, "What would you like to do?"
                            , "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if (choice2 == 0) {
                    } else {
                        break;
                    }
                } if(choice1 == 2) {
                    f.poundsToYEN(inputToDouble);

                        int choice2 = JOptionPane.showOptionDialog(null, "What would you like to do?"
                                , "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                        if(choice2 == 0){

                        } else {
                            break;
                        }
                    }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Output, try again");

                int choice2 = JOptionPane.showOptionDialog(null, "What would you like to do?",
                        "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                if(choice2 == 0){

                } else {
                    break;
                }
            }

        }

    }
}

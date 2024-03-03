//Advanced Lab- Leap Years
//Neil McCarthy - x23319828

import javax.swing.JOptionPane;

public class Leapyears {
    public static void main(String[] args) {
        //vars
        int year =0;
        //input
        year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year: "));
        //process + output
        if (year % 4 == 0) {
            //if year is divisible by 4, it is a leap year
            if (year % 100 != 0 || year % 400 == 0){
                //if year is not divisible by 100, or is divisible by 400, it is a leap year
                JOptionPane.showMessageDialog(null, year + " is a leap year.");
            } else {
                JOptionPane.showMessageDialog(null, year + " is not a leap year.");
            }
        } else {
            JOptionPane.showMessageDialog(null, year + " is not a leap year.");
        }
    }
}
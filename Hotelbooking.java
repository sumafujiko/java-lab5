//Lab 2 - Hotel Booking
//Neil McCarthy - x23319828

import javax.swing.JOptionPane;

public class Hotelbooking {
    public static void main(String[] args) {
        //vars
        int age =  0;
        String name;
        int numNights;
        int roomCost = 90;
        //input
        age = Integer.parseInt(JOptionPane.showInputDialog("Welcome to the hotel! Please enter your age: "));
        
        if (age < 18) {
            JOptionPane.showMessageDialog(null, "Sorry, you are too young to book a room");
            System.exit(0);
        } 

        name = JOptionPane.showInputDialog("Whose name will the booking be under? ");

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, you must enter a name to book a room");
            System.exit(0);
        }

        numNights = Integer.parseInt(JOptionPane.showInputDialog("Hi " + name + ", please enter the number of nights you will be staying: "));
        //process
        int totalCost = roomCost * numNights;
        //output
        JOptionPane.showMessageDialog(null, "Okay " + name + ", a booking for " + numNights + " nights will cost €" + totalCost + ". Thank you for booking with us!");
        //end
    }
}
//********************************************************************************
// PANTHERID:  [6164011]
// CLASS: COP 2210 – [fall 2018]
// ASSIGNMENT  [3]
// DATE: [31/10/2018]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package hous.of.horrors;

import javax.swing.JOptionPane;

public class HouseOfHorrors {

    public static void main(String[] args) {

        ScaryHouse scaryhouse = new ScaryHouse();
        scaryhouse.Start();
        scaryhouse.door();
        JOptionPane.showMessageDialog(null, "Your Backpack contains "
                + scaryhouse.getbackpack());
    }
    
}
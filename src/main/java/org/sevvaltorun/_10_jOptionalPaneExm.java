package org.sevvaltorun;

import javax.swing.JOptionPane;

public class _10_jOptionalPaneExm {
    public static void main(String[] args) {
        int answer = JOptionPane.showConfirmDialog(null, "Do u like to Java?");
        if (answer == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Awesome, this great sounds!");
        } else if (answer == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Ups..Why? This is so sad");
        } else {
            JOptionPane.showMessageDialog(null, "Please, select one option!");
        }
    }
}
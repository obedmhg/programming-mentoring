package org.example.session;

import javax.swing.*;
import java.util.Random;

public class Session02 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer answer = random.nextInt(10) + 1;
        String guess = JOptionPane.showInputDialog("Guess");
        if(answer.toString() == guess) {
            JOptionPane.showMessageDialog(null, "You did it");
        } else {
            JOptionPane.showMessageDialog(null, "Fail");

        }
    }
}

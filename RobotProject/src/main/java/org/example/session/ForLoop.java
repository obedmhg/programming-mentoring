package org.example.session;

import javax.swing.*;
import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {
        Random random = new Random();
        Integer answer = random.nextInt(10) + 1;
        for (int i=0; i<5; i++) {
            String answerByUser = JOptionPane.showInputDialog("Guess the number:");
            if (answer.toString().equals(answerByUser)) {
                JOptionPane.showMessageDialog(null, "Win!!");
            } else {
                JOptionPane.showMessageDialog(null, "Lose");
            }
        }

    }
}

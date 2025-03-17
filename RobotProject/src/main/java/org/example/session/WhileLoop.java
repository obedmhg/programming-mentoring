package org.example.session;

import javax.swing.*;
import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        Random random = new Random();
        Integer answer = random.nextInt(10) + 1;
        boolean atinaste = false;

        while(atinaste==false) {
            String answerByUser = JOptionPane.showInputDialog("Guess the number:");
            if (answer.toString().equals(answerByUser)) {
                JOptionPane.showMessageDialog(null, "Win!!");
                atinaste = true;
            } else {
                if (answer > Integer.parseInt(answerByUser)) {
                    JOptionPane.showMessageDialog(null, "up please");
                } else {
                    JOptionPane.showMessageDialog(null, "down please");
                }
            }
        }

    }
}

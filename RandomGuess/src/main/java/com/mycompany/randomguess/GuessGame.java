/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randomguess;
import javax.swing.JOptionPane;
/**
 *
 * @author andre
 */
public class GuessGame {
    public static void main(String[] args){
        String num1; 
        int randNum = (1 + (int)(Math.random() * 1000)), numGuess = 0, numAtt = 0;
    
        do{
            num1 = JOptionPane.showInputDialog(null, "Please enter a number",
                "Number", JOptionPane.INFORMATION_MESSAGE);
            numGuess = Integer.parseInt(num1);
            numAtt++;
            if (numGuess == randNum){
                JOptionPane.showMessageDialog(null, "Your guess is correct");
            }else{
                if (numGuess > randNum){
                    JOptionPane.showMessageDialog(null, "Your guess is too high");
                }else {
                    if (numGuess < randNum){
                        JOptionPane.showMessageDialog(null, "Your guess is too low");
                    }   
                }
            }   
        }while (numGuess != randNum);
        JOptionPane.showMessageDialog(null,"The nunber of attempts is " + numAtt);
    }        
                
}



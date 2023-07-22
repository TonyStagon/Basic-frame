/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author MBSSUPPORT
 */
public class MyFirstFrame extends JFrame {
    
    public MyFirstFrame (){
    
     setTitle("My First GUI");
 setSize(250, 300);
 setVisible(true);
 setDefaultLookAndFeelDecorated(true);
 setResizable(true);
 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 setForeground(Color.BLUE);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stopwatch;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author katipunanna_sd2082
 */
public class StopWatch {
    public static void main(String[] args) 
 {
  myTimer s=new myTimer();
  s.setSize(500,100);
  s.setVisible(true);
  s.setTitle("My StopWatch");
  s.setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  myTimer t= new myTimer();
  t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  t.pack();
  t.setVisible(true);
 }
}


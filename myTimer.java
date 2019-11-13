/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stopwatch;

/**
 *
 * @author katipunanna_sd2082
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class myTimer extends JFrame implements ActionListener,Runnable
{
 JLabel disp;
 JButton btn;
 JButton btn1;
 boolean stop=false;
 int i,j,k,l;
 public myTimer()
 {
  disp=new JLabel();
  btn=new JButton("Start");
  btn1=new JButton("Stop");
  disp.setFont(new Font("Helvetica",Font.PLAIN,20));
  disp.setBackground(Color.cyan);
  disp.setForeground(Color.red);
  Container c=getContentPane();
  c.setLayout(new FlowLayout());
  c.add(disp); 
  c.add(btn);
  c.add(btn1);
  
  btn.addActionListener(this);
  btn1.addActionListener(this);
  
  final JLabel timeLabel = new JLabel();
        add(timeLabel);
        
        final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        ActionListener timerListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Date date = new Date();
                String time = timeFormat.format(date);
                timeLabel.setText(time);
            }
        };
        javax.swing.Timer timer = new javax.swing.Timer(1000, timerListener);
        // to make sure it doesn't wait one second at the start
        timer.setInitialDelay(0);
        timer.start();
 }
 public void run()
 {
  for(i=0;;i++)
  {
   for(j=0;j< 60;j++)
   {
    for(k=0;k< 60;k++)
    {
     for(l=0;l< 100;l++)
     {
      if(stop)
      {
       break;
      }
      NumberFormat nf = new DecimalFormat("00");
      disp.setText(nf.format(i)+":"+nf.format(j)+":"+nf.format(k));
      try{
       Thread.sleep(10);
      }catch(Exception e){}
     }
    }
   }
  }
 }
 public void actionPerformed(ActionEvent ae)
 {
  Thread t=new Thread(this);
  if(ae.getActionCommand().equals("Start"))
  {
   t.start();
   btn1.setText("Stop");
  }
  else
  {
   stop=true;
  }
 }
}
 
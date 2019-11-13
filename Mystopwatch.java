/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author katipunanna_sd2082
 */
public class Mystopwatch extends javax.swing.JFrame {
   static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    static int secondsCountDown = 10;
    static int secondsCountUp = 0;
   
    static boolean  Mystopwatch = true;
    static boolean stateCountDown = true;
    static boolean stateCountUp = true;
   
    public Mystopwatch() {
        initComponents();
        JLabel disp;
        JButton btn;
        JButton btn1;
        boolean stop=false;
        int i,j,k,l;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        stopBtnStopWatch = new javax.swing.JButton();
        startBtnStopWatch = new javax.swing.JButton();
        secondStopWatch = new javax.swing.JLabel();
        hourStopWatch = new javax.swing.JLabel();
        minuteStopWatch = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CURRENTtime = new javax.swing.JLabel();
        CountDown = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        startBtnCounterDown = new javax.swing.JButton();
        stopBtnCounterDown = new javax.swing.JButton();
        countdown = new javax.swing.JLabel();
        CountUp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        stopBtnCounterUp = new javax.swing.JButton();
        startBtnCounterUp = new javax.swing.JButton();
        countup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Stop Watch");

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stopBtnStopWatch.setText("Stop");
        stopBtnStopWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnStopWatchActionPerformed(evt);
            }
        });

        startBtnStopWatch.setText("Start");
        startBtnStopWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnStopWatchActionPerformed(evt);
            }
        });

        secondStopWatch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        secondStopWatch.setText(":0");

        hourStopWatch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hourStopWatch.setText("0");

        minuteStopWatch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        minuteStopWatch.setText(":0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(startBtnStopWatch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(stopBtnStopWatch)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hourStopWatch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minuteStopWatch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondStopWatch)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondStopWatch, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(minuteStopWatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hourStopWatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startBtnStopWatch)
                    .addComponent(stopBtnStopWatch))
                .addGap(17, 17, 17))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("CURRENT TIME");

        CURRENTtime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CURRENTtime.setText("00:00:00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CURRENTtime, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CURRENTtime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        CountDown.setBackground(new java.awt.Color(255, 255, 102));
        CountDown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("COUNT DOWN");

        startBtnCounterDown.setText("Start");
        startBtnCounterDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnCounterDownActionPerformed(evt);
            }
        });

        stopBtnCounterDown.setText("Stop");
        stopBtnCounterDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnCounterDownActionPerformed(evt);
            }
        });

        countdown.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        countdown.setText("0");

        javax.swing.GroupLayout CountDownLayout = new javax.swing.GroupLayout(CountDown);
        CountDown.setLayout(CountDownLayout);
        CountDownLayout.setHorizontalGroup(
            CountDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountDownLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(CountDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CountDownLayout.createSequentialGroup()
                        .addGroup(CountDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CountDownLayout.createSequentialGroup()
                                .addComponent(startBtnCounterDown)
                                .addGap(18, 18, 18)
                                .addComponent(stopBtnCounterDown))
                            .addGroup(CountDownLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CountDownLayout.createSequentialGroup()
                        .addComponent(countdown)
                        .addGap(98, 98, 98))))
        );
        CountDownLayout.setVerticalGroup(
            CountDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountDownLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(countdown, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CountDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtnCounterDown)
                    .addComponent(stopBtnCounterDown))
                .addContainerGap())
        );

        CountUp.setBackground(new java.awt.Color(102, 102, 255));
        CountUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("COUNT UP");

        stopBtnCounterUp.setText("Stop");
        stopBtnCounterUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnCounterUpActionPerformed(evt);
            }
        });

        startBtnCounterUp.setText("Start");
        startBtnCounterUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnCounterUpActionPerformed(evt);
            }
        });

        countup.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        countup.setText("0");

        javax.swing.GroupLayout CountUpLayout = new javax.swing.GroupLayout(CountUp);
        CountUp.setLayout(CountUpLayout);
        CountUpLayout.setHorizontalGroup(
            CountUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountUpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CountUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CountUpLayout.createSequentialGroup()
                        .addComponent(startBtnCounterUp)
                        .addGap(18, 18, 18)
                        .addComponent(stopBtnCounterUp)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CountUpLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CountUpLayout.createSequentialGroup()
                        .addComponent(countup)
                        .addGap(97, 97, 97))))
        );
        CountUpLayout.setVerticalGroup(
            CountUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CountUpLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countup, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(CountUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stopBtnCounterUp)
                    .addComponent(startBtnCounterUp))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CountDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CountUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CountUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CountDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopBtnStopWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnStopWatchActionPerformed
        // TODO add your handling code here:
         Mystopwatch = false;

        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if ( Mystopwatch == true) {
                        try {
                            sleep(1000);
                            if (seconds == 60) {
                                seconds = 0;
                                minutes++;
                            }
                            if (minutes == 60) {
                                seconds = 0;
                                hours++;
                            }

                            secondStopWatch.setText(": " + seconds);
                            minuteStopWatch.setText(": " + minutes);
                            hourStopWatch.setText("" + hours);
                            seconds++;

                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();
                   
    }//GEN-LAST:event_stopBtnStopWatchActionPerformed

    private void stopBtnCounterDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnCounterDownActionPerformed
        // TODO add your handling code here:
         stateCountDown = false;
    }//GEN-LAST:event_stopBtnCounterDownActionPerformed

    private void stopBtnCounterUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnCounterUpActionPerformed
        // TODO add your handling code here:
          stateCountUp = false;
    }//GEN-LAST:event_stopBtnCounterUpActionPerformed

    private void startBtnStopWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnStopWatchActionPerformed
        // TODO add your handling code here:
         Mystopwatch = true;

        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if ( Mystopwatch == true) {
                        try {
                            sleep(1000);
                            if (seconds == 60) {
                                seconds = 0;
                                minutes++;
                            }
                            if (minutes == 60) {
                                seconds = 0;
                                hours++;
                            }

                            secondStopWatch.setText(": " + seconds);
                            minuteStopWatch.setText(": " + minutes);
                            hourStopWatch.setText("" + hours);
                            seconds++;

                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();
                                                 

    }//GEN-LAST:event_startBtnStopWatchActionPerformed

    private void startBtnCounterDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnCounterDownActionPerformed
        // TODO add your handling code here:
        stateCountDown = true;

        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (stateCountDown == true) {
                        try {
                            sleep(1000);
                            if (secondsCountDown != 0) {;
                                secondsCountDown--;
                            } else if (secondsCountDown == 0) {
                                CountDown.setBackground(Color.pink);
                            }
                            countdown.setText(" " + secondsCountDown);

                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();
                                
    }//GEN-LAST:event_startBtnCounterDownActionPerformed

    private void startBtnCounterUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnCounterUpActionPerformed
        // TODO add your handling code here:
         stateCountUp = true;

        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (stateCountUp == true) {
                        try {
                            sleep(1000);
                           secondsCountUp++;
                           if(secondsCountUp == 11){
                               CountUp.setBackground(Color.ORANGE);
                               break;
                           }                          
                            countup.setText(" " + secondsCountUp);
                           
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();
                                                   
    }//GEN-LAST:event_startBtnCounterUpActionPerformed
//
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mystopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mystopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mystopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mystopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                Mystopwatch m = new Mystopwatch();
                m.setVisible(true);
                boolean x = true;

                final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                int interval = 1000; // 1000 ms
                new Timer(interval, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Date date = new Date();
                        String time = timeFormat.format(date);
                        m.CURRENTtime.setText(time);
                    }

                }).start();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CURRENTtime;
    private javax.swing.JPanel CountDown;
    private javax.swing.JPanel CountUp;
    private javax.swing.JLabel countdown;
    private javax.swing.JLabel countup;
    private javax.swing.JLabel hourStopWatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minuteStopWatch;
    private javax.swing.JLabel secondStopWatch;
    private javax.swing.JButton startBtnCounterDown;
    private javax.swing.JButton startBtnCounterUp;
    private javax.swing.JButton startBtnStopWatch;
    private javax.swing.JButton stopBtnCounterDown;
    private javax.swing.JButton stopBtnCounterUp;
    private javax.swing.JButton stopBtnStopWatch;
    // End of variables declaration//GEN-END:variables
}

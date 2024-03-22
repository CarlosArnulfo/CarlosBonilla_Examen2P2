/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_ex2p2_carlosbonilla;

import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author lospe
 */
public class Carrera implements Runnable{
    private int speedP1;
    private int speedP2;
   private JProgressBar p1;
   private JProgressBar p2;
   private String p1name;
   private String p2name;
private JLabel cronometro;

    public Carrera(int speedP1, int speedP2, JProgressBar p1, JProgressBar p2, JLabel cronometroP1, String p1name, String p2name) {
        this.speedP1 = speedP1;
        this.speedP2 = speedP2;
        this.p1 = p1;
        this.p2 = p2;
        this.cronometro = cronometroP1;
    }


    public int getSpeedP1() {
        return speedP1;
    }

    public void setSpeedP1(int speedP1) {
        this.speedP1 = speedP1;
    }

    public int getSpeedP2() {
        return speedP2;
    }

    public void setSpeedP2(int speedP2) {
        this.speedP2 = speedP2;
    }
    @Override
    public void run(){
        int milisp1=0;
        int milisp2=0;
        int secsp1=0;
        int secsp2=0;
        int minsP1=0;
        int minsP2=0;
        p1.setValue(0);
        p2.setValue(0);
        while(p1.getValue()!=p1.getMaximum()&&p2.getValue()!=p2.getMaximum()){
            if (milisp1==1000) {
                secsp1+=1;
                milisp1=0;
            }
            if (milisp2==1000) {
                secsp2+=1;
                milisp2=0;
            }
            if(secsp1==60){
                minsP1+=1;
                secsp1=0;
            }
            if(secsp2==60){
                minsP2+=1;
                secsp2=0;
            }
            milisp1+=50;
            milisp2+=50;
            p1.setValue(p1.getValue()+speedP1);
            p2.setValue(p2.getValue()+speedP2);
            cronometro.setText(minsP1+":"+secsp1+":"+milisp1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        };
    }
}

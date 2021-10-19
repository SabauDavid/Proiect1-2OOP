package Ocean;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.Color.*;


public class OceanApplication {
    private JButton displaySubmarineButton;
    private JButton hideSubmarineButton;
    private JLabel SubmarineLabel;
    private JPanel OceanPanel;
    private JLabel titlu;
    private JButton deep;
    private JButton rise;
    private JTextField perle;
    private JTextField adancime;
    private JTextField pesti;
    private JButton inve;
    private JButton adnc;
    private JLabel inventar;

    public OceanApplication() {
        Ocean.Submarin sub=new Ocean.Submarin();
        Ocean.SeaLifeBro.Inventory inv=new Ocean.SeaLifeBro.Inventory();
        Ocean.SeaLifeBro.Water water= new Ocean.SeaLifeBro.Water();
        sub.set_maxDepth(8);
        hideSubmarineButton.setVisible(false);
        SubmarineLabel.setVisible(false);

        displaySubmarineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent disp) {

                SubmarineLabel.setVisible(true);
                hideSubmarineButton.setVisible(true);
                displaySubmarineButton.setVisible(false);

            }
        });
        hideSubmarineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent dispf) {

                SubmarineLabel.setVisible(false);
                displaySubmarineButton.setVisible(true);
                hideSubmarineButton.setVisible(false);

            }
        });
        deep.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ddeep){
                if(rise.getText()=="SURFACE LEVEL !")
                {
                    rise.setText("Rise to the surface");
                rise.setForeground(Color.green);
                }
                if(sub._currentDepth<sub._getmaxDepth()){
                sub._deeper(sub._currentDepth);
                if(inv.main()==1)
                    inv.set_fish(inv._fish);
                else if(inv.main()==2)
                    inv.set_pearls(inv._pearls);
                else
                if(inv.main()==3&&inv.get_fish()!=0)
                {
                    inv.set_sharkbite();
                    inv.set_sharkbite();
                    inv.set_sharkbite();}



            }
            else{
                deep.setText("BOTTOM OF THE OCEAN");
                deep.setForeground(Color.red);
                }

            }});
        rise.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent undeep){
                if(sub._currentDepth>0){
                    deep.setText("Go deeper");
                    deep.setForeground(Color.green);

                    sub._undeeper(sub._currentDepth);
                    if(inv.main()==1)
                        inv.set_fish(inv._fish);
                    else if(inv.main()==2)
                        inv.set_pearls(inv._pearls);
                    else
                    if(inv.main()==3)
                        inv.set_sharkbite();}
                else {

                    rise.setForeground(Color.red);
                    rise.setText("SURFACE LEVEL !");
                }
            }});
        inve.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent prl)
            {
                perle.setText("Pearls:"+inv.get_pearls());
                pesti.setText("Fish:"+inv.get_fish());
            }

        });
        adnc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent adnc){
                adancime.setText("Depth:"+sub.get_currentDepth()+"000 METERS");
            }
        });



    }
    private static void maximiseFrame (JFrame frame)
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = dim.width;
        int h = dim.height;
        frame.setSize(w, h);
        frame.setLocation(0, 0);
    }
    public static void main (String[]args){

        JFrame frame= new JFrame("Ocean Frame");
        frame.setContentPane(new OceanApplication().OceanPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        maximiseFrame(frame);



    }

}

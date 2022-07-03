package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class exact{

    public static void main(String args[]){
        SwingJava obj = new SwingJava();
    }
}

class SwingJava extends JFrame{

    JTextField t1;
    JRadioButton b1;
    JRadioButton b2;
    JRadioButton b3;
    JButton b4;
    JLabel l1;

    int calculate1( int unit ){
    	
    	Integer cost;
        if( (unit >= 1) && (unit <= 15) ){
            cost = unit*50;
        }
        else if( (unit >= 16) && (unit <= 20) ){
            cost = (15*50)+(unit-15)*45;
        }
        else if( (unit >= 21) && ( unit <=30 ) ){
            cost = (15*50) + (5*45) +(unit-20)*40;
        }
        else if( (unit >= 31) && (unit <= 50) ){
            cost = (15*50) + (5*45) + (10*40) + (unit-30)*35;
        }
        else{
            cost = (15*50) + (5*45) + (10*40) + (30*35) + (unit-50)*30;
        }
        return cost;
    } 

    int calculate2( int unit ){
    	
    	Integer cost;
        if( (unit >= 1) && (unit <= 15) ){
            cost = unit*60;
        }
        else if( (unit >= 16) && (unit <= 20) ){
            cost = (15*60)+(unit-15)*55;
        }
        else if( (unit >= 21) && ( unit <=30 ) ){
            cost = (15*60) + (5*55) +(unit-20)*50;
        }
        else if( (unit >= 31) && (unit <= 50) ){
            cost = (15*60) + (5*55) + (10*50) + (unit-30)*45;
        }
        else{
            cost = (15*60) + (5*55) + (10*50) + (30*45) + (unit-50)*40;
        }
        return cost;
    }

    SwingJava(){

        t1 = new JTextField(20);
        b1 = new JRadioButton("Retailer");
        b2 = new JRadioButton("Wholeseller");
        //b3 = new JRadioButton("Special Discount");
        b4 = new JButton("Calculate Cost");
        l1 = new JLabel();
        ButtonGroup bg = new ButtonGroup();

        add(t1);
        add(b1);
        add(b2);
        bg.add(b1);
        bg.add(b2);
        //add(b3);
        add(b4);
        add(l1);

        ActionListener al=new ActionListener(){

            public void actionPerformed(ActionEvent e){
                String s1 = t1.getText();
                int a1 = Integer.parseInt(s1);
                Integer cost1=0 , cost2=0;

                if( e.getSource() == b1 ){
                    
                    cost1 = calculate1( a1 );
                    //l1.setText(cost.toString());
                }

                if( e.getSource() == b2 ){

                    cost2 = calculate2( a1 );
                    //l1.setText(cost.toString());
                }
                
                if( cost1 != 0 ) {
                	l1.setText(cost1.toString());
                }
                else {
                	l1.setText(cost2.toString());
                }
                
                if( e.getSource() == b4 ){
                    if( cost1 != 0 ) {
                    	l1.setText(cost1.toString());
                    }
                    else {
                    	l1.setText(cost2.toString());
                    }
                }
            }
        };

        b1.addActionListener(al);
        b2.addActionListener(al);
        // b3.addActionListener(al);
        b4.addActionListener(al);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(3);
    }
}
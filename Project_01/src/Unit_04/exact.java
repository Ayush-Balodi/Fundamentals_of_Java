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
    JRadioButton r1;
    JRadioButton r2;
    JButton b1;
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
        
        r1 = new JRadioButton("Retailer");
        r2 = new JRadioButton("Wholeseller");
        
        b1 = new JButton("Calculate Cost");
        l1 = new JLabel();

        add(t1);
        add(r1);
        add(r2);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        add(b1);
        add(l1);

        ActionListener al=new ActionListener(){

            public void actionPerformed(ActionEvent e){
                String s1 = t1.getText();
                int a1 = Integer.parseInt(s1);
                Integer cost=0;

                if( r1.isSelected() ){
                    
                    cost = calculate1( a1 );
                    l1.setText(cost.toString());
                }

                if( r2.isSelected() ){

                    cost = calculate2( a1 );
                    l1.setText(cost.toString());
                }
            }
        };

        b1.addActionListener(al);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(3);
    }
}
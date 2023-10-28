import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame jf;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bminus,bmul,bdiv,bequal,bclear;
    TextField jtf,jtf1;
	JLabel l;
	double num1=0, num2=0, result;
	int calculation;
	
    public Calculator(String s) {
        jf = new JFrame("First calculator");
		
		l= new JLabel("MY FIRST CALCULATOR");
		l.setBounds(100,30,150,20);
		l.setForeground(Color.red);
		jf.add(l);
       
	    jtf1 = new TextField();
		//left , top, width, height
        jtf1.setBounds(100, 60, 150, 40);
        jf.add(jtf1);
	   
        jtf = new TextField();
		//left , top, width, height
        jtf.setBounds(100, 100, 150, 50);
        jf.add(jtf);
		
		b7 = new Button("7");
		b7.setBounds(100,170,30,30);
		jf.add(b7);
		b7.addActionListener(this);
		
		b8 = new Button("8");
		b8.setBounds(140,170,30,30);
		jf.add(b8);
		b8.addActionListener(this);
		
		b9 = new Button("9");
		b9.setBounds(180,170,30,30);
		jf.add(b9);
		b9.addActionListener(this);
		
		bplus = new Button("+");
		bplus.setBounds(220,170,30,30);
		bplus.setBackground(Color.orange);
		jf.add(bplus);
		bplus.addActionListener(this);
		//nextline
		b4 = new Button("4");
		b4.setBounds(100,210,30,30);
		jf.add(b4);
		b4.addActionListener(this);
		
		b5 = new Button("5");
		b5.setBounds(140,210,30,30);
		jf.add(b5);
		b5.addActionListener(this);
		
		b6 = new Button("6");
		b6.setBounds(180,210,30,30);
		jf.add(b6);
		b6.addActionListener(this);
		
		bminus = new Button("-");
		bminus.setBounds(220,210,30,30);
		bminus.setBackground(Color.orange);
		jf.add(bminus);
		bminus.addActionListener(this);
		//nextline
		
		b1 = new Button("1");
		b1.setBounds(100,250,30,30);
		jf.add(b1);
		b1.addActionListener(this);
		
		b2 = new Button("2");
		b2.setBounds(140,250,30,30);
		jf.add(b2);
		b2.addActionListener(this);
		
		b3 = new Button("3");
		b3.setBounds(180,250,30,30);
		jf.add(b3);
		b3.addActionListener(this);
		
		bmul = new Button("X");
		bmul.setBounds(220,250,30,30);
		bmul.setBackground(Color.orange);
		jf.add(bmul);
		bmul.addActionListener(this);
		//nextline
		
		bclear = new Button("C");
		bclear.setBounds(100,290,30,30);
		bclear.setBackground(Color.red);
		jf.add(bclear);
		bclear.addActionListener(this);
		
		b0 = new Button("0");
		b0.setBounds(140,290,30,30);
		//b0.setBackground(Color.orange);
		jf.add(b0);
		b0.addActionListener(this);
		
		bequal = new Button("=");
		bequal.setBounds(180,290,30,30);
		bequal.setBackground(Color.orange);
		jf.add(bequal);
		bequal.addActionListener(this);
		
		bdiv = new Button("/");
		bdiv.setBounds(220,290,30,30);
		bdiv.setBackground(Color.orange);
		jf.add(bdiv);
		bdiv.addActionListener(this);
		
		//framelayout set
		jf.getContentPane().setBackground(Color.black);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,400);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==b1)
		jtf.setText(jtf.getText()+"1");
		
	    if(e.getSource()==b2)
		jtf.setText(jtf.getText()+"2");
	
	    if(e.getSource()==b3)
		jtf.setText(jtf.getText()+"3");
	
	    if(e.getSource()==b4)
		jtf.setText(jtf.getText()+"4");
	
	    if(e.getSource()==b5)
		jtf.setText(jtf.getText()+"5");
	
	    if(e.getSource()==b6)
		jtf.setText(jtf.getText()+"6");
	
	    if(e.getSource()==b7)
		jtf.setText(jtf.getText()+"7");
	
	    if(e.getSource()==b8)
		jtf.setText(jtf.getText()+"8");
	
	    if(e.getSource()==b9)
		jtf.setText(jtf.getText()+"9");
	
	    if(e.getSource()==b0)
		jtf.setText(jtf.getText()+"0");
	
	    if(e.getSource()==bclear)
        jtf.setText("");
	
	    if(e.getSource()== bplus){
			String str= jtf.getText();
			num1=Double.parseDouble(jtf.getText());
			calculation=1;
			jtf.setText("");
			jtf1.setText(str+"+");
		}
		if(e.getSource()== bminus){
			String str= jtf.getText();
			num1=Double.parseDouble(jtf.getText());
			calculation=2;
			jtf.setText("");
			jtf1.setText(str+"-");
		}
		if(e.getSource()== bmul){
			String str= jtf.getText();
			num1=Double.parseDouble(jtf.getText());
			calculation=3;
			jtf.setText("");
			jtf1.setText(str+"*");
		}
		if(e.getSource()== bdiv){
			String str= jtf.getText();
			num1=Double.parseDouble(jtf.getText());
			calculation=4;
			jtf.setText("");
			jtf1.setText(str+"/");
		}
		if(e.getSource()==bequal){
			num2=Double.parseDouble(jtf.getText());
		switch(calculation){
			case 1:
			result= num1+num2;
			break;
			
			case 2:
			result= num1-num2;
			break;
			
			case 3:
			result= num1*num2;
			break;
			
			case 4:
			result= num1/num2;
			break;
		}
		jtf.setText(Double.toString(result));
		jtf1.setText("");
	
    }
}
public static void main(String s[]) {
    new Calculator("First running calculator");
}
}

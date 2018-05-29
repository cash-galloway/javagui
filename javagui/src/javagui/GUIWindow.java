package javagui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class GUIWindow implements ActionListener
{
	boolean winner=false;
	String buttonName = "X";
	JButton button1=new JButton("");
	JButton button2=new JButton("");
	JButton button3=new JButton("");
	JButton button4=new JButton("");
	JButton button5=new JButton("");
	JButton button6=new JButton("");
	JButton button7=new JButton("");
	JButton button8=new JButton("");
	JButton button9=new JButton("");
	
	JFrame gameFrame=new JFrame("Turn:" + buttonName);
	
	byte count;
	
public GUIWindow()
	{
		gameFrame.setSize(400, 400);
		gameFrame.setLayout(new GridLayout(3,3));
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gameFrame.getContentPane().add(button1);
		button1.addActionListener(this);
		
		gameFrame.getContentPane().add(button2);
		button2.addActionListener(this);
		
		gameFrame.getContentPane().add(button3);
		button3.addActionListener(this);
		
		gameFrame.getContentPane().add(button4);
		button4.addActionListener(this);
		
		gameFrame.getContentPane().add(button5);
		button5.addActionListener(this);
		
		gameFrame.getContentPane().add(button6);
		button6.addActionListener(this);
		
		gameFrame.getContentPane().add(button7);
		button7.addActionListener(this);
		
		gameFrame.getContentPane().add(button8);
		button8.addActionListener(this);
		
		gameFrame.getContentPane().add(button9);
		button9.addActionListener(this);
		gameFrame.setVisible(true);
		
		count=0;
		
	}
	

	
public void actionPerformed(ActionEvent e)
	{
		
		count++;
		if(count==1 || count==3 || count==5 || count==7 || count==9)
			buttonName="x";
		else if(count==2 || count==4 || count==6 || count==8)
			buttonName="O";
		
		String ham = "x";
		if(buttonName == "x")
			ham ="O";
		else if(buttonName == "o")
			ham="X";
		
		
		if(e.getSource()==button1)
		{
			button1.setText(buttonName);
			button1.setBackground(Color.BLACK);
			button1.setEnabled(false);
			gameFrame.setTitle("Turn:" + ham);
			
	}
	else if(e.getSource()== button2)
	{
		button2.setText(buttonName);
		button2.setBackground(Color.BLACK);
		button2.setEnabled(false);
		gameFrame.setTitle("Turn:" + ham);
	}

	else if(e.getSource()== button3)
	{
		button3.setText(buttonName);
		button3.setBackground(Color.BLACK);
		button3.setEnabled(false);
		gameFrame.setTitle("Turn:" + ham);
	}
		
	else if(e.getSource()== button4)
	{
		button4.setText(buttonName);
		button4.setBackground(Color.BLACK);
		button4.setEnabled(false);
		gameFrame.setTitle("Turn:" + ham);
	}
		
	else if(e.getSource()== button5)
	{
		button5.setText(buttonName);
		button5.setBackground(Color.BLACK);
		button5.setEnabled(false);
		gameFrame.setTitle("Turn:" + ham);
	}
		
	else if(e.getSource()== button6)
	{
		button6.setText(buttonName);
		button6.setBackground(Color.BLACK);
		button6.setEnabled(false);
		gameFrame.setTitle("Turn:" + ham);
	}
		
	else if(e.getSource()== button7)
	{
		button7.setText(buttonName);
		button7.setBackground(Color.BLACK);
		button7.setEnabled(false);
		gameFrame.setTitle("Turn:" + ham);
	}
		
	else if(e.getSource()== button8)
	{
		button8.setText(buttonName);
		button8.setBackground(Color.BLACK);
		button8.setEnabled(false);
		gameFrame.setTitle("Turn:" + ham);
	}

	else if(e.getSource()== button9)
	{
		button9.setText(buttonName);
		button9.setBackground(Color.BLACK);
		button9.setEnabled(false);
		gameFrame.setTitle("Turn:" + ham);
	}

		// HORIZONTAL WINS
if(button1.getText()==button2.getText() && button2.getText()==button3.getText() && button1.getText()!="" )
{
	winner=true;
	JOptionPane.showMessageDialog(null, buttonName+ " Won! GG");
	reset();
}
else if(button4.getText()==button5.getText() && button5.getText()==button6.getText() && button4.getText()!="" )
{
	winner=true;
	JOptionPane.showMessageDialog(null, buttonName+ " Won! GG");
	reset();
	
}
else if(button7.getText()==button8.getText() && button8.getText()==button9.getText() && button7.getText()!="")
{
	winner=true;
	JOptionPane.showMessageDialog(null, buttonName+ " Won! GG");
	reset();
}

// VERTICAL WINS
else if(button1.getText()==button4.getText() && button4.getText()==button7.getText() && button1.getText()!="")
{
	winner=true;
	JOptionPane.showMessageDialog(null, buttonName+ " Won! GG");
	reset();
}
else if(button2.getText()==button5.getText() && button5.getText()==button8.getText() && button2.getText()!="")
{
	winner=true;
	JOptionPane.showMessageDialog(null, buttonName+ " Won! GG");
	reset();
}
else if(button3.getText()==button6.getText() && button6.getText()==button9.getText() && button3.getText()!="")
{
	winner=true;
	JOptionPane.showMessageDialog(null, buttonName+ " Won! GG");
	reset();
}


//Diagonal Wins


else if(button1.getText()==button5.getText() && button5.getText()==button9.getText() && button1.getText()!="")
{
	winner=true;
	JOptionPane.showMessageDialog(null, buttonName+ " Won! GG");
	reset();
}

else if(button3.getText()==button5.getText() && button5.getText()==button7.getText() && button3.getText()!="")
{
	winner=true;
	JOptionPane.showMessageDialog(null, buttonName+ " Won! GG");
	reset();
}

else if(count==9 && winner==false)
	JOptionPane.showMessageDialog(null,"Match Is Draw");
	
	}

public static void main(String[] args) {
	
	new GUIWindow();




	}
public void reset() {
	count = 0;
	buttonName = "x";
	gameFrame.setTitle("Turn: x");
	
	button1.setText("");
	button2.setText("");
	button3.setText("");
	button4.setText("");
	button5.setText("");
	button6.setText("");
	button7.setText("");
	button8.setText("");
	button9.setText("");
	
	button1.setEnabled(true);
	button2.setEnabled(true);
	button3.setEnabled(true);
	button4.setEnabled(true);
	button5.setEnabled(true);
	button6.setEnabled(true);
	button7.setEnabled(true);
	button8.setEnabled(true);
	button9.setEnabled(true);
	
	button1.setBackground(Color.WHITE);
	button2.setBackground(Color.WHITE);
	button3.setBackground(Color.WHITE);
	button4.setBackground(Color.WHITE);
	button5.setBackground(Color.WHITE);
	button6.setBackground(Color.WHITE);
	button7.setBackground(Color.WHITE);
	button8.setBackground(Color.WHITE);
	button9.setBackground(Color.WHITE);
}



}



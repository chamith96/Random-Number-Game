import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

public class RandomNumber extends JFrame{
	int randomNub,guess;
	private JButton button;
	private JTextField textField;
	private JLabel promptLabel;
	private JLabel resultLabel;
	private JLabel randomLabel;
	
	public RandomNumber(){
		setLayout(new FlowLayout());
		promptLabel=new JLabel("Enter a random number 1-100");
		add(promptLabel);
		textField=new JTextField(10);
		add(textField);
		button=new JButton("Guess");
		add(button);
		resultLabel=new JLabel("");
		add(resultLabel);
		randomLabel=new JLabel("");
		add(randomLabel);
		
		event e=new event();
		button.addActionListener(e);
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int randomNum=(int)(Math.random()*10+1);
			try{
				guess=(int)Double.parseDouble(textField.getText());
				if(guess==randomNum){
					resultLabel.setText("You won the Game");
				}
				else if(guess!=randomNum){
					resultLabel.setText("You Loss the Game");
				}
				randomLabel.setText("The random number generated was "+randomNum);
			}catch(Exception ex){
				randomLabel.setText("You have not enter the number");
				randomLabel.setText("");
			}
		}
	}
	
	public static void main(String[] args) {
		RandomNumber g=new RandomNumber();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setVisible(true);
		g.setSize(300,200);
		g.setTitle("Random Number Gussing Game");
		
	}

}

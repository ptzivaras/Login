import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPassword = new JPasswordField();
	JLabel userIDLabel = new JLabel("UserID");
	JLabel PasswordLabel = new JLabel("Password");
	JLabel message = new JLabel();
	
	HashMap<String, String> loginInfoCopy = new HashMap<String, String>();//global in class so all methods see it
	
	Login(HashMap<String,String> loginInfoPassed){
		loginInfoCopy = loginInfoPassed;
	
		userIDLabel.setBounds(50, 100, 75, 25);//Delete these 3 lines and you will not see anything
		PasswordLabel.setBounds(50, 150, 75, 25);
		message.setBounds(125, 250, 250, 35);
		message.setFont(new Font(null,Font.ITALIC,25));
		userIDField.setBounds(125, 100, 250, 35);
		userPassword.setBounds(125, 150, 250, 35);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.addActionListener(this);
		resetButton.setBounds(225,200,100,25);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);//add components
		frame.add(PasswordLabel);
		frame.add(userIDField);
		frame.add(userPassword);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close frame when exit
		frame.setSize(420, 420);
		frame.setLayout(null);//no layout manager
		frame.setVisible(true);//so to see it
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==resetButton) {
			userIDField.setText("");//Clear Text
			userPassword.setText("");
		}
		if(e.getSource()==loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPassword.getPassword());
			
			if(loginInfoCopy.containsKey(userID)) {//if username correct
				if(loginInfoCopy.get(userID).equals(password)) {
					message.setForeground(Color.green);
					message.setText("Login successful");
					Welcome welcomePage = new Welcome(userID);
				}
				else {
					message.setForeground(Color.red);
					message.setText("Wrong password");
				}
			}
			else {
				message.setForeground(Color.red);
				message.setText("username not found");
			}
			
		}
	}
}

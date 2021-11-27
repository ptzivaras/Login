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
		
		
		frame.add(userIDLabel);//add components
		frame.add(PasswordLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close frame when exit
		frame.setSize(420, 420);
		frame.setLayout(null);//no layout manager
		frame.setVisible(true);//so to see it
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

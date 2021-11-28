import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome {
	JFrame frame = new JFrame();
	JLabel welcome = new JLabel("Hello!");
	
	Welcome(String userID){
		welcome.setBounds(0, 0, 200, 35);
		welcome.setText("Hello, welcome "+userID);
		
		frame.add(welcome);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

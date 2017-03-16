package mrs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class mrLoginPopUp extends JFrame {
	private JPanel pN,pS,pW,pE,pC;
	private JLabel studentIDLabel,passwordLabel,dummy1,dummy2;
	private JTextField txtStudentID;
	private JTextField txtPassword;
	private JButton loginPageLoginButton;
	private JButton cancelLogin;
	
	//constructor
	public mrLoginPopUp(){
		
		super("Login");
		
		setLayout(new BorderLayout());
		
		//creating components
		pN= new JPanel();
		pS= new JPanel();
		pW= new JPanel();
		pE= new JPanel();
		pC= new JPanel();
		
		studentIDLabel= new JLabel("Student ID :",SwingConstants.RIGHT);
		passwordLabel=new JLabel("Password :",SwingConstants.RIGHT);
		
		txtStudentID= new JTextField("Student ID",25);
		txtPassword= new JTextField("Password",25);
		loginPageLoginButton= new JButton("LOGIN");
		cancelLogin= new JButton("Cancel");
		
		//adding panel
		add(pN,BorderLayout.NORTH);add(pS,BorderLayout.SOUTH);
		add(pW,BorderLayout.WEST);add(pE,BorderLayout.EAST);
		add(pC,BorderLayout.CENTER);
		//add component to pC
		pC.setLayout(new GridLayout(3, 2,10,10));
		pC.add(studentIDLabel);
		pC.add(txtStudentID);
		pC.add(passwordLabel);
		pC.add(txtPassword);
		
		//pC.setLayout(new GridLayout(1,2,10,10));
		pC.add(cancelLogin);
		pC.add(loginPageLoginButton);
		HandlerClass handler = new HandlerClass();
		
		txtStudentID.addActionListener(handler);
		txtPassword.addActionListener(handler);
		loginPageLoginButton.addActionListener(handler);
		cancelLogin.addActionListener(handler);
		
		//setting when opening frame
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private class HandlerClass implements ActionListener{

		
		public void actionPerformed(ActionEvent event) {
			
		}
		
	}
}

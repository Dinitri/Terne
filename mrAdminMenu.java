//dimension 800 x 600

package mrs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Icon;
import javax.swing.JPanel;

public class mrAdminMenu extends JFrame {
  
	public mrAdminMenu(){
		
			//create menu bar
			JMenuBar adminMenu = new JMenuBar();
	
			//add menu bar to frame
			this.setJMenuBar(adminMenu);
	
			//create menu(s)
			JMenu programme= new JMenu("Programme");
			JMenu student = new JMenu("Student");
			JMenu register = new JMenu("Register");
			JMenu logout = new JMenu("Log Out");
	
			//add menus to menu bar
			adminMenu.add(programme);
			adminMenu.add(student);
			adminMenu.add(register);
			adminMenu.add(logout);
	
			//creating menu items
			JMenuItem addStudent = new JMenuItem("Add new Student");
			JMenuItem modifyStudent = new JMenuItem("Modify Student details");
			JMenuItem deleteStudent = new JMenuItem("Delete Student details");
	
			JMenuItem addProgramme = new JMenuItem("Add new Programme");
			JMenuItem modifyProgramme = new JMenuItem("Modify Programme details");
			JMenuItem deleteProgramme = new JMenuItem("Delete Programme details");
	
			JMenuItem logOutItem= new JMenuItem("Log out");
	
			//add menu items to menus
			programme.add(addProgramme);
			programme.add(modifyProgramme);
			programme.add(deleteProgramme);
	
			student.add(addStudent);
			student.add(modifyStudent);
			student.add(deleteStudent);
	
			logout.add(logOutItem);
	
			//adding action listener to menu items using anonymous class
	
			//add action for add programme
			addProgramme.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				//frame want to open
			}
			});
	
			
			//add action for modify programme
			modifyProgramme.addActionListener(new ActionListener() {
		
	    	public void actionPerformed(ActionEvent e) {
	    		//frame want to open
	    	}
			});
	
	
			//add action for delete programme
			deleteProgramme.addActionListener(new ActionListener() {
		
		    public void actionPerformed(ActionEvent e) {
		    	//frame want to open
		    }
			});
			
	
			//add action for add student
			addStudent.addActionListener(new ActionListener() {
				
			    public void actionPerformed(ActionEvent e) {
			    	//frame want to open
			    }
				});
			
			
			//add action for modify student
			modifyStudent.addActionListener(new ActionListener() {
				
			    public void actionPerformed(ActionEvent e) {
			    	//frame want to open
			    }
				});
			
			
			//add action for delete student
			deleteStudent.addActionListener(new ActionListener() {
				
			    public void actionPerformed(ActionEvent e) {
			    	//frame want to open
			    }
				});
			
			
			//add action for logout student
			logOutItem.addActionListener(new ActionListener() {
				
			    public void actionPerformed(ActionEvent e) {
			    	//frame want to open
			    }
				});
			
			
			// create panel
			JPanel panel= new JPanel();
			//get image from files
			Icon image= new ImageIcon(getClass().getResource("adminbackground.png"));
			//create label and put image in it
			JLabel label= new JLabel(image);
			//add image label to panel
			panel.add(label);
			add(panel);
			
			setBackground(Color.BLACK);
			
			//setting when opening frame
			pack();
			setLocationRelativeTo(null);
			setResizable(false);
			
	}//end of constructor



}//end of class mrAdminMenu
	
	


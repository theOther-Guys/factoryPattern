package com.guiUniversity;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Registration extends JFrame{
	
	private Register reg  = new Register();
	private JTextField name , fName ;
	private JComboBox<String> facultyName ;
	private JLabel lblName , lblFName ;
	private JPanel north , center ;
	private JButton register ;
	public Registration() {
		// TODO Auto-generated constructor stub
		name = new JTextField(10);
		fName = new JTextField(10);
		facultyName = new JComboBox<String>();
		lblName = new JLabel(" Name : ");
		lblFName = new JLabel(" Father Name :");
		north = new JPanel();
		center = new JPanel();
		register = new JButton("register");
		addItemToComponents();
		setLayoutManager();
	}
	private void addItemToComponents() {
		facultyName.addItem("Economics");
		facultyName.addItem("CS");
		facultyName.addItem("LAW");
	}
	private void setLayoutManager (){
		north.setLayout(new FlowLayout(FlowLayout.LEADING));
		center.setLayout(new GridBagLayout());
			addItemsToContainers();
	}
	private void addItemsToContainers(){
		north.add(lblName);
		north.add(name);
		north.add(lblFName);
		north.add(fName);
		north.add(facultyName);
		north.add(register);
		addContainersToFrame();
		addActionToComponents();
	}
	
	private void addActionToComponents() {
		// TODO Auto-generated method stub
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				reg.registerStudent(new Students(name.getText(), fName.getText(), String.valueOf(facultyName.getSelectedItem())));
				name.setText(null);
				fName.setText(null);
				facultyName.setSelectedIndex(0);
			}
		});
	}
	private void addContainersToFrame() {
		// TODO Auto-generated method stub
		add(north, BorderLayout.NORTH);
		add(center , BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		Registration register = new Registration();
		register.setSize(600, 300);
		register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		register.setVisible(true);
		
		FacultyGUI fa = new FacultyGUI();
		fa.setSize(800, 400);
		fa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fa.setVisible(true);
	}
	

}

package com.guiUniversity;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;

import com.university.Student;

public class FacultyGUI extends JFrame {

	JTable table;
	DefaultTableModel tableModel;
	private JButton getData;
	private JPanel north, center;
	private JComboBox<String> facultySelection;

	public FacultyGUI() {
		// TODO Auto-generated constructor stub
		tableModel = new DefaultTableModel();
		table = new JTable(tableModel);
		north = new JPanel();
		center = new JPanel();
		facultySelection = new JComboBox<String>();
		getData = new JButton(" load Data ");
		setLayoutToContaners();
		addComponentsToContainers();
	}

	private void setLayoutToContaners() {
		// TODO Auto-generated method stub
		north.setLayout(new FlowLayout(FlowLayout.LEADING));
		center.setLayout(new FlowLayout(FlowLayout.CENTER));
	}

	private void addComponentsToContainers() {
		// TODO Auto-generated method stub
		north.add(facultySelection);
		center.add(table);
		north.add(getData);
		addItemToFacultySelection();
		addContainerToFrame();
	}

	private void addContainerToFrame() {
		// TODO Auto-generated method stub
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
	}

	private void addItemToFacultySelection() {
		// TODO Auto-generated method stub
		facultySelection.addItem("Economics");
		facultySelection.addItem("LAW");
		facultySelection.addItem("CS");
		addActionToComponents();
		addColumnToTable();
	}

	private void addColumnToTable() {
		// TODO Auto-generated method stub
		tableModel.addColumn(" Name ");
		tableModel.addColumn(" Father Name ");
		tableModel.addColumn(" Email Address ");
		tableModel.addRow(new String []{ " ahmadullah", " ishaq Ali", " ahmadullah@gmail.com"});
		tableModel.addRow(new String []{ " ahmadullah", " ishaq Ali", " ahmadullah@gmail.com"});
		tableModel.addRow(new String []{ " ahmadullah", " ishaq Ali", " ahmadullah@gmail.com"});
		}
	private void addActionToTableCell(){
		JTextField field = (JTextField)table.getCellEditor();
			int [] data = table.getSelectedRows();
			
	}
	

	private void addActionToComponents() {
		// TODO Auto-generated method stub
		getData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String facultyName = (String) facultySelection
						.getSelectedItem();
				CS cs = new CS();
				ArrayList<Students> student = University.student;

				for (int i = 0; i < University.student.size(); i++) {
					System.out.println(University.student.get(i).getName());
				}
				for (int index = 0; index < University.student.size(); index++) {
					String[] data = { University.student.get(index).getfName(),
							University.student.get(index).getfName(),
							University.student.get(index).getEmailAddress() };
					tableModel.addRow(data);
					System.out
							.println(University.student.get(index).getfName());
					// tableModel.addRow(new String
					// []{f.attendance.get(index).getfName() ,
					// f.attendance.get(index).getfName() ,
					// f.attendance.get(index).getEmailAddress()});
				}
				// loadData(f);

			}

			private void loadData(University cs) {
				// TODO Auto-generated method stub
				// addColumnForSubjects((CS) f);
				String faculty = (String) facultySelection.getSelectedItem();
				for (int index = 0; index < cs.attendance.size(); index++) {
					tableModel.addRow(new String[] {
							cs.attendance.get(index).getfName(),
							cs.attendance.get(index).getfName(),
							cs.attendance.get(index).getEmailAddress() });
				}
				center.validate();
			}

			private void addColumnForSubjects(CS f) {
				// TODO Auto-generated method stub
				for (int index = 0; index < f.subjects.size(); index++) {
					tableModel.addColumn("Subject" + index + 1);
					tableModel.addColumn("Credit");
				}
			}
		});
		
	}

	public static void main(String[] args) {
		FacultyGUI faculty = new FacultyGUI();

		faculty.setSize(800, 400);
		faculty.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		faculty.setVisible(true);
	}

}

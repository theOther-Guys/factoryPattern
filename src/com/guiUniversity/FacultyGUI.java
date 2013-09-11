package com.guiUniversity;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

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
		center.add(new JScrollPane(table));
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
		addActionToComboBox();
	}

	private void addColumnToTable() {
		// TODO Auto-generated method stub
		tableModel.addColumn(" Name ");
		tableModel.addColumn(" Father Name ");
		tableModel.addColumn(" Email Address ");
//		tableModel.addRow(new String[] { " ahmadullah", " ishaq Ali",
//				" ahmadullah@gmail.com" });
//		tableModel.addRow(new String[] { " ahmadullah", " ishaq Ali",
//				" ahmadullah@gmail.com" });
//		tableModel.addRow(new String[] { " ahmadullah", " ishaq Ali",
//				" ahmadullah@gmail.com" });
		addActionToTableCell();
	}

	private void addActionToTableCell() {
		table.getCellEditor();
		addActionToComboBox();

	}

	private void addActionToComponents() {
		// TODO Auto-generated method stub
		getData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				facultySelection.getSelectedItem();
				new CS();
				for (int i = 0; i < University.student.size(); i++) {
					if (University.student.get(i).getFacultyName()
							.equals(facultySelection.getSelectedItem())) {
						// System.out.println(University.student.get(i).getName());
						tableModel.addRow(new String[] {
								University.student.get(i).getName(),
								University.student.get(i).getfName(),
								University.student.get(i).getEmailAddress() });
					}
				}

//				for (int index = 0; index < University.student.size(); index++) {
//					String[] data = { University.student.get(index).getfName(),
//							University.student.get(index).getfName(),
//							University.student.get(index).getEmailAddress() };
//					tableModel.addRow(data);
//					System.out
//							.println(University.student.get(index).getfName());
//					// tableModel.addRow(new String
//					// []{f.attendance.get(index).getfName() ,
//					// f.attendance.get(index).getfName() ,
//					// f.attendance.get(index).getEmailAddress()});
//				}
				// loadData(f);

			}

			private void loadData(University cs) {
				facultySelection.getSelectedItem();
				for (int index = 0; index < cs.attendance.size(); index++) {
					tableModel.addRow(new String[] {
							cs.attendance.get(index).getfName(),
							cs.attendance.get(index).getfName(),
							cs.attendance.get(index).getEmailAddress() });
				}
				center.validate();
				addColumnForSubjects((CS) cs);
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

	private void addActionToComboBox() {
		facultySelection.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int row = table.getSelectedRow();
				for (int index = 0; index < table.getColumnCount(); index++) {
					table.getCellEditor(row, index);
					table.getCellRenderer(row, index);
					table.getCellEditor();
				}

			}
		});
		addActionToTableCells();
	}
	private void addActionToTableCells(){
		table.getModel().addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				// TODO Auto-generated method stub
			CreditSheet creditSheet = new CreditSheet();
			try {
			int selectedColumn = table.getSelectedColumn();
			int selectedRow = table.getSelectedRow();
			creditSheet.setName(table.getValueAt(selectedRow, selectedColumn).toString());
			}catch (ArrayIndexOutOfBoundsException e1){
//				System.out.println("no such data" );
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

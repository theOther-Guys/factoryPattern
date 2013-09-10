package com.guiUniversity;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CreditSheet extends JFrame {

	private JLabel name, txtName, txtFName, fName, facultyName, txtFacultyName,
			txtStIdNumber, stIdNumber, date, txtDate, semester, txtSemester;
	private JPanel north, center, south;
	private JTable table;
	private DefaultTableModel tableModel;

	public CreditSheet() {
		name = new JLabel(" اسم");
		txtName = new JLabel();
		fName = new JLabel(" ولد ");
		txtFacultyName = new JLabel();
		txtFName = new JLabel();
		facultyName = new JLabel(" فاکولته ");
		txtStIdNumber = new JLabel();
		stIdNumber = new JLabel("کد  ");
		date = new JLabel(" تاریخ ");
		semester = new JLabel(" سمستر  ");
		txtDate = new JLabel(new Date().toString());
		txtSemester = new JLabel();
		north = new JPanel();
		center = new JPanel();
		south = new JPanel();
		tableModel = new DefaultTableModel();
		table = new JTable(tableModel);
		txtSemester = new JLabel();
		setLayoutOFPanels();
	}

	private void setLayoutOFPanels() {
		// TODO Auto-generated method stub
		north.setLayout(new GridLayout(2, 6));
		center.setLayout(new FlowLayout(FlowLayout.RIGHT));
		south.setLayout(new FlowLayout(FlowLayout.RIGHT));
		addComponentsToContainers();
	}

	private void addComponentsToContainers() {
		// TODO Auto-generated method stub
		north.add(name);
		north.add(txtName);
		north.add(fName);
		north.add(txtFName);
		north.add(semester);
		north.add(txtSemester);
		north.add(facultyName);
		north.add(txtFacultyName);
		north.add(date);
		north.add(txtDate);
		north.add(stIdNumber);
		north.add(txtStIdNumber);
		addContentToCenterPanel();
	}

	private void addContentToCenterPanel() {
		// TODO Auto-generated method stub
		setTableModelRowCount();
		JScrollPane scroll = new JScrollPane(table);
		table.setAlignmentX(JTable.RIGHT_ALIGNMENT);
		center.add(scroll);
	}

	private void setTableModelRowCount() {
		tableModel.setColumnCount(4);
		tableModel.setColumnIdentifiers(new String [] { "ملاحظات ", " کریدت " ,"مضمون " , " شماره "});
		addComponenttoSouthPanel();
	}

	private void addComponenttoSouthPanel() {
		south.add(new JLabel("امضای رئیس پوهنجی"));
		south.add(new JLabel());
		south.add(new JLabel(" امضائی رئیس پوهنتون"));
		south.add(new JLabel());
		south.add(new JLabel(" امضائی رئیس دیپارتمنت "));
		south.add(new JLabel());
		addContentToFrame();
	}

	public JLabel getTxtName() {
		return txtName;
	}

	public void setTxtName(JLabel txtName) {
		this.txtName = txtName;
	}

	public JLabel getTxtFName() {
		return txtFName;
	}

	public void setTxtFName(JLabel txtFName) {
		this.txtFName = txtFName;
	}

	public JLabel getTxtFacultyName() {
		return txtFacultyName;
	}

	public void setTxtFacultyName(JLabel txtFacultyName) {
		this.txtFacultyName = txtFacultyName;
	}

	public JLabel getTxtStIdNumber() {
		return txtStIdNumber;
	}

	public void setTxtStIdNumber(JLabel txtStIdNumber) {
		this.txtStIdNumber = txtStIdNumber;
	}

	public JLabel getTxtDate() {
		return txtDate;
	}

	public void setTxtDate(JLabel txtDate) {
		this.txtDate = txtDate;
	}

	public JLabel getTxtSemester() {
		return txtSemester;
	}

	public void setTxtSemester(JLabel txtSemester) {
		this.txtSemester = txtSemester;
	}

	private void addContentToFrame() {
		// TODO Auto-generated method stub
		add(north, BorderLayout.NORTH);
		add(center);
		add(south, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		CreditSheet sheet = new CreditSheet();

		sheet.setSize(480, 600);
		sheet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sheet.setVisible(true);
	}

}

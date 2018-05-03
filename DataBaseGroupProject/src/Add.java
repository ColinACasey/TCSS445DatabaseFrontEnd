/*
 * DataBase: GroupProject
 * Colin Casey
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;

/**
 * This class is opened when the add button
 * is pushed on the Homepage Frame. 
 * @author caseycao
 */
public class Add extends JPanel implements Observer{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	/**
     * Used to set button size.
     */
    private static final Dimension MY_BUTTON = new Dimension(100, 100);
	private JLabel lblEmployee;
	private JLabel lblFirstName;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblPhoneNumber;
	private JTextField textField_2;
	private JLabel lblAge;
	private JTextField textField_3;
	private JLabel lblGender;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblEmail;
	private JLabel lblMember;
	private JLabel lblFirstName_1;
	private JTextField textField_6;
	private JLabel lblLastName_1;
	private JTextField textField_7;
	private JLabel lblPosition;
	private JTextField textField_8;
	private JLabel lblPhoneNumber_1;
	private JTextField textField_9;
	private JLabel lblAge_1;
	private JTextField textField_10;
	private JLabel lblGender_1;
	private JTextField textField_11;
	private JLabel lblEmail_1;
	private JTextField textField_12;
	private JLabel lblFindAPerson;
	private JButton btnSubmit;
	private JTable table;

	public Add() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblFindAPerson = new JLabel("Add a Person");
		GridBagConstraints gbc_lblFindAPerson = new GridBagConstraints();
		gbc_lblFindAPerson.insets = new Insets(0, 0, 5, 5);
		gbc_lblFindAPerson.gridx = 1;
		gbc_lblFindAPerson.gridy = 0;
		add(lblFindAPerson, gbc_lblFindAPerson);
		
		lblEmployee = new JLabel("Employee");
		GridBagConstraints gbc_lblEmployee = new GridBagConstraints();
		gbc_lblEmployee.anchor = GridBagConstraints.WEST;
		gbc_lblEmployee.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmployee.gridx = 0;
		gbc_lblEmployee.gridy = 1;
		add(lblEmployee, gbc_lblEmployee);
		
		lblFirstName = new JLabel("First Name");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.WEST;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 0;
		gbc_lblFirstName.gridy = 2;
		add(lblFirstName, gbc_lblFirstName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.WEST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 0;
		gbc_lblLastName.gridy = 3;
		add(lblLastName, gbc_lblLastName);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblPosition = new JLabel("Position");
		GridBagConstraints gbc_lblPosition = new GridBagConstraints();
		gbc_lblPosition.anchor = GridBagConstraints.WEST;
		gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosition.gridx = 0;
		gbc_lblPosition.gridy = 4;
		add(lblPosition, gbc_lblPosition);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.anchor = GridBagConstraints.NORTH;
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 4;
		add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		lblPhoneNumber = new JLabel("Phone Number *");
		GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
		gbc_lblPhoneNumber.anchor = GridBagConstraints.WEST;
		gbc_lblPhoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoneNumber.gridx = 0;
		gbc_lblPhoneNumber.gridy = 5;
		add(lblPhoneNumber, gbc_lblPhoneNumber);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 5;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		lblAge = new JLabel("Age");
		GridBagConstraints gbc_lblAge = new GridBagConstraints();
		gbc_lblAge.anchor = GridBagConstraints.WEST;
		gbc_lblAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblAge.gridx = 0;
		gbc_lblAge.gridy = 6;
		add(lblAge, gbc_lblAge);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 6;
		add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		lblGender = new JLabel("Gender");
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.WEST;
		gbc_lblGender.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender.gridx = 0;
		gbc_lblGender.gridy = 7;
		add(lblGender, gbc_lblGender);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 7;
		add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		lblEmail = new JLabel("Email *");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 8;
		add(lblEmail, gbc_lblEmail);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 8;
		add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		lblMember = new JLabel("Customer");
		GridBagConstraints gbc_lblMember = new GridBagConstraints();
		gbc_lblMember.anchor = GridBagConstraints.WEST;
		gbc_lblMember.insets = new Insets(0, 0, 5, 5);
		gbc_lblMember.gridx = 0;
		gbc_lblMember.gridy = 10;
		add(lblMember, gbc_lblMember);
		
		lblFirstName_1 = new JLabel("First Name");
		GridBagConstraints gbc_lblFirstName_1 = new GridBagConstraints();
		gbc_lblFirstName_1.anchor = GridBagConstraints.WEST;
		gbc_lblFirstName_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName_1.gridx = 0;
		gbc_lblFirstName_1.gridy = 11;
		add(lblFirstName_1, gbc_lblFirstName_1);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 11;
		add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		lblLastName_1 = new JLabel("Last Name");
		GridBagConstraints gbc_lblLastName_1 = new GridBagConstraints();
		gbc_lblLastName_1.anchor = GridBagConstraints.WEST;
		gbc_lblLastName_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName_1.gridx = 0;
		gbc_lblLastName_1.gridy = 12;
		add(lblLastName_1, gbc_lblLastName_1);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 12;
		add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		lblGender_1 = new JLabel("Gender");
		GridBagConstraints gbc_lblGender_1 = new GridBagConstraints();
		gbc_lblGender_1.anchor = GridBagConstraints.WEST;
		gbc_lblGender_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblGender_1.gridx = 0;
		gbc_lblGender_1.gridy = 13;
		add(lblGender_1, gbc_lblGender_1);
		
		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 1;
		gbc_textField_11.gridy = 13;
		add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		lblEmail_1 = new JLabel("Email");
		GridBagConstraints gbc_lblEmail_1 = new GridBagConstraints();
		gbc_lblEmail_1.anchor = GridBagConstraints.WEST;
		gbc_lblEmail_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_1.gridx = 0;
		gbc_lblEmail_1.gridy = 14;
		add(lblEmail_1, gbc_lblEmail_1);
		
		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 1;
		gbc_textField_12.gridy = 14;
		add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		lblAge_1 = new JLabel("Age");
		GridBagConstraints gbc_lblAge_1 = new GridBagConstraints();
		gbc_lblAge_1.anchor = GridBagConstraints.WEST;
		gbc_lblAge_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAge_1.gridx = 0;
		gbc_lblAge_1.gridy = 15;
		add(lblAge_1, gbc_lblAge_1);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 1;
		gbc_textField_10.gridy = 15;
		add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		lblPhoneNumber_1 = new JLabel("Phone Number *");
		GridBagConstraints gbc_lblPhoneNumber_1 = new GridBagConstraints();
		gbc_lblPhoneNumber_1.anchor = GridBagConstraints.WEST;
		gbc_lblPhoneNumber_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoneNumber_1.gridx = 0;
		gbc_lblPhoneNumber_1.gridy = 16;
		add(lblPhoneNumber_1, gbc_lblPhoneNumber_1);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 1;
		gbc_textField_9.gridy = 16;
		add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 2;
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 17;
		add(table, gbc_table);
		
		btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.gridx = 2;
		gbc_btnSubmit.gridy = 17;
		add(btnSubmit, gbc_btnSubmit);
	}

	//currently not used.
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}	
}

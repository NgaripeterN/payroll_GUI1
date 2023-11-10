package FirstProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldRate;
	private JTextField textFieldHour_per_Day;
	private JTextField textFieldDays_Worked;
	private JTextField textField_GrossSalary2;
	private JTextField textField_tax;
	private JTextField textField_Philhealth;
	private JTextField textField_sss;
	private JTextField textField_TotalDeduction;
	private JTextField textField_NetSalary;
	private JTextField textField_GrossSalary;
	private JTextField textField_Deduction;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setFont(new Font("Dialog", Font.BOLD, 20));
		setTitle("                                                    Simple Payroll System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1152, 541);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("               Employee Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 64, 231, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Rate per Hour:");
		lblNewLabel.setPreferredSize(new Dimension(76, 13));
		lblNewLabel.setMinimumSize(new Dimension(76, 13));
		lblNewLabel.setMaximumSize(new Dimension(76, 13));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(new Rectangle(138, 108, 124, 28));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Hour per Day:");
		lblNewLabel_2.setPreferredSize(new Dimension(76, 13));
		lblNewLabel_2.setMinimumSize(new Dimension(76, 13));
		lblNewLabel_2.setMaximumSize(new Dimension(76, 13));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(138, 146, 124, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Days worked:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setMinimumSize(new Dimension(76, 13));
		lblNewLabel_3.setMaximumSize(new Dimension(76, 13));
		lblNewLabel_3.setPreferredSize(new Dimension(76, 13));
		lblNewLabel_3.setBounds(47, 180, 205, 24);
		contentPane.add(lblNewLabel_3);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(262, 68, 144, 27);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldRate = new JTextField();
		textFieldRate.setBounds(262, 108, 144, 27);
		contentPane.add(textFieldRate);
		textFieldRate.setColumns(10);
		
		textFieldHour_per_Day = new JTextField();
		textFieldHour_per_Day.setBounds(262, 149, 144, 27);
		contentPane.add(textFieldHour_per_Day);
		textFieldHour_per_Day.setColumns(10);
		
		textFieldDays_Worked = new JTextField();
		textFieldDays_Worked.setBounds(262, 180, 144, 27);
		contentPane.add(textFieldDays_Worked);
		textFieldDays_Worked.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Simple Payroll System");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(405, 10, 302, 43);
		contentPane.add(lblNewLabel_4);
		
		textField_GrossSalary2 = new JTextField();
		textField_GrossSalary2.setEditable(false);
		textField_GrossSalary2.setBounds(241, 283, 165, 33);
		contentPane.add(textField_GrossSalary2);
		textField_GrossSalary2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("GROSS SALARY:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(68, 281, 174, 28);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setBounds(491, 64, 229, 28);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("TAX 15% of Monthly Wage:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(449, 108, 225, 21);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Philhealth 5%:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(553, 147, 154, 22);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SSS 2%:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(605, 181, 115, 22);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setBounds(464, 279, 225, 33);
		contentPane.add(lblNewLabel_10);
		
		textField_tax = new JTextField();
		textField_tax.setEditable(false);
		textField_tax.setBounds(684, 108, 106, 24);
		contentPane.add(textField_tax);
		textField_tax.setColumns(10);
		
		textField_Philhealth = new JTextField();
		textField_Philhealth.setEditable(false);
		textField_Philhealth.setBounds(684, 146, 106, 25);
		contentPane.add(textField_Philhealth);
		textField_Philhealth.setColumns(10);
		
		textField_sss = new JTextField();
		textField_sss.setEditable(false);
		textField_sss.setBounds(684, 180, 106, 25);
		contentPane.add(textField_sss);
		textField_sss.setColumns(10);
		
		textField_TotalDeduction = new JTextField();
		textField_TotalDeduction.setEditable(false);
		textField_TotalDeduction.setBounds(671, 281, 119, 33);
		contentPane.add(textField_TotalDeduction);
		textField_TotalDeduction.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("NET SALARY:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(819, 281, 197, 28);
		contentPane.add(lblNewLabel_11);
		
		textField_NetSalary = new JTextField();
		textField_NetSalary.setEditable(false);
		textField_NetSalary.setBounds(966, 281, 144, 35);
		contentPane.add(textField_NetSalary);
		textField_NetSalary.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCompute.setForeground(new Color(255, 255, 255));
		btnCompute.setBackground(SystemColor.textHighlight);
		btnCompute.setBounds(507, 335, 130, 43);
		contentPane.add(btnCompute);
		btnCompute.addActionListener((ActionListener) new ActionListener() {
		        public void actionPerformed(ActionEvent arg0) {
		        	String name = textFieldName.getText();
		            double ratePerHour, hoursPerDay, grossSalary, taxDeduction, philhealthDeduction, sssDeduction, totalDeduction, netSalary;
		            int daysWorked;

		            ratePerHour = Double.valueOf(textFieldRate.getText());
		            hoursPerDay = Double.valueOf(textFieldHour_per_Day.getText());
		            daysWorked = Integer.valueOf(textFieldDays_Worked.getText());

		            // Calculate the gross salary
		            grossSalary = ratePerHour * hoursPerDay * daysWorked;
		             taxDeduction = grossSalary * 0.15;
		             philhealthDeduction = grossSalary * 0.05;
		             sssDeduction = grossSalary * 0.02;
                     totalDeduction = taxDeduction + philhealthDeduction + sssDeduction;
		            // Calculate the net salary
		             netSalary = grossSalary - taxDeduction - philhealthDeduction - sssDeduction;

		            // Create a new DecimalFormat object with 2 decimal places
		            DecimalFormat df = new DecimalFormat("#.##");

		            // Format the gross salary, tax deduction, Philhealth deduction, SSS deduction, total deduction, and net salary before displaying them in the text fields
		            textField_GrossSalary.setText(df.format(grossSalary));
		            textField_GrossSalary2.setText(df.format(grossSalary));
		            textField_tax.setText(df.format(taxDeduction));
		            textField_Philhealth.setText(df.format(philhealthDeduction));
		            textField_sss.setText(df.format(sssDeduction));
		            textField_TotalDeduction.setText(df.format(totalDeduction));
		            textField_Deduction.setText(df.format(totalDeduction));
		            textField_NetSalary.setText(df.format(netSalary));
		        }
		        });
		
		JLabel lblNewLabel_12 = new JLabel("Gross Salary:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(860, 89, 106, 28);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Deduction:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(871, 127, 115, 32);
		contentPane.add(lblNewLabel_13);
		
		textField_GrossSalary = new JTextField();
		textField_GrossSalary.setEditable(false);
		textField_GrossSalary.setBounds(966, 89, 106, 27);
		contentPane.add(textField_GrossSalary);
		textField_GrossSalary.setColumns(10);
		
		textField_Deduction = new JTextField();
		textField_Deduction.setEditable(false);
		textField_Deduction.setBounds(966, 127, 106, 29);
		contentPane.add(textField_Deduction);
		textField_Deduction.setColumns(10);
	}
}

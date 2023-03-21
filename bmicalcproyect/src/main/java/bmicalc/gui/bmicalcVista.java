package bmicalc.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class bmicalcVista extends JFrame {

	private JPanel contentPane;
	private JTextField textField_mass;
	private JTextField textField_height;
	private JTextField textField_waistc;
	private JTextField textField_bmi;
	private JButton btnBMI,btnABDOBESITY,btnCATEGORY;
	private JLabel lblresultado_bmi, lblresult_abdobsesity,lblresult_category;
	private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmicalcVista frame = new bmicalcVista();
					frame.pack();
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
	public bmicalcVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("BMI CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(8, 1));
		
		JPanel panel_mass = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_mass.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel.add(panel_mass);
		
		JLabel lblmass = new JLabel("mass (kg) : ");
		panel_mass.add(lblmass);
		
		textField_mass = new JTextField();
		textField_mass.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_mass.add(textField_mass);
		textField_mass.setColumns(10);
		
		JPanel panel_height = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_height.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel.add(panel_height);
		
		JLabel lblheight = new JLabel("height (m) :");
		panel_height.add(lblheight);
		
		textField_height = new JTextField();
		textField_height.setHorizontalAlignment(SwingConstants.RIGHT);
		//textField_height.setText("");
		panel_height.add(textField_height);
		textField_height.setColumns(10);
		
		JPanel panel_gender = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_gender.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel.add(panel_gender);
		
		JLabel lblgender = new JLabel("gender :");
		panel_gender.add(lblgender);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Female", "Male"}));
		panel_gender.add(comboBox);
		
		
		
		JPanel panel_waistc = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_waistc.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel.add(panel_waistc);
		
		JLabel lblwaistc = new JLabel("waist circumference (cm) :");
		panel_waistc.add(lblwaistc);
		
		textField_waistc = new JTextField();
		textField_waistc.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_waistc.add(textField_waistc);
		textField_waistc.setColumns(10);
		
		JPanel panel_bmi = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_bmi.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel.add(panel_bmi);
		
		JLabel lblbmi = new JLabel("bmi : ");
		panel_bmi.add(lblbmi);
		
		textField_bmi = new JTextField();
		textField_bmi.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_bmi.add(textField_bmi);
		textField_bmi.setColumns(10);
		
		JPanel panel_bmicalc = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_bmicalc.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel.add(panel_bmicalc);
		
		JButton btnBMI = new JButton("Compute bmi");
		panel_bmicalc.add(btnBMI);
		
		JLabel lblresultado_bmi = new JLabel("El resultado de bmi es: ");
		lblresultado_bmi.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_bmicalc.add(lblresultado_bmi);
		
		JPanel panel_abdobsesitycalc = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_abdobsesitycalc.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.add(panel_abdobsesitycalc);
		
		JButton btnABDOBESITY = new JButton("Compute abdominal obesity");
		btnABDOBESITY.setHorizontalAlignment(SwingConstants.LEFT);
		panel_abdobsesitycalc.add(btnABDOBESITY);
		
		JLabel lblresult_abdobsesity = new JLabel("El resultado de si tiene abdominal obsesity es: ");
		lblresult_abdobsesity.setHorizontalAlignment(SwingConstants.LEFT);
		panel_abdobsesitycalc.add(lblresult_abdobsesity);
		
		JPanel panel_categorycalc = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_categorycalc.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel.add(panel_categorycalc);
		
		JButton btnCATEGORY = new JButton("Compute category");
		btnCATEGORY.setHorizontalAlignment(SwingConstants.LEFT);
		panel_categorycalc.add(btnCATEGORY);
		
		JLabel lblresult_category = new JLabel("La categoria obtenida es: ");
		panel_categorycalc.add(lblresult_category);
		
		pack();
		setVisible(true);
		
		
	}
	
	
	public void registerController(ActionListener ctrl) {
		btnBMI.addActionListener(ctrl);
		btnBMI.setActionCommand("Compute bmi");
		btnABDOBESITY.addActionListener(ctrl);
		btnABDOBESITY.setActionCommand("Compute abdominal obesity");
		btnCATEGORY.addActionListener(ctrl);
		btnCATEGORY.setActionCommand("Compute category");
	}
	
	public double getInputValueMass() {
		return Double.parseDouble(textField_mass.getText());
	}
	
	public double getInputValueHeight() {
		return Double.parseDouble(textField_height.getText());
	}
	
	public double getInputValueWaistC() {
		return Double.parseDouble(textField_waistc.getText());
	}
	
	public double getInputValueBMI() {
		return Double.parseDouble(textField_bmi.getText());
	}
	
	/*
	public String getInputValueGender(JComboBox comboBox) {
		String gender = (String) comboBox.getSelectedItem();
	    return gender;
	}
	*/
	
	public String getInputValueGender() {
	    return comboBox.getSelectedItem().toString();
	}
	
	public void setResultado_bmi(double resultado) {
		lblresultado_bmi.setText("El resultado de bmi es: " + resultado);
		
	}
	
	
	
	public void setResultado_category(String resultado3) {
		lblresult_category.setText("La categoria obtenida es: " + resultado3);
	}

	public void setResultado_abdobsesity(boolean resultado) {
		lblresult_abdobsesity.setText("El resultado de si tiene abdominal obsesity es: " + resultado);
		
	}
	
	
	
	
	
}

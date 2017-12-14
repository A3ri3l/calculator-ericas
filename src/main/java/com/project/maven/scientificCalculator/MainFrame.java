package com.project.maven.scientificCalculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * In my mainframe I have a calculator handling 10 types of calculations (plus, minus, division, multiplication, 
 * hex, log, sin, sinh, plusminus and square root. Its called from my main class.
 * 
 * @author erica
 *
 */

public class MainFrame {

	/**
	 * All my J-thingies are listed here. Frame, Menu Items, Buttons, TextFields aso.
	 */

	private JFrame frmCalculatorericas;
	private JMenuBar menu = new JMenuBar();
	private JMenu mnFile = new JMenu("File");
	private JMenuItem mntmBasic = new JMenuItem("Basic");
	private JMenuItem mntmScientific = new JMenuItem("Scientific");
	private JMenuItem mntmExit = new JMenuItem("Exit");
	private JTextField txtEntryField;
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btn0 = new JButton("0");
	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("/");
	private JButton btnLog = new JButton("Log");
	private JButton btnSquareRoot = new JButton("√");
	private JButton btnPi = new JButton("Pi");
	private JButton btnCE = new JButton("CE");
	private JButton btnResult = new JButton("=");
	private final JButton btnPlusMinus = new JButton("±");
	private final JButton btnSin = new JButton("Sin");
	private final JButton btmSinH = new JButton("Sinh");

	double firstNo;
	double secondNo;
	double result;
	double operations2;
	String operations;
	String answer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmCalculatorericas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
		addActionListeners();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatorericas = new JFrame();
		frmCalculatorericas.setTitle("calculator-ericas");
		frmCalculatorericas.setBounds(100, 100, 204, 359);
		frmCalculatorericas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatorericas.getContentPane().setLayout(null);
		frmCalculatorericas.setVisible(true);
		

		txtEntryField = new JTextField();
		txtEntryField.setBounds(10, 18, 183, 29);
		frmCalculatorericas.getContentPane().add(txtEntryField);
		txtEntryField.setColumns(10);

		btnAdd.setBounds(75, 66, 56, 29);
		frmCalculatorericas.getContentPane().add(btnAdd);

		btnDivide.setBounds(137, 107, 56, 29);
		frmCalculatorericas.getContentPane().add(btnDivide);

		btnSubtract.setBounds(137, 66, 56, 29);
		frmCalculatorericas.getContentPane().add(btnSubtract);

		btnMultiply.setBounds(75, 107, 56, 29);
		frmCalculatorericas.getContentPane().add(btnMultiply);
		
		btnCE.setBounds(10, 66, 56, 70);
		frmCalculatorericas.getContentPane().add(btnCE);

		btnResult.setBounds(137, 265, 56, 29);
		frmCalculatorericas.getContentPane().add(btnResult);

		btnLog.setBounds(236, 142, 56, 29);
		frmCalculatorericas.getContentPane().add(btnLog);

		btnSquareRoot.setBounds(236, 107, 56, 29);
		frmCalculatorericas.getContentPane().add(btnSquareRoot);
	
		btnPi.setBounds(236, 66, 56, 29);
		frmCalculatorericas.getContentPane().add(btnPi);

		btn7.setBounds(12, 224, 56, 29);
		frmCalculatorericas.getContentPane().add(btn7);

		btn4.setBounds(12, 183, 56, 29);
		frmCalculatorericas.getContentPane().add(btn4);

		btn5.setBounds(75, 183, 56, 29);
		frmCalculatorericas.getContentPane().add(btn5);

		btn1.setBounds(10, 142, 56, 29);
		frmCalculatorericas.getContentPane().add(btn1);

		btn2.setBounds(75, 142, 56, 29);
		frmCalculatorericas.getContentPane().add(btn2);

		btn3.setBounds(137, 142, 56, 29);
		frmCalculatorericas.getContentPane().add(btn3);

		btn6.setBounds(137, 183, 56, 29);
		frmCalculatorericas.getContentPane().add(btn6);

		btn8.setBounds(75, 224, 56, 29);
		frmCalculatorericas.getContentPane().add(btn8);

		btn9.setBounds(137, 224, 56, 29);
		frmCalculatorericas.getContentPane().add(btn9);

		btn0.setBounds(10, 265, 114, 29);
		frmCalculatorericas.getContentPane().add(btn0);

		btnPlusMinus.setBounds(236, 183, 56, 29);
		frmCalculatorericas.getContentPane().add(btnPlusMinus);

		btnSin.setBounds(236, 224, 56, 29);
		frmCalculatorericas.getContentPane().add(btnSin);

		btmSinH.setBounds(236, 265, 56, 29);
		frmCalculatorericas.getContentPane().add(btmSinH);

		frmCalculatorericas.setJMenuBar(menu);
		menu.add(mnFile);
	}

	/**
	 * Here I list all action listeners for the calculator.
	 */
		
	public void addActionListeners() {
		        
		
		mntmBasic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmCalculatorericas.setTitle("basic calculator");
				frmCalculatorericas.setBounds(100, 100, 204, 359);
				txtEntryField.setBounds(10, 18, 183, 29);

			}
		});
		mnFile.add(mntmBasic);

		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmCalculatorericas.setTitle("scientific calculator");
				frmCalculatorericas.setBounds(100, 100, 318, 359);
				txtEntryField.setBounds(12, 18, 290, 29);
			}
		});
		mnFile.add(mntmScientific);

		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtEntryField.setText(null);
				//operations.set(null);
				
			}
		});

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn1.getText();
				txtEntryField.setText(iNo);
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn2.getText();
				txtEntryField.setText(iNo);
			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn3.getText();
				txtEntryField.setText(iNo);
			}
		});

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn4.getText();
				txtEntryField.setText(iNo);
			}
		});

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn5.getText();
				txtEntryField.setText(iNo);
			}
		});

		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn6.getText();
				txtEntryField.setText(iNo);
			}
		});

		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn7.getText();
				txtEntryField.setText(iNo);
			}
		});

		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn8.getText();
				txtEntryField.setText(iNo);
			}
		});

		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn9.getText();
				txtEntryField.setText(iNo);
			}
		});

		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNo = txtEntryField.getText() + btn0.getText();
				txtEntryField.setText(iNo);
			}
		});

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNo = Double.parseDouble(txtEntryField.getText());
				txtEntryField.setText("");
				operations = "+";
			}
		});

		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNo = Double.parseDouble(txtEntryField.getText());
				txtEntryField.setText("");
				operations = "-";
			}
		});

		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNo = Double.parseDouble(txtEntryField.getText());
				txtEntryField.setText("");
				operations = "*";
			}
		});

		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNo = Double.parseDouble(txtEntryField.getText());
				txtEntryField.setText("");
				operations = "/";
			}
		});
		
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double operations;
				operations = (3.1415926535897932384626433832795);
				txtEntryField.setText(String.valueOf(operations));
				
			}
		});

		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double operations2 = Double.parseDouble(String.valueOf(txtEntryField.getText()));
				operations2 = Math.log(operations2);
				txtEntryField.setText(String.valueOf(operations2));
			}
		});

		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double operations2 = Double.parseDouble(String.valueOf(txtEntryField.getText()));
				operations2 = operations2 * (-1);
				txtEntryField.setText(String.valueOf(operations2));
			}
		});

		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double operations2 = Double.parseDouble(String.valueOf(txtEntryField.getText()));
				operations2 = Math.sqrt(operations2);
				txtEntryField.setText(String.valueOf(operations2));

			}
		});

		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double operations2 = Double.parseDouble(String.valueOf(txtEntryField.getText()));
				operations2 = Math.sin(operations2);
				txtEntryField.setText(String.valueOf(operations2));
			}
		});

		btmSinH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double operations2 = Double.parseDouble(String.valueOf(txtEntryField.getText()));
				operations2 = Math.sinh(operations2);
				txtEntryField.setText(String.valueOf(operations2));
			}
		});

		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;
				secondNo = Double.parseDouble(txtEntryField.getText());

				if (operations == "+") {
					result = firstNo + secondNo;
					answer = String.format("%.2f", result);
					txtEntryField.setText(answer);
				}

				else if (operations == "-") {
					result = firstNo - secondNo;
					answer = String.format("%.2f", result);
					txtEntryField.setText(answer);
				}

				else if (operations == "/") {
					result = firstNo / secondNo;
					answer = String.format("%.2f", result);
					txtEntryField.setText(answer);
				}
				
				else if (operations == "*") {
					result = firstNo * secondNo;
					answer = String.format("%.2f", result);
					txtEntryField.setText(answer);
				}
				
			}
		});

	
		
}
}

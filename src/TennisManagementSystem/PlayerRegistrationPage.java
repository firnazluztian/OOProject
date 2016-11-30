package TennisManagementSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayerRegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField name_textInput;
	private JTextField email_textInput;
	private JTextField country_textInput;
	private JTextField coach_textInput;
	private JTextField label5_textInput;
	private JTextField label6_textInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerRegistrationPage frame = new PlayerRegistrationPage();
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
	public PlayerRegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton back_button = new JButton("Back");
		back_button.setBounds(10, 11, 89, 23);
		contentPane.add(back_button);
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage l = new LoginPage();
				l.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel title_text = new JLabel("Player Registration");
		title_text.setHorizontalAlignment(SwingConstants.CENTER);
		title_text.setBounds(10, 45, 284, 42);
		contentPane.add(title_text);
		
		JLabel name_text = new JLabel("Name");
		name_text.setHorizontalAlignment(SwingConstants.LEFT);
		name_text.setBounds(10, 98, 284, 25);
		contentPane.add(name_text);
		
		name_textInput = new JTextField();
		name_textInput.setHorizontalAlignment(SwingConstants.CENTER);
		name_textInput.setBounds(10, 123, 284, 28);
		contentPane.add(name_textInput);
		name_textInput.setColumns(10);
		
		JLabel email_text = new JLabel("Email");
		email_text.setHorizontalAlignment(SwingConstants.LEFT);
		email_text.setBounds(10, 150, 284, 25);
		contentPane.add(email_text);
		
		email_textInput = new JTextField();
		email_textInput.setHorizontalAlignment(SwingConstants.CENTER);
		email_textInput.setColumns(10);
		email_textInput.setBounds(10, 174, 284, 28);
		contentPane.add(email_textInput);
		
		JLabel country_text = new JLabel("Country");
		country_text.setHorizontalAlignment(SwingConstants.LEFT);
		country_text.setBounds(10, 200, 284, 25);
		contentPane.add(country_text);
		
		country_textInput = new JTextField();
		country_textInput.setHorizontalAlignment(SwingConstants.CENTER);
		country_textInput.setColumns(10);
		country_textInput.setBounds(10, 223, 284, 28);
		contentPane.add(country_textInput);
		
		JLabel coach_text = new JLabel("Coach");
		coach_text.setHorizontalAlignment(SwingConstants.LEFT);
		coach_text.setBounds(10, 250, 284, 25);
		contentPane.add(coach_text);
		
		coach_textInput = new JTextField();
		coach_textInput.setHorizontalAlignment(SwingConstants.CENTER);
		coach_textInput.setColumns(10);
		coach_textInput.setBounds(10, 273, 284, 28);
		contentPane.add(coach_textInput);
		
		JLabel label5_text = new JLabel("label_5");
		label5_text.setHorizontalAlignment(SwingConstants.LEFT);
		label5_text.setBounds(10, 301, 43, 25);
		contentPane.add(label5_text);
		
		label5_textInput = new JTextField();
		label5_textInput.setHorizontalAlignment(SwingConstants.CENTER);
		label5_textInput.setColumns(10);
		label5_textInput.setBounds(10, 323, 284, 28);
		contentPane.add(label5_textInput);
		
		JLabel label6_text = new JLabel("label_6");
		label6_text.setHorizontalAlignment(SwingConstants.LEFT);
		label6_text.setBounds(10, 351, 284, 25);
		contentPane.add(label6_text);
		
		label6_textInput = new JTextField();
		label6_textInput.setHorizontalAlignment(SwingConstants.CENTER);
		label6_textInput.setColumns(10);
		label6_textInput.setBounds(10, 374, 284, 28);
		contentPane.add(label6_textInput);
		
		JButton submit_button = new JButton("Submit");
		contentPane.add(submit_button);
		submit_button.setBounds(109, 430, 89, 23);
		submit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// do something
			}
		});
		
	}

}

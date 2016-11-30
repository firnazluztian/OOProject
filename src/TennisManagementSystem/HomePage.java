package TennisManagementSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton logout_button = new JButton("logout");
		logout_button.setBounds(10, 11, 89, 23);
		contentPane.add(logout_button);
		logout_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage l = new LoginPage();
				l.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblYouAreLogged = new JLabel("You are logged in as :");
		lblYouAreLogged.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYouAreLogged.setBounds(10, 45, 165, 42);
		contentPane.add(lblYouAreLogged);
		
		JLabel username_text = new JLabel("get_username");
		username_text.setHorizontalAlignment(SwingConstants.LEFT);
		username_text.setBounds(185, 45, 109, 42);
		contentPane.add(username_text);
	}

}

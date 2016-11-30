package TennisManagementSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField username_textInput;
	private JPasswordField password_textInput;
	private Object String;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setBounds(100, 100, 320, 568);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title_text = new JLabel("Tennis Tournament \r\nManagement System");
		title_text.setBounds(10, 53, 284, 58);
		title_text.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(title_text);
		
		username_textInput = new JTextField();
		username_textInput.setBounds(47, 134, 200, 30);
		username_textInput.setColumns(10);
		contentPane.add(username_textInput);
		
		password_textInput = new JPasswordField();
		password_textInput.setBounds(47, 167, 200, 30);
		password_textInput.setColumns(10);
		contentPane.add(password_textInput);
		
		JButton login_button = new JButton("Login");
		login_button.setBounds(47, 208, 200, 35);
		login_button.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(login_button);
		
		JLabel register_text = new JLabel("or register here as");
		register_text.setBounds(47, 254, 111, 14);
		register_text.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(register_text);
		
		JButton player_button = new JButton("Player");
		player_button.setBounds(158, 254, 89, 23);
		contentPane.add(player_button);
		
		JButton ATP_button = new JButton("ATP");
		ATP_button.setBounds(158, 279, 89, 23);
		contentPane.add(ATP_button);
		
		/*add warning if one or more field is empty*/
		JLabel warning_text = new JLabel("");
		warning_text.setHorizontalAlignment(SwingConstants.CENTER);
		warning_text.setBounds(10, 250, 284, 58);
		contentPane.add(warning_text);
		
		
		player_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerRegistrationPage p = new PlayerRegistrationPage();
				p.setVisible(true);
				setVisible(false);
			}
		});
		
		login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (username_textInput.getText().isEmpty() || password_textInput.getPassword().length == 0) {
					//custom title, error icon
					JOptionPane.showMessageDialog(warning_text,
					    "username or password is invalid.",
					    "login error",
					    JOptionPane.ERROR_MESSAGE);
				}
				else {
					HomePage h = new HomePage();
					h.setVisible(true);
					setVisible(false);
				}
			}
		});

	}
}

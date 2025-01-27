package recommendation;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class gintamafinalchapter extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gintamafinalchapter frame = new gintamafinalchapter();
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
	public gintamafinalchapter() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img = new ImageIcon(this.getClass().getResource("/gintamafinalchapter.jpg")).getImage().getScaledInstance(182, 261,Image.SCALE_DEFAULT);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 182, 261);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrYouGot = new JTextArea();
		txtrYouGot.setEditable(false);
		txtrYouGot.setBackground(SystemColor.menu);
		txtrYouGot.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtrYouGot.setLineWrap(true);
		txtrYouGot.setText("You got:\nGintama the Movie: The Final Chapter - Be Forever Yorozuya \n(2013)");
		txtrYouGot.setBounds(192, 11, 232, 200);
		contentPane.add(txtrYouGot);
		
		JButton btnLink = new JButton("Details");
		btnLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				openWebPage("https://www.imdb.com/title/tt2374144/?ref_=fn_al_tt_1");
			}

			private void openWebPage(String string) {
				   try {         
					     java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.imdb.com/title/tt2374144/?ref_=fn_al_tt_1"));
					   }
					   catch (java.io.IOException e) {
					       System.out.println(e.getMessage());
					   }
				
			}
		});
		btnLink.setBounds(321, 227, 92, 23);
		contentPane.add(btnLink);
		
	}
}

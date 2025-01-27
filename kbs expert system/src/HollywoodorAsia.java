import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HollywoodorAsia extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HollywoodorAsia frame = new HollywoodorAsia();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public HollywoodorAsia(Movies m) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHollywoodOrAsia = new JLabel("Hollywood or Asia?");
		lblHollywoodOrAsia.setHorizontalAlignment(SwingConstants.CENTER);
		lblHollywoodOrAsia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHollywoodOrAsia.setBounds(10, 11, 414, 52);
		contentPane.add(lblHollywoodOrAsia);
		
		JButton btnHollywood = new JButton("Hollywood");
		btnHollywood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setHollywood(true);
				System.out.println("Hollywood : "+ m.isHollywood() +" (user prefer hollywood)");
				AloneorNot movie = new AloneorNot(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnHollywood.setBounds(161, 112, 106, 33);
		contentPane.add(btnHollywood);
		
		JButton btnAsia = new JButton("Asia");
		btnAsia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setHollywood(false);
				System.out.println("Hollywood : "+ m.isHollywood() +" (user prefer asian)");
				AloneorNot movie = new AloneorNot(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnAsia.setBounds(161, 167, 106, 33);
		contentPane.add(btnAsia);
	}

}

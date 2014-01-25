import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;


public class BandosGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BandosGUI frame = new BandosGUI();
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
	public BandosGUI() {
		setTitle("EliteBandos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("yo");
		tabbedPane.addTab("Banking", null, panel, null);
		
		JLabel lblEliteBandos = new JLabel("Elite Bandos");
		lblEliteBandos.setFont(new Font("Cooper Std Black", Font.BOLD, 22));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(115)
							.addComponent(lblEliteBandos, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEliteBandos, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Travelling", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Abilities", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Looting", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Others", null, panel_4, null);
		contentPane.setLayout(gl_contentPane);
	}
}

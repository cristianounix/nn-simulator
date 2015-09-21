package br.fee.unicamp;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class GUInterface {

	private JFrame frame;

	public GUInterface() {
		frame = new JFrame("Neural Network Simulator.");
		frame.setLayout(null);

		JPanel panel = this.createInputFilePanel();
		
		frame.add(panel);

		frame.setResizable(Boolean.FALSE);
		frame.setSize(1000, 770);
		frame.setVisible(Boolean.TRUE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JPanel createInputFilePanel() {
		TitledBorder border = BorderFactory.createTitledBorder(null,
				"Input File:", TitledBorder.LEFT, TitledBorder.TOP, new Font("arial", Font.PLAIN, 12));

		JPanel panel = new JPanel(null);
		panel.setBorder(border);
		panel.setBounds(10, 10, 980, 300);
		
		JLabel lbInputFile = new JLabel("File");
		lbInputFile.setBounds(20, 30, 100, 20);
		panel.add(lbInputFile);
		
		final JTextField txtInputFile = new JTextField();
		txtInputFile.setBounds(20, 50, 840, 25);
		txtInputFile.setEnabled(Boolean.FALSE);
		panel.add(txtInputFile);
		
		JButton btnFileChooser = new JButton("Select");
		btnFileChooser.setBounds(880, 50, 80, 25);
		btnFileChooser.addActionListener(new FileChooserActionListener(new PathFileManager(txtInputFile)));
		
		panel.add(btnFileChooser);
		
		return panel;
	}

	public static void main(String[] args) {
		GUInterface gui = new GUInterface();

	}

}
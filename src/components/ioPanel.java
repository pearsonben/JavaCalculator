package components;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ioPanel extends JPanel{
	
	public JTextField answerField = new JTextField(20);
	public JTextField inputField = new JTextField(20);
	
	public ioPanel() {
		/* GridBagLayout concept explained in the buttonPanel file.
		 * 
		 */
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(5,5,5,5);
		constraints.gridx = 0;
		constraints.gridy = 0;
		
		this.add(new JLabel("Output:"), constraints);
		
		constraints.gridy = 1;
		this.add(new JLabel("Input:"), constraints);
		
		// Making the component to be added stretch across multiple grid slots
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.ipady = 20;
		constraints.weightx = 1;
		constraints.gridwidth = 3;
		constraints.gridx = 1;
		constraints.gridy = 0;
		
		this.add(answerField, constraints);
		
		constraints.gridy = 1;
		this.add(inputField, constraints);
		
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "I/O Border"));

		
		
	}
}

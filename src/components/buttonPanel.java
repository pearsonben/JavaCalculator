package components;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class buttonPanel extends JPanel{
	
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	private JButton button0 = new JButton("0");
	private JButton multiplybutton = new JButton("x");
	private JButton dividebutton = new JButton("/");
	private JButton plusbutton = new JButton("+");
	private JButton minusbutton = new JButton("-");
	private JButton equalsbutton = new JButton("=");
	private JButton closebracketbutton = new JButton(")");
	private JButton openbracketbutton = new JButton("(");
	private JButton resetbutton = new JButton("AC");

	/* creating listener functions for all of the buttons, which can be accessed from the main class,
	 * while keeping the buttons private.
	 */
	public void button1AddActionListener(ActionListener al) {
	    button1.addActionListener(al);
	}
	
	public void button2AddActionListener(ActionListener al) {
	    button2.addActionListener(al);
	}
	
	public void button3AddActionListener(ActionListener al) {
	    button3.addActionListener(al);
	}
	
	public void button4AddActionListener(ActionListener al) {
	    button4.addActionListener(al);
	}
	
	public void button5AddActionListener(ActionListener al) {
	    button5.addActionListener(al);
	}
	
	public void button6AddActionListener(ActionListener al) {
	    button6.addActionListener(al);
	}
	
	public void button7AddActionListener(ActionListener al) {
	    button7.addActionListener(al);
	}
	
	public void button8AddActionListener(ActionListener al) {
	    button8.addActionListener(al);
	}
	
	public void button9AddActionListener(ActionListener al) {
	    button9.addActionListener(al);
	}
	
	public void button0AddActionListener(ActionListener al) {
	    button0.addActionListener(al);
	}
	
	public void equalsbuttonAddActionListener(ActionListener al) {
	    equalsbutton.addActionListener(al);
	}
	
	public void plusbuttonAddActionListener(ActionListener al) {
	    plusbutton.addActionListener(al);
	}
	
	public void minusbuttonAddActionListener(ActionListener al) {
	    minusbutton.addActionListener(al);
	}
	
	public void multiplybuttonAddActionListener(ActionListener al) {
	    multiplybutton.addActionListener(al);
	}
	
	public void dividebuttonAddActionListener(ActionListener al) {
	    dividebutton.addActionListener(al);
	}
	
	public void openbracketbuttonAddActionListener(ActionListener al) {
	    openbracketbutton.addActionListener(al);
	}
	
	public void closebracketbuttonAddActionListener(ActionListener al) {
	    closebracketbutton.addActionListener(al);
	}
	
	public void resetbuttonAddActionListener(ActionListener al) {
	    resetbutton.addActionListener(al);
	}
	
	public buttonPanel() {
		
		/* using the gridbaglayout, the panel is essentially just a grid with co ordinates.
		 * You can choose the grid parameters with .gridx and .gridy, and then just do the normal
		 * .add(component) function to add the component at the chosen co-ordinate.
		 */
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(5,5,5,5);
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		
		this.add(button1, constraints);
		constraints.gridx = 1;
		
		this.add(button2, constraints);
		
		constraints.gridx = 2;
		this.add(button3, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(button4, constraints);
		
		constraints.gridx = 1;
		this.add(button5, constraints);
		
		constraints.gridx = 2;
		this.add(button6, constraints);
		
		constraints.gridy = 2;
		constraints.gridx = 0;
		this.add(button7, constraints);
		
		constraints.gridx = 1;
		this.add(button8, constraints);
		
		constraints.gridx = 2;
		this.add(button9, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		this.add(button0, constraints);
		
		constraints.gridx = 3;
		constraints.gridy = 0;
		this.add(multiplybutton, constraints);
		
		constraints.gridy = 1;
		this.add(plusbutton, constraints);
		
		constraints.gridx = 4;
		this.add(minusbutton, constraints);
		
		constraints.gridy = 0;
		this.add(dividebutton, constraints);
		
		constraints.gridx = 4;
		constraints.gridy = 4;
		this.add(equalsbutton, constraints);
		
		constraints.gridx = 3;
		this.add(resetbutton, constraints);
		
		constraints.gridy = 2;
		this.add(openbracketbutton, constraints);
		
		constraints.gridx = 4;
		constraints.gridy = 2;
		this.add(closebracketbutton, constraints);
		
		
		// adds a titled border to the panel
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Button Panel"));
		
		
	}
	
}

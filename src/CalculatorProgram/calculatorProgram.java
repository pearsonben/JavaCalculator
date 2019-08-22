package CalculatorProgram;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import components.buttonPanel;
import components.ioPanel;

public class calculatorProgram extends JFrame{
	
	buttonPanel buttonPanel = new buttonPanel();
	ioPanel ioPanel = new ioPanel();
	
	public calculatorProgram() {
		// setting the title of the program
		super("Java Calculator");
		
		// adding the buttons to the main frame
		add(buttonPanel, BorderLayout.CENTER);
		add(ioPanel, BorderLayout.NORTH);
		pack();
		setLocationRelativeTo(null);
		
		
		//------------------------- BUTTON LISTENERS----------------------------------------------
		buttonPanel.button0AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "0");
			}
			
		});
		
		buttonPanel.button1AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "1");
			}
			
		});
		
		buttonPanel.button2AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "2");
			}
			
		});
		
		buttonPanel.button3AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "3");
			}
			
		});
		
		buttonPanel.button4AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "4");
			}
			
		});
		
		buttonPanel.button5AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "5");
			}
			
		});
		
		buttonPanel.button6AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "6");
			}
			
		});
		
		buttonPanel.button7AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "7");
			}
			
		});
		
		buttonPanel.button8AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "8");
			}
			
		});
		
		buttonPanel.button9AddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "9");
			}
			
		});
		
		buttonPanel.minusbuttonAddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + " - ");
			}
			
		});
		
		buttonPanel.plusbuttonAddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + " + ");
			}
			
		});
		
		buttonPanel.multiplybuttonAddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + " * ");
			}
			
		});
		
		buttonPanel.dividebuttonAddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "/");
			}
			
		});
		
		buttonPanel.equalsbuttonAddActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = ioPanel.inputField.getText();
				ioPanel.answerField.setText(Double.toString(eval(input)));
				
				
			}
			
		});
		
		buttonPanel.openbracketbuttonAddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + "(");
			}
			
		});
		
		buttonPanel.closebracketbuttonAddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText(ioPanel.inputField.getText() + ")");
			}
			
		});
		

		buttonPanel.resetbuttonAddActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ioPanel.inputField.setText("");
				ioPanel.answerField.setText("");
			}
			
		});
		
		
		this.addKeyListener(new KeyListener() {

			
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				
				if(key == KeyEvent.VK_ENTER) {
					String input = ioPanel.inputField.getText();
					ioPanel.answerField.setText(Double.toString(eval(input)));
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
	
	}
	
	public static void main(String[] args) {
		new calculatorProgram().setVisible(true);
		
	}

	// ------------------------------METHOD CREATED BY BOANN, FROM STACKOVERFLOW-------------------
	// https://stackoverflow.com/questions/3422673/how-to-evaluate-a-math-expression-given-in-string-form
	
	public static double eval(final String str) {
	    return new Object() {
	        int pos = -1, ch;

	        void nextChar() {
	            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
	        }

	        boolean eat(int charToEat) {
	            while (ch == ' ') nextChar();
	            if (ch == charToEat) {
	                nextChar();
	                return true;
	            }
	            return false;
	        }

	        double parse() {
	            nextChar();
	            double x = parseExpression();
	            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
	            return x;
	        }

	        // Grammar:
	        // expression = term | expression `+` term | expression `-` term
	        // term = factor | term `*` factor | term `/` factor
	        // factor = `+` factor | `-` factor | `(` expression `)`
	        //        | number | functionName factor | factor `^` factor

	        double parseExpression() {
	            double x = parseTerm();
	            for (;;) {
	                if      (eat('+')) x += parseTerm(); // addition
	                else if (eat('-')) x -= parseTerm(); // subtraction
	                else return x;
	            }
	        }

	        double parseTerm() {
	            double x = parseFactor();
	            for (;;) {
	                if      (eat('*')) x *= parseFactor(); // multiplication
	                else if (eat('/')) x /= parseFactor(); // division
	                else return x;
	            }
	        }

	        double parseFactor() {
	            if (eat('+')) return parseFactor(); // unary plus
	            if (eat('-')) return -parseFactor(); // unary minus

	            double x;
	            int startPos = this.pos;
	            if (eat('(')) { // parentheses
	                x = parseExpression();
	                eat(')');
	            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
	                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
	                x = Double.parseDouble(str.substring(startPos, this.pos));
	            } else if (ch >= 'a' && ch <= 'z') { // functions
	                while (ch >= 'a' && ch <= 'z') nextChar();
	                String func = str.substring(startPos, this.pos);
	                x = parseFactor();
	                if (func.equals("sqrt")) x = Math.sqrt(x);
	                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
	                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
	                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
	                else throw new RuntimeException("Unknown function: " + func);
	            } else {
	                throw new RuntimeException("Unexpected: " + (char)ch);
	            }

	            if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

	            return x;
	        }
	    }.parse();
	}
	
	
}

package org.springframework.gs_maven;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class simpleCalc {

	public simpleCalc() {
		JFrame fr = new JFrame("Simple Calculator");
		fr.setLocation(250, 100);

		JPanel calc = new JPanel();
		// calc.setT
		// The field labels
		JPanel pnlLabel = new JPanel();
		pnlLabel.setLayout(new GridLayout(3, 3, 3, 3));
		JLabel lblOne = new JLabel("First Number");
		JLabel lblTwo = new JLabel("Second Number");
		JLabel result = new JLabel("Result");
		pnlLabel.add(lblOne);
		pnlLabel.add(lblTwo);
		pnlLabel.add(result);

		// The Text-fields
		JPanel pnlTxt = new JPanel();
		pnlTxt.setLayout(new GridLayout(3, 3, 3, 3));
		final JTextField txt1 = new JTextField(5);
		final JTextField txt2 = new JTextField(5);
		final JFormattedTextField ans = new JFormattedTextField(0);
		pnlTxt.add(txt1);
		pnlTxt.add(txt2);
		pnlTxt.add(ans);

		JPanel cont = new JPanel();
		cont.setLayout(new FlowLayout());
		cont.add(pnlLabel);
		cont.add(pnlTxt);
		// The Buttons
		JButton add = new JButton("Add");
		JButton sub = new JButton("Subtract");
		JButton div = new JButton("Divide");
		JButton mult = new JButton("Multiply");
		JButton reset = new JButton("Reset");
		JPanel pnlButtons = new JPanel();

		pnlButtons.add(add);
		pnlButtons.add(sub);
		pnlButtons.add(div);
		pnlButtons.add(mult);
		pnlButtons.add(reset);

		calc.add(cont);
		calc.add(pnlButtons);

		Container c = fr.getContentPane();
		c.add(calc, BorderLayout.CENTER);
		fr.pack();
		fr.setSize(400, 300);
		fr.setResizable(false);
		fr.setVisible(true);

		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());

				ans.setText(String.valueOf(a + b));
			}
		});

		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());

				ans.setText(String.valueOf(a - b));
			}
		});

		div.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());
				double answ = (a / b);

				try {
					ans.setValue(Double.valueOf(answ));

				} catch (Exception e) {

				}
			}
		});

		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());

				ans.setText(String.valueOf(a * b));
			}
		});

		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				txt1.setText(null);
				txt2.setText(null);
				ans.setText(null);
			}

		});

	}

	public static void main(String[] args) {
		new simpleCalc();
	}

}

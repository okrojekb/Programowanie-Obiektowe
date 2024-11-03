package pl.edu.pw.mini.po.lab14.ui;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("Moja ramka");
		setPreferredSize(new Dimension(600, 600));
		
		JPanel jPanel = new JPanel();
		
		//jPanel.setLayout(new BoxLayout(jPanel, ));
		
		MyPanel myPanel = new MyPanel();
		myPanel.setPreferredSize(new Dimension(200, 200));
		jPanel.add(myPanel);
		
		MyButton myButton = new MyButton();
		myButton.setPreferredSize(new Dimension(200, 200));
		jPanel.add(myButton);
		
		add(jPanel);
		
		
		pack();
		setVisible(true);
	}
}

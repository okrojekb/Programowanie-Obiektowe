package pl.edu.pw.mini.po.lab14.ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{

	public MyPanel() {
		setBackground(new Color(100, 200, 50));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawRect(100, 100, 100, 100);
	}

}

package main.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class CellPanel extends DropTarget {

	public CellPanel(MainWindow container)
	{
		this.setLayout(new BorderLayout());
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

	}

	@Override
	public boolean acceptMultipleChilds() {
		return false;
	}
}

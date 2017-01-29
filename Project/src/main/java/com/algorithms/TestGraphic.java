package com.algorithms;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import com.filereader.MyCanvas;
import com.model.ItemsPerNode;

public class TestGraphic {
	public static  void createFrame(int x,int y,int w,int h, List<ItemsPerNode> itemsPerNode) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(x, y, w*10, h*10);
		
			window.getContentPane().add(new MyCanvas(itemsPerNode));
		
		window.setVisible(true);
	}
}
package com.shenjugroup.tool.javacrudtool.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BoardMainView extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BoardMainView() {
        super();


        this.setSize(800, 700);
        this.setTitle("code-generate-tool");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);

        // 显示器屏幕大小
        Dimension screenSizeInfo = Toolkit.getDefaultToolkit().getScreenSize();
        int leftTopX = ((int) screenSizeInfo.getWidth() - this.getWidth()) / 2;
        int leftTopY = ((int) screenSizeInfo.getHeight() - this.getHeight()) / 2;

        // 设置显示的位置在屏幕中间
        this.setLocation(leftTopX, leftTopY);
    }
}

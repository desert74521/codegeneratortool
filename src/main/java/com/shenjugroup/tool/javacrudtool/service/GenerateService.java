package com.shenjugroup.tool.javacrudtool.service;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.stereotype.Service;

import com.shenjugroup.tool.javacrudtool.data.model.ElementsContext;
import com.shenjugroup.tool.javacrudtool.event.OnGenerateConnectClick;
import com.shenjugroup.tool.javacrudtool.event.OnTestConnectClick;
import com.shenjugroup.tool.javacrudtool.view.BoardMainView;

@Service
public class GenerateService {
	
	public void initElementsView(BoardMainView boardMainView, ElementsContext elementsContext) {
		
		elementsContext.urlLabel = new JLabel();
		elementsContext.urlLabel.setText("数据库url");
		elementsContext.urlLabel.setFont(new Font(null, Font.PLAIN, 16));
		
		elementsContext.urlField = new JTextField(40);
		elementsContext.urlField.setFont(new Font(null, Font.PLAIN, 16));
		
		elementsContext.pwdLabel = new JLabel();
		elementsContext.pwdLabel.setText("数据库密码");
		elementsContext.pwdLabel.setFont(new Font(null, Font.PLAIN, 16));
		
		elementsContext.pwdField = new JTextField(40);
		elementsContext.pwdField.setFont(new Font(null, Font.PLAIN, 16));
		
		
		elementsContext.userNameLabel = new JLabel();
		elementsContext.userNameLabel.setText("数据库用户名");
		elementsContext.userNameLabel.setFont(new Font(null, Font.PLAIN, 16));
		
		elementsContext.userNameField = new JTextField(40);
		elementsContext.userNameField.setFont(new Font(null, Font.PLAIN, 16));
		
		elementsContext.dirLabel = new JLabel();
		elementsContext.dirLabel.setText("生成代码基本目录");
		elementsContext.dirLabel.setFont(new Font(null, Font.PLAIN, 16));
		
		elementsContext.dirField = new JTextField(40);
		elementsContext.dirField.setFont(new Font(null, Font.PLAIN, 16));
		
		elementsContext.testResultLabel = new JLabel();
		elementsContext.testResultLabel.setText("---------点击测试---------");
		elementsContext.testResultLabel.setFont(new Font(null, Font.PLAIN, 10));
		
		elementsContext.testBtn = new JButton("连接测试");
		elementsContext.testBtn.addActionListener(new OnTestConnectClick());
		
		elementsContext.generateResultLabel = new JLabel();
		elementsContext.generateResultLabel.setText("");
		elementsContext.generateResultLabel.setFont(new Font(null, Font.PLAIN, 16));
		
		elementsContext.generateBtn = new JButton("生成按钮");
		elementsContext.generateBtn.addActionListener(new OnGenerateConnectClick());
		
		FlowLayout layout = new FlowLayout(5, 16, 12);
		elementsContext.panel = new JPanel(layout);
		
		elementsContext.panel.add(elementsContext.urlLabel);
		elementsContext.panel.add(elementsContext.urlField);
		elementsContext.panel.add(elementsContext.userNameLabel);
		elementsContext.panel.add(elementsContext.userNameField);
		elementsContext.panel.add(elementsContext.pwdLabel);
		elementsContext.panel.add(elementsContext.pwdField);
		elementsContext.panel.add(elementsContext.testBtn);
		elementsContext.panel.add(elementsContext.testResultLabel);
		elementsContext.panel.add(elementsContext.dirLabel);
		elementsContext.panel.add(elementsContext.dirField);
		elementsContext.panel.add(elementsContext.generateBtn);
		elementsContext.panel.add(elementsContext.generateResultLabel);
		
		boardMainView.setContentPane(elementsContext.panel);
		
	}
}

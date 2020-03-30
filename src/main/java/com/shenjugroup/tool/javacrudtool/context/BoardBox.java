package com.shenjugroup.tool.javacrudtool.context;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.shenjugroup.tool.javacrudtool.view.BoardMainView;

@Component
public class BoardBox {
	
	private BoardMainView boardMainView;
	
	@EventListener
    public void init(ApplicationReadyEvent applicationStartedEvent) {

        this.boardMainView = new BoardMainView();
        // 2. 创建中间容器（面板容器）
        JPanel panel = new JPanel();                // 创建面板容器，使用默认的布局管理器

        // 3. 创建一个基本组件（按钮），并添加到 面板容器 中
        JButton btn = new JButton("测试按钮");
        btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ninhao");
			}
        	
        });
        panel.add(btn);
        this.boardMainView.setContentPane(panel);
        this.boardMainView.setVisible(true);
    }
}

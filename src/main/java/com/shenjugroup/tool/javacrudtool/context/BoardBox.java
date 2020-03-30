package com.shenjugroup.tool.javacrudtool.context;

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
        this.boardMainView.setVisible(true);
    }
}

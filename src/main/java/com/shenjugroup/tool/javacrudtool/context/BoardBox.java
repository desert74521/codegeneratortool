package com.shenjugroup.tool.javacrudtool.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.shenjugroup.tool.javacrudtool.data.model.ElementsContext;
import com.shenjugroup.tool.javacrudtool.service.GenerateService;
import com.shenjugroup.tool.javacrudtool.view.BoardMainView;

@Component
public class BoardBox {
	
	private BoardMainView boardMainView;
	
	@Autowired
	private GenerateService generateService;
	
	@EventListener
    public void init(ApplicationReadyEvent applicationStartedEvent) {

        this.boardMainView = new BoardMainView();
        generateService.initElementsView(boardMainView, new ElementsContext());
        this.boardMainView.setVisible(true);
    }
}

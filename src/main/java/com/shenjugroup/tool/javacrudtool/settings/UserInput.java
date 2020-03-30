package com.shenjugroup.tool.javacrudtool.settings;

import lombok.Data;

@Data
public class UserInput {
	
	private String url;
	
	private String userName;
	
	private String pwd;
	
	private String tableName;
	
	private boolean isHelth;
}

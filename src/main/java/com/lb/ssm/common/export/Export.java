package com.lb.ssm.common.export;

import java.io.OutputStream;
import java.util.List;

public abstract class Export {
	
	
	public abstract OutputStream writeStream(OutputStream out, String type, List<String[]> records);
	
	protected String[] getColumns(String type) {
		
		return new String[] { "序号", "小区名称", "小区所属位置", "小区描述", "小区地址" };
		
	}
	
}

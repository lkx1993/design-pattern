package com.mkmd.builder.test;

/**
 * 文本编辑器
 * 
 * @author mahd
 *
 */
public class TextBulider extends Bulider {
	private StringBuffer stb = new StringBuffer();

	public void makeTitle(String title) {
		stb.append("==================\n");
		stb.append("/" + title + "/");
		stb.append("\n");
	}

	public void makeString(String str) {
		stb.append("*" + str + "\n");
		stb.append("\n");

	}

	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			stb.append("  ." + items[i] + "\n");
		}
		stb.append("\n");

	}

	public void close() {
		stb.append("==================\n");

	}

	public String getResult() {
		return stb.toString();
	}

}

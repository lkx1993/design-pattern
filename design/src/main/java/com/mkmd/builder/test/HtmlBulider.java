package com.mkmd.builder.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * html编辑器
 * 
 * @author mahd
 *
 */
public class HtmlBulider extends Bulider {
	private String filename;
	private PrintWriter print;

	public void makeTitle(String title) {
		filename = title + ".html";
		try {
			print = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		print.println("<html><head><title>" + title + "></title></head><body>");
		// 输出标题
		print.println("<h1>" + title + "></h1>");
	}

	public void makeString(String str) {
		print.println("<p>" + str + "></p>");

	}

	public void makeItems(String[] items) {
		print.println("<ul>");
		for (int i = 0; i < items.length; i++) {
			print.println("<li>" + items[i] + "></li>");
		}
		print.println("</ul>");

	}

	public void close() {
		print.println("</body></html>");
		print.close();
	}

	public String getResult() {
		return filename;
	}

}

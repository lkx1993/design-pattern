package com.mkmd.builder.test;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if (args[0].equals("plain")) {
			TextBulider tb = new TextBulider();
			Director director = new Director(tb);
			director.construct();
			String result = tb.getResult();
			System.out.println(result);

		} else if (args[0].equals("html")) {
			HtmlBulider hb = new HtmlBulider();
			Director director = new Director(hb);
			director.construct();
			String filename = hb.getResult();
			System.out.println(filename + "编写完成");
		} else {
			usage();
			System.exit(0);
		}

	}

	public static void usage() {
		System.out.println("Usage:java Main plain  编写纯文本文档");
		System.out.println("Usage:java Main html  编写html文档");
	}

}

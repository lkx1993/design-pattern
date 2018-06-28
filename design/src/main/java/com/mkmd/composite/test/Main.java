package com.mkmd.composite.test;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Make root entries...");
			Directory rootD = new Directory("root");
			Directory binD = new Directory("bin");
			Directory tmpD = new Directory("tmp");
			Directory usrD = new Directory("usr");
			rootD.add(binD);
			rootD.add(tmpD);
			rootD.add(usrD);
			binD.add(new File("vi", 10000));
			binD.add(new File("latex", 20000));
			rootD.printList();

			System.out.println("");
			System.out.println("Make user entries...");
			Directory yukiD = new Directory("yuki");
			Directory hanakuD = new Directory("hanaku");
			Directory tomuraD = new Directory("tomura");
			usrD.add(yukiD);
			usrD.add(hanakuD);
			usrD.add(tomuraD);
			yukiD.add(new File("diary.html", 100));
			yukiD.add(new File("Composite.java", 200));
			hanakuD.add(new File("memo.tex", 300));
			tomuraD.add(new File("game.doc", 400));
			tomuraD.add(new File("junk.mail", 500));
			rootD.printList();
		} catch (FileTreatMentException e) {
			e.printStackTrace();
		}
	}

}

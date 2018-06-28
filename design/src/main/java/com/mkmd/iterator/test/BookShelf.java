package com.mkmd.iterator.test;

/**
 * 书架类
 * 
 * @author mahd
 *
 */
public class BookShelf implements Aggregate {
	/**
	 * 书数组
	 */
	private Book[] books;
	/**
	 * 数组中书的数量
	 */
	private int last = 0;

	/**
	 * 初始化时定义书架的最大容量
	 * 
	 * @param maxsize
	 */
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}

	public int getLength() {
		return last;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}

	/**
	 * 实现Aggregate接口获取Iterator方法
	 */
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}

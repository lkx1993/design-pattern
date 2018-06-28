package com.mkmd.iterator.test;

/**
 * 遍历书架的类
 * 
 * @author mahd
 *
 */
public class BookShelfIterator implements Iterator {
	/**
	 * 书架
	 */
	private BookShelf bookShelf;
	/**
	 * 模拟迭代器指针
	 */
	private int index;

	/**
	 * 初始化时将指针指向书架第一位
	 * 
	 * @param bookShelf
	 */
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

	public BookShelf getBookShelf() {
		return bookShelf;
	}

	public void setBookShelf(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}

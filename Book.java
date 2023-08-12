package BookSorter;

import java.util.Comparator;

public class Book implements Comparable<Book>{
	private String bookName;
	private int pageCount;
	private String authorName;
	private int date;
	
	
	public Book(String bookName,int pageCount,String authorName,int date) {
		this.bookName=bookName;
		this.pageCount=pageCount;
		this.date=date;
		this.authorName=authorName;
	}
	
	public int getPageCount(){
		return pageCount;
	}
	
	public int getDate(){
		return date;
	}
	
	public String getBookName(){
		return bookName;
	}
	
	public String getAuthorName(){
		return authorName;
	}

	@Override
	public int compareTo(Book o) {
		return this.bookName.compareTo(o.bookName);
		
	}
	
	 public String toString() {
		
		return "[Book :]"+bookName+"\n"+
				"[Page Count :]"+pageCount+"\n"+
				"[Publication Year: ]"+date+"\n"+
				"[Author Name: ]"+authorName+"\n";
	}
	
	
	
	
	
	

}

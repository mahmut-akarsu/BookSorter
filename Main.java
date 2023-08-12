package BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Book coleInenNur=new Book("Cöle İnen Nur",598,"Necip Fazıl Kısakürek",1969);
		Book buUlke=new Book("Bu Ülke",598,"Cemil Meriç",1974);
		Book saatleriAyarlama=new Book("Saatleri Ayarlama Enstitüsü",382,"Ahmet Hamdi Tnpınar",1954);
		Book kurkMantolu=new Book("Kürk Mantolu Madonna",160,"Sabahattin Ali",1943);
		Book hayvanCiftligi=new Book("Hayvan Çiftliği",152,"George Orwell",1945);
		
		TreeSet<Book> books=new TreeSet<>();
		books.add(saatleriAyarlama);
		books.add(buUlke);
		books.add(coleInenNur);
		books.add(hayvanCiftligi);
		books.add(kurkMantolu);
		
		
		System.out.println("sorted by Alphabetical \n");
		
		for(Book book: books) {
			
			System.out.println(book);
			System.out.println("-------------------------------------");
		}
		
		System.out.println("#######################################################################");
		
		TreeSet<Book> sortedPage =new TreeSet<Book>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPageCount()-o2.getPageCount();
			}
			
		}
				);
		
		sortedPage.addAll(books);
		System.out.println("Sorted by Page Count \n ");
		
		for(Book bookElement: sortedPage) {
			System.out.println(bookElement);
			System.out.println("-------------------------------------");
		}
		

	}

}

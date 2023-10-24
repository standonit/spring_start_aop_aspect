package AOP;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class UniLibrary extends AbstractLibrary {


	public void getBook() {
		System.out.println("We take a book from the UniLibrary");
		System.out.println("----------------------------------------");
	}

	public String returnBook() {
		System.out.println("We return the book to the UniLibrary");
		return "War and Peace";
	}

	public void getMagazine() {
		System.out.println("We take a magazine from the UniLibrary");
		System.out.println("----------------------------------------");
	}

	public void returnMagazine() {
		System.out.println("We return a magazine to the UniLibrary");
		System.out.println("----------------------------------------");
	}

	public void addBook(String personName, Book book) {
		System.out.println("We add the book to the UniLibrary");
		System.out.println("----------------------------------------");
	}

	public void addMagazine() {
		System.out.println("We add the magazine to the UniLibrary");
		System.out.println("----------------------------------------");
	}

}

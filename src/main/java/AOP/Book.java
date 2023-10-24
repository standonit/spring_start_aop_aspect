package AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	
	@Value("Java book")
	private String name;
	
	@Value("Fedor Mihailovich")
	private String author;
	
	@Value("1966")
	private int yearOfPublication;

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

}

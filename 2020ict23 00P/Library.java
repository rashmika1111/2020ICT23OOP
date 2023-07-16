import java.util.*;

public class Library {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		var b1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
		var b2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
		var b3 = new Book("1984", "B003", "George Orwell", 382);
		var b4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
		var b5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);
		
		Book[] bookArray = {b1, b2, b3, b4, b5};
		
		var m1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
		var m2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
		var m3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
		var m4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
		var m5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");
		
		Magazine[] magazineArray = {m1, m2, m3, m4, m5};
		
		var lm1 = new LibraryMember("L001", "John Doe");
		var lm2 = new LibraryMember("L002", "Jane Smith");
		var lm3 = new LibraryMember("L003", "David Johnson");
		var lm4 = new LibraryMember("L003", "Sarah Williams");
		var lm5 = new LibraryMember("L005", "Michael Brown");
		
		LibraryMember[] libraryMemberArray = {lm1, lm2, lm3, lm4, lm5};
		
		//checkin libraryitems
		b1.checkIn();
		m1.checkIn();
		
		//BOOK Details
		System.out.println("\nBOOK Details...............................................\n");
		for(int i = 0; i < bookArray.length; i++) {
			bookArray[i].displayItemDetails();
			System.out.println(); 
		}
		
		//Magazine Details
		System.out.println("\nMagazine Details............................................\n");
		for(int i = 0; i < magazineArray.length; i++) {
			magazineArray[i].displayItemDetails();
			System.out.println();
		}
		
		//Library Member Details
		System.out.println("\nLibrary Member Details........................................\n");
		for(int i = 0; i < libraryMemberArray.length; i++) {
			libraryMemberArray[i].displayMemberDetails();
			System.out.println();
		}
	}
}
public class Book extends LibraryItem {

	private String author;
	private int numPages;
	private boolean check;
	
	Book(String title,
		String itemId,
		String author,
		int numPages) {
			
		super(title, itemId);
		this.author = author;
		this.numPages = numPages;
		check = false;
		
	}
	
	public void displayItemDetails(){
		if(check == true) {
			System.out.println("Item ID : " + getItemId() + "\n" + "Title : " + getTitle() + "\n" + "Author : " + author + "\n" +"Is it checked in or not : " + checkIn() + "\n" + "Number of pages : " + numPages);
		}
		else {
			System.out.println("Item ID : " + getItemId() + "\n" + "Title : " + getTitle() + "\n" + "Author : " + author + "\n" +"Is it checked in or not : " + checkOut() + "\n" + "Number of pages : " + numPages);
		}
	}
	
	public String checkOut() {
		check = false;
		return "Its not checked in";
	}
	
	public String checkIn() {
		check = true;
		return "Its checked in";
	}
}
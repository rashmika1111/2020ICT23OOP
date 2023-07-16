public class Magazine extends LibraryItem {
	
	private String issueDate;
	private String publisher;
	private boolean check;
	
	Magazine(String title,
			String itemId,
			String issueDate,
			String publisher) {
				
		super(title, itemId);
		this.issueDate = issueDate;
		this.publisher = publisher;
		check = false;
	}
	
	public void displayItemDetails(){
		if(check == true) {
			System.out.println("Item ID : " + getItemId() + "\n" + "Title : " + getTitle() + "\n" +"Is it checked in or not : " + checkIn() + "\n" + "Issue date : " + issueDate + "\n" + "Publisher : " + publisher);
		}
		else {
			System.out.println("Item ID : " + getItemId() + "\n" + "Title : " + getTitle() + "\n" + "Is it checked in or not : " + checkOut() + "\n" + "Issue date : " + issueDate + "\n" + "Publisher : " + publisher);
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
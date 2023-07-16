public class LibraryMember {
	
	private String memberId;
	private String name;
	
	LibraryMember(String memberId,
					String name) {
						
		this.memberId = memberId;
		this.name = name;
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public void displayMemberDetails() {
		System.out.println("Member id : " + memberId + "\n" + "Name : " + name);
	}
} 
import java.util.Scanner;
class library {
	private Scanner sc = new Scanner(System.in);
	private String [] books;
	private String [] newbook;
	
	public void addBook(String ...arr) {
		if ( books == null ) {
			this.books = new String[arr.length];
			for(int i = 0; i<arr.length; i++) {
				this.books[i] = arr[i];
			}
		}
		else {
			this.newbook = new String[books.length + arr.length];
			for(int i = 0; i<books.length; i++) {
				this.newbook[i] = books[i];
			}
			for(int i = 0; i<arr.length; i++) {
				this.newbook[books.length + i] = arr[i];
			}
			this.books = new String[newbook.length];
			for(int i = 0; i<newbook.length; i++) {
				this.books[i] = newbook[i];
			}
			for(int i = 0; i<books.length; i++) {
				newbook[i] = books[i].replace(" ", "");
				newbook[i] = newbook[i].toLowerCase();
				books[i] = newbook[i];
			}
		}
	}
	
	public void issueBook() {
		System.out.print("Enter The Book You Want To Issue: ");
		String bookName = sc.nextLine();
		bookName = bookName.replace(" ", "");
		bookName = bookName .toLowerCase();
		for(int i = 0; i<books.length; i++) {
			if(books[i] != null  && books[i].equals(bookName)) {
				books[i] = null;
				System.out.println("Your Book is issued");
				return;
			}
		}
	}
	
	public void returnBook() {
		System.out.println("Enter The Book You Want To return: ");
		String bookName = sc.nextLine();
		bookName = bookName.replace(" ", "");
		bookName = bookName.toLowerCase();
		for(int i = 0; i<books.length; i++) {
			if(books[i] == null) {
				books[i] = bookName;
				return;
			}
		}
	}
	
	public void showAvailableBooks() {
		for(int i = 0; i<books.length; i++) {
			System.out.println(books[i]);
		}
	}
}

public class OnlineLibrary {
	
	public static void main (String[] args) {
		
	}
}


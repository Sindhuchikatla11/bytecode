package Singleinheritance;

class Record {
	String name;
	int id;
	String stream;
	Record(String name,int id,String stream){
		this.name=name;
		this.id=id;
		this.stream=stream;
	}
	void displayRecorddetails() {
		System.out.println("student name:"+name);
		System.out.println("student id:"+id);
		System.out.println("student stream:"+stream);
	}
	
}
class student extends Record {
	String bookname;
	int no_of_books;
	String type_of_book;
	student(String name,int id,String stream){
		super(name,id,stream);
	}
	void LibraryRecord() {
		bookname="mahabharatham";
		no_of_books=2;
		type_of_book="ethics";
			}
	void displayLibrarydetails() {
		LibraryRecord();
		displayRecorddetails();
		System.out.println("bookname:"+bookname);
		System.out.println("no_of_books:"+no_of_books);
		System.out.println("type_of_book:"+type_of_book);
	}
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student i= new student("sindhuja",234556,"cse");
		i.displayLibrarydetails();
       
	}

}

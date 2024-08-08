package oops;

class book{
	private String name;
	private String author;
	book(String name,String author){
		this.name=name;
		this.author=author;
	}
	public String getname(){
		return name;
	}
	public String setname() {
		return author;
	}
	public void display_bookInfo() {
		System.out.println("name:"+name);
		System.out.println("author:"+author);
	}
}
class Info extends book{
	Info(){
		super("peace","abc");
	}
}
public class Author {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info i=new Info();
		i.display_bookInfo();
		

	}

}

package oops;

class Account{
	private String name;
	private int age;
	private String gender;
	public void setDetails(String name,int age,String gender) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class bankaccount{
	Account a=new Account();
	private String bankname;
	private int accountno;
	public void getDetails(String bankname,int accountno) {
		this.setBankname(bankname);
		this.setAccountno(accountno);
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.setDetails("sindhu",21,"female");
		bankaccount b= new bankaccount();
		b.getDetails("Sbi",45677836);
		

	}

}

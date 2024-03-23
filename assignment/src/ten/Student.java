package ten;


public class Student {
	String name,address;
	int age;
	Student(){
		age=0;
		name="Unknown";
		address="Not Available";
	}
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Name:"+name+" Age:"+age+" Address:"+address);
	}
}

class Student_Main {
	public static void main(String[] args) {
	Student[] arr = new Student[2];
	arr[0]=new Student();
	arr[1]=new Student();
	arr[0].setInfo("Aston",19);
	arr[1].setInfo("romeo", 19,"Margao");
	arr[0].display();
	arr[1].display();
}
}

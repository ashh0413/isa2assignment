package seven;

public class Dog {
	String name,breed;
	Dog(String name, String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	String display_name()
	{
		return name;
	}
	String display_breed()
	{
		return breed;
	}
	public void setvalues(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	public void display()
	{
		System.out.println("Name:"+name+" Breed:"+breed);
	}
}

class Dog_main {
	public static void main(String[] args) {
		Dog d1=new Dog("Tyson","German Shepherd");
		Dog d2=new Dog("Pepsi","Labrador Retriever");
		d1.display();
		d2.display();
		d1.setvalues("fillop","BullDog");
		d1.display();
	}
}
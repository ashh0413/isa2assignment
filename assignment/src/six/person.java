package six;

public class person {
	String name;
	int age;
	person(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	void set_name(String name){
		this.name=name;
	}
	void set_age(int age){
		this.age=age;
	}
	String display_name(){
		return name;
	}
	int display_age(){
		return age;
	}
	public void display_values(){
		System.out.println("Name:"+name+" Age:"+age);
	}
	
}
class person_main {
	public static void main(String[] args) {
		person p1=new person("Aston",19);
		person p2=new person("Sita",15);
		p1.display_values();
		p2.display_values();
	}
}

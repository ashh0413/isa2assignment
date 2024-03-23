package twelve;


abstract class Shape{
	public abstract void calculatePerimeter();
	public abstract void calculateArea();
}

class Circle extends Shape{
	float r;
	double pi=3.14,area,perimeter;
	Circle(float r)
	{
		this.r=r;
	}
	public void calculatePerimeter()
	{
		perimeter=2*pi*r;
	}
	public void calculateArea()
	{
		area=pi*r*r;
	}
	public void display()
	{
		System.out.println("Area:"+area+" Perimeter:"+perimeter);
	}
}

class Triangle extends Shape{
	int base,height,a,b,c,perimeter;
	double area;
	Triangle(int base,int height,int a,int b,int c)
	{
		this.base=base;
		this.height=height;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void calculatePerimeter()
	{
		perimeter=a+b+c;
	}
	public void calculateArea()
	{
		area=0.5*base*height;
	}
	public void display()
	{
		System.out.println("Area:"+area+" Perimeter:"+perimeter);
	}
}

class Shape_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(7);
		Triangle t1=new Triangle(6,6,2,3,4);
		c1.calculateArea();
		c1.calculatePerimeter();
		c1.display();
		t1.calculateArea();
		t1.calculatePerimeter();
		t1.display();
	}
}

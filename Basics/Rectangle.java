public class Rectangle{
	private int length;
	private int width;
	public Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
void calculateArea(){
	double area=length*width;
	
}
int calculatePerimeter(){
	double perimeter=length+width+length+width;
	return perimeter;
}
void display(){
	System.out.println("The Area is      : "+area);
	System.out.println("The Perimeter is : "+perimeter);
}	
public static void main(String[] args){
	Rectangle r1=new Rectangle(5,7);
	Rectangle r2=new Rectangle(5,7);
	
	r1.display();
	r2.display();
}
	
}
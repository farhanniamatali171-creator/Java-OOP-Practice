public class Car{
private String brand;
private String model;
private double price;
public Car(String brand,String model,double price){
this.brand=brand;
this.model=model;
this.price=price;	
	
}
public String getBrand(){
	return brand;
}
public void setBrand(String brand){
	this.brand=brand;
}
public String getModel(){
	return model;
}
public void setModel(String model){
	this.model=model;
}
public double getPrice(){
	return price;
}
public void setPrice(double price){
	this.price=price;
}

void display(){
	System.out.println("Car brand is : "+brand);
	System.out.println("Car model is : "+model);
	System.out.println("Car price is : "+price);
}
public static void main(String[] args){
	Car c1=new Car("BMW","New",2500000);
	Car c2=new Car("RR","New",2700000);
	System.out.println("------------------------");
	System.out.println("----------Car1----------");
	c1.display();
	System.out.println("----------Car2----------");
	c2.display();
	System.out.println("------------------------");
	
	}
}

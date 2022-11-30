package for3;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="Audi";
		car1.color="red";
		car1.price=2500000;
		car1.isSensor=true;
		car1.isAirBag=true;
		
		Car car2=new Car();
		car2.brand="Bmw";
		car2.color="blue";
		car2.price=2300000;
		car2.isSensor=true;
		car2.isAirBag=true;
		
		Car car3=new Car();
		car3.brand="Ferari";
		car3.color="yellow";
		car3.price=2400000;
		car3.isSensor=true;
		car3.isAirBag=true;
		
		Car car4=new Car();
		car4.brand="Benz";
		car4.color="white";
		car4.price=2700000;
		car4.isSensor=true;
		car4.isAirBag=true;
		
		Car car5=new Car();
		car5.brand="Honda";
		car5.color="black";
		car5.price=2000000;
		car5.isSensor=true;
		car5.isAirBag=false;
		
		Car[] cars=new Car[5];
		cars[0]=car1;
		cars[1]=car2;
		cars[2]=car3;
		cars[3]=car4;
		cars[4]=car5;
		
		int m=0;
		int max=0;
		for(int i=0;i<cars.length;i++) {
			if(cars[i].price>max) {
				max=cars[i].price;
				m=i; 
			}
		}
		System.out.println(cars[m].brand+" "+cars[m].color+" "+cars[m].price+" "+cars[m].isSensor+" "+cars[m].isAirBag);
	    
		int m1=0;
	    int max1=cars[0].brand.length();
	    for(int i=0;i<cars.length;i++ ) {
	    	if(cars[i].brand.length()>max1) {
	    		max1=cars[i].brand.length();
	    		m1=i;
	    		
	    	}
	    }
	    System.out.println(max1);
	    System.out.println(cars[m1].brand+" "+cars[m1].color+" "+cars[m1].price+" "+cars[m1].isSensor+" "+cars[m1].isAirBag);
	}

}

package for3;

public class UsePen {
	public static void main(String[]args) {
		Pen pen1=new Pen();
		pen1.brand="Reynolds";
		pen1.price=15;
		pen1.color="blue";
		pen1.isBallPen=true;
		
		Pen pen2=new Pen();
		pen2.brand="Natraj";
		pen2.price=10;
		pen2.color="green";
		pen2.isBallPen=true;
		
		Pen pen3=new Pen();
		pen3.brand="Cello";
		pen3.price=12;
		pen3.color="black";
		pen3.isBallPen=true;
		
		Pen pen4=new Pen();
		pen4.brand="Hero";
		pen4.price=30;
		pen4.color="red";
		pen4.isBallPen=false;
		
		Pen[] p= {pen1,pen2,pen3,pen4};
		
		
		String name="";
		int min=p[0].price;
		for(Pen p1:p) {
			System.out.println(p1.brand+" "+p1.price+" "+p1.color+" "+p1.isBallPen);
			
			if(p1.price<=min) {
				min=p1.price;
				name=p1.brand;
			}
		}
		System.out.println(name);
		System.out.println(min);
	}
}

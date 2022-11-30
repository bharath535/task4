package for3;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop lap1=new Laptop();
		lap1.brand="Lenovo";
		lap1.price=35000;
		lap1.isLed=true;
		lap1.taxAmount=1500;
		lap1.netPrice=lap1.price+lap1.taxAmount;
		
		Laptop lap2=new Laptop();
		lap2.brand="Hp";
		lap2.price=34000;
		lap2.isLed=true;
		lap2.taxAmount=1400;
		lap2.netPrice=lap2.price+lap2.taxAmount;
		
		Laptop lap3=new Laptop();
		lap3.brand="Dell";
		lap3.price=36000;
		lap3.isLed=true;
		lap3.taxAmount=1600;
		lap3.netPrice=lap3.price+lap3.taxAmount;
		
		Laptop[] l= {lap1,lap2,lap3};
		int max=0;
		String maxBrand="";
		for(int i=0;i<l.length;i++) {
			System.out.println("Brand = "+l[i].brand+" Is LED = "+l[i].isLed+" NetPrice = "+l[i].netPrice);
			if(l[i].netPrice>max) {
				max=l[i].netPrice;
				maxBrand=l[i].brand;				
			}
		}
		
		System.out.println(max);
		System.out.println(maxBrand);
	
	}
}
	



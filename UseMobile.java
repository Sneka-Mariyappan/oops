package oops;

public class UseMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Battery ba1 = new Battery();
		ba1.model="XXX";
		ba1.capacity = 5000;
		
		Battery ba2 = new Battery();
		ba2.model="YYY";
		ba2.capacity = 6000;
		
		Mobile m1 = new Mobile();
		m1.brand ="vivo";
		m1.price = 15000;
		m1.color ="blue";
		m1.b = ba1;
		
		
		Mobile m2 = new Mobile();
		m2.brand ="oppo";
		m2.price = 20000;
		m2.color ="black";
		m2.b = ba2;
		
		
		Mobile[] mbl = {m1,m2};
		for(int i=0;i<mbl.length;i++) {
		System.out.println(mbl[i].brand+" "+mbl[i].price+" "+mbl[i].color+" "+
		mbl[i].b.model+" "+mbl[i].b.capacity);
		}	
		
		

	}

}

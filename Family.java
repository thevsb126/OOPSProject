package watermanagement;

public class Family<E> implements Consumer<E> {
	private int famno, adults, minors, watpts;
	private double waterconsumed, extracharge;
	
	public Family() {
		famno = 0;
		adults = 0;
		minors = 0;
		waterconsumed = 0.0;
		extracharge = 0.0;
	}
	
	public Family(int a, int b, int c) {
		famno = a;
		adults = b;
		minors = c;
	}
	
	public int getAdults() {
		return adults;
	}
	
	public int getMinors() {
		return minors;
	}
	
	public void setWater(double x) {
		waterconsumed = x;
	}
	
	public E search(E[] obj,int x)
	{
		
	}
	
	public void insert(Family<E> [] obj, Family<E> iobj,  int x)
	{
		iobj.setWater();
	}
}

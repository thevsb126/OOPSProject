package watermanagement;

public class Factory<E> implements Consumer<E> {
	int factno, workers, type, watpts;
	double waterconsumed, extracharge;
	
	public Factory() {
		factno = 0;
		workers = 0;
		type = 0;
		waterconsumed = 0.0;
		
	}
	
	public Factory(int a, int b, int c, double d) {
		factno = a;
		workers = b;
		type = c;
	}
}

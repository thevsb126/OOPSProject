package watermanagement;

public interface Consumer<E> {
	public E search(E[] obj, int x);
	public E delete(E[] obj, int x);
	public void insert(E[] obj, int x);
	public void consume(E[] obj, double a);
}

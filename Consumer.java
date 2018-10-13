package watermanagement;

public interface Consumer {
	public void updateDetails(int a, int b, int c);
	public void getDetails();
	public void UsageEntry();
	public float calWaterCurrency();
	public float calWaterPoints();
	public float getUsage(); 
}

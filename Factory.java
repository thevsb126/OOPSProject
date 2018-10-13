package management;

public class Factory implements Consumer {
	public int noworkers;
	public String type;
	public int areainm2;
	public float wgiven, wused, wpoints;

	Factory()
	{
		noworkers=0;
		type = "No Type";
		areainm2 = 0;
		wgiven = 0;
		wused =0;
		wpoints = 0;
	}

	Factory(int w1, String t, int a1)
	{
		noworkers=w1;
		type=t;
		areainm2=a1;
	}

	public float calWaterCurrency()
	{
		if(type == "Food")
			wgiven = 30*((20.0*areainm2)+(50*noworkers));
			return wgiven;
		else if(type == "Textiles")
			wgiven = 30*((20.0*areainm2)+(50*noworkers));
			return wgiven;
		else if(type == "Leather")
			wgiven = 30*((30.0*areainm2)+(50*noworkers));
			return wgiven;
		else if(type == "Petrol")
			wgiven = 30*((15.0*areainm2)+(50*noworkers));
			return wgiven;
		else if(type == "Chemical")
			wgiven = 30*((25.0*areainm2)+(50*noworkers));
			return wgiven;
		else if(type == "Agriculture")
			wgiven = 30*((50.0*areainm2)+(50*noworkers));
			return wgiven;
		else
			wgiven =  30*((20.0*areainm2)+(50*noworkers));
			return wgiven;
	}

	public void updateDetails(int w1, String t, int a1)
	{
		noworkers=w1;
		type=t;
		areainm2=a1;
		wgiven = calWaterCurrency();
	}

	public void getDetails()
	{
		System.out.println("The number of workers in the Factory: " + noworkers);
		System.out.println("Area of the Factory in sqauare metres: " + areainm2);
		System.out.println("Type of the Industry: " + Type);
		System.out.println("Water Currency alloted: " + wgiven + " litres per month");
	}

	public void UsageEntry(float entry)
	{
		wused = entry;
	}

	public float calWaterPoints()
	{
		wpoints = (wgiven/wused)*100;
		System.out.println("The water points collected: ");
		return wpoints;
	}

	public float getUsage()
	{
		System.out.println("Amount of Water Used: " + wused);
		return wused;
	}
}

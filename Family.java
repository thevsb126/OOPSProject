package watermanagement;

class Family implements Consumer
{

	public int num, adults, children;
	public float wgiven, wused, wpoints;

	Family()
	{
		num = 0;
		adults = 0;
		children = 0;
		wgiven = ((1500.0*adults) + (750.0*children));
	}

	Family(int num1, int adults1, int children1)
	{
		num = num1;
		adults = adults1;
		children = children1;
		wgiven = ((1500.0*adults) + (750.0*children));
	}

	public void updateDetails(int num1, int adults1, int children1)
	{
		num = num1;
		adults = adults1;
		children = children1;
		wgiven = ((1500.0*adults) + (750.0*children));
	}

	public void getDetails()
	{
		System.out.println("The number of members in the family: " + num);
		System.out.println("Number of adults: " + adults);
		System.out.println("Number of children: " + children);
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

	public float calWaterCurrency()
	{
		wgiven = ((1500.0*adults) + (750.0*children));
		return wgiven;
	}

}

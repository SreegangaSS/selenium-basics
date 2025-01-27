package secondweek;

public class LicenseEx {
	public void test(int a) throws LicenException
	{
		if(a<=18)
		{
			throw new LicenException("not");
		}
		else
		{
			System.out.println("eligible");
		}
	}
	public static void main(String[] args) throws LicenException {
		
		LicenseEx e=new LicenseEx();
		e.test(12);
	}

}

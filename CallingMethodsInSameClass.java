public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		CallingMethodsInSameClass as = new CallingMethodsInSameClass();
		int addValue =as.add(1004556,1000);
		System.out.println("Adding values1111      "+addValue);
	}

	public int add(int a, int b) {
	int c ;
	
	c= a+b;
	System.out.println("Adding values     "+c);
	return c;
	}

	//added one comment for testing
}

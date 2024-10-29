package basics;

public class Nested_if {

	public static void main(String[] args) {
		int age=21,weight=75;
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("eligible");
			}
			else
			{
				System.out.println("ineligible:under weight");
			}
		}
		else
		{
			System.out.println("ineligible");
		}

	}

}

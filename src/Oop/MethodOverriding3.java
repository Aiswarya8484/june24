package Oop;
class car
{
	public void speed()
	{
		System.out.print("car speed");
	}
	public void power()
	{
		System.out.println("car power");
	}
}
class BMW extends car
{

	@Override
	public void speed() {
		System.out.println("bmw speed");
		super.speed();
	}

	@Override
	public void power() {
		System.out.println("bmw power");
		super.power();
	}
	
}


public class MethodOverriding3 {

	public static void main(String[] args) {
		BMW ob=new BMW();
		ob.power();
		ob.speed();

	}

}

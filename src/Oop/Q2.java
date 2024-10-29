package Oop;
interface basicanimal
{
	void cat();
	void sleep();
}
class monkey
{
	public void jump()
	{
		System.out.println("monkey jump");
	}
	public void bite()
	{
		System.out.println("monker bite");
	}
}
class Human extends monkey implements basicanimal
{

	@Override
	public void cat() {
    System.out.println("cat");		
	}

	@Override
	public void sleep() {
	    System.out.println("sleep");		
		
	}
	public void speak()
	{
	    System.out.println("speak");		

	}
}

public class Q2 {

	public static void main(String[] args) {
		Human ob=new Human();
		ob.bite();
		ob.jump();
		ob.cat();
		ob.sleep();
		ob.speak();

	}

}

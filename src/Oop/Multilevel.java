package Oop;

	class Animal2
	{
		public void sleeping()
		{
		 System.out.println("sleeping");	
		}
	     }
	class Dog2 extends Animal2
	{
		public void barking()
		{
			System.out.println("dog is barking");
		}
	}
	class BlackDog extends Dog2
	{
		public void Eating()
		{
		System.out.println("eating food");
		}
		
	}
	
	public class Multilevel {
		
	public static void main(String[] args) {
		
		BlackDog b=new BlackDog();
		b.barking();
		b.Eating();
		b.sleeping();

	}

}

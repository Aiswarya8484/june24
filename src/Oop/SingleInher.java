package Oop;

class Animal
{
	public void sleeping()
	{
	 System.out.println("sleeping");	
	}
     }
class Dog extends Animal
{
	public void barking()
	{
		System.out.println("dog is barking");
	}
}


public class SingleInher {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.barking();
		d.sleeping();

	}

}

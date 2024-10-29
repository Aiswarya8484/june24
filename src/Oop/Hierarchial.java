package Oop;
class Animal1
{
	public void sleeping()
	{
	 System.out.println("sleeping");	
	}
     }
class Dog1 extends Animal1
{
	public void barking()
	{
		System.out.println("dog is barking");
	}
}
class Cat extends Animal
{
	public void jumping()
	{
		System.out.println("jumping");
	}
}

public class Hierarchial {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		d.barking();
		d.sleeping();
		c.jumping();
		c.sleeping();

	}

}

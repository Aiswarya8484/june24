package Oop;

abstract class Google
{
	abstract void message();
	public void search()
	{
		System.out.println("google search");
	}
}
class SearchAll extends Google
{

	@Override
	void message() {
       System.out.println("search all details");		
	}
}
class SearchImage extends Google
{

	@Override
	void message() {
		System.out.println("search image details");
	}	
}
class Searchvideo extends Google
{

	@Override
	void message() {
    System.out.println("search video details");		
	}
	
}

public class Abstractclass {

	public static void main(String[] args) {
		SearchAll a=new SearchAll ();
		a.message();
		a.search();
		SearchImage i=new SearchImage();
		i.message();
		i.search();
		Searchvideo v=new Searchvideo();
		v.message();
		v.search();
		

	}

}

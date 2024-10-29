package Oop;
interface whatappcalls
{
	int a=10;
	void calls();
	void mute();
	void disconnect();
}

class Audiocalls implements whatappcalls
{

	@Override
	public void calls() {
    System.out.println("whatapp calls");		
	}

	@Override
	public void mute() {
	    System.out.println("call mute");		
		
	}

	@Override
	public void disconnect() {
	    System.out.println("calls disconnect");		
		
	}
	
}

class Videocall implements whatappcalls
{

	@Override
	public void calls() {
		 System.out.println("whatapp videocalls");
		
	}

	@Override
	public void mute() {
	    System.out.println("videocall mute");		

		
		
	}

	@Override
	public void disconnect() {
	    System.out.println("videocalls disconnect");		
		
	}
	
}
public class Interfaceprgm {

	public static void main(String[] args) {
		Audiocalls a=new Audiocalls();
		a.calls();
		a.disconnect();
		a.mute();
		Videocall v=new Videocall();
		v.calls();
		v.disconnect();
		v.mute();
		whatappcalls ob=new Audiocalls();
		ob.calls();
		ob.disconnect();
		ob.mute();
		ob=new Videocall();
		ob.calls();
		ob.disconnect();
		ob.mute();
	    System.out.println(whatappcalls.a);
	 //   System.out.println(whatappcalls.a=20);		

	    

		
		
		

	}

}

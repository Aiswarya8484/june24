package Oop;
class encap
{
	private String name;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}

public class Encapsulation {
	
	public static void main(String[] args) {
		encap ob=new encap();
		ob.setName("anu");
        System.out.println(ob.getName());
        ob.setDesignation("tester");
        System.out.println(ob.getDesignation());
	}

}

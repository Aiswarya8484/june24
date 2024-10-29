package string_fun;

public class Question {

	public static void main(String[] args) {
		String s="jmeter ";
		String s1="performance testing tool";
		System.out.println(s.concat(s1));
		String s2="java langauge is platform independent";
		if(s2.contains("Langauge"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fails");
		}
		
		String s3="selenium webdrive is used for webapplication testing";
		String words[]=s3.split(" ");
		for(String l:words )
		{
			System.out.println(l);
		if(l.contains("webapplication"))
		{
			break;
		}
	
		}

	}

}

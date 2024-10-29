package Assignment;

public class Vowels {

	public static void main(String[] args) {
			String s="hello luminar";
			int i,count=0;
			for(i=0;i<s.length();i++)
			{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			count++;
			
			}
			}
			System.out.println(count);
	}

}

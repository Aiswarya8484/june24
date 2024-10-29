package exam;


		
		interface principal {
		void resign();
		void rejoin();
		}
		class Teacher extends student implements principal
		{
		public void department()
		{
		System.out.println("BCA");
		}
		@Override
		public void resign() {
		System.out.println("resign");
		}
		@Override
		public void rejoin() {
		System.out.println("rejoin");
		}
		}
		class student
		{
		public void mark()
		{
		System.out.println("mark"); 
		}
		public void showdetails()
		{
		System.out.println("details");
		}
		}
		public class q5 {
		public static void main(String[] args) {
		 Teacher ob=new Teacher();
		 ob.department();
		 ob.resign();
		}
		}
	



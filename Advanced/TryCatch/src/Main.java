
public class Main {

	public static void main(String[] args) {
		Time time= new Time();
		
		System.out.print("The initial uinverse time is: ");
		System.out.println(time.toUniString());
		System.out.print("The initial standart time is: ");
		System.out.println(time.toString());
		
		time.setTime(13, 27, 6);
		System.out.print("The initial uinverse time is: ");
		System.out.println(time.toUniString());
		System.out.print("The initial standart time is: ");
		System.out.println(time.toString());
		
		try 
		{
			time.setTime(99,99,99);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.print("After attempting invalid settings:\n");
		System.out.print("The initial uinverse time is: ");
		System.out.println(time.toUniString());
		System.out.print("The initial standart time is: ");
		System.out.println(time.toString());
	

	}

}

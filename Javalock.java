package CovidTrace;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Javalock {

	
	public static void main(String[] args) throws FileNotFoundException {
		ExInserts();}
	

	private static void ExInserts() {
		// TODO Auto-generated method stub
		int choice = -1;
		boolean b = false;
		while (!b) {
			if (choice == -1) {
				System.out.println("Welcome to our Covid Test Center");
				System.out.println("Select action :");
				System.out.println("1.Add a Patient");
				System.out.println("2.DELETE a Cured one");
				System.out.println("3.Search and edit Person Status");
				System.out.println("4.Search based on Covid");
			
				
				
				System.out.println("5.Log out");

				@SuppressWarnings("resource")
				Scanner sc1 = new Scanner(System.in);

				choice = sc1.nextInt();
			}
	}
	}
}
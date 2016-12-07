package mvcObserver;
import java.util.Scanner;

/**
 * MVC + observer
 */
public class MVCplatform {
	
	public static void main(String[] args)
	{
		Model model = new Model();
		
		View view1 = new View( "View1", model );
		View view2 = new View( "View2", model );
		View view3 = new View( "View3", model );
		
		Controller controller = new Controller( model );
		
		try ( Scanner scanner = new Scanner(System.in) )
		{			
			do
			{
				System.out.println("Give text to the model ( \"exit\" ends! ): ");
				
				String text = scanner.nextLine();
				
				if ( text.equals("exit") )
				{
					System.exit(0);
				}
				
				controller.assignText(text);
				
				System.out.println("This text comes from " + view1.retrieveName() + ": " + view1.text() );
				System.out.println("This text comes from " + view2.retrieveName() + ": " + view2.text() );
				System.out.println("This text comes from " + view3.retrieveName() + ": " + view3.text() );
				System.out.println();
			}
			while(true);
		}
		catch ( Exception ex )
		{
			System.out.println( ex.getMessage() );
		}
		
	}

}

package use_all_operators;

public class AssignmentOperators 
{
		  public static void main(String[] args) 
		  {
		   
		    int a = 10;
		    int var;

		    //using =
		    var = a;
		    System.out.println("var using =: " + var);

		    //using =+
		    var += a;
		    System.out.println("var using +=: " + var);

		    //using =*
		    var *= a;
		    System.out.println("var using *=: " + var);
		  }
}
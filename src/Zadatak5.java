import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
public class Zadatak5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner input=new Scanner("maraton.txt");
		PrintWriter output=new java.io.PrintWriter("najboljiMaratonci.txt");

		String red = null;
		String vrijemeTakmicara = null;
		do{
			String imeTakmicara=input.nextLine();
			String[] niz=imeTakmicara.split(" ");
			if(Integer.parseInt(vrijemeTakmicara)<300);
			output.println(red);
		}while(input.hasNextLine());
		
		input.close();
		output.close();
	
	
	
	}

}

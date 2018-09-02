import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
public class Zadatak7 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner input=new Scanner("takmicari.txt");
		ArrayList<String>takmicari=new ArrayList<>();
		
		do{
			takmicari.add(input.nextLine());
		
		}while(input.hasNextLine());
		
		Collections.sort(takmicari);
		System.out.println("Sortirana imena su:");
		for(int i=0;i<takmicari.size();i++){
			System.out.println(takmicari.get(i));
		}
	}

}

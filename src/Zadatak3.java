import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class Zadatak3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite ime takmicara cije vrijeme zelite vidjeti!");
		String imeTakmicara=input.next();
		Scanner unos=new Scanner("maraton.txt");
		FileReader fr=new FileReader("maraton.txt");
		ArrayList<String>ucesnici=new ArrayList<>();
		int vrijemeUcesnika;
		boolean ime=false;
		while(input.hasNext()){
			if(input.next().equals(imeTakmicara)){
			vrijemeUcesnika=input.nextInt();
			ime=true;
			System.out.println("Vrijeme ucesnika je:"+vrijemeUcesnika);
			}
			
			else{
					System.out.println("Ne mozemo naci ucesnika u fajlu!");
				}
		
			}
	
	
		input.close();
		unos.close();



		
		
		
	}

}

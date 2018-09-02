import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Zadatak1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(new File("maraton.txt"));
		
		
		String imeTakmicara;
		int vrijemeTakmicara = 0;
		int najbrzeVrijeme=0;
		String najboljiUcesnik=null;
		
		while(input.hasNext()){
		
			imeTakmicara=input.next();
			vrijemeTakmicara=input.nextInt();
			
			for(int i=0;i<imeTakmicara.length();i++){
				if(vrijemeTakmicara>najbrzeVrijeme){
				najbrzeVrijeme=vrijemeTakmicara;
				najboljiUcesnik=imeTakmicara;
				System.out.println("Najbrze vrijeme istrcanog maratona je:"+najbrzeVrijeme);
				System.out.println("Ime najboljeg ucesnika:"+najboljiUcesnik);
			}
		input.close();
		
		}
		
		
		
		
		
		
		}
	}
}



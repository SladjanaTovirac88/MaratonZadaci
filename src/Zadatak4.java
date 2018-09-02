import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Zadatak4 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner input=new Scanner("maraton.txt");
		FileReader fr=new FileReader("maraton.txt");
		ArrayList<Integer>vrijeme=new ArrayList<>();
		int suma=0;
		double prosjek;
		while(input.hasNext()){
			String ime=input.next();
			vrijeme.add(input.nextInt());
		}
		for(int i=0;i<vrijeme.size();i++){
			suma+=vrijeme.get(i);
			prosjek=suma/vrijeme.size();
		
		System.out.println("Prosjecno vrijeme svih takmicara je:"+prosjek);
		}

	}

}

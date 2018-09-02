import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.IOException;
public class Zadatak6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		URL file=new URL("http://www.textfiles.com/science/astronau.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(file.openStream()));
		
		String red;
		int brojac=0;
		while(br.readLine()!=null){
			if(br.readLine().length()>0){
				brojac++;
			}
		}
		br.close();
		System.out.println("Broj linija fajla je:"+brojac);
		
		
	}

}

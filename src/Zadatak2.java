import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class Zadatak2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new FileReader("maraton.txt"));
		String input=reader.readLine();
		ArrayList<String>imenaTakmicari=new ArrayList<String>();
		ArrayList<Integer>vrijemeTakmicari=new ArrayList<>();
			
		while(input!=null){
			String []takmicar=input.split(" ");
			String imeTakmicara=takmicar[0];
			int vrijemeTakmicara1=Integer.parseInt(takmicar[1]);
			imenaTakmicari.add(imeTakmicara);
			vrijemeTakmicari.add(vrijemeTakmicara1);
		}
		int index=0;
		int najkraceVrijeme=0;
		while(! vrijemeTakmicari.isEmpty()){
			najkraceVrijeme=Integer.MAX_VALUE;
			for(int i=0;i<vrijemeTakmicari.size();i++){
				if(vrijemeTakmicari.get(i)<najkraceVrijeme){
					najkraceVrijeme=vrijemeTakmicari.get(i);
					index=i;
				}
			}
			System.out.println(imenaTakmicari.get(index)+vrijemeTakmicari.get(index));
			imenaTakmicari.remove(index);
			vrijemeTakmicari.remove(index);
			
		}
		reader.close();
			
			
		}
	}
			
			
			
			
	



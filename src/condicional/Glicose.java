package condicional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Glicose {

	public static void main(String[] args) throws Exception{

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a média da Glicose: ");
		double media=Double.parseDouble(reader.readLine());
		
		if(media <= 100) {
			System.out.println("NORMAL");
		}else if(media > 100 && media <= 140) {
			System.out.println("ELEVADO");
		}else {
			System.out.println("DIABETES");
		}
		
		reader.close();
	}

}

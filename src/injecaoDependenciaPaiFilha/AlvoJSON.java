package injecaoDependenciaPaiFilha;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

public class AlvoJSON extends AlvoPersistencia{

	public void salva(List listAlunos) throws IOException {
		
		String jsonUser = new Gson().toJson(listAlunos);
		
		System.out.println("\nGravando Json...\n");
		System.out.println(jsonUser);
		
	    FileWriter fileWriter = new FileWriter("C:\\Users\\Jenifer\\Documents\\Github\\POO II\\POO II\\src\\injecaoDependenciaPaiFilha\\filjson.json");
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
	}
}
 
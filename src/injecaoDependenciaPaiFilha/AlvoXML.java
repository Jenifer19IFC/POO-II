package injecaoDependenciaPaiFilha;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class AlvoXML extends AlvoPersistencia{
	
	public void salva(List listAlunos) throws IOException {
			
		XStream xstream = new XStream(new DomDriver());
		
		String xml = xstream.toXML(listAlunos);
		System.out.println("\nGravando XML...\n");
		System.out.println(xml);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\Jenifer\\Documents\\Github\\POO II\\POO II\\src\\injecaoDependenciaPaiFilha\\filXML.xml");
		fileWriter.write(xml);
		fileWriter.flush();
		fileWriter.close();
        
	}

}

package injecaoDependenciaPaiFilha;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.persistence.XmlMap;

import atendimentoMedico.EnviaTraducao;
import atendimentoMedico.Idioma;
import atendimentoMedico.IdiomaIngles;
import atendimentoMedico.IdiomaPortugues;

public class Main {

	public static void main(String[] args) throws org.json.simple.parser.ParseException, ParseException, IOException {
		
		Pessoa p = new Pessoa();
		
		Aluno a = new Aluno();
		a.setNome("Jenifer");
		a.setMatricula(12345);
		a.setEmail("jenifergoedert10@gmail.com");
		a.setDataNascimento("10/06/2002");
		a.setCpf("102.345.324-00");
		
		Aluno a2 = new Aluno();
		a2.setNome("Vanessa");
		a2.setMatricula(44444);
		a2.setEmail("vanessa@gmail.com");
		a2.setDataNascimento("12/05/2001");
		a2.setCpf("334.323.541-00");
		
		List<Aluno> listAlunos = new ArrayList<Aluno>();
		listAlunos.add(a);
		listAlunos.add(a2);
		
		AlvoPersistencia alvo = new AlvoJSON();
		EnviaPersistencia enviaPersistencia = new EnviaPersistencia(alvo);
		enviaPersistencia.dispararArquivo(listAlunos);
		
		alvo = new AlvoXML();
		enviaPersistencia = new EnviaPersistencia(alvo);
		enviaPersistencia.dispararArquivo(listAlunos);
		
		
		
		
		
		
	}

}

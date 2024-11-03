package pl.edu.pw.mini.po.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import pl.edu.pw.mini.po.files.a.FirstClass;

public class Lab_11 {

	public static void main(String[] args) {

		File f = new File(".\\plik1.txt");
		try {
			f.createNewFile();
			System.out.println(f.getCanonicalPath());

		} catch (IOException e) {
			e.printStackTrace();
		}

		Czlowiek cz1;

		InputStream inputStream = Lab_11.class.getResourceAsStream("/plik1.txt");
		System.out.println(inputStream);
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				cz1 = new Czlowiek(line);
				System.out.println("imie: " + cz1.imie + "\nnazwisko: " + cz1.nazwisko + "\nsrednia: " + cz1.srednia + "\nwiek: " + cz1.wiek + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

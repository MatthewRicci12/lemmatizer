package the_parts_of_speech;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Word {
	   public String name;
	   public ArrayList<String> lexemes;
	   public POS type;
	   
	   public static enum POS {
		   Noun, Verb, Conjunction, DegreeAdv, Adjective, Adverb, Auxiliary, Preposition, Pronoun, Demonstrative, Determiner, Null
	   }

	   public Word(String name, ArrayList<String> lexemes, POS type) {
	      this.name = name;
	      this.lexemes = lexemes;
	      this.type = type;
	
	   }
	   
	public static ArrayList<Word> make_pos_list_changing(File some_file, POS type) {
		{
			try {
			ArrayList<Word> NewMap = new ArrayList<Word>(); 
			File Lemma = some_file;
			Scanner myReader = new Scanner(Lemma);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] array_version  = data.split(" ");
				
				ArrayList<String> lexemes = new ArrayList<String>(); //This is where the lexemes will go for each entry.
				
				for (int i = 1; i < array_version.length; i ++) {
					if (array_version[i].charAt(0) == '{') {
						String lexeme = array_version[i].substring(1, (array_version[i].length() - 1)); //Get rid of curly brace and comma
						
						lexemes.add(lexeme);
					} else if (array_version[i].charAt(array_version[i].length() - 1) == '}') {
						String lexeme = array_version[i].substring(0, (array_version[i].length() - 1)); //Get rid of curly brace
						lexemes.add(lexeme);
					} else {
						String lexeme = array_version[i].substring(0, (array_version[i].length() - 1)); //Get rid of comma
							lexemes.add(lexeme);
						}
					}
					Word word = new Word(array_version[0], lexemes, type);
					NewMap.add(word);
					} 
				return NewMap;
				
				} catch (FileNotFoundException e) {
						e.printStackTrace();
						return null;
				}	
				
			}
		}

public static ArrayList<Word> make_pos_list_unchanging(File some_file, POS type) {
	{
		try {
			ArrayList<Word> final_list = new ArrayList<Word>();
			File Lemma = some_file;
			Scanner myReader = new Scanner(Lemma);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				Word word = new Word(data, null, type);
				final_list.add(word);

		} 
			return final_list; 
			} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		}
	}

}
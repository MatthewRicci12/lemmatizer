package the_parts_of_speech;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap; 

//Line 19...data is each line, a String.

public class FileOpener {
			
	public static ArrayList<Word> all_changing_lists(String type) {
		File nounfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Nouns.txt");
		File verbfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Verbs.txt");
		File adjfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Adjectives.txt");
		File auxfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Auxiliary Verbs.txt");
		File pronfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Pronouns.txt");
		
		ArrayList<Word> NounMap = Word.make_pos_list_changing(nounfile, Word.POS.Noun);
		ArrayList<Word> PronMap = Word.make_pos_list_changing(pronfile, Word.POS.Pronoun);
		ArrayList<Word> AuxMap = Word.make_pos_list_changing(auxfile, Word.POS.Auxiliary);
		ArrayList<Word> VerbMap = Word.make_pos_list_changing(verbfile, Word.POS.Verb);
		ArrayList<Word> AdjMap = Word.make_pos_list_changing(adjfile, Word.POS.Adjective);
		
		switch (type) {
		case ("Noun"):
			return NounMap;
		case ("Verb"):
			return VerbMap;
		case ("Adjective"):
			return AdjMap;
		case("Pronoun"):
			return PronMap;
		case("Auxiliary"):
			return AuxMap;
		default:
			return null;
		}

		}

public static ArrayList<Word> all_unchanging_lists(String type) {
	File advfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Adverbs.txt");
	File prepfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Prepositions.txt");
	File detfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Determiners.txt");
	File demfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Demonstratives.txt");
	File degfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Adverbs of Degree.txt");
	File conjfile = new File("C:\\Users\\matth\\Desktop\\Drive\\Lemmatizer Files\\English Conjunctions.txt");
	
	ArrayList<Word> AdvMap = Word.make_pos_list_changing(advfile, Word.POS.Adverb);
	ArrayList<Word> PrepMap = Word.make_pos_list_changing(prepfile, Word.POS.Preposition);
	ArrayList<Word> DetMap = Word.make_pos_list_changing(detfile, Word.POS.Determiner);
	ArrayList<Word> DegMap = Word.make_pos_list_changing(degfile, Word.POS.DegreeAdv);
	ArrayList<Word> ConjMap = Word.make_pos_list_changing(conjfile, Word.POS.Conjunction);
	ArrayList<Word> DemMap = Word.make_pos_list_changing(demfile, Word.POS.Demonstrative);
	
		switch (type) {
		case ("Determiner"):
			return DetMap;
		case ("Adverb"):
			return AdvMap;
		case ("Preposition"):
			return PrepMap;
		case ("DegreeAdv"):
			return DegMap;
		case ("Conjunction"):
			return ConjMap;
		case ("Demonstrative"):
			return DemMap;
		default:
			return null;
		}

		}



	
}

//			 String[] strArray = i.lexemes.toArray(new String[i.lexemes.size()]);
//System.out.println(i.name + ' ' + Arrays.toString(strArray) + i.type);
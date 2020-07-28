package main_func;

import the_parts_of_speech.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class The_Main {
	
	private static HashMap<String, Word.POS> context_search(String word, Word.POS pos_of_last_word, ArrayList<Word> Nouns, ArrayList<Word> Verbs, ArrayList<Word> Adjectives, ArrayList<Word> Pronouns, ArrayList<Word> Auxiliaries, ArrayList<Word> Determiners, ArrayList<Word> Adverbs, ArrayList<Word> Prepositions, ArrayList<Word> DegreeAdvs, ArrayList<Word> Conjunctions, ArrayList<Word> Demonstratives) {
		HashMap<String, Word.POS> word_information = new HashMap<String, Word.POS>();
		
		//Also if comma before
		
		
		if (pos_of_last_word == Word.POS.Noun) {
			for (Word Verb : Verbs) {
				System.out.println("Searching through verb list...");
				if (word.equals(Verb.name) || Verb.lexemes.contains(word)) {
					word_information.put(Verb.name, Word.POS.Verb);
					return word_information;
				} 
				} for (Word Auxiliary : Auxiliaries) {
					System.out.println("Searching through aux list...");
					if (word.equals(Auxiliary.name) || Auxiliary.lexemes.contains(word)) {
						word_information.put(Auxiliary.name, Word.POS.Auxiliary);
						return word_information;
					
				} } for (Word Conjunction : Conjunctions) {
					System.out.println("Searching through conjunction list...");
					if (word.equals(Conjunction.name) || Conjunction.lexemes.contains(word)) {
						word_information.put(Conjunction.name, Word.POS.Conjunction);
						return word_information;
				}
					
				} for (Word Noun : Nouns) {
					System.out.println("Searching through noun list...");
				if (word.equals(Noun.name) || Noun.lexemes.contains(word)) {
					word_information.put(Noun.name, Word.POS.Noun);
					return word_information;
				} 		
				} for (Word Adverb : Adverbs) {
					System.out.println("Searching through adverb list...");
					if (word.equals(Adverb.name) || Adverb.lexemes.contains(word)) {
						word_information.put(Adverb.name, Word.POS.Adverb);
						return word_information;
				} } for (Word DegreeAdv : DegreeAdvs) {
					System.out.println("Searching through degree adverb list...");
					if (word.equals(DegreeAdv.name) || DegreeAdv.lexemes.contains(word)) {
						word_information.put(DegreeAdv.name, Word.POS.DegreeAdv);
						return word_information;
				}
					
				} for (Word Demonstrative : Demonstratives) {
					System.out.println("Searching through demonstrative list...");
					if (word.equals(Demonstrative.name) || Demonstrative.lexemes.contains(word)) {
						word_information.put(Demonstrative.name, Word.POS.Demonstrative);
						return word_information;
				}
					
				} 
					
			
		} else if (pos_of_last_word == Word.POS.Verb) {
			for (Word Noun : Nouns) {
				System.out.println("Searching through noun list...");
				if (word.equals(Noun.name) || Noun.lexemes.contains(word)) {
					word_information.put(Noun.name, Word.POS.Noun);
					return word_information;
				} 
				
			} for (Word Determiner : Determiners) {
				System.out.println("Searching through determiner list...");
				if (word.equals(Determiner.name) || Determiner.lexemes.contains(word)) {
					word_information.put(Determiner.name, Word.POS.Determiner);
					return word_information;
			}
				
			} for (Word Adjective : Adjectives) {
				System.out.println("Searching through adjective list...");
				if (word.equals(Adjective.name) || Adjective.lexemes.contains(word)) {
					word_information.put(Adjective.name, Word.POS.Adjective);
					return word_information;
				} 
				
			} for (Word Pronoun : Pronouns) {
				System.out.println("Searching through pronoun list...");
				if (word.equals(Pronoun.name) || Pronoun.lexemes.contains(word)) {
					word_information.put(Pronoun.name, Word.POS.Pronoun);
					return word_information;
			}
				
			} for (Word Adverb : Adverbs) {
				System.out.println("Searching through adverb list...");
				if (word.equals(Adverb.name) || Adverb.lexemes.contains(word)) {
					word_information.put(Adverb.name, Word.POS.Adverb);
					return word_information;
				
			} } for (Word DegreeAdv : DegreeAdvs) {
				System.out.println("Searching through degree adverb list...");
				if (word.equals(DegreeAdv.name) || DegreeAdv.lexemes.contains(word)) {
					word_information.put(DegreeAdv.name, Word.POS.DegreeAdv);
					return word_information;
			}
				
			} for (Word Preposition : Prepositions) {
				System.out.println("Searching through preposition list...");
				if (word.equals(Preposition.name) || Preposition.lexemes.contains(word)) {
					word_information.put(Preposition.name, Word.POS.Preposition);
					return word_information;
			}
				
			} for (Word Conjunction : Conjunctions) {
				System.out.println("Searching through conjunction list...");
				if (word.equals(Conjunction.name) || Conjunction.lexemes.contains(word)) {
					word_information.put(Conjunction.name, Word.POS.Conjunction);
					return word_information;
			}
				
			} for (Word Demonstrative : Demonstratives) {
				System.out.println("Searching through demonstrative list...");
				if (word.equals(Demonstrative.name) || Demonstrative.lexemes.contains(word)) {
					word_information.put(Demonstrative.name, Word.POS.Demonstrative);
					return word_information;
			}
				
			}
		 } else if (pos_of_last_word == Word.POS.Adjective) {
			 for (Word Noun : Nouns) {
					System.out.println("Searching through noun list...");
					if (word.equals(Noun.name) || Noun.lexemes.contains(word)) {
						word_information.put(Noun.name, Word.POS.Noun);
						return word_information;
					} 
					
				} for (Word Adjective : Adjectives) {
					System.out.println("Searching through adjective list...");
					if (word.equals(Adjective.name) || Adjective.lexemes.contains(word)) {
						word_information.put(Adjective.name, Word.POS.Adjective);
						return word_information;
					} 
					
				} for (Word Adverb : Adverbs) {
					System.out.println("Searching through adverb list...");
					if (word.equals(Adverb.name) || Adverb.lexemes.contains(word)) {
						word_information.put(Adverb.name, Word.POS.Adverb);
						return word_information;
					
				} } for (Word Conjunction : Conjunctions) {
					System.out.println("Searching through conjunction list...");
					if (word.equals(Conjunction.name) || Conjunction.lexemes.contains(word)) {
						word_information.put(Conjunction.name, Word.POS.Conjunction);
						return word_information;
				}
					
				} for (Word Preposition : Prepositions) {
					System.out.println("Searching through preposition list...");
					if (word.equals(Preposition.name) || Preposition.lexemes.contains(word)) {
						word_information.put(Preposition.name, Word.POS.Preposition);
						return word_information;
				}
					
				} for (Word Demonstrative : Demonstratives) {
					System.out.println("Searching through demonstrative list...");
					if (word.equals(Demonstrative.name) || Demonstrative.lexemes.contains(word)) {
						word_information.put(Demonstrative.name, Word.POS.Demonstrative);
						return word_information;
				}
					
				}
		} else if (pos_of_last_word == Word.POS.Pronoun) {
			for (Word Verb : Verbs) {
				System.out.println("Searching through verb list...");
				if (word.equals(Verb.name) || Verb.lexemes.contains(word)) {
					word_information.put(Verb.name, Word.POS.Verb);
					return word_information;
				} 
				
			} for (Word Auxiliary : Auxiliaries) {
				System.out.println("Searching through auxiliary list...");
				if (word.equals(Auxiliary.name) || Auxiliary.lexemes.contains(word)) {
					word_information.put(Auxiliary.name, Word.POS.Auxiliary);
					return word_information;
				
			} } for (Word Adverb : Adverbs) {
				System.out.println("Searching through adverb list...");
				if (word.equals(Adverb.name) || Adverb.lexemes.contains(word)) {
					word_information.put(Adverb.name, Word.POS.Adverb);
					return word_information;
				
			} } 
			
			
		} else if (pos_of_last_word == Word.POS.Auxiliary) {
			for (Word Verb : Verbs) {
				System.out.println("Searching through verb list...");
				if (word.equals(Verb.name) || Verb.lexemes.contains(word)) {
					word_information.put(Verb.name, Word.POS.Verb);
					return word_information;
				} 
				
			}
			
		} else if (pos_of_last_word == Word.POS.Adverb) {
			for (Word Verb : Verbs) {
				System.out.println("Searching through verb list...");
				if (word.equals(Verb.name) || Verb.lexemes.contains(word)) {
					word_information.put(Verb.name, Word.POS.Verb);
					return word_information;
				} 
				
			} for (Word Adjective : Adjectives) {
				System.out.println("Searching through adjective list...");
				if (word.equals(Adjective.name) || Adjective.lexemes.contains(word)) {
					word_information.put(Adjective.name, Word.POS.Adjective);
					return word_information;
				} 
				
			}
			
			
		} else if (pos_of_last_word == Word.POS.Determiner) {
			for (Word Noun : Nouns) {
				System.out.println("Searching through noun list...");
				if (word.equals(Noun.name) || Noun.lexemes.contains(word)) {
					word_information.put(Noun.name, Word.POS.Noun);
					return word_information;
				} 
				
			} for (Word Adjective : Adjectives) {
				System.out.println("Searching through adj list...");
				if (word.equals(Adjective.name) || Adjective.lexemes.contains(word)) {
					word_information.put(Adjective.name, Word.POS.Adjective);
					return word_information;
				} 
				
			}
			
			
		} else if (pos_of_last_word == Word.POS.Preposition) {
			for (Word Determiner : Determiners) {
				System.out.println("Searching through determiner list...");
				if (word.equals(Determiner.name) || Determiner.lexemes.contains(word)) {
					word_information.put(Determiner.name, Word.POS.Determiner);
					return word_information;
			}
				
			} for (Word Adjective : Adjectives) {
				System.out.println("Searching through adjective list...");
				if (word.equals(Adjective.name) || Adjective.lexemes.contains(word)) {
					word_information.put(Adjective.name, Word.POS.Adjective);
					return word_information;
				} 
				
			} for (Word Noun : Nouns) {
				System.out.println("Searching through noun list...");
				if (word.equals(Noun.name) || Noun.lexemes.contains(word)) {
					word_information.put(Noun.name, Word.POS.Noun);
					return word_information;
				} 
				
			}
			
			
		} else if (pos_of_last_word == Word.POS.DegreeAdv) {
			for (Word Adjective : Adjectives) {
				System.out.println("Searching through adjective list...");
				if (word.equals(Adjective.name) || Adjective.lexemes.contains(word)) {
					word_information.put(Adjective.name, Word.POS.Adjective);
					return word_information;
				} 
				
			} for (Word Adverb : Adverbs) {
				System.out.println("Searching through adverb list...");
				if (word.equals(Adverb.name) || Adverb.lexemes.contains(word)) {
					word_information.put(Adverb.name, Word.POS.Adverb);
					return word_information;
				
			} }
			
			
		} else if (pos_of_last_word == Word.POS.Conjunction) {
			for (Word Determiner : Determiners) {
				System.out.println("Searching through determiner list...");
				if (word.equals(Determiner.name) || Determiner.lexemes.contains(word)) {
					word_information.put(Determiner.name, Word.POS.Determiner);
					return word_information;
			}
				
			} for (Word Adjective : Adjectives) {
				System.out.println("Searching through adjective list...");
				if (word.equals(Adjective.name) || Adjective.lexemes.contains(word)) {
					word_information.put(Adjective.name, Word.POS.Adjective);
					return word_information;
				} 
				
			} for (Word Noun : Nouns) {
				System.out.println("Searching through noun list...");
				if (word.equals(Noun.name) || Noun.lexemes.contains(word)) {
					word_information.put(Noun.name, Word.POS.Noun);
					return word_information;
				} 
				
			} for (Word Preposition : Prepositions) {
				System.out.println("Searching through preposition list...");
			if (word.equals(Preposition.name) || Preposition.lexemes.contains(word)) {
				word_information.put(Preposition.name, Word.POS.Preposition);
				return word_information;
			}
			
			} for (Word Adverb : Adverbs) {
				System.out.println("Searching through adverb list...");
			if (word.equals(Adverb.name) || Adverb.lexemes.contains(word)) {
				word_information.put(Adverb.name, Word.POS.Adverb);
				return word_information;
			
			} } for (Word DegreeAdv : DegreeAdvs) {
				System.out.println("Searching through degree adverb list...");
			if (word.equals(DegreeAdv.name) || DegreeAdv.lexemes.contains(word)) {
				word_information.put(DegreeAdv.name, Word.POS.DegreeAdv);
				return word_information;
			}
			
			}
			
			
		} else if (pos_of_last_word == Word.POS.Demonstrative) {
			for (Word Verb : Verbs) {
				System.out.println("Searching through verb list...");
				if (word.equals(Verb.name) || Verb.lexemes.contains(word)) {
					word_information.put(Verb.name, Word.POS.Verb);
					return word_information;
				} 
				
			} for (Word Auxiliary : Auxiliaries) {
				System.out.println("Searching through auxiliary list...");
				if (word.equals(Auxiliary.name) || Auxiliary.lexemes.contains(word)) {
					word_information.put(Auxiliary.name, Word.POS.Auxiliary);
					return word_information;
				
			} }
		} else if (pos_of_last_word == Word.POS.Null) {
			System.out.println("Performing brute force search...");
			HashMap<String, Word.POS> word_info = brute_force_search(word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
			return word_info;
		}
		System.out.println("Performing brute force search...");
		HashMap<String, Word.POS> word_info = brute_force_search(word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
		return word_info;
	}
	
	
	private static HashMap<String, Word.POS> brute_force_search(String word, ArrayList<Word> Nouns, ArrayList<Word> Verbs, ArrayList<Word> Adjectives, ArrayList<Word> Pronouns, ArrayList<Word> Auxiliaries, ArrayList<Word> Determiners, ArrayList<Word> Adverbs, ArrayList<Word> Prepositions, ArrayList<Word> DegreeAdvs, ArrayList<Word> Conjunctions, ArrayList<Word> Demonstratives) {
		HashMap<String, Word.POS> word_information = new HashMap<String, Word.POS>();
		
		System.out.println("Performing brute force search...");
		{
			
		for (Word Noun : Nouns) {
			if (word.equals(Noun.name) || Noun.lexemes.contains(word)) {
				word_information.put(Noun.name, Word.POS.Noun);
				return word_information;
			} 
			
		} for (Word Verb : Verbs) {
			if (word.equals(Verb.name) || Verb.lexemes.contains(word)) {
				word_information.put(Verb.name, Word.POS.Verb);
				return word_information;
			} 
			
		} for (Word Adjective : Adjectives) {
			if (word.equals(Adjective.name) || Adjective.lexemes.contains(word)) {
				word_information.put(Adjective.name, Word.POS.Adjective);
				return word_information;
			} 
			
		} for (Word Pronoun : Pronouns) {
			if (word.equals(Pronoun.name) || Pronoun.lexemes.contains(word)) {
				word_information.put(Pronoun.name, Word.POS.Pronoun);
				return word_information;
		}
			
		} for (Word Auxiliary : Auxiliaries) {
			if (word.equals(Auxiliary.name) || Auxiliary.lexemes.contains(word)) {
				word_information.put(Auxiliary.name, Word.POS.Auxiliary);
				return word_information;
			
		} } for (Word Adverb : Adverbs) {
			if (word.equals(Adverb.name) || Adverb.lexemes.contains(word)) {
				word_information.put(Adverb.name, Word.POS.Adverb);
				return word_information;
			
		} } for (Word Determiner : Determiners) {
			if (word.equals(Determiner.name) || Determiner.lexemes.contains(word)) {
				word_information.put(Determiner.name, Word.POS.Determiner);
				return word_information;
		}
			
		} for (Word Preposition : Prepositions) {
			if (word.equals(Preposition.name) || Preposition.lexemes.contains(word)) {
				word_information.put(Preposition.name, Word.POS.Preposition);
				return word_information;
		}
			
		} for (Word DegreeAdv : DegreeAdvs) {
			if (word.equals(DegreeAdv.name) || DegreeAdv.lexemes.contains(word)) {
				word_information.put(DegreeAdv.name, Word.POS.DegreeAdv);
				return word_information;
		}
			
		} for (Word Conjunction : Conjunctions) {
			if (word.equals(Conjunction.name) || Conjunction.lexemes.contains(word)) {
				word_information.put(Conjunction.name, Word.POS.Conjunction);
				return word_information;
		}
			
		} for (Word Demonstrative : Demonstratives) {
			if (word.equals(Demonstrative.name) || Demonstrative.lexemes.contains(word)) {
				word_information.put(Demonstrative.name, Word.POS.Demonstrative);
				return word_information;
		}
			
		}
			}
		word_information.put(word, Word.POS.Null);
		return word_information;
				}

					
		
	
	private static ArrayList<Character> punctuation_list() {
		ArrayList<Character> punctuation = new ArrayList<Character>();
		Character[] temp = {'.', ',', '!', '?', ':', ';', '(', ')', '"', '\'',};
		
		for (Character item : temp) {
			punctuation.add(item);
		}	
		
		return punctuation;
	}
	
	private static String lemmatize(String input, ArrayList<Word> Nouns, ArrayList<Word> Verbs, ArrayList<Word> Adjectives, ArrayList<Word> Pronouns, ArrayList<Word> Auxiliaries, ArrayList<Word> Determiners, ArrayList<Word> Adverbs, ArrayList<Word> Prepositions, ArrayList<Word> DegreeAdvs, ArrayList<Word> Conjunctions, ArrayList<Word> Demonstratives) {
		input = input.toLowerCase();
		String[] pre_text = input.trim().split(" "); 
		ArrayList<String> the_text = new ArrayList<String>(Arrays.asList(pre_text));
		ArrayList<Character> punctuation = punctuation_list();
		ArrayList<String> final_text = new ArrayList<String>();
		Word.POS pos_of_last_word = Word.POS.Null;
		String first_word = the_text.get(0);
		
		
		//First word
		if (punctuation.contains(first_word.charAt(first_word.length() - 1))) { //first word w/ punctuation
			System.out.println("(2) First word " + first_word + ", brute force search");
			String temp_word = first_word.substring(0, first_word.length() - 1);
			char punc = first_word.charAt(first_word.length() - 1);
			HashMap<String, Word.POS> word_info = brute_force_search(temp_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
			for (String key : word_info.keySet()) {
				String the_string = key + punc;
				final_text.add(the_string);
				pos_of_last_word = word_info.get(key);
			}	
		} else { //first word w/o punctuation
			System.out.println("(2) First word " + first_word + ", brute force search");
			HashMap<String, Word.POS> word_info = brute_force_search(first_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
			for (String key : word_info.keySet()) {
				final_text.add(key);
				pos_of_last_word = word_info.get(key);
			}
		}
		
		//Text has more than 1 word
		if (the_text.size() > 1) { 
			String cur_word = the_text.get(the_text.indexOf(first_word) + 1); //2nd word
			
			while (cur_word !=the_text.get(the_text.size() - 1)) { //while the current word isn't the last word
				if (the_text.get((the_text.indexOf(cur_word) - 1)).contains(".")) { //word after a period, punc, brute force search
					if (punctuation.contains(cur_word.charAt(cur_word.length() - 1))) {
						System.out.println("(4) Word after a period " + cur_word + " , brute force search");
						String temp_word = cur_word.substring(0, cur_word.length() - 1);
						char punc = cur_word.charAt(cur_word.length() - 1);
						HashMap<String, Word.POS> word_info = brute_force_search(temp_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
						for (String key : word_info.keySet()) {
							String the_string = key + punc;
							final_text.add(the_string);
							pos_of_last_word = word_info.get(key);
						
						}	
						cur_word = the_text.get(the_text.indexOf(cur_word) + 1);
					} else { //word after a period, no punc, brute force search
						System.out.println("(4) Word after a period " + cur_word + " , brute force search");
						HashMap<String, Word.POS> word_info = brute_force_search(cur_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
						for (String key : word_info.keySet()) {
							final_text.add(key);
							pos_of_last_word = word_info.get(key);
						
					}
						cur_word = the_text.get(the_text.indexOf(cur_word) + 1);	
					
				} } else if (pos_of_last_word == Word.POS.Null) { //ELSE IF THE LAST WORD'S POS COULD NOT BE DETERMINED
					if (punctuation.contains(cur_word.charAt(cur_word.length() - 1))) { //Null pos, punc
						System.out.println("(5) Last word returned null pos, " + cur_word + " , brute force search");
						String temp_word = cur_word.substring(0, cur_word.length() - 1);
						char punc = cur_word.charAt(cur_word.length() - 1);
						HashMap<String, Word.POS> word_info = brute_force_search(temp_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
						for (String key : word_info.keySet()) {
							String the_string = key + punc;
							final_text.add(the_string);
							pos_of_last_word = word_info.get(key);
						
						}	
						cur_word = the_text.get(the_text.indexOf(cur_word) + 1);
					} else { //Null pos, no punc
						System.out.println("(5) Last word returned null pos, " + cur_word + " , brute force search");
						HashMap<String, Word.POS> word_info = brute_force_search(cur_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
						for (String key : word_info.keySet()) {
							final_text.add(key);
							pos_of_last_word = word_info.get(key);
						
					}
						cur_word = the_text.get(the_text.indexOf(cur_word) + 1);
						
						
					}
					
					
					

				//MIDDLE WORDY
				} else {
					if (punctuation.contains(cur_word.charAt(cur_word.length() - 1))) { //middle word, punc, context search
						System.out.println("(6) Middle word " + cur_word + ", context search");
						String temp_word = cur_word.substring(0, cur_word.length() - 1);
						char punc = cur_word.charAt(cur_word.length() - 1);
						HashMap<String, Word.POS> word_info = context_search(temp_word, pos_of_last_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
						for (String key : word_info.keySet()) {
							String the_string = key + punc;
							final_text.add(the_string);
							pos_of_last_word = word_info.get(key);
						
						}	
						cur_word = the_text.get(the_text.indexOf(cur_word) + 1);
					} 
					else { //middle word, no punc, context search
						System.out.println("(6) Middle word " + cur_word + ", context search");
						HashMap<String, Word.POS> word_info = context_search(cur_word, pos_of_last_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
						for (String key : word_info.keySet()) {
							final_text.add(key);
							pos_of_last_word = word_info.get(key);
						
					}
						cur_word = the_text.get(the_text.indexOf(cur_word) + 1);	
					}
					
					}
			}
			//While loop ends here, and cur is now the final word. This runs once then exits the "if", going straight to the return.
				System.out.println("(7) Final word " + cur_word + ", context search");
				if (punctuation.contains(cur_word.charAt(cur_word.length() - 1))) { //Final word, punc
					String temp_word = cur_word.substring(0, cur_word.length() - 1);
					char punc = cur_word.charAt(cur_word.length() - 1);
					HashMap<String, Word.POS> word_info = context_search(temp_word, pos_of_last_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
					for (String key : word_info.keySet()) {
						String the_string = key + punc;
						final_text.add(the_string);
						pos_of_last_word = word_info.get(key);
					
					}	
				} 
				else { //Final word, no punc
					System.out.println("(7) Final word " + cur_word + ", context search");
					HashMap<String, Word.POS> word_info = context_search(cur_word, pos_of_last_word, Nouns, Verbs, Adjectives, Pronouns, Auxiliaries, Determiners, Adverbs, Prepositions, DegreeAdvs, Conjunctions, Demonstratives);
					for (String key : word_info.keySet()) {
						final_text.add(key);
						pos_of_last_word = word_info.get(key);
					
				}
					cur_word = the_text.get(the_text.indexOf(cur_word) + 1);
				}
			
		
		} else { //Text size is 1 word, skip straight to the return.
			System.out.println("Single word input " + first_word);
			String[] strArray = final_text.toArray(new String[final_text.size()]);
			return Arrays.toString(strArray).substring(1, (Arrays.toString(strArray).length() - 1));
		}

	
		System.out.println("Hitting final loop");
		String[] strArray = final_text.toArray(new String[final_text.size()]);
		return Arrays.toString(strArray).substring(1, (Arrays.toString(strArray).length() - 1));
	}
	
	public static void main(String[] args) {
		ArrayList<Word> NounMap = FileOpener.all_changing_lists("Noun");
		ArrayList<Word> VerbMap = FileOpener.all_changing_lists("Verb");
		ArrayList<Word> AdjMap = FileOpener.all_changing_lists("Adjective");
		ArrayList<Word> PronMap = FileOpener.all_changing_lists("Pronoun");
		ArrayList<Word> AuxMap = FileOpener.all_changing_lists("Auxiliary");
		
		ArrayList<Word> DetMap = FileOpener.all_unchanging_lists("Determiner");
		ArrayList<Word> AdvMap = FileOpener.all_unchanging_lists("Adverb");
		ArrayList<Word> PrepMap = FileOpener.all_unchanging_lists("Preposition");
		ArrayList<Word> DegMap = FileOpener.all_unchanging_lists("DegreeAdv");
		ArrayList<Word> ConjMap = FileOpener.all_unchanging_lists("Conjunction");
		ArrayList<Word> DemMap = FileOpener.all_unchanging_lists("Demonstrative");
		
		Scanner scanny_boy = new Scanner(System.in);
		System.out.println("Welcome to the Lemmatizer Prototype! This is a very rough chop version, and does not represent the final version in any way." + "\n");

		System.out.println("Please input the text you would like to lemmatize.");
		String user_input = scanny_boy.nextLine();
		
		System.out.println(lemmatize(user_input, NounMap, VerbMap, AdjMap, PronMap, AuxMap, DetMap, AdvMap, PrepMap, DegMap, ConjMap, DemMap));
		
		
		//Later: Upper and lower case retain...just do contractions, idiot xD "Do not" is not 2 words, it's a string with a space character.
	}

}
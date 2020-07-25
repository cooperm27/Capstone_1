import java.util.Scanner;

public class pigLatinTranslator {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the Pig Latin Translator");
		System.out.println();
		String playAgain;
		
		
	do {
		System.out.println("Please enter a line to be translated");
		String phrase = scnr.nextLine();
		
		String cleanPhrase = contractionKiller(phrase);
		
		String[] eachWord = cleanPhrase.split(" ");
		String output =  "";
		
		for (int i = 0; i < eachWord.length; i++) {
			String pigLatinPhrase = translateWord(eachWord[i]);
			output = pigLatinPhrase + " ";
			System.out.print(output);
		}
		System.out.println();
		System.out.println("Would you like to enter another line? (Y/N)");
		playAgain = scnr.nextLine();
				
	}while (playAgain.equalsIgnoreCase ("Y")); {
	
	if (playAgain.equalsIgnoreCase ("N")) {
		System.out.println("Eesay Ouyay Aterlay");
		}
	
	}
	}

	
	
	public static String translateWord(String word) {
        

		String lowerCaseWord = word.toLowerCase();
		int pos = 0;
		char vowel;
        
        for (int i = 0; i < lowerCaseWord.length(); i++) {
             vowel = lowerCaseWord.charAt(i);

            if (isVowel(vowel)) {
                pos = i;
                break;
            }
        }
        if (pos == 0) {
        	return lowerCaseWord + "way";
        }else {
        	String a = lowerCaseWord.substring(pos);
        	String b = lowerCaseWord.substring(0,pos);
        	return a + b + "ay";
        }
        	
	}
	
	public static boolean isVowel(char vowel) {
		if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
			return true;
		}
		return false; 		
	}
	public static String contractionKiller(String contraction) {
		
		String contractionFree = contraction.replaceAll("\\p{P}", "");
		return contractionFree;
	}
	public static void numIgnorer(String numbers) {
		
		if (numbers.contains("1") || (numbers.contains("2") || (numbers.contains("3") || (numbers.contains("4") || (numbers.contains("5") || (numbers.contains("6")||(numbers.contains("7") || (numbers.contains("8")||(numbers.contains("9") || (numbers.contains("0"))))))))))) {
			boolean printNumbers = true; 
				if (printNumbers = true) {
					System.out.println(numbers);
				} 		
						
			}
		}
	}

	
	



package erick.caiza;

public class Name {
	private String word;
	
	public Name(String word) {
		this.word=word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
		
	
	public int NumberOfCharacters() {
		return this.word.length();
		
	}
	
	public String capitalLetters() {
		return this.word=this.word.toUpperCase(); 
	}
	
	public String changeWord() {
		String reverse=" ";
		for(int number = this.NumberOfCharacters()-1; number >= 0; number --) {
			reverse=reverse+this.word.charAt(number);
		}
		return reverse;
		
	}
		
}
package com.tutorialspoint;

public class TextEditor {

/*	private SpellChecker spellChecker;

	// a setter method to inject the dependency.
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	// a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}*/

//	Constructor-based Dependency Injection
	
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	/*
	 * public void getMessage() { spellChecker.getMessage(); }
	 */
}

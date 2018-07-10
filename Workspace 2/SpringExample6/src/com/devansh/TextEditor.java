package com.devansh;

public class TextEditor {
	   private SpellChecker spellChecker;

	   public TextEditor(SpellChecker spellChecker) {
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	   }
	 public void spellCheck() {
		// TODO Auto-generated method stub
		spellChecker.checkSpelling();
	}
	}
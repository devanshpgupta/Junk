package com.devansh;

public class TextEditor {
private SpellChecker spellChecker;
public TextEditor(SpellChecker spellChecker)
{
	System.out.println("Inside TextEditor Constructor");
	this.spellChecker=spellChecker;
}
/*
public SpellChecker getSpellChecker()
{
	return getSpellChecker();
} */
public void spellcheck()
{
	spellChecker.checkspell();
}

}

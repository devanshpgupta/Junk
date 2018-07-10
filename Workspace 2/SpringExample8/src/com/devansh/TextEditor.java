package com.devansh;

public class TextEditor {
private SpellChecker spellchecker;

public void setSpellChecker(SpellChecker spellchecker)
{
	System.out.println("Inside setSpellChecker");
	this.spellchecker=spellchecker;
}
public SpellChecker getSpellChecker()
{
	return this.spellchecker;
	
}
public void spellcheck()
{
	spellchecker.checkspelling();
}
	
}

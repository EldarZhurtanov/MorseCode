package kz.eldar.morse.models;

import java.util.Collection;

public class LetterInMorseCode {
    Character letter;
    Collection<MorseSymbol> letterInMorseCode;

    public LetterInMorseCode(Character letter, Collection<MorseSymbol> morseCode)
    {
        this.letter = letter;
        this.letterInMorseCode = morseCode;
    }

    public Character getLetter()
    {
        return letter;
    }

    public Collection<MorseSymbol> getMorseSymbols()
    {
        return letterInMorseCode;
    }
}

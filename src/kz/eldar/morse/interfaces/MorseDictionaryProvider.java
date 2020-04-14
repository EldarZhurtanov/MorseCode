package kz.eldar.morse.interfaces;

import kz.eldar.morse.models.LetterInMorseCode;
import kz.eldar.morse.models.MorseSymbol;

import java.util.Collection;
import java.util.Map;

public interface MorseDictionaryProvider {
    public Collection<LetterInMorseCode> getMorseDictionary();
}

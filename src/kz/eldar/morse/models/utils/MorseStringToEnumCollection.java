package kz.eldar.morse.models.utils;

import kz.eldar.morse.models.MorseSymbol;

import java.util.Collection;
import java.util.LinkedList;

public class MorseStringToEnumCollection {
    public static Collection<MorseSymbol> morseStringToEnumCollection(String s)
    {
        Collection morseSymbols = new LinkedList();
        for(char c: s.toCharArray())
        {
            morseSymbols.add(MorseCharacterToMorseEnum.morseCharacterToEnum(c));
        }
        return morseSymbols;
    }
}

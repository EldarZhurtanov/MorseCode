package kz.eldar.morse.models.utils;

import kz.eldar.morse.models.MorseSymbol;

import java.util.Collection;

public class MorseEnumCollectionToString {
    public static String morseEnumCollectionToString(Collection<MorseSymbol> symbols)
    {
        String morseString = "";
        for(MorseSymbol symbol: symbols)
        {
            morseString += MorseEnumToMorseCharacter.morseEnumToMorseCharacter(symbol);
        }
        return morseString;
    }
}

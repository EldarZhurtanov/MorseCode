package kz.eldar.morse.models.utils;

import kz.eldar.morse.models.MorseSymbol;

public class MorseCharacterToMorseEnum {
    public static MorseSymbol morseCharacterToEnum(Character c)
            throws IllegalArgumentException
    {
        if(c.equals('-'))
        {
            return MorseSymbol.dash;
        }
        if(c.equals('.'))
        {
            return MorseSymbol.dot;
        }
        throw new IllegalArgumentException("Unknown character met");
    }
}

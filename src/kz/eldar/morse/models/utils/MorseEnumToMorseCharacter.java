package kz.eldar.morse.models.utils;

import kz.eldar.morse.models.MorseSymbol;

public class MorseEnumToMorseCharacter {
    public static Character morseEnumToMorseCharacter(MorseSymbol symbol)
    {
        return symbol == MorseSymbol.dash ? '-' : '.';
    }
}

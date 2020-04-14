package kz.eldar.morse.converters;

import kz.eldar.morse.models.utils.MorseEnumCollectionToString;
import kz.eldar.morse.validators.LetterValidator;

public class LetterConverter {
    public static String toMorse(LetterValidator validator)
    {
        if(validator.isValid())
        {
            return MorseEnumCollectionToString.morseEnumCollectionToString(validator.getLetterInMorseCode().getMorseSymbols());
        }
        return null;
    }

    public static Character fromMorse(LetterValidator validator)
    {
        if(validator.isValid())
        {
            return validator.getLetterInMorseCode().getLetter();
        }
        return null;
    }

}

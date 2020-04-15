package kz.eldar.morse;

import kz.eldar.morse.converters.TextConverter;
import kz.eldar.morse.validators.TextValidator;

public class MorseConverterFacade {
    public static String Convert(String text)
            throws IllegalArgumentException
    {
        if(TextValidator.isValidMorseText(text))
        {
            return TextConverter.fromMorse(new TextValidator(text));
        }
        else
        {
            return TextConverter.toMorse(new TextValidator(text));
        }
    }
}

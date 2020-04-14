package kz.eldar.morse.converters;

import kz.eldar.morse.validators.TextValidator;
import kz.eldar.morse.validators.WordValidator;

public class TextConverter
{
    public static String toMorse(TextValidator validator)
    {
        if(validator.isValid())
        {
            String result = "";
            for(WordValidator wordValidator: validator.getWordValidators())
            {
                result += WordConverter.toMorse(wordValidator) + "   ";
            }
            return result.trim();
        }
        return null;
    }

    public static String fromMorse(TextValidator validator) {
        if (validator.isValid()) {

            String result = "";
            for (WordValidator wordValidator: validator.getWordValidators()) {
                result += WordConverter.fromMorse(wordValidator) + " ";
            }
            return result.trim();
        }
        return null;
    }
}

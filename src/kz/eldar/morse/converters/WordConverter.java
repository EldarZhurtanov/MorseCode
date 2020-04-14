package kz.eldar.morse.converters;

import kz.eldar.morse.validators.LetterValidator;
import kz.eldar.morse.validators.WordValidator;

public class WordConverter
{
    public static String toMorse(WordValidator validator)
    {
        if(validator.isValid())
        {
            String result = "";
            for(LetterValidator letterValidator: validator.getLetterValidators())
            {
                result += LetterConverter.toMorse(letterValidator) + " ";
            }
            return result.trim();
        }
        return null;
    }

    public static String fromMorse(WordValidator validator)
    {
        if(validator.isValid())
        {
            String result = "";
            for(LetterValidator letterValidator: validator.getLetterValidators())
            {
                result += LetterConverter.fromMorse(letterValidator);
            }
            return result;
        }
        return null;
    }
}

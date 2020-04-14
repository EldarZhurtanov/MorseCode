package kz.eldar.morse;

import kz.eldar.morse.converters.TextConverter;
import kz.eldar.morse.validators.TextValidator;

public class MorseConverterFacade {
    public static String Convert(String text)
    {
        TextValidator textValidator = new TextValidator(text);

        if(textValidator.isValid())
        {
            if (textValidator.isMorseText())
                return TextConverter.fromMorse(textValidator);
            else
                return TextConverter.toMorse(textValidator);
        }
        else
            return null;

    }
}

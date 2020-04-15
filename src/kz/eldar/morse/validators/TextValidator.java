package kz.eldar.morse.validators;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

public class TextValidator{
    private Collection<WordValidator> wordValidators;
    private Boolean isValid = true;

    public TextValidator(String text)
            throws IllegalArgumentException
    {
        try
        {
            wordValidators = validateMorseText(text);
        }
        catch (IllegalArgumentException e)
        {
            try
            {
                wordValidators = validateText(text);
            }
            catch (IllegalArgumentException ex)
            {
                isValid = false;
                wordValidators = null;
                throw ex;
            }
        }
    }

    private static Collection<WordValidator> validateMorseText(String text)
            throws IllegalArgumentException
    {
        String[] words = text.split("\\s{2,}");

        Collection<WordValidator> wordValidators = new LinkedList<WordValidator>();

        for(String word: words)
        {
            Collection<String> wordInMorse = new LinkedList<String>(Arrays.asList(word.split("\\s")));

            wordValidators.add(new WordValidator(wordInMorse));
        }
        return wordValidators;
    }

    private static Collection<WordValidator> validateText(String text)
            throws IllegalArgumentException
    {
        String[] words = text.split("\\s{1,}");

        Collection<WordValidator> wordValidators = new LinkedList<WordValidator>();

        for(String word: words)
            wordValidators.add(new WordValidator(word));

        return wordValidators;
    }

    public static Boolean isValidText(String text)
    {
        try{
            return validateText(text).size() > 0;
        }
        catch (IllegalArgumentException ex)
        {
            return false;
        }
    }

    public static Boolean isValidMorseText(String text)
    {
        try{
            return validateMorseText(text).size() > 0;
        }
        catch (IllegalArgumentException ex)
        {
            return false;
        }
    }

    public Collection<WordValidator> getWordValidators() {
        return wordValidators;
    }

    public Boolean isValid()
    {
        return isValid;
    }
}

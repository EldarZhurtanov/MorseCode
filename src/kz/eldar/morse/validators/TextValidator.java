package kz.eldar.morse.validators;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class TextValidator{
    private Collection<WordValidator> wordValidators;
    private Boolean isValid = true;
    private Boolean isMorseText = true;

    public TextValidator(String text)
    {
        wordValidators = ValidateMorseText(text);

        if(wordValidators == null)
        {
            isMorseText = false;

            wordValidators = ValidateText(text);

            if(wordValidators == null)
                isValid = false;
        }

    }

    private static Collection<WordValidator> ValidateMorseText(String text)
    {
        String[] words = text.split("\\s{2,}");

        Collection<WordValidator> wordValidators = new LinkedList<WordValidator>();

        for(String word: words)
        {
            Collection<String> wordInMorse = new LinkedList<String>(Arrays.asList(word.split("\\s")));

            WordValidator wordValidator = new WordValidator(wordInMorse);

            if(wordValidator.isValid())
            {
                wordValidators.add(wordValidator);
            }
            else
            {
                wordValidators = null;
                break;
            }
        }
        return wordValidators;
    }

    private static Collection<WordValidator> ValidateText(String text)
    {
        String[] words = text.split("\\s{1,}");

        Collection<WordValidator> wordValidators = new LinkedList<WordValidator>();

        for(String word: words)
        {
            WordValidator wordValidator = new WordValidator(word);

            if(wordValidator.isValid())
            {
                wordValidators.add(wordValidator);
            }
            else
            {
                wordValidators = null;
                break;
            }
        }
        return wordValidators;
    }

    public Boolean isValid() {
        return isValid;
    }

    public Boolean isMorseText() {
        return isMorseText;
    }

    public Collection<WordValidator> getWordValidators() {
        return wordValidators;
    }
}

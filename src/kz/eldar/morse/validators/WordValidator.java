package kz.eldar.morse.validators;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

public class WordValidator {
    private Collection<LetterValidator> letterValidators = new LinkedList<>();
    private Boolean isValid = true;

    public WordValidator(String word) throws IllegalArgumentException
    {
        try
        {
            for (char letter : word.toCharArray())
                letterValidators.add(new LetterValidator(letter));
        }
        catch (IllegalArgumentException ex)
        {
            isValid = false;
            letterValidators = null;
            throw ex;
        }
    }

    public WordValidator(Collection<String> wordInMorse) throws IllegalArgumentException
    {
        try
        {
            for (String letterInMorse : wordInMorse)
                letterValidators.add(new LetterValidator(letterInMorse));
        }
        catch (IllegalArgumentException ex)
        {
            isValid = false;
            letterValidators = null;
            throw ex;
        }
    }

    private static Collection<LetterValidator> validateWord(String word)
            throws IllegalArgumentException
    {
        Collection<LetterValidator> letterValidators = new LinkedList<>();

        for (char letter : word.toCharArray())
            letterValidators.add(new LetterValidator(letter));

        return letterValidators;
    }

    private static Collection<LetterValidator> validateWord(Collection<String> wordInMorse)
            throws IllegalArgumentException
    {
        Collection<LetterValidator> letterValidators = new LinkedList<>();

        for (String letterInMorse : wordInMorse)
            letterValidators.add(new LetterValidator(letterInMorse));

        return letterValidators;
    }

    public static Boolean isValidWord(String word)
    {
        try
        {
            WordValidator wordValidator = new WordValidator(word);

            return wordValidator.getLetterValidators().size() > 0;
        }
        catch (IllegalArgumentException ex)
        {
            return false;
        }
    }


    public static Boolean isValidWord(Collection<String> wordInMorse) {
        try
        {
            WordValidator wordValidator = new WordValidator(wordInMorse);

            return wordValidator.getLetterValidators().size() > 0;
        }
        catch (IllegalArgumentException ex)
        {
            return false;
        }
    }

    public Collection<LetterValidator> getLetterValidators() {
        return letterValidators;
    }

    public Boolean isValid()
    {
        return isValid;
    }
}

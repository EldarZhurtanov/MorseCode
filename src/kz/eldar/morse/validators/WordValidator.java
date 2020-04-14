package kz.eldar.morse.validators;

import java.util.Collection;
import java.util.LinkedList;

public class WordValidator {
    private Collection<LetterValidator> letterValidators = new LinkedList<LetterValidator>();
    private Boolean isValid = true;

    public WordValidator(String word) {

        for(char letter: word.toCharArray())
        {
            LetterValidator letterValidator = new LetterValidator(letter);

            if(letterValidator.isValid())
                letterValidators.add(letterValidator);
            else
            {
                isValid = false;
                letterValidators = null;
                break;
            }
        }
    }

    public WordValidator(Collection<String> wordInMorse) {

        for(String letterInMorse: wordInMorse)
        {
            LetterValidator letterValidator = new LetterValidator(letterInMorse);

            if(letterValidator.isValid())
                letterValidators.add(letterValidator);
            else
            {
                isValid = false;
                letterValidators = null;
                break;
            }
        }
    }

    public Boolean isValid() {
        return isValid;
    }

    public Collection<LetterValidator> getLetterValidators() {
        return letterValidators;
    }
}

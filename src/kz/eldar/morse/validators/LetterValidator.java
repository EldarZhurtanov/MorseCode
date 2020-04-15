package kz.eldar.morse.validators;

import kz.eldar.morse.interfaces.MorseDictionaryProvider;
import kz.eldar.morse.models.LetterInMorseCode;
import kz.eldar.morse.models.utils.MorseEnumCollectionToString;
import kz.eldar.morse.dictionary.providers.BadMorseDictionaryProvider;

import java.util.Optional;

public class LetterValidator {
    private static MorseDictionaryProvider morseDictionaryProvider = new BadMorseDictionaryProvider();
    private  LetterInMorseCode letterInMorseCode = null;
    private Boolean isValid = true;

    public LetterValidator(Character letter)
            throws IllegalArgumentException
    {
        Optional<LetterInMorseCode> letterInMorseCode = validateLetter(letter);

        if(letterInMorseCode.isPresent())
        {
            this.letterInMorseCode = letterInMorseCode.get();
        }
        else
        {
            isValid = false;
            letterInMorseCode = null;
            throw new IllegalArgumentException("Unknown character met: " + letter);
        }
    }

    public LetterValidator(String letterInMorse)
            throws IllegalArgumentException
    {
        Optional<LetterInMorseCode> letterInMorseCode = validateMorseLetter(letterInMorse);

        if(letterInMorseCode.isPresent())
        {
            this.letterInMorseCode = letterInMorseCode.get();
        }
        else
        {
            isValid = false;
            letterInMorseCode = null;
            throw new IllegalArgumentException("Unknown character met: " + letterInMorse);
        }
    }

    private static Optional<LetterInMorseCode> validateLetter(Character letter)
    {
        return  morseDictionaryProvider
                .getMorseDictionary()
                .stream()
                .filter(l -> l
                        .getLetter()
                        .equals(Character.toLowerCase(letter)))
                .findAny();
    }

    private static Optional<LetterInMorseCode> validateMorseLetter(String letterInMorse)
    {
        return morseDictionaryProvider
                .getMorseDictionary()
                .stream()
                .filter(l -> MorseEnumCollectionToString
                        .morseEnumCollectionToString(l.getMorseSymbols())
                        .equals(letterInMorse))
                .findAny();
    }

    public static Boolean isValidLetter(Character letter)
    {
        return validateLetter(letter).isPresent();
    }

    public static Boolean isValidMorseLetter(String letterInMorse)
    {
        return validateMorseLetter(letterInMorse).isPresent();
    }

    public LetterInMorseCode getLetterInMorseCode() {
        return letterInMorseCode;
    }

    public Boolean isValid()
    {
        return isValid;
    }
}

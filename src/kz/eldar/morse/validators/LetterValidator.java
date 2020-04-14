package kz.eldar.morse.validators;

import kz.eldar.morse.interfaces.MorseDictionaryProvider;
import kz.eldar.morse.models.LetterInMorseCode;
import kz.eldar.morse.models.utils.MorseEnumCollectionToString;
import kz.eldar.morse.dictionary.providers.BadMorseDictionaryProvider;

import java.util.Optional;

public class LetterValidator {
    private static MorseDictionaryProvider morseDictionaryProvider = new BadMorseDictionaryProvider();
    private  LetterInMorseCode letterInMorseCode = null;
    private Boolean isValid = false;

    public LetterValidator(Character letter)
    {
        Character lowLetter = Character.toLowerCase(letter);

        Optional<LetterInMorseCode> letterInDictionary = morseDictionaryProvider
                .getMorseDictionary()
                .stream()
                .filter(letterInMorseCode -> letterInMorseCode
                        .getLetter()
                        .equals(lowLetter))
                .findAny();

        if(letterInDictionary.isPresent())
        {
            letterInMorseCode = letterInDictionary.get();
            isValid = true;
        }
    }

    public LetterValidator(String letterInMorse)
    {
        Optional<LetterInMorseCode> letterInDictionary = morseDictionaryProvider
                .getMorseDictionary()
                .stream()
                .filter(letterInMorseCode -> MorseEnumCollectionToString
                        .morseEnumCollectionToString(letterInMorseCode.getMorseSymbols())
                        .equals(letterInMorse))
                .findAny();

        if(letterInDictionary.isPresent())
        {
            letterInMorseCode = letterInDictionary.get();
            isValid = true;
        }
    }

    public Boolean isValid() {
        return isValid;
    }

    public LetterInMorseCode getLetterInMorseCode() {
        return letterInMorseCode;
    }
}

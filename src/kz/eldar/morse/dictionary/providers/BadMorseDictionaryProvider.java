package kz.eldar.morse.dictionary.providers;

import kz.eldar.morse.interfaces.MorseDictionaryProvider;
import kz.eldar.morse.models.LetterInMorseCode;
import kz.eldar.morse.models.utils.MorseStringToEnumCollection;

import java.util.ArrayList;
import java.util.Collection;

public class BadMorseDictionaryProvider implements MorseDictionaryProvider {

    private static Collection<LetterInMorseCode> morseDictionary = new ArrayList<LetterInMorseCode>();

    @Override
    public Collection<LetterInMorseCode> getMorseDictionary() {
        return morseDictionary;
    }

    static {
        morseDictionary.add(new LetterInMorseCode('0', MorseStringToEnumCollection.morseStringToEnumCollection("-----")));
        morseDictionary.add(new LetterInMorseCode('0', MorseStringToEnumCollection.morseStringToEnumCollection("-----" )));
        morseDictionary.add(new LetterInMorseCode('1', MorseStringToEnumCollection.morseStringToEnumCollection(".----" )));
        morseDictionary.add(new LetterInMorseCode('2', MorseStringToEnumCollection.morseStringToEnumCollection("..---" )));
        morseDictionary.add(new LetterInMorseCode('3', MorseStringToEnumCollection.morseStringToEnumCollection("...--" )));
        morseDictionary.add(new LetterInMorseCode('4', MorseStringToEnumCollection.morseStringToEnumCollection("....-" )));
        morseDictionary.add(new LetterInMorseCode('5', MorseStringToEnumCollection.morseStringToEnumCollection("....." )));
        morseDictionary.add(new LetterInMorseCode('6', MorseStringToEnumCollection.morseStringToEnumCollection("-...." )));
        morseDictionary.add(new LetterInMorseCode('7', MorseStringToEnumCollection.morseStringToEnumCollection("--..." )));
        morseDictionary.add(new LetterInMorseCode('8', MorseStringToEnumCollection.morseStringToEnumCollection("---.." )));
        morseDictionary.add(new LetterInMorseCode('9', MorseStringToEnumCollection.morseStringToEnumCollection("----." )));
        morseDictionary.add(new LetterInMorseCode('a', MorseStringToEnumCollection.morseStringToEnumCollection(".-"    )));
        morseDictionary.add(new LetterInMorseCode('b', MorseStringToEnumCollection.morseStringToEnumCollection("-..."  )));
        morseDictionary.add(new LetterInMorseCode('c', MorseStringToEnumCollection.morseStringToEnumCollection("-.-."  )));
        morseDictionary.add(new LetterInMorseCode('d', MorseStringToEnumCollection.morseStringToEnumCollection("-.."   )));
        morseDictionary.add(new LetterInMorseCode('e', MorseStringToEnumCollection.morseStringToEnumCollection("."     )));
        morseDictionary.add(new LetterInMorseCode('f', MorseStringToEnumCollection.morseStringToEnumCollection("..-."  )));
        morseDictionary.add(new LetterInMorseCode('g', MorseStringToEnumCollection.morseStringToEnumCollection("--."   )));
        morseDictionary.add(new LetterInMorseCode('h', MorseStringToEnumCollection.morseStringToEnumCollection("...."  )));
        morseDictionary.add(new LetterInMorseCode('i', MorseStringToEnumCollection.morseStringToEnumCollection(".."    )));
        morseDictionary.add(new LetterInMorseCode('j', MorseStringToEnumCollection.morseStringToEnumCollection(".---"  )));
        morseDictionary.add(new LetterInMorseCode('k', MorseStringToEnumCollection.morseStringToEnumCollection("-.-"   )));
        morseDictionary.add(new LetterInMorseCode('l', MorseStringToEnumCollection.morseStringToEnumCollection(".-.."  )));
        morseDictionary.add(new LetterInMorseCode('m', MorseStringToEnumCollection.morseStringToEnumCollection("--"    )));
        morseDictionary.add(new LetterInMorseCode('n', MorseStringToEnumCollection.morseStringToEnumCollection("-."    )));
        morseDictionary.add(new LetterInMorseCode('o', MorseStringToEnumCollection.morseStringToEnumCollection("---"   )));
        morseDictionary.add(new LetterInMorseCode('p', MorseStringToEnumCollection.morseStringToEnumCollection(".--."  )));
        morseDictionary.add(new LetterInMorseCode('q', MorseStringToEnumCollection.morseStringToEnumCollection("--.-"  )));
        morseDictionary.add(new LetterInMorseCode('r', MorseStringToEnumCollection.morseStringToEnumCollection(".-."   )));
        morseDictionary.add(new LetterInMorseCode('s', MorseStringToEnumCollection.morseStringToEnumCollection("..."   )));
        morseDictionary.add(new LetterInMorseCode('t', MorseStringToEnumCollection.morseStringToEnumCollection("-"     )));
        morseDictionary.add(new LetterInMorseCode('u', MorseStringToEnumCollection.morseStringToEnumCollection("..-"   )));
        morseDictionary.add(new LetterInMorseCode('v', MorseStringToEnumCollection.morseStringToEnumCollection("...-"  )));
        morseDictionary.add(new LetterInMorseCode('w', MorseStringToEnumCollection.morseStringToEnumCollection(".--"   )));
        morseDictionary.add(new LetterInMorseCode('x', MorseStringToEnumCollection.morseStringToEnumCollection("-..-"  )));
        morseDictionary.add(new LetterInMorseCode('y', MorseStringToEnumCollection.morseStringToEnumCollection("-.--"  )));
        morseDictionary.add(new LetterInMorseCode('z', MorseStringToEnumCollection.morseStringToEnumCollection("--.."  )));
        morseDictionary.add(new LetterInMorseCode('.', MorseStringToEnumCollection.morseStringToEnumCollection(".-.-.-")));
        morseDictionary.add(new LetterInMorseCode(',', MorseStringToEnumCollection.morseStringToEnumCollection("--..--")));
        morseDictionary.add(new LetterInMorseCode('?', MorseStringToEnumCollection.morseStringToEnumCollection("..--..")));
        morseDictionary.add(new LetterInMorseCode('!', MorseStringToEnumCollection.morseStringToEnumCollection("-.-.--")));
        morseDictionary.add(new LetterInMorseCode('-', MorseStringToEnumCollection.morseStringToEnumCollection("-....-")));
        morseDictionary.add(new LetterInMorseCode('/', MorseStringToEnumCollection.morseStringToEnumCollection("-..-." )));
        morseDictionary.add(new LetterInMorseCode('@', MorseStringToEnumCollection.morseStringToEnumCollection(".--.-.")));
        morseDictionary.add(new LetterInMorseCode('(', MorseStringToEnumCollection.morseStringToEnumCollection("-.--." )));
        morseDictionary.add(new LetterInMorseCode(')', MorseStringToEnumCollection.morseStringToEnumCollection("-.--.-")));
        morseDictionary.add(new LetterInMorseCode(')', MorseStringToEnumCollection.morseStringToEnumCollection("-.--.-")));
    }
}

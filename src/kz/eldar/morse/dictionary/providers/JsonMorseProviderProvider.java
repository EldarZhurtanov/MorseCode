package kz.eldar.morse.dictionary.providers;

import kz.eldar.morse.interfaces.MorseDictionaryProvider;
import kz.eldar.morse.models.LetterInMorseCode;

import java.util.Collection;

public class JsonMorseProviderProvider implements MorseDictionaryProvider {
    //я хотел использовать json для получения словаря морзе,
    //но мы ещё не начали изучать фреймворки,
    //поэтому я не знаю как поставить Json парсер
    @Override
    public Collection<LetterInMorseCode> getMorseDictionary() {
        throw new UnsupportedOperationException("No JsonProvider implementation");
    }
}

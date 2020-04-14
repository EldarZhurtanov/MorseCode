package kz.eldar;

import kz.eldar.morse.MorseConverterFacade;
import kz.eldar.morse.converters.LetterConverter;
import kz.eldar.morse.converters.TextConverter;
import kz.eldar.morse.converters.WordConverter;
import kz.eldar.morse.validators.LetterValidator;
import kz.eldar.morse.validators.TextValidator;
import kz.eldar.morse.validators.WordValidator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

//В кратце:
//Валидаторы создаются на основе текста (буква - LetterValidator, слово - WordValidator, Text - TextValidator)
//валидируют текст, и на каждую букву создают пару <буква в char, буква в мозре>, причем TextValidator хранит коллекцию
//WordValidator'ов, которые в свою очередь хранят коллекции LetterValidator'ов, которые хранят эти пары.

//Конверторы принимают валидаторы (TextConverter - TextValidator, WordConverter - WordValidator, LetterConverter - LetterValidator)
//и в зависимости от вызванной функции(toMorse/fromMorse) возвращают текст склееный из
//значения пар <буква в char, буква в мозре>(созданных в конструкторе валидатора).
//причем как и валидаторы TextConverter использует WordConverter, который в свою очередь использует LetterConverter.

//Всё это прикрывает очень лёгкий фасад, но при надобности можно работать с валидаторами и конверторами напрямую.

//Пометка: TextValidator сам отпределяет какую строку ему передали(в морзе или обычную) попыткой провалидировать её как морзе.
//Остальные же валидаторы работают на 2х перегрузках констуктора(с морзе аргументом и с обычным).

//Словарь Морзе я хотел получать из Json, но пока без Maven, а значит без Jackson.
//Зато всё по солиду, DI соблюдён, что позволяет заменить провайдера изменив реализацию
//IMorseDictionaryProvider в одной строке LetterValidator'а.

public class Main {

    public static void main(String[] args) {

        System.out.println(MorseConverterFacade.Convert("Java Bruh."));
        System.out.println(MorseConverterFacade.Convert(".--- .- ...- .-   -... .-. ..- .... .-.-.-"));
        System.out.println();

        //Использование напрямую без фасадов
        System.out.println(TextConverter.toMorse(new TextValidator("Java Bruh.")));
        System.out.println(TextConverter.fromMorse(new TextValidator(".--- .- ...- .-   -... .-. ..- .... .-.-.-")));
        System.out.println();

        System.out.println(WordConverter.toMorse(new WordValidator("Bruh")));
        String[] lettrs = {"-...", ".-.", "..-", "....", ".-.-.-"};
        System.out.println(WordConverter.fromMorse(new WordValidator(Arrays.asList(lettrs))));
        System.out.println();

        System.out.println(LetterConverter.toMorse(new LetterValidator('b')));
        System.out.println(LetterConverter.fromMorse(new LetterValidator("-...")));
        System.out.println();

        //"Сломанные" строки корректно возвращают null
        System.out.println(MorseConverterFacade.Convert("ЖЖЖ"));
        System.out.println(LetterConverter.toMorse(new LetterValidator('Ы')));
    }
}

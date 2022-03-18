package utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NamesBuilder {
    public static final String[] names = {"Rafu Henri", "João Pau na Costa", "Oseias Corno", "Gabzinho Sales", "Professor Clovis"};

    private static final Map<Character, List<String>> namesMaps = new HashMap<>();

    private static final Character[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'y', 'w', 'z'};

    private static final Character[] vowels = {'a', 'e', 'i', 'o', 'u'};

    private NamesBuilder() {
    }

    public static NamesBuilder builder() {
        return new NamesBuilder();
    }

    public NamesBuilder namesStartsWithA() {
        namesMaps.put('A', Collections.emptyList());
        return this;
    }
}

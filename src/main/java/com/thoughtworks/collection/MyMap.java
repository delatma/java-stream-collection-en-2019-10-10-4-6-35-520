package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream()
                .map(a->a*3)
                .collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream()
                .filter(i -> i < letterList.size())
                .map(i -> letterList.get(i-1))
                .collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return this.array.stream()
                .map(num -> {
                    --num;
                    return num > 25 ? letterList.get(num / 26 - 1) + letterList.get(num % 26):
                            letterList.get(num % 26);
                })
                .collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}

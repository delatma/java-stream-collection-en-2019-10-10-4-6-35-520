package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.*;

import static java.lang.System.out;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int firstNumber = Math.min(leftBorder, rightBorder);
        int secondNumber = Math.max(leftBorder, rightBorder);

        return IntStream.rangeClosed(firstNumber,secondNumber)
                .filter(n -> n % 2 == 0)
                .sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int firstNumber = Math.min(leftBorder, rightBorder);
        int secondNumber = Math.max(leftBorder, rightBorder);

        return IntStream.rangeClosed(firstNumber,secondNumber)
                .filter(n -> n % 2 != 0)
                .sum();

    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int total = 0;
        for (Integer integer : arrayList) {
            total+=integer*3+2;
        }
        return total;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer currentInteger : arrayList) {
            if(currentInteger%2 == 0){
                resultList.add(currentInteger);
            }
            else{
                resultList.add(currentInteger*3+2);
            }
        }
        return resultList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int total = 0;
        for (Integer currentInteger : arrayList) {
            if(currentInteger%2 != 0){
                total+=currentInteger*3+5;
            }
        }
        return total;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(a -> a%2 == 0)
                .sorted(Comparator.naturalOrder())
                .reduce(0, (subtotal , element) -> subtotal+element / 2 );
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(a -> a%2 == 0)
                .mapToDouble(a -> a)
                .average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.contains(specialElment) && specialElment % 2 == 0;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(a -> a % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> even = arrayList.stream()
                .filter(a -> a % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        List<Integer> odd = arrayList.stream()
                .filter(a -> a % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        even.addAll(odd);
        return even;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> processedList = new ArrayList<>();
        for (int curIndex = 0, nextIndex=1; nextIndex < arrayList.size(); curIndex++, nextIndex++) {
            Integer currentValue = arrayList.get(curIndex);
            Integer nextValue = arrayList.get(nextIndex);
            processedList.add((currentValue + nextValue) * 3);
        }
        return processedList;
    }
}

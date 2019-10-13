package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
       return arrayList.stream()
               .mapToInt(a->a)
               .max()
               .orElseThrow(NoSuchElementException::new);
    }

    public double getMinimum() {
        return arrayList.stream()
                .mapToInt(a->a)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

    public double getAverage() {
        return arrayList.stream()
                .mapToInt(a->a)
                .average()
                .orElseThrow(NoSuchElementException::new);
    }

    public double getOrderedMedian() {
        return getMedianFromList(arrayList);
    }

    public int getFirstEven() {
        return arrayList.stream()
                .reduce(0, (a, b) -> a==0 && b%2==0? a=b : a);
    }

    public int getIndexOfFirstEven() {
        return arrayList.indexOf(getFirstEven());
    }

    public boolean isEqual(List<Integer> arrayList) {
        return this.arrayList.equals(arrayList);
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        return getMedianFromList(arrayList);
    }

    public int getLastOdd() {
        return arrayList.stream()
                .filter(a->a%2!=0)
                .reduce((a,b)-> b)
                .orElse(0);
    }

    public int getIndexOfLastOdd() {
        return arrayList.indexOf(getLastOdd());
    }

    public static double getMedianFromList(List<Integer> arrayList){
        if(arrayList.size()%2==0){
            double leftMiddleElement  = arrayList.get(arrayList.size() / 2-1);
            double rightMiddleElement = arrayList.get((arrayList.size() / 2));

            return (leftMiddleElement+rightMiddleElement)/2;
        } else{
            return arrayList.get(arrayList.size() / 2);
        }
    }
}

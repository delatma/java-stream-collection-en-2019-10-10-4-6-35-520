package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int total = 0;

        if(leftBorder < rightBorder) {
            for(int i=leftBorder; i <= rightBorder; i++){
                if(i % 2 == 0) {
                    total += i;
                }
            }
        }
        else{
            for(int i=rightBorder; i <= leftBorder; i++){
                if(i % 2 == 0) {
                    total += i;
                }
            }
        }
        return total;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int total = 0;
        if(leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for(int i=leftBorder; i <= rightBorder; i++){
            if(i % 2 != 0) {
                total += i;
            }
        }
        return total;
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
//
//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
//
//    public double getAverageOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
//
//    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//        throw new NotImplementedException();
//    }
//
//    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
//
//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
//
//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}

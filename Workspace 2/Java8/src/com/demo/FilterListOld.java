package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterListOld {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "rest");
        List<String> result = getFilterOutput(lines, "rest");
        for (String temp : result) {
            System.out.println(temp);    //output : spring, node
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"rest".equals(line)) { 
                result.add(line);
            }
        }
        return result;
    }

}

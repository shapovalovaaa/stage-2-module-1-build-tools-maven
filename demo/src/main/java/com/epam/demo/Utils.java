package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> strings) {
        return strings.stream().allMatch(StringUtils::isPositiveNumber);
    }
}
package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;
import java.util.Optional;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return Optional.ofNullable(str)
                .filter(NumberUtils::isCreatable)
                .map(NumberUtils::createBigDecimal)
                .map(decimal -> decimal.compareTo(BigDecimal.ZERO) > 0)
                .orElse(false);
    }
}

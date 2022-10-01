package com.hillel.util;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Objects.nonNull;

public class WordFinder {
    public static int findWord(String filepath, String word) {
        String fileContent = IOUtil.readFile(filepath);
        if (nonNull(fileContent)) {
            fileContent = fileContent.toLowerCase(Locale.ROOT);
            Matcher matcher = Pattern.compile("\\b" + word.toLowerCase(Locale.ROOT) + "\\b").matcher(fileContent);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            return count;
        } else {
            return 0;
        }
    }
}

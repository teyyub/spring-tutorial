package org.example.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class JavaTest {
    public static void main(String[] args) {
        ClassLoader classLoader = JavaTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("config.txt");

        if (is == null) {
            throw new IllegalArgumentException("Fayl tapılmadı!");
        }

        // Stream-i oxumaq üçün mürəkkəb kod
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String content = reader.lines().collect(Collectors.joining("\n"));
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
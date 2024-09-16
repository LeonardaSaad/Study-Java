package com.projectsimpledemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MorseConverter {
    private Properties morseProperties = new Properties();

    public MorseConverter() {
        loadMorce();
    }

     private void loadMorce() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("morse-code.properties")) {
            if (input == null) {
                throw new RuntimeException("Sorry, unable to find morse-code.properties");
            }
            morseProperties.load(input);
            System.out.println("Loaded Morse Code");
        } catch (IOException e) {
            throw new RuntimeException("Failed to load Morse code properties", e);
        }
    }

    public String convertToMorse(String input) {
        StringBuilder morseCode = new StringBuilder();
        for (char c : input.toCharArray()) {
            String morse = morseProperties.getProperty(Character.toString(c));
            if (morse != null) {
                morseCode.append(morse).append(" ");
            } else {
                morseCode.append("? ");
            }
            return morseCode.toString();
        }
        return morseCode.toString();
    }
}

package com.carbon.chatiere.bmorant;

public class StringCalculator {

    public int Add(String input) {
        int result;
        char delimiter;
        if (input.equals("")) {
            result = 0;
        } else {
            result = Integer.parseInt(input);
        }
        return result;
    }
}

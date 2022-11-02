package com.carbon.chatiere.bmorant;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Test
    void should_return_0_when_input_is_emptyString() {
        // Given
        stringCalculator = new StringCalculator();
        // When
        String input = "";
        // Then
        assertThat(stringCalculator.Add(input)).isEqualTo(0);
    }


}
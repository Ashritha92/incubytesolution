package com.ashritha;


import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ashritha.implementation.StringCalculator;

@SpringBootTest
class StringcalculatortddApplicationTests {

	@Test
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,3");
    }
	@Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");

    }
    @Test
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
    }
    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        Assert.assertEquals(0, StringCalculator.addEmpty(""));
       
    }

}

package com.ashritha;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ashritha.implementation.StringCalculator;

@SpringBootTest
class StringcalculatortddApplicationTests {

	@Test
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,3");
    }

}

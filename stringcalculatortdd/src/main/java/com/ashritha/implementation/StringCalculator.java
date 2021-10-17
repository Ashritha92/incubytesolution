package com.ashritha.implementation;

public class StringCalculator {
	public static final void add(final String numbers) {
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                Integer.parseInt(number);             }
        }
    }

	
	public static final int addEmpty(final String numbers) { // Changed void to int
	    String[] numbersArray = numbers.split(",");
	    if (numbersArray.length > 2) {
	        throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
	    } else {
	        for (String number : numbersArray) {
	            if (!number.isEmpty()) {
	                Integer.parseInt(number);
	            }
	        }
	    }
	    return 0; // Added return
	}
}

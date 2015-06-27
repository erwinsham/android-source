package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */// int [] numbers = [4, 6, 8, 2]
	public static final int findMaxRecursively(List<Integer> numbers) {
		if( numbers.size() == 1){
			return numbers.get(0);
		}
		
		if (numbers.get(0) > numbers.get(1)){
			numbers.remove(1);
		} else{
			numbers.remove(0);
		}
		
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/
		return findMaxRecursively(numbers);
	}
}

/*

value = 5
 
 return value  * factorial(value - 1)
 
 1st time
 value == 5
 
 2nd time 
 value == 4
 
 3rd time
 value == 3
 
 4th time
 value == 2
 
 5th time
 value == 1
 return value
 
 



*/
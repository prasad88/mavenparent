package com.bootmicroservices.ratingsservice.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootmicroservices.ratingsservice.models.UserRating;

@RestController
public class UserDataController {

	@RequestMapping("/userData/{userId}") 
	public List<UserRating> getUserMovies(@PathVariable("userId") String userId){
		
		return Collections.singletonList(
				new UserRating("Test", "123", "Desc",4)
		);
	}
	
	/*
	 * public static void main(String[] args) throws NumberFormatException,
	 * IOException { BigInteger number = new BigInteger("45"); BigInteger x = new
	 * BigInteger("2"); long totalFactors = 1; while
	 * (x.multiply(x).compareTo(number) <= 0) { int power = 0; while
	 * (number.mod(x).equals(BigInteger.ZERO)) { power++; number = number.divide(x);
	 * } totalFactors *= (power + 1); x = x.add(BigInteger.ONE); } if
	 * (!number.equals(BigInteger.ONE)) { totalFactors *= 2; }
	 * System.out.println("The total number of factors is: " + totalFactors); }
	 */
	
	
	
	
	
	
	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	// method to calculate all common divisors 
    // of two given numbers 
    // a, b --> input integer numbers 
    static int commDiv(int a,int b) 
    { 
        // find gcd of a,b 
        int n = gcd(a, b); 
       
        // Count divisors of n. 
        int result = 0; 
        for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            // if 'i' is factor of n 
            if (n%i==0) 
            { 
                // check if divisors are equal 
                if (n/i == i) 
                    result += 1; 
                else
                    result += 2; 
            } 
        } 
        return result; 
    } 
  
    // Driver method 
    public static void main(String args[]) throws IOException 
    { 
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String inputList = br.readLine();
    	String[] numberListStr = inputList.split(" ");
    	//Long.parseLong(\)
    	
    	
    	
    	long[] numberList = Arrays.asList(numberListStr).stream().mapToLong(Long::parseLong).toArray();
    	long number1 = numberList[0];
    	long number2 = numberList[1];
    	
    	List<Long> factorsOfNumber1 = getFactors(number1);
    	List<Long> factorsOfNumber2 = getFactors(number2);
    	
    	List<Long> resultList = new ArrayList<>(factorsOfNumber1);
    	resultList.retainAll(factorsOfNumber2);
    	System.out.println("Result:>>>"+resultList);
    	System.out.println(resultList.size());
    }

	private static List<Long> getFactors(long number) {
		long i =1;
		List<Long> factors = new ArrayList<Long>();
		if(number == 0 || number == 1) {
			
		}
		while(i <= number/2) {
			if((number%i) == 0) {
				factors.add(i);
			}
			i++;
		}
		System.out.println(number+">>Number: >>>"+factors);
		return factors;
	}
	
	
	
	
	//test Comment
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

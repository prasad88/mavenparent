package com.bootmicroservices.ratingsservice.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

import lombok.Data;

@Data
public class UserRating {

	private String name;
	private String movieId;
	private String desc;
	private int rating;
	
	public UserRating(String name, String movieId, String desc, int rating) {
		super();
		this.name = name;
		this.movieId = movieId;
		this.desc = desc;
		this.rating = rating;
	}
	
	
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		  /* Sample code to perform I/O:
       * Use either of these methods for input*/

      //BufferedReader
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Integer size = Integer.parseInt(br.readLine());                // Reading input from STDIN
      String inputList = br.readLine();
      String[] numberListStr = inputList.split(" ");
      int[] numberList = Arrays.asList(numberListStr).stream().mapToInt(Integer::parseInt).toArray();
      Integer sum = IntStream.of(numberList).sum();
      int lastAns = (int) (sum/size);
      System.out.println(lastAns+1);
	}
	
	
	
	
	
	
	
	
	
}

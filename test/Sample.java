package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;

public class Sample {
	
	private static final int TOTAL_LENGTH = 100000;
	private static final int SECTION_LENGTH = 1000;
	
	public static void make( String path ) {
		
		repeatTheSameLogic( TOTAL_LENGTH/SECTION_LENGTH , path );
		
	}
	
	private static void repeatTheSameLogic( int repeatTimes , String path ) {
		
		for ( int i = 0 ; i < repeatTimes ; i++ )
			makeSubFile( path );
		
	}
	
	private static void makeSubFile( String path ) {
		
		String sample = prepareDigits();
		writeDigitsIntoFile( sample , path );
		
	}
	
	private static String prepareDigits() {
		
		return BigInteger.probablePrime( SECTION_LENGTH, new Random() ).toString();
		
	}
	
	private static void writeDigitsIntoFile( String digits , String path ) {
		
		try ( BufferedWriter writer = new BufferedWriter( new FileWriter( path , true ) ) ) {
			
			writer.append(digits);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample.make( "C://Users/jingle/Desktop/sample.txt" );
	}

}

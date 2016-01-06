// Single line comment
/* Multi line comment
 * 
 * 
 */

// Coded up by Collin Mullis, but it is not my code. Just practice.

import java.util.Scanner;
import java.util.*;
public class Animal {
	
	public static final double FAVNUMBER = 1.6180;
	
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userInput = new Scanner(System.in);


	public Animal() {
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);

		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);
		
		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + multOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);
		
		int modOfNumbers = 5 % 3;
		System.out.println("5 % 1 = " + modOfNumbers);
		
		System.out.println("Enter the name: \n");
		
		// hasNextInt, hasNextFloat, hasNextDouble, hasNextBoolean, etc.
		// nextInt, nextFloat, nextDouble, nextBoolean, etc.
		
		if(userInput.hasNextLine()) {
			
		
			
			this.setName(userInput.nextLine());
		}
		
			this.setFavoriteChar();
			this.setUniqueID();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}
	
	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 100000;
															// Max number to generate to, min number you want to generate to.
		this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
		String stringNumber = Long.toString(maxNumber);
		
		// int (can change to anything) numberString = (Uppercase of data type) Integer.parseInt(What you want Converted to primitive)
		// Byte.toString(What you want Converted to String)
		// Integer.toString(What you want Converted to String)
		
		int numberString = Integer.parseInt(stringNumber);
		
		
	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		int randomNumber = (int) (Math.random() * 126) + 1;
		
		this.favoriteChar = (char) randomNumber;
		
		if (randomNumber == 32) {
			
			System.out.println("Favorite character set to Space");
		
		} else if (randomNumber == 10) {
			
			System.out.println("Favorite character set to Newline");
			
		} else {
			
			System.out.println("Favorite character set to " + this.favoriteChar);
		}
		
		if((randomNumber > 97) && (randomNumber < 122)) {
			
			System.out.println("Favorite character is a lowecase character");
		} 
		
		if(((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91)))
			
			System.out.println("Favorite character is a letter");
		
		int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
		
		switch(randomNumber){
		
			case 8:
				System.out.println("Favorite character set to backspace");
				break;
				
			case 10:
			case 11:
			case 12:
				System.out.println("FAvorite character set to Nommer");
				break;
				
			default :
				System.out.println();
				break;
		}		
		
	}
		

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	protected static void countTo(int startingNumber){
		
		for(int i = startingNumber; i <= 100; i++){
			
			if(i == 90) continue;
			
			System.out.println(i);
		}
	}
	
	protected static String printNumber(int maxNumbers){
		
		int i = 1;
		
		while(i < (maxNumbers / 2)){
			
			System.out.println(i);
			i++;
			
			if(i == (maxNumbers/2)) break;
			
		}
		
		Animal.countTo(maxNumbers/2);
		
		return "End of printNumbers";
		
	}
	
	protected static void guessMyNumber() {
		
		int number;
		
		do {
			
			System.out.println("Guess Number up to 100");
			
			while(!userInput.hasNextInt()){
				
				String numberEntered = userInput.next();
				System.out.printf("%s is not a number\n", numberEntered);
				// "%s part, s is string || d for byte, int, short or long || f for float or double, and can define decimal place by .(# of decimal places it needs)
			
			}
			
			number = userInput.nextInt();
			
		} while(number != 50);
		System.out.println("Yay you guessed it!");
	}
	
	public String makeSound(){
		
		return "Grrr";
	}
	
	public static void speakAnimal(Animal randAnimal){
		
		System.out.println("Animal says " + randAnimal.makeSound());
	}
	

	
	public static void main(String[] args) {
		
		Animal theAnimal = new Animal();
		
		int[] favoriteNumbers = new int[20];
		favoriteNumbers [0] = 100;
		
		String [] stringArray = {"Random", "Words", "Here"};
		
		for(String word : stringArray){
			
			System.out.println(word);
			
		}
		
		String [][][] arrayName = { { { "000" }, { "100" }, { "200" } }, 
			 { { "010" }, { "110" }, { "210" }, { "310" } },
			 { { "020" }, { "120" }, { "220" }, { "320" } } };
		
		for(int i = 0; i < arrayName.length; i++)
		{
			for(int j = 0; j < arrayName[i].length; j++)
			{
				for(int k = 0; k < arrayName[i][j].length; k++)
				{
					System.out.println("| " + arrayName[i][j][k] + " ");
					
				}
			}
			
			System.out.println("|");
		}
			String[] cloneOfArray = Arrays.copyOf(stringArray, 3);
			
			System.out.println(Arrays.toString(cloneOfArray));
			
			System.out.println(Arrays.binarySearch(cloneOfArray, "Random"));
		}
}

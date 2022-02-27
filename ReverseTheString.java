import  java.util.*;
public class Main
{
	public static void main(String[] args) {
	String str;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string to be reversed"); // Keeping the Hope
	str = sc.nextLine();
	char[] arr = str.toCharArray();
	System.out.println("Reversed String is: "); // epoH eht gnipeeK
	int j= arr.length;
	for(int i=j; i>0; i--){
	    System.out.println(arr[i-1]); // 
	}
	}
}

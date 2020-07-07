package com.vnr.nazish.vnrvjiet.java8_lambdas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PalindromeString {
	public static void palindromes() {
        List<String> a = Arrays.asList("aba","aaa","abba","acdf","abcddcba","avdc","abcdef","Madam");
        List<String> palindromes = PalindromeString.findPal(a, 
                (str) -> PalindromeString.isPal((String) str));
 
        System.out.println(palindromes);
    }
 
    public static boolean isPal(String str) {
    	StringBuffer newStr =new StringBuffer();
    	for(int j = str.length()-1; j >= 0 ; j--) {
    	newStr = newStr.append(str.charAt(j));
    	}
    	if(str.equalsIgnoreCase(newStr.toString())) {
    		return true;
    	} else {
    		return false;
    	}
        } 
    public static List<String> findPal(List<String> list, Predicate<String> predicate) { 
    	List<String> pal = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
            pal.add((String) i);
        });
        return pal;
    }   
}
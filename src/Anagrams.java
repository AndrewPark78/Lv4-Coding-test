import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Anagrams {
	File f = new File("dict.txt");
	Scanner d = new Scanner(f);
	public static void main(String[] args) {
		Anagrams a = new Anagrams();
		a.ans("iceman");
	}
	public ArrayList<String> ans(String input) {
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<Character> c = new ArrayList<Character>();
		for (int i = 0; i < input.length(); i++) {
			c.add(input.charAt(i));
		}
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < c.size(); j++) {
				if(Scanner.next)
			}
		}
		return s;
	}
}

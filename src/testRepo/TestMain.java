package testRepo;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
	public static void main(String[] args) {
		ArrayList<Integer> countList = new ArrayList<>();

		countList.add(1);
		countList.add(6);
		countList.add(3);

		System.out.println(countList);

		Collections.sort(countList);
		System.out.println(countList);
		Collections.reverse(countList);

		System.out.println(countList);

	}

}

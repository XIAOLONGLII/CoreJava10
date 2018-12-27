package OCA;

import java.util.ArrayList;
import java.util.List;



public class FirstQuiz
{
	public static void main(String[] args)
	{
		List<Integer> e = new ArrayList<>();
		e.add(10);
		e.add(11);
		int firstElement = e.get(1);
		System.out.println(firstElement);
	}

}

package Collections.com.learning;

import java.util.ArrayList;

public class Friends {
	public static void main(String[] args)
	{
		ArrayList<String> friends = new ArrayList<String>();
		
		friends.add("Anusha");
		friends.add("Renuka");
		friends.add("Vamsi");
		friends.add("Raga");
		friends.add("Pranavi");
		friends.add("Sharmi");
		
		System.out.println("Friends List: " +friends);
		
		friends.add(5,"Navya");
		friends.add(6,"Radha");
		
		System.out.println("New Friends List: " +friends);
		
		friends.remove(5);
		System.out.println("Friends: " +friends);
		
	}
}

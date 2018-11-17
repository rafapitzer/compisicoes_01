package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1_1 = new Comment("Have a nice trip");
		Comment c2_1 = new Comment("Wow that's awesome!");
		Post p1_1 = new Post(
					sdf.parse("21/06/2018 13:05:44"), 
					"Traveling to New Zealand", 
					"I'm going to visit this wonderful country!", 
					12);
		p1_1.addComment(c1_1);
		p1_1.addComment(c2_1);
		
		Comment c1_2 = new Comment("Good night");
		Comment c2_2 = new Comment("May the Force be with you");
		Post p1_2 = new Post(
					sdf.parse("28/07/2018 23:14:19"), 
					"Good night guys", 
					"See you tomorrow", 
					5);
		p1_2.addComment(c1_2);
		p1_2.addComment(c2_2);
		
		System.out.println(p1_1);
		System.out.println(p1_2);
	
	}

}

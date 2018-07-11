package datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class ListMovieMain {
	public static void main(String [] args) {
		
		ArrayList <Movie> list = new ArrayList();
		
		Movie movie = new Movie();
		movie.setName("Moonlight");
		movie.setDirector("Barry Jenkins");
		movie.setReleasedate("2016-10-21");
		movie.setDuration(110);
		list.add(movie);
		
		movie =new Movie();
		movie.setName("Manchester by the Sea");
		movie.setDirector("Kenneth Lonergan");
		movie.setReleasedate("2016-11-18");
		movie.setDuration(137);
		list.add(movie);
		
		Comparator<Movie> comp = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Movie first = (Movie)o1;
				Movie second = (Movie)o2;
				//return second.getDuration() -  first.getDuration();
				return first.getDirector().compareTo(second.getDirector());
			}
			
		};
		list.sort(comp);
		for(Movie temp : list) {
			System.out.println(temp);
		}
		System.out.println(list.get(0));
	}

}

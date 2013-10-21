import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Event {
	
	int start;
	int finish;
	/**
	 * @param args
	 */
	public static class MyEventComparator implements Comparator<Event> {
		public int compare(Event e1, Event e2) {
			if (e1.start > e2.start)
				return 1;
			if (e1.start == e2.start)
				return 0;
			else {
				return -1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Event> e = new ArrayList<Event>();
		Collections.sort(e, new MyEventComparator());
	}

}

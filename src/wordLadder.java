import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;


public class wordLadder {
	
	public static Vector<String> findDict (String str, Set<String> dict) {
		Vector<String> res = new Vector<String>();
		
		int size = str.length();
		
		for (int i = 0 ; i < size; i++) {
			for (char j = 'a'; j <= 'z'; j++) {
				StringBuilder sb = new StringBuilder(str);
				sb.setCharAt(i, j);

				/*if (!dict.get(dict.indexOf(s)).equals(dict.get(dict.size() - 1))) {
					res.add(s);
				}*/
				if (dict.contains(sb.toString())) {
					res.add(sb.toString());
				}
			}
		}
		
		return res;
	}
	
	public static int ladderLength(String start, String end, Set<String> dict) {
		int numTransforms = 0;
		Set<String> added = new HashSet<String>();
		
	    if (start == end)
	        return numTransforms;
	    
	    Queue<String> q = new PriorityQueue<String>();
	    q.add(start);
	    added.add(start);
	    
	    while (!q.isEmpty()) {
	    	String s = q.remove();
	    	
	    	if (s == end) {
	    		return numTransforms + 1;
	    	}
	    	else {
	    		Vector<String> neighbors = findDict(s, dict);
		    	java.util.Iterator<String> itr = neighbors.iterator();
		    	while (itr.hasNext()) {
		    		String st = itr.next();
		    		if (!added.contains(st)) {
		    			q.add(st);
			    		added.add(st);
			    		numTransforms++;
		    		}
		    	}
		    	System.out.println(q);
	    	}
	    }
	    
	    
	    return numTransforms;
	}
	public static void main(String[] args) {
		Set<String> dict = new HashSet();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		
		String start = "hit";
		String end = "cog";
		
		System.out.println(ladderLength(start, end, dict));
	    
	    
	    
	    
	}
}

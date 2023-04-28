package org.howard.edu.lsp.finals.problem;
import java.util.*;

public class SongsDatabase {
	/* Key is the genre, HashSet contains associated songs */
	private Map<String, HashSet<String>> map = 
new HashMap<String, HashSet<String>>();

		/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		//checks if the genre is present in database
		if (!(map.containsKey(genre))) {
			HashSet<String> newSet = new HashSet<String>();
			newSet.add(songTitle);
			map.put(genre, newSet);
		}
		else {
			//this set gets the set available for the genre, if present in the database.
			HashSet<String> retrievedSet = map.get(genre);
			retrievedSet.add(songTitle);
			map.put(genre, retrievedSet);
		}
	
	}

	/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
		if (map.containsKey(genre)) {
			return map.get(genre);
		}
		return new HashSet<String>();
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
		//loops through the map
		for (String key : map.keySet()) {
			if (map.get(key).contains(songTitle)) {
				return key;
			}
		}
		return "NO MATCH";
	}
}



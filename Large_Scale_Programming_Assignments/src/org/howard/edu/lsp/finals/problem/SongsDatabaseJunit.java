package org.howard.edu.lsp.finals.problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

public class SongsDatabaseJunit {
	@Test
	@DisplayName("Test to add songs to the database")
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");
        db.addSong("Jazz", "Potions");
        db.addSong("Pop", "Creepin'");
        db.addSong("Pop", "Search 'nd Rescue");

        assertTrue(db.getSongs("Rap").contains("Savage"));
        assertTrue(db.getSongs("Rap").contains("Gin and Juice"));
        assertTrue(db.getSongs("Jazz").contains("Always There"));
        assertTrue(db.getSongs("Jazz").contains("Potions"));
        assertTrue(db.getSongs("Pop").contains("Creepin'"));
        assertTrue(db.getSongs("Pop").contains("Search 'nd Rescue"));
    }

    @Test
	@DisplayName("Test to get songs from the database")
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");
        db.addSong("Jazz", "Potions");
        db.addSong("Pop", "Creepin'");
        db.addSong("Pop", "Search 'nd Rescue");

        assertEquals(2, db.getSongs("Rap").size());
        assertEquals(2, db.getSongs("Jazz").size());
        assertEquals(2, db.getSongs("Pop").size());
        assertEquals(0, db.getSongs("Rock").size());
    }

    @Test
	@DisplayName("Test to get songs from the database")

    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");
        db.addSong("Jazz", "Potions");
        db.addSong("Pop", "Creepin'");
        db.addSong("Pop", "Search 'nd Rescue");

        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Rap", db.getGenreOfSong("Gin and Juice"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertEquals("Jazz", db.getGenreOfSong("Potions"));
        assertEquals("Pop", db.getGenreOfSong("Creepin'"));
        assertEquals("Pop", db.getGenreOfSong("Search 'nd Rescue"));
        assertEquals("NO MATCH", db.getGenreOfSong("Bohemian Rhapsody"));
        assertEquals("NO MATCH", db.getGenreOfSong("Reason You"));
    }
}



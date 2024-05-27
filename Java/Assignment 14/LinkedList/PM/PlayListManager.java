package Assinment14.LinkedList.PM;
import java.util.Collections;
import java.util.LinkedList;

public class PlayListManager {
    public static LinkedList<Song> songLinkedList = new LinkedList<Song>();
    public static void addSong(int songId, String title, String artist, String album, int duration)
    {
        songLinkedList.add(new Song(songId, title, artist, album, duration));
        System.out.println("Song added successfully.");
    }
    //Search for a song by `title` and display its details
    public static void searchSong(String title)
    {
        for (Song song : songLinkedList)
        {
            if (song.getTitle().equals(title))
            {
                System.out.print(song);
                break;
            }
        }
            System.out.println("Order not found");
    }
    //remove a song based on song id
    public static void removeSong(int songId) {
        boolean found = false;
        for (Song song : songLinkedList) {
            if (song.getSongId() == songId)
            {
                System.out.println("Song removed Successfully:");
                songLinkedList.remove(songId);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Song not found.");
        }
    }

    public static void displaySong() {
        if (songLinkedList.isEmpty()) {
            System.out.println("No Songs to display.");
        } else {
            //Sort songs by duration
            Collections.sort(songLinkedList, new DurationComparator());
            for (Song song : songLinkedList)
            {
                System.out.println(song);
            }
        }
    }

}

package Assinment14.LinkedList.PM;
public class Song{
    int songId, duration;
    String title,artist, album;

    public Song(int songId, String title,String artist, String album,int duration) {
        this.songId = songId;
        this.duration = duration;
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public int getSongId() {
        return songId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "songId=" + songId +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", duration=" + duration ;
    }
}

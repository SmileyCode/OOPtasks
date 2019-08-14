package Theme2.Task5;

public class Track {

    private Album album;
    private String trackName;
    private String author;

    public Track(String trackName) {
        setTrackName(trackName);
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return getTrackName() + (getAuthor() != null ? ", авторы: " + getAuthor() + ", " + getAlbum().getAuthor() : ", автор: " + getAlbum().getAuthor());
    }
}

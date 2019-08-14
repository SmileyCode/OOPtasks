package Theme2.Task5;

import java.util.ArrayList;

public class Album {

    private String author;
    private String name;
    private ArrayList<Track> tracklist = new ArrayList<>();

    public Album(String author, String name) {
        setAuthor(author);
        setName(name);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Track> getTracklist() {
        return tracklist;
    }

    //3.4
    public void setTracklist(ArrayList<Track> tracklist) {
        this.tracklist = tracklist;
    }

    public void addTrack(Track track){
        this.tracklist.add(track);
    }

    public void showTracks(){
        for (int i = 0; i < getTracklist().size(); i++) {
            System.out.println(getTracklist().get(i).toString());
        }
    }
}

package Theme3;


import Theme2.Review;

import java.util.ArrayList;

public class Publication {

    private String name;
    private String text;
    private ArrayList<String> tags = new ArrayList<>();
    private ArrayList<Review> reviews = new ArrayList<>();

    public Publication(String name, String text) {
        setName(name);
        setText(text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addTag(String tag){
        this.tags.add(tag);
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }

    public void showPublication(){
        System.out.println(getName() + "\n" + getText() + "\n" + getTags());
        for (Review i : getReviews())
            System.out.println(i);
    }

}

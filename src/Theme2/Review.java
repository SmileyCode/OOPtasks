package Theme2;

public class Review {

    private int rating;
    private String text;
    private Review parentReview;
    private int reviewLevel = 0;//Сколько = будет перед комментом

    public Review(int rating, String text) {
        setRating(rating);
        setText(text);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Review getParentReview() {
        return parentReview;
    }

    public void setParentReview(Review parentReview) {
        this.parentReview = parentReview;
        this.reviewLevel = parentReview.getReviewLevel() + 1;
    }

    public int getReviewLevel() {
        return reviewLevel;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < getReviewLevel(); i++) {
            res+="===";
        }
        //if(getParentReview() != null)
         //   System.out.println(getParentReview().toString());
        return res + "(" + getRating() + ") " + getText();
    }
}

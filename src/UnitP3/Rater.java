package UnitP3;

public class Rater {
    private String companyName;
    private int rating;
    private String review;

    public Rater() {
        this.companyName = "";
        this.review = "";
        this.rating = 0;
    }

    public void evaluateReview(){
        boolean greaterThan4 = rating >= 4;
        boolean lowerThan3 = rating <=3;
        boolean below2 = rating < 2;

        System.out.println("It is " + greaterThan4 + "that the rating is 4 or above");
    }


    @Override
    public String toString() {
        return "companyName='" + companyName + '\'' +
                ", rating=" + rating +
                ", review='" + review + '\'' ;
    }

    public Rater(String companyName) {
        this.companyName = companyName;
    }

    public Rater(String companyName, int rating, String review) {
        this.companyName = companyName;
        this.rating = rating;
        this.review = review;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getRating() {
        return rating;
    }

    public void updateReview(){
        if(rating >= 3) {
            this.review = "Proudly recommended";
        }
        else{
            setReview("Needs more reviews");
        }
    }



    public void setRating(int rating) {
        if (rating <= 5){
            this.rating = rating;
            updateReview();
        }
        
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}

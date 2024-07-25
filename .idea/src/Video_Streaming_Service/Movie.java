package Video_Streaming_Service;

public class Movie extends Video {

    private double rating;

    public Movie(String title, int duration) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "Movie: " + getTitle() + " (" + getDuration() + " minutes, Rating: " + rating + ")";
    }

}

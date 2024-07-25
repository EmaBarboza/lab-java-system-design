package Video_Streaming_Service;

public class TVSeries  extends  Video{

    private int episodes;


    public TVSeries(String title, int duration) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "TV Series: " + getTitle() + " (" + getDuration() + " minutes, " + episodes + " episodes)";
    }
}

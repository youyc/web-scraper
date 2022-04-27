package GroupProject;

public class Issue {
    private String title;
    private int submission;
    private String link;
    private int number;

    public Issue (String title, int submission, String link) {

        this.title = title;
        this.submission = submission;
        this.link = link;
    }



    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setSubmission(int submission){
        this.submission = submission;
    }

    public int getSubmission(){
        return submission;
    }

    public void setLink(String link){
        this.link = link;
    }

    public String getLink(){
        return link;
    }
}

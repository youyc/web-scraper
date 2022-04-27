package GroupProject;

import java.util.ArrayList;

public class Student2 {
    private String number;
    private String matricNo;
    private String name;
    private String link;
    private String githubId;
    private int issueSubmitted;
    private int assignmentSubmitted;
//    private String[] issueNotSubmitted = new String[13];
//    private int[] issueNotSubmittedIndex = new int[13];
//    private String[] assignmentNotSubmitted = new String[3];
//    private int[] assignmentNotSubmittedIndex = new int[3];


    //url is used for preventing student submit more than 1 time in an issue
    private String url;

    public Student2(String number, String matricNo, String name, String link, String githubId, int issueSubmitted, int assignmentSubmitted,  String url ){
        this.number = number;
        this.matricNo = matricNo;
        this.name = name;
        this.link = link;
        this.githubId = githubId;
        this.issueSubmitted = issueSubmitted;
        this.assignmentSubmitted = assignmentSubmitted;
        this.url = url;
//        this.assignmentNotSubmittedIndex = assignmentNotSubmittedIndex;
//        this.assignmentNotSubmitted = assignmentNotSubmitted;
//        this.issueNotSubmittedIndex = issueNotSubmittedIndex;
//        this.issueNotSubmitted = issueNotSubmitted;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public void setMatricNo(String matricNo){
        this.matricNo = matricNo;
    }

    public String getMatricNo(){
        return matricNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLink(String link){
        this.link = link;
    }

    public String getLink(){
        return link;
    }

    public void setGithubId(String githubId) {
        this.githubId = githubId;
    }

    public String getGithubId() {
        return githubId;
    }

    public void setIssueSubmitted(int issueSubmitted) {
        this.issueSubmitted = issueSubmitted;
    }

    public int getIssueSubmitted(){
        return issueSubmitted;
    }

    public void setAssignmentSubmitted(int assignmentSubmitted){
        this.assignmentSubmitted = assignmentSubmitted;
    }

    public int getAssignmentSubmitted(){
        return assignmentSubmitted;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

//    public void setIssueNotSubmitted(String[] issueNotSubmitted) { this. issueNotSubmitted = issueNotSubmitted;}

//    public String[] getIssueNotSubmitted() { return issueNotSubmitted;}
//
//    public void setIssueNotSubmittedIndex(int[] issueNotSubmittedIndex) {this.issueNotSubmittedIndex = issueNotSubmittedIndex;}
//
//    public int[] getIssueNotSubmittedIndex(){return issueNotSubmittedIndex;}
//
//    public void setAssignmentNotSubmitted(String[] assignmentNotSubmittedNotSubmitted) { this. assignmentNotSubmitted = assignmentNotSubmitted;}
//
//    public String[] getAssignmentNotSubmitted(){return assignmentNotSubmitted;}
//
//    public void setAssignmentNotSubmittedIndex(int[] assignmentNotSubmittedIndex){this.assignmentNotSubmittedIndex = assignmentNotSubmittedIndex;}
//
//    public int[] getAssignmentNotSubmittedIndex() {return assignmentNotSubmittedIndex;}




    public double calculate_issue_percentage(int issueSubmitted, int total_issue_number){
        double submission_percentage = ((double)issueSubmitted / (double)total_issue_number) * 100;
        submission_percentage = Double.parseDouble(String.format("%.2f", submission_percentage));
        return submission_percentage;
    }

    public double calculate_assignment_percentage(int assignmentSubmitted, int total_assignment_number){
        double submission_percentage = ((double)assignmentSubmitted / (double)total_assignment_number) * 100;
        submission_percentage = Double.parseDouble(String.format("%.2f", submission_percentage));
        return submission_percentage;
    }
}

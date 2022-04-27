package GroupProject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static GroupProject.Main2.*;

public class Issue_Assignment {

    //get student submitted issue1
    public void get_url_information(String url) {




        try {
            String issue_or_assignment = null;
            Document document = Jsoup.connect(url).get();
            String title = document.title();
            Element body = document.body();
            Elements comments = body.getElementsByClass("author link-gray-dark css-truncate-target width-fit");

            //get title from each url
            System.out.println(title);
            if (url.contains("Main-Issues") && url.length() == 53) {
                title = title.replaceAll(" · Issue #" + url.substring(url.length() - 1) + " · STIW3054-A201/Main-Issues · GitHub", "");
                issue_or_assignment = "issue";
            } else if (url.contains("Main-Issues") && url.length() == 54) {
                title = title.replaceAll(" · Issue #" + url.substring(url.length() - 2) + " · STIW3054-A201/Main-Issues · GitHub", "");
                issue_or_assignment = "issue";
            } else if (url.contains("Assignments_and_Project")){
                title = title.replaceAll(" · Issue #" + url.substring(url.length() - 1) + " · STIW3054-A201/Assignments_and_Project · GitHub", "");
                issue_or_assignment = "assignment";
            }


            //+1 to student who submit issue
            int i = 0;


            for (Element comment : comments) {

                String comment_text = comment.text();


                if (i != 0) {
                    for (Student2 student : student_list) {
                        if (comment_text.equals(student.getGithubId()) && !url.equals(student.getUrl())) {
                            student.setUrl(url);

                            if (issue_or_assignment.equals("issue")) {

                                student.setIssueSubmitted(student.getIssueSubmitted() + 1);
                                //systemoutprint for showing arraylist result
                            } else if (issue_or_assignment.equals("assignment")) {

                                student.setAssignmentSubmitted(student.getAssignmentSubmitted() + 1);
                                //systemoutprint for showing arraylist result
                            }
                        }




                    }

                }
                i++;
            }
            if (issue_or_assignment.equals("issue")) {
                issue_list.add(new Issue(title, i - 1, url));
            } else if (issue_or_assignment.equals("assignment")){
                assignment_list.add(new Assignment(title, i - 1, url));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

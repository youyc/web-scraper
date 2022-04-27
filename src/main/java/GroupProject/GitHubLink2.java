package GroupProject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static GroupProject.Main2.student_list;

public class GitHubLink2 {
    //get every student link and github id
    public void get_students_github_link(String url) {
        try {
            Document document_issue1 = Jsoup.connect(url).get();;
            Element body_issue1 = document_issue1.body();
            Elements issues1 = body_issue1.getElementsByClass("d-block comment-body markdown-body  js-comment-body");
            //set link and github id to student from issue1 to object
            int i = 0;
            for (Element issue1 : issues1) {
                if (i != 0) {
                    Elements issue1_comment = issue1.getElementsByTag("p");

                    for (Student2 student : student_list) {
                        if (issue1_comment.text().contains(student.getMatricNo())) {
                            String link = issue1_comment.select("a").text();
                            String githubId = link.replaceAll("https://github.com/", "");
                            student.setLink(link);
                            student.setGithubId(githubId);
                            //systemoutprint for showing arraylist result
                        }
                    }
                }
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

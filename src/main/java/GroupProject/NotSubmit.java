package GroupProject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static GroupProject.Main2.*;
import static GroupProject.Main2.assignment_list;

public class NotSubmit implements Runnable{


    @Override
    public void run() {

        Document document;
        Document document2;
        for (int i = 0; i < Main2.issue_list.size(); i ++) {
            boolean checkIssue = false;
            try {

                document = Jsoup.connect(issue_list.get(i).getLink()).get();

                Element body = document.body();
                Elements comments = body.getElementsByClass("author link-gray-dark css-truncate-target width-fit");
                int j = 0;
                for (Element comment : comments) {
                    Thread.sleep(80);
                    if (j != 0) {


                        if (comment.text().equals(BotMessage.githubid)) {
                            checkIssue = true;

                        }
                    }
                    j++;
                }
                if (checkIssue == false) {
                    BotMessage.finalMessage2 += String.format("\n|%-2s|%-29s|", i+1, issue_list.get(i).getTitle());
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < assignment_list.size(); i ++) {
            boolean checkAssignment = false;
            try {

                document2 = Jsoup.connect(assignment_list.get(i).getLink()).get();

                Element body = document2.body();
                Elements comments = body.getElementsByClass("author link-gray-dark css-truncate-target width-fit");
                int j = 0;
                for (Element comment : comments) {
                    Thread.sleep(80);
                    if (j != 0) {

                        if (comment.text().equals(BotMessage.githubid)) {
                            checkAssignment = true;

                        }
                    }
                    j++;
                }
                if (checkAssignment == false) {
                    BotMessage.finalMessage3 += String.format("\n|%-2s|%-22s|", i+1, assignment_list.get(i).getTitle().replaceAll("_"," "));
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

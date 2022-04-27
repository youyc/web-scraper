package GroupProject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

import static GroupProject.Main2.student_list;

/**
 * This class is to read the table from the link given and store the data
 */
public class ListOfStudents2 {
    //set every student matric and name
    public void get_students_information(String url) {
        try {
            Document document_students = Jsoup.connect(url).get();;
            Element body_students = document_students.body();
            Elements students = body_students.getElementsByTag("tr");
            int i = 0;
            for (Element student : students) {
                if (i != 0) {
                    Elements student_number = student.select("td:eq(0)");
                    Elements student_matric = student.select("td:eq(1)");
                    Elements student_name = student.select("td:eq(2)");

                    student_list.add(new Student2(student_number.text(), student_matric.text(), student_name.text(), "", "", 0, 0, ""));
                    //systemoutprint for showing arraylist result
                }
                i++;
            }
            //systemoutprint for showing arraylist size result in class
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    /**
     * The main function of this class to read the table values from the web
     */


}
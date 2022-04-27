package GroupProject;

import static GroupProject.Main2.*;

public class BotMessage {


    static String welcomeMessage = "|No|Matric|Name                 |\n" +
                                   "|--|------|---------------------|\n";
    static String issueMessage = String.format("Number of issues: 14\n" +
            "-------------------------------------------\n" +
            "|%-5s|%-29s|%-5s|\n" +
            "|-----|-----------------------------|-----|\n","Issue","Title","Count");
    static String issueMessage2 = String.format("Issue Submission\n" +
            "----------------------------------------\n" +
            "|%-2s|%-6s|%-21s|%-2s|%-3s|\n" +
            "|--|------|---------------------|--|---|\n","No", "Matric", "Name", "SI",  "%");
    static String assignmentMessage = String.format("Number of assignments: 2\n" +
            "---------------------------\n" +
            "|%-5s|%-13s|%-5s|\n" +
            "|-----|-------------|-----|\n","Issue","Title","Count");

    static String assignmentMessage2 = String.format("Assignment Submission\n" +
            "----------------------------------------\n" +
            "|%-2s|%-6s|%-21s|%-2s|%-3s|\n" +
            "|--|------|---------------------|--|---|\n","No", "Matric", "Name", "SA",  "%");

    static String finalMessage;
    static String finalMessage2;
    static String finalMessage3;
    static String githubid;
    public void text() {
            String bin = "Bin";
            String ahmed = "Ahmed";
            for(int i = 0; i < 45 ; i ++) {
                if (student_list.get(i).getName().contains(bin)) {
                    int index = student_list.get(i).getName().indexOf(bin);

                    student_list.get(i).setName(student_list.get(i).getName().substring(0,index));


            } else if (student_list.get(i).getName().contains(ahmed)){
                    int index2 = student_list.get(i).getName().indexOf(ahmed);
                    student_list.get(i).setName(student_list.get(i).getName().substring(0,index2));
                }
            }
            for (int i = 0 ; i < issue_list.size() ; i ++) {
                if (issue_list.get(i).getTitle().length() > 20) {
                    issue_list.get(i).setTitle(issue_list.get(i).getTitle().replaceAll(issue_list.get(i).getTitle().substring(17),"..."));
                }
            }
        for (int i = 0 ; i < 2 ; i ++) {
            if (assignment_list.get(i).getTitle().length() > 20) {
                assignment_list.get(i).setTitle(assignment_list.get(i).getTitle().replaceAll(assignment_list.get(i).getTitle().substring(17),"..."));
            }
        }

        for (int i = 0; i < 45 ; i ++) {


            welcomeMessage += String.format("|%-2s|%-6s|%-21s|\n",student_list.get(i).getNumber(),student_list.get(i).getMatricNo(),student_list.get(i).getName());
        }


        for (int no = 0; no < issue_list.size(); no++) {
            issueMessage += String.format("|%-5s|%-29s|%-5s|\n" ,no+1,issue_list.get(no).getTitle(),issue_list.get(no).getSubmission());

        }


        for (Student2 student: student_list){
            double issue_percentage = student.calculate_issue_percentage(student.getIssueSubmitted(), issue_list.size());
            issueMessage2 += String.format("|%-2s|%-6s|%-21s|%-2s|%-3.0f|\n",student.getNumber(), student.getMatricNo(), student.getName(), student.getIssueSubmitted(), issue_percentage);
        }

        for (int no = 0; no < assignment_list.size(); no++) {
            assignmentMessage += String.format("|%-5s|%-13s|%-5s|\n" ,no+1,assignment_list.get(no).getTitle().replaceAll("_"," "),assignment_list.get(no).getSubmission());

        }

        for (Student2 student: student_list){
            double assignment_percentage = student.calculate_assignment_percentage(student.getAssignmentSubmitted(), assignment_list.size());
            assignmentMessage2 += String.format("|%-2s|%-6s|%-21s|%-2s|%-3.0f|\n",student.getNumber(), student.getMatricNo(), student.getName(), student.getAssignmentSubmitted(), assignment_percentage);
        }


    }
    public void finalText(){
        for (int i = 0; i < student_list.size(); i++){
            if (Pro_gamerr_bot.userMessage.equals(student_list.get(i).getMatricNo())) {
                githubid = student_list.get(i).getGithubId();

                finalMessage = String.format("Your request:\n" +
                        "\n"+student_list.get(i).getMatricNo()+" "+student_list.get(i).getName()+"\n" +
                        "Submitted Issues: "+student_list.get(i).getIssueSubmitted()+" "+"("+student_list.get(i).calculate_issue_percentage(student_list.get(i).getIssueSubmitted(), issue_list.size())+"%%)\n" +
                        "Submitted Assignments: "+student_list.get(i).getAssignmentSubmitted()+" "+"("+student_list.get(i).calculate_assignment_percentage(student_list.get(i).getAssignmentSubmitted(), assignment_list.size())+"%%)\n");
                finalMessage2 = String.format("\n|%-2s|%-29s|\n" +
                        "|--|-----------------------------|","No","Unsubmitted Issue");


                    finalMessage3 = String.format("\n|%-2s|%-22s|\n" +
                            "|--|----------------------|", "No", "Unsubmitted Assignment");

            NotSubmit notSubmit = new NotSubmit();
            notSubmit.run();


            }
        }


    }
    public void clear() {
        welcomeMessage = "|No|Matric|Name                 |\n" +
                "|--|------|---------------------|\n";
        issueMessage = String.format("Number of issues: 14\n" +
                "-------------------------------------------\n" +
                "|%-5s|%-29s|%-5s|\n" +
                "|-----|-----------------------------|-----|\n","Issue","Title","Count");
        issueMessage2 = String.format("Issue Submission\n" +
                "----------------------------------------\n" +
                "|%-2s|%-6s|%-21s|%-2s|%-3s|\n" +
                "|--|------|---------------------|--|---|\n","No", "Matric", "Name", "SI",  "%");
        assignmentMessage = String.format("Number of assignments: 2\n" +
                "---------------------------\n" +
                "|%-5s|%-13s|%-5s|\n" +
                "|-----|-------------|-----|\n","Issue","Title","Count");

        assignmentMessage2 = String.format("Assignment Submission\n" +
                "----------------------------------------\n" +
                "|%-2s|%-6s|%-21s|%-2s|%-3s|\n" +
                "|--|------|---------------------|--|---|\n","No", "Matric", "Name", "SA",  "%");
    }
}

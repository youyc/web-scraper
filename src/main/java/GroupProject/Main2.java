package GroupProject;


import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This class is to initialize and call the telegram bot
 */
public class Main2 {
    //global variable

    static ArrayList<Student2> student_list = new ArrayList();
    static ArrayList<Issue> issue_list = new ArrayList();
    static ArrayList<Assignment> assignment_list = new ArrayList();

    public static void main(String[] args) throws Exception {
        //student number, matric, and name
        new ListOfStudents2().get_students_information("https://github.com/STIW3054-A201/Main-Data/wiki/List_of_Student");
        //student github link and github ID
        new GitHubLink2().get_students_github_link("https://github.com/STIW3054-A201/Main-Data/issues/1");
        Core.main(null);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@&%%#%%@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@%(*,*/((((/,..    .*(&@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@,.**,,..  ....,***/(,    ,(@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@#.                 . .*(###*  ..(@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@, .                 .....   ,/#&. ..%@@@@@@@@@@@@@\n" +
                "@&#///*,...     ..                         ,.  ,@@@@@@@@@@@@\n" +
                "@@@@@@, .      .,...                     #&(  /* %@@@@@@@@@@\n" +
                "@%(/,*..      ..**.,                  .  /#, ...# *@@@@@@@@@\n" +
                "@@@@@,.       //*(/.*                 .   *, .,,*%  @@@@@@@@\n" +
                "@@@@@ .    .  /((//*/, . .,.   ..      .  *,..*(#&. ..(&@@@@\n" +
                "@@@@@.. ..... /###(,,#.*,  ,* ,  .     .. *...*%&%. @@@@@@@@\n" +
                "@@@@@.. ......   /###**%#(#**(%%,      ... .,.,/, ./@@@@@@@@\n" +
                "@@@@@% ...,..,.(.%*#%##%#%%%&&%%%..  . ,.      .   #@@@@@@@@\n" +
                "@@@@@@# ...**./(##/(%%%%%%%%%%%##/, ...,..    ..     *@@@@@@\n" +
                "@@@@@@@#.%   .,./(/#(/,#%%%%%%###(* *,*,    . ..       .@@@@\n" +
                "@@@@@@@@@#&.. ..*//(((#%%%%(#%##((.,/(,    ..,     ...   #@@\n" +
                "@@@@@@@@@@@&   . ,//((.,(#(####(/*,*/.     ,    .,,, ,.  &@@\n" +
                "@@@@@@@@@@@@/  .*, .///((((##((***,*.  .   ..,.,, .    (@@@@\n" +
                "@@@@@@@@@@@@/@ ./@@  @&/(#((/(/**,,   .  .,   ,,.    &@@@@@@\n" +
                "@@@@@@@&%#(&@@(@(%@@*@@@@*    */,...      .,.    .(@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@         ...           #@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@&     ......        ,(&@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@.  ...  ..     (@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@#    .*/#@@@@@@@@@@@@@@@@@@@@@@@@@@\n");


        // Initialize Api Context
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);


        // Instantiate Telegram Bots API


        // Register our bot
        try {
            telegramBotsApi.registerBot(new Pro_gamerr_bot());


        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

package GroupProject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Core {
    static String replyText = "";
    public static void main(String[] args) throws Exception {

        int coreCount = Runtime.getRuntime().availableProcessors();


        Runnable issue1 = new Issue1();
        Runnable issue2 = new Issue2();
        Runnable issue3 = new Issue3();
        Runnable issue4 = new Issue4();
        Runnable issue5 = new Issue5();
        Runnable issue6 = new Issue6();
        Runnable issue7 = new Issue7();
        Runnable issue8 = new Issue8();
        Runnable issue9 = new Issue9();
        Runnable issue10 = new Issue10();
        Runnable issue11 = new Issue11();
        Runnable issue12 = new Issue12();
        Runnable issue13 = new Issue13();
        Runnable issue14 = new Issue14();
        Runnable assignment1 = new Assignment1();
        Runnable assignment2 = new Assignment2();


        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);

        executorService.execute(issue1);
        executorService.execute(issue2);
        executorService.execute(issue3);
        executorService.execute(issue4);
        executorService.execute(issue5);
        executorService.execute(issue6);
        executorService.execute(issue7);
        executorService.execute(issue8);
        executorService.execute(issue9);
        executorService.execute(issue10);
        executorService.execute(issue11);
        executorService.execute(issue12);
        executorService.execute(issue13);
        executorService.execute(issue14);
        executorService.execute(assignment1);
        executorService.execute(assignment2);


        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60000, TimeUnit.MILLISECONDS)) {
                executorService.shutdownNow();

                replyText = "I'm Terminated";
            }
            else {
                replyText = "I'm Ready";
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

    }
}

class Issue1 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/1");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Issue2 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/2");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Issue3 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/3");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Issue4 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/4");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Issue5 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/5");
        double time = (System.currentTimeMillis() - startTime);

    }
}
class Issue6 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/6");
        double time = (System.currentTimeMillis() - startTime);

    }
}
class Issue7 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/7");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Issue8 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/8");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Issue9 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/9");
        double time = (System.currentTimeMillis() - startTime);

    }
}
class Issue10 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/10");
        double time = (System.currentTimeMillis() - startTime);

    }
}
class Issue11 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/11");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Issue12 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/12");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Issue13 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/13");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Issue14 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Main-Issues/issues/14");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Assignment1 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Assignments_and_Project/issues/1");
        double time = (System.currentTimeMillis() - startTime);

    }
}

class Assignment2 implements Runnable{
    @Override
    public void run() {
        double startTime = System.currentTimeMillis();;
        new Issue_Assignment().get_url_information("https://github.com/STIW3054-A201/Assignments_and_Project/issues/2");
        double time = (System.currentTimeMillis() - startTime);

    }
}



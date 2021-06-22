package template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Brew coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Add sugar (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error");
        }
        if(answer == null) {
            answer = "no";
        }
        return answer;
    }
}

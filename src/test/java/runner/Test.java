package runner;

import ask.auto.App;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        App app = new App();
        String response1 = app.getRequest("https://reqres.in/api/users?page=2");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(response1);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String response2 = app.postRequest("https://reqres.in/api/users");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(response2);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}

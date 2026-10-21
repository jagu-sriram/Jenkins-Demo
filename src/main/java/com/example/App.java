
package com.example;

public class App {

    public String getMessage() {
        return "Hello from Jenkins Maven Project!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }
}

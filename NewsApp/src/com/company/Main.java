package com.company;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        while (true){
            try {
                Thread.sleep(5000000);
                timer.schedule(new NewsGenerator(),5000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

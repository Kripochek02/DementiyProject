package com.example.dementiy.placeholder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class gdfgdf {

    class Answer extends Thread {
        String str;
        public Answer(String str) {
            this.str = str;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.print(i);
                try {
                    Thread t1 = new Answer(str);
                    Thread t2 = new Answer(str);
                    t1.start();
                    t2.start();
                    sleep(10);
                } catch (InterruptedException e) {}
            }
        }
    }
}

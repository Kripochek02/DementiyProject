package com.example.dementiy.placeholder;

import static java.lang.System.in;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SchoolMain {
    public static void main(String[] args) {
        Student student = new Student("ЯН", 3);
        Student student1 = new Student("Денчик", 5);
        try {
            File f = new File("C:\\OOPConstruct2-master\\app\\src\\main\\Dementiy2\\app\\src\\main\\java\\com\\example\\dementiy\\placeholder\\in.txt");
            Scanner s = new Scanner(f);
            int a = s.nextInt();
            int b = s.nextInt();
            student.division(a, b);
            student1.division(a, b);
        } catch (FileNotFoundException e ) {
            System.out.println("Ошибка с файлом");
        } catch (MyFirstException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Я всегда работаю");
        }
    }
}

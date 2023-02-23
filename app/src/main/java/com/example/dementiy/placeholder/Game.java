package com.example.dementiy.placeholder;

import androidx.annotation.NonNull;

import java.util.Scanner;

public class Game {
    public Story story;
    public Character character;

    public Game(Story story, Character c) {
        this.story = story;
        this.character = character;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи своё имя");
        String name = in.nextLine();
        Character c = new Character(name, 100, 100, 100);
        Situation start = createStory();
        Story story = new Story(start);
        Game g = new Game(story, c);
        g.start();
    }

    public static Situation createStory() {
        Situation start = new Situation( "оказался в лесу. на развилке","1 - пойдем налево, 2 - прямо, 3 - направо", 0,0,0, 3);
        start.direction[0] = new Situation("Тут болото. Что дальше?", "1 - идем назад, 2 - переходим", 0, -50, -1, 2);
        start.direction[0].direction[0] = start;
        start.direction[0].direction[1] = new Situation("Конец", "", 0,0,0,0);
        start.direction[1] = new Situation("Тут пропасть. Что дальше?,", "конец", 0, -50, -1, 0);
        start.direction[2] = new Situation( "Тут замок. Что дальше?", "1 - идем назад, 2 - открываем дверь", 0, -50, -1, 2);
        start.direction[2].direction[1] = start;
        start.direction[3].direction[1] = new Situation( "На вас напал дракон", "1 - идем назад, 2 - сражаемся с ним", 0, -50, -1, 2);
        start.direction[3] = new Situation( "Вас ранили", "1 - отсутупаем, 2 - продолжаем сражаться", 0, -50, -1, 2);
        start.direction[3].direction[1] = start;
        return start;
    }



    private void show() {
        System.out.println(this.story.currentSituation.text);
        System.out.println(this.story.currentSituation.subject);
        if (this.story.isEnd()) {
            return;
        }
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        this.story.go(a);
    }
    public void start() {
        while (true) {
            this.show();
            if (this.story.isEnd()) {
                break;
            }
        }
        this.show();
    }
}

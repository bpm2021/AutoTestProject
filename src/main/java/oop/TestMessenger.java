package oop;

import oop.classes.Messenger;
import oop.classes.Telegram;
import oop.classes.Viber;

public class TestMessenger {

    public static void main(String[] args) {

        Messenger telegram = new Telegram();
        Messenger viber    = new Viber();

        telegram.sendMessenger();
        telegram.getMessenger();

        viber.sendMessenger();
        viber.getMessenger();

    }
}

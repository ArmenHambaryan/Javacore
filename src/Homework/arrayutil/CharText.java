package Homework.arrayutil;

public class CharText {
    public static void main(String[] args) {
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ')
                System.out.print(text[i]);

        }
    }
}

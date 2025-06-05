package com.dr.wordgame;

public class App {
    public static void main(String[] args) {
        String[] words = {"java","programming","class", "computer", "method" };
        WordGuessingGame game = new WordGuessingGame(words, 3); 
        game.play();
    }
}

package com.meme.memes;

/**
 * Meme
 */
public class Meme {
    private String id;
    private String text;

    public Meme() {
        String id = "";
        for (int i = 0; i < 10; i++) {
            id += Double.valueOf(Math.floor(Math.random() * 10)).toString();
        }
        this.id = id;
        this.text = "";
    }

    public Meme(String text) {
        this();
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public Meme setText(String text) {
        this.text = text;
        return this;
    }

    public String getId() {
        return this.id;
    }
}

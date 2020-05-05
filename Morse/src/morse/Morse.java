/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

/**
 *
 * @author Hi-XV
 */
public class Morse {

    private String word, sound;

    public Morse(String word, String sound) {
        this.word = word;
        this.sound = sound;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getWord() {
        return word;
    }

    public String getSound() {
        return sound;
    }

}

/*
 * Copyright (c) 2016. The League of Amazing Programmers. All Rights Reserved.
 */

package org.jointheleague.resources.leaguesoundsexample;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Stephen Cerruti on 11/19/16.
 */
public class PlayBatman {
    public static void main(String... args) {
        // open the sound file as a Java input stream

        InputStream in = PlayBatman.class.getResourceAsStream("/batman.wav");

        // create an audiostream from the inputstream
        AudioStream audioStream = null;
        try {
            audioStream = new AudioStream(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
    }
}

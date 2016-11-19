/*
 * Copyright (c) 2016. The League of Amazing Programmers. All Rights Reserved.
 */

package org.jointheleague.resources.leaguesoundsexample;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * This test checks whether the resources are correctly made available by maven.
 *
 * Created by Stephen Cerruti on 11/19/16.
 */
public class ResourceFileTest {
    @Test
    public void resourceFilePresent() throws Exception {
        assertNotNull(PlayBatman.class.getResource("/batman.wav"));

    }
}
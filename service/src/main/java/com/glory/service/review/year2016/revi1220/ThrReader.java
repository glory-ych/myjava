package com.glory.service.review.year2016.revi1220;

import java.io.IOException;
import java.io.PipedReader;

/**
 * Created by yangch on 2016/12/20 0020.
 */
public class ThrReader implements Runnable {
    private PipedReader pipedReader;

    public ThrReader(PipedReader pipedReader) {
        this.pipedReader = pipedReader;
    }

    @Override
    public void run() {
        try {
            while (true) {
                  System.out.println((char)pipedReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

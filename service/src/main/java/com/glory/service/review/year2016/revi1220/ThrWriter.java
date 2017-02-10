package com.glory.service.review.year2016.revi1220;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * Created by yangch on 2016/12/20 0020.
 */
public class ThrWriter implements Runnable {
    private PipedWriter pipedWriter;

    public ThrWriter(PipedWriter pipedWriter) {
        this.pipedWriter = pipedWriter;
    }

    @Override
    public void run() {
        try {
            while (true) {
                pipedWriter.write("hello world");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.sergeydolgozvjaga.personexample;

import com.sergeydolgozvjaga.personexample.View.ViewFrame;

import java.awt.*;
import java.util.logging.Logger;

/**
* Class Main
*
* @Author Dolgozvjaga Sergey 20.03.18
* @since 1.01
* */
public class Main implements Runnable {

    private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        EventQueue.invokeLater(new Main());
    }

    @Override
    public void run() {

        logger.info("start app");
        ViewFrame frame = new ViewFrame();
        frame.setVisible(false);
        logger.info("exiting app");
    }
}
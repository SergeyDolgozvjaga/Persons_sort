package com.sergeydolgozvjaga.personexample.View;

import javax.swing.*;
import java.util.logging.Logger;

/**
* Class contain sizes of frame, that we can print
* also contain all Panels
* */
public class ViewFrame extends JFrame {

    private final Logger logger = Logger.getLogger(String.valueOf(ViewFrame.class));

   private Panels panels;
   private MenuPanel menuPanel;

    public ViewFrame(){
        initUI();
    }

    /**
    * Method initiate frame, that will show app window
    * */
    private void initUI() {

        logger.info("start initUI");
        panels = new Panels();
        menuPanel = new MenuPanel();

        JFrame frame = new JFrame();
        // set window size
        frame.setSize(700, 600);
        frame.setTitle("Sorted List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setJMenuBar(menuPanel.menuBarPanel());
        frame.add(panels);

        frame.setVisible(true);
        logger.info("exit initUI");
    }
}
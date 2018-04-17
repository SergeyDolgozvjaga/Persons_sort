package com.sergeydolgozvjaga.personexample.View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.logging.Logger;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
* Class describes JPanel with Menu
* */
public class MenuPanel extends JMenuBar {

    private final Logger logger = Logger.getLogger(String.valueOf(MenuPanel.class));

    // set font for menu
    Font font = new Font("Verdana", Font.PLAIN, 12);

    /**
     * Method create JMenuBar
     * FileMenu add to JMenuBar
     *
     * @return JMenuBar with add FileMenu
     */
    public JMenuBar menuBarPanel(){

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu());
        return menuBar;
    }

    /**
    * Method create JMenu
    * Some FileMenuItem add to JMenu
    * newMenu() add to JMenu
    * @return JMenu with add FileMenuItem
    * */
    private JMenu fileMenu(){

        logger.info("start fileMenu()");
        JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(font);

        fileMenu.add(newMenu());

        fileMenu.add(openItem());
        fileMenu.add(closeItem());
        fileMenu.add(closeAllItem());
        fileMenu.addSeparator();
        fileMenu.add(exitItem());

        logger.info("exit fileMenu()");
        return fileMenu;
    }

    /**
    * Method create JMenu
    * Some FileMenuItem add to JMenu
    * @return JMenu with add FileMenuItem
    * */
    private JMenu newMenu(){

        logger.info("start newMenu");
        JMenu newMenu = new JMenu("New");
        newMenu.setFont(font);

        newMenu.add(txtFileItem());
        newMenu.add(imgFileItem());
        newMenu.addSeparator();
        newMenu.add(folderItem());

        logger.info("exit newMenu()");
        return newMenu;
    }

    /**
    * Method create JMenuItem
    * add listener to JMenuItem
    * @return JMenuItem
    * */
    private JMenuItem openItem(){
        logger.info("start openItem");
        JMenuItem openItem = new JMenuItem("Open");
        openItem.setFont(font);
        openItem.addActionListener((ActionEvent e) -> {
            System.out.println("In progress...");
        });
        logger.info("exit openItem");
        return openItem;

    }

    /**
     * Method create JMenuItem
     * add listener to JMenuItem
     *
     * @return JMenuItem
     * */
    private JMenuItem closeItem(){
        logger.info("start closeItem");
        JMenuItem closeItem = new JMenuItem("Close");
        closeItem.setFont(font);
        closeItem.addActionListener((ActionEvent e) -> {
            System.out.println("In progress...");
        });
        logger.info("exit closeItem");
        return closeItem;
    }

    /**
     * Method create JMenuItem
     * add listener to JMenuItem
     *
     * @return JMenuItem
     * */
    private JMenuItem closeAllItem(){
        logger.info("start closeAllItem");
        JMenuItem closeAllItem = new JMenuItem("Close all");
        closeAllItem.setFont(font);
        closeAllItem.addActionListener((ActionEvent e) -> {
            System.out.println("In progress...");
        });
        logger.info("exit closeAllItem");
        return closeAllItem;
    }

    /**
     * Method create JMenuItem
     * add listener to JMenuItem
     *
     * @return JMenuItem
     * */
    private JMenuItem exitItem(){
        logger.info("start exitItem");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        exitItem.addActionListener((ActionEvent e) -> {
            System.out.println("Exit");
            System.exit(0);
        });
        logger.info("exit exitItem");
        return exitItem;
    }

    /**
     * Method create JMenuItem
     * add listener to JMenuItem
     *
     * @return JMenuItem
     * */
    private JMenuItem txtFileItem(){
        logger.info("start txtFileItem");
        JMenuItem txtFileItem = new JMenuItem("Text file");
        txtFileItem.setFont(font);
        txtFileItem.addActionListener((ActionEvent e) -> {
            System.out.println("In progress...");
        });
        logger.info("exit txtFileItem");
        return txtFileItem;
    }

    /**
     * Method create JMenuItem
     * add listener to JMenuItem
     *
     * @return JMenuItem
     * */
    private JMenuItem imgFileItem(){
        logger.info("start imgFileItem");
        JMenuItem imgFileItem = new JMenuItem("Image file");
        imgFileItem.setFont(font);
        imgFileItem.addActionListener((ActionEvent e) -> {
            System.out.println("In progress...");
        });
        logger.info("exit imgFileItem");
        return imgFileItem;
    }

    /**
     * Method create JMenuItem
     * add listener to JMenuItem
     *
     * @return JMenuItem
     * */
    private JMenuItem folderItem(){
        logger.info("start folderItem");
        JMenuItem folderItem = new JMenuItem("Folder");
        folderItem.setFont(font);
        folderItem.addActionListener((ActionEvent e) -> {
            System.out.println("In progress...");
        });
        logger.info("exit folderItem");
        return folderItem;
    }
}
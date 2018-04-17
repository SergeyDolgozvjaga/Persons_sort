package com.sergeydolgozvjaga.personexample.View;

import com.sergeydolgozvjaga.personexample.PersonSort;
import com.sergeydolgozvjaga.personexample.Serialized;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Logger;

/**
* Class describes JPanels, that will show view
* */
public class Panels extends JPanel {

    private final Logger logger = Logger.getLogger(String.valueOf(Panels.class));

    private PersonSort sort;
    private Serialized serialized;
    private JTextArea  area;
    private JScrollPane scrollPane;

    public Panels() {
        super(new BorderLayout());
        this.add(exitPanel(), BorderLayout.SOUTH);
        this.add(sortPanel(), BorderLayout.WEST);
        this.add(showTextPanel(), BorderLayout.CENTER);
    }

    /**
    * Method create Panel with buttons,
    * that sorted Person list in different ways
    *
    * @return Panel with different buttons on it
    * */
    private JPanel sortPanel(){
        logger.info("start sortPanel()");
        area = new JTextArea();
        serialized = new Serialized();
        sort = new PersonSort();

        JPanel sortPanel = new JPanel();
        sortPanel.setLayout(new GridLayout(6,1));

        sortPanel.add(btnUnsorted());
        sortPanel.add(btnSortByName());
        sortPanel.add(btnSortByAge());
        sortPanel.add(btnShowNames());
        sortPanel.add(btnSerialize());
        sortPanel.add(btnDeserialize());

        logger.info("exit sortPanel()");
        return sortPanel;
    }

    /**
    * Method create Panel, that contain button "Exit"
    * @return Panel with button Exit
    * */
    private JPanel exitPanel(){

        JPanel exitPanel = new JPanel();
        exitPanel.add(btnExit());
        return exitPanel;
    }

    /**
    * Method create Panel, that show text area
    * @return Panel with JTextArea with scrollPanes (horizontal and vertical)
    * */
    private JPanel showTextPanel(){
        logger.info("start showTextPanel()");
        area = new JTextArea(30, 35);
        // don't editable TextArea
        area.setEditable(false);

        JPanel showTextPanel = new JPanel();
        // vertical and horizontal JScrollPane
        scrollPane = new JScrollPane(area);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        showTextPanel.add(scrollPane);
        logger.info("exit showTextPanel");
        return showTextPanel;
    }

    /**
    * Method create Button "Exit"
    * @return close application
    * */
    private JButton btnExit(){
        logger.info("start btnExit()");
        JButton btnExit= new JButton("Exit");
        btnExit.addActionListener((ActionEvent e) -> {
            System.out.println("Exit");
            System.exit(0);
        });
        logger.info("exit btnExit()");
        return btnExit;
    }

    /**
    * Method create Button "Serialize to file"
    * @return white Persons list to file "person.dat"
    * */
    private JButton btnSerialize(){
        logger.info("start btnSerialize");
        JButton btnSerialize = new JButton("Serialize to file");
        btnSerialize.addActionListener((ActionEvent e) -> {
            serialized.serialize();
            area.setText("DATA IS SERIALIZE TO FILE");
        });
        logger.info("exit btnSerialize");
        return btnSerialize;
    }

    /**
    * Method create Button "Deserialize from file"
    * @return deserialize Person list
    * */
    private JButton btnDeserialize(){
        logger.info("start btnDeserialize");
        JButton btnDeserialize = new JButton("Deserialize from file");
        btnDeserialize.addActionListener((ActionEvent e) -> {
            serialized.deserialize();
        });
        logger.info("exit btnDeserialize");
        return btnDeserialize;
    }

    /**
    * Method create Button "Sort by Name"
    * @return show list Person, sort by Name
    * */
    private JButton btnSortByName() {
        logger.info("start btnSortByName");
        JButton btnSortByName = new JButton("Sort by Name");
        btnSortByName.addActionListener((ActionEvent e) -> {
            area.setText(sort.stringPersonSortByName());
        });
        logger.info("exit btnSortByName");
        return btnSortByName;
    }

    /**
    * Method create Button "Sort by Age"
    * @return show list Person, sort by Age
    * */
    private JButton btnSortByAge(){
        logger.info("start btnSortByAge");
        JButton btnSortByAge = new JButton("Sort by Age");
        btnSortByAge.addActionListener((ActionEvent e) -> {
            area.setText(sort.stringPersonSortByAge());
        });
        logger.info("exit btnSortByAge");
        return btnSortByAge;
    }

    /**
    * Method create Button "Show only Names"
    * @return show Names of Person list
    * */
    private JButton btnShowNames(){
        logger.info("btnShowNames");
        JButton btnShowNames = new JButton("Show only Names");
        btnShowNames.addActionListener((ActionEvent e) -> {
            area.setText(sort.stringGetAllNames());
        });
        logger.info("btnShowNames");
        return btnShowNames;
    }

    /**
    * Method create Button "Sort by ID"
    * @return show Person list, also it's a unsorted list - because list sorted "by Id" by default
    * */
    private JButton btnUnsorted(){
        logger.info("start btnUnsorted");
        JButton btnUnsorted = new JButton("Sort by ID");
        btnUnsorted.addActionListener((ActionEvent e) -> {
            area.setText(sort.stringPersonList());
        });
        logger.info("exit btnUnsorted");
        return btnUnsorted;
    }
}

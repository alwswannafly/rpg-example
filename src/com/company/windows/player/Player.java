package com.company.windows.player;

import javax.swing.*;
import java.awt.*;
import com.company.models.PlayerModel;

public class Player extends JPanel {
    // TODO: - realize with RPG-10

    private JButton close;

    public Player(){
        setLayout(new GridLayout(1, 6));
        add(new StatsofPlayer());
        add(new ActivatedObj());
        add(new Inventory());
        setupclose();
    }
    void setupclose(){
        close = new JButton("X");
//        setBounds(620, 20, 40, 30);
        add(close);
    }



    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}
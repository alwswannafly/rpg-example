package com.company.windows.player;

import javax.swing.*;
import java.awt.*;

public class Player extends JPanel {
    // TODO: - realize with RPG-10

    private Image background, Hp, Intellegt, Speed, Mana;
    private int Level, Exp;
    private Label Hp_l, Intellegt_l, Speed_l, Mana_l;

    public Player(){
        setFocusable(true);

        Hp_l = new Label("|");
        Hp_l.setForeground(Color.RED);
        Hp_l.setFont(new Font("serif", 0,15));
//        Hp_l.setBounds();
        add(this.Hp_l);


    }
}
package com.company.windows;

import com.company.windows.menu.Menu;
import javax.swing.*;

public class Window extends JFrame {
    public Window() {
        setVisible(true);
        setSize(640, 480);
        setTitle("Game");

        // TODO: - realize with RPG-12

        // Change panel only for test your task!
        getContentPane().add(new Menu());
    }
}

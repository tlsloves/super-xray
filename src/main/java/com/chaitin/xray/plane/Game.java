package com.chaitin.xray.plane;

import javax.swing.*;

public class Game extends JFrame {
    static Home h;

    public static void start() {
        h = new Home();
        h.setVisible(true);
        h.setResizable(false);
    }
}

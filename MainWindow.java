package com.unpri.charactermanager.view;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {

    public MainWindow(List<String> daftarKarakter) {
        // 1. Mengatur Title Bar dan Ukuran Jendela
        setTitle("Aplikasi Data Karakter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Memosisikan jendela di tengah layar

        // 2. Membuat panel utama dengan Layout Manager
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Judul Header
        JLabel headerLabel = new JLabel("Daftar Karakter:");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        mainPanel.add(headerLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // 3. Menampilkan Data Karakter secara DINAMIS (Menggunakan Loop)
        for (String karakter : daftarKarakter) {
            JLabel labelKarakter = new JLabel("• " + karakter);
            labelKarakter.setFont(new Font("Arial", Font.PLAIN, 14));
            mainPanel.add(labelKarakter);
            mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        }

        // Menambahkan panel ke dalam JFrame
        add(new JScrollPane(mainPanel));
    }
}
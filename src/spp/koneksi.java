/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SMKN1Rembang-PC
 */
public class koneksi {
    public static Connection conn;
    public static Connection getConnection(){
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/upkspp","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
        return conn;
    }
}

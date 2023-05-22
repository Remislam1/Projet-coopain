/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coopain.DAO;

import coopain.model.Demande;
import coopain.technic.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class DemandeDAO implements DemandeDAOInterface {

    public void create(Demande demande) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO demande (ID_ADHERENT, ID_TYPEPA, IDNATIONALTAUREAU, , IDNATIONALVACHE,) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, demande.getAdherent());
            ps.setString(2, demande.getPaillette());
            ps.setString(3, demande.getTaureau());
            ps.setString(4, demande.getVache());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de la demande");
        }
    }



}

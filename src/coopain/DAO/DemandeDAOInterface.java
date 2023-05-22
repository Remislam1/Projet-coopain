/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package coopain.DAO;
import coopain.model.Demande;
import java.util.TreeMap;

/**
 *
 * @author patrick DUPRE
 */
public interface DemandeDAOInterface {
    public static void create(Demande demande) {}
    public static void update(Demande demande) {}
    public static void delete(String demande) {}
    public static Demande getLDemande(String demande) {
        Demande ut = new Demande();
        
        return ut;
    }
    public static TreeMap<String, Demande> getLesDemandes() {
        TreeMap<String, Demande> lesDe = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        return lesDe;
    }
            
 
}
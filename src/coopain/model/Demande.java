/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coopain.model;

/**
 *
 * @author r.pontello
 */
public class Demande {

    private String adherent;
    private String secteur;
    private String taureau;
    private String race;
    private String vache;

    public Demande(String adherent, String secteur, String taureau, String race, String vache) {
        this.adherent = adherent;
        this.secteur = secteur;
        this.taureau = taureau;
        this.race = race;
        this.vache = vache;
    }

    public Demande() {
    }

    public String getAdherent() {
        return adherent;
    }

    public void setAdherent(String adherent) {
        this.adherent = adherent;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getTaureau() {
        return taureau;
    }

    public void setTaureau(String taureau) {
        this.taureau = taureau;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getVache() {
        return vache;
    }

    public void setVache(String vache) {
        this.vache = vache;
    }

}

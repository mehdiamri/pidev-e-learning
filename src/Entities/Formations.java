/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;




/**
 *
 * @author AMINE N
 */
public class Formations {
    private int Id;
    private String Objet;
    private String Type;
    private String Objectif;
    private int nb_participants;
    private float cout_hj;
    private int nb_jour;
    private float cout_fin;
    private Date date_reelle;
    private Date date_prevu;
    private String path;
    private String Rapport;
    private int Note;
    private String categorie;
    private int id_formateur;

    public Formations(int Id, String Objet, String Type, String Objectif, int nb_participants, float cout_hj, int nb_jour, float cout_fin, Date date_reelle, Date date_prevu) {
        this.Id = Id;
        this.Objet = Objet;
        this.Type = Type;
        this.Objectif = Objectif;
        this.nb_participants = nb_participants;
        this.cout_hj = cout_hj;
        this.nb_jour = nb_jour;
        this.cout_fin = cout_fin;
        this.date_reelle = date_reelle;
        this.date_prevu = date_prevu;
    }

    public Formations(String Objet, String Type, String Objectif, int nb_participants, float cout_hj, int nb_jour, float cout_fin, Date date_reelle, Date date_prevu, String path, int id_formateur) {
        this.Objet = Objet;
        this.Type = Type;
        this.Objectif = Objectif;
        this.nb_participants = nb_participants;
        this.cout_hj = cout_hj;
        this.nb_jour = nb_jour;
        this.cout_fin = cout_fin;
        this.date_reelle = date_reelle;
        this.date_prevu = date_prevu;
        this.path = path;
        this.id_formateur = id_formateur;
    }

    public int getId_formateur() {
        return id_formateur;
    }

    public void setId_formateur(int id_formateur) {
        this.id_formateur = id_formateur;
    }
    

    public Formations(String Objet, String Type, String Objectif, int nb_participants, float cout_hj, int nb_jour, float cout_fin, String Rapport, int Note) {
        this.Objet = Objet;
        this.Type = Type;
        this.Objectif = Objectif;
        this.nb_participants = nb_participants;
        this.cout_hj = cout_hj;
        this.nb_jour = nb_jour;
        this.cout_fin = cout_fin;
        this.Rapport = Rapport;
        this.Note = Note;
    }

    public Formations() {
    }

    public Formations(String Objet, String Type, String Objectif, int nb_participants, float cout_hj, int nb_jour, float cout_fin, Date date_reelle, Date date_prevu,String path) {
        this.Objet = Objet;
        this.Type = Type;
        this.Objectif = Objectif;
        this.nb_participants = nb_participants;
        this.cout_hj = cout_hj;
        this.nb_jour = nb_jour;
        this.cout_fin = cout_fin;
        this.date_reelle = date_reelle;
        this.date_prevu = date_prevu;
        this.path=path;
    }

    public Formations(int Id, String Objet, String Type, String Objectif, int nb_participants, float cout_hj, int nb_jour, float cout_fin, Date date_reelle, Date date_prevu, String path) {
        this.Id = Id;
        this.Objet = Objet;
        this.Type = Type;
        this.Objectif = Objectif;
        this.nb_participants = nb_participants;
        this.cout_hj = cout_hj;
        this.nb_jour = nb_jour;
        this.cout_fin = cout_fin;
        this.date_reelle = date_reelle;
        this.date_prevu = date_prevu;
        this.path = path;
    }

    public Formations(int Id, String Objet, String Type, String Objectif, int nb_participants, float cout_hj, int nb_jour, float cout_fin, String path) {
        this.Id = Id;
        this.Objet = Objet;
        this.Type = Type;
        this.Objectif = Objectif;
        this.nb_participants = nb_participants;
        this.cout_hj = cout_hj;
        this.nb_jour = nb_jour;
        this.cout_fin = cout_fin;
        this.path = path;
    }

    public Formations(String Objet, String Type, String Objectif, int nb_participants, float cout_hj, int nb_jour, float cout_fin, Date date_reelle, Date date_prevu, String path, String categorie) {
        this.Objet = Objet;
        this.Type = Type;
        this.Objectif = Objectif;
        this.nb_participants = nb_participants;
        this.cout_hj = cout_hj;
        this.nb_jour = nb_jour;
        this.cout_fin = cout_fin;
        this.date_reelle = date_reelle;
        this.date_prevu = date_prevu;
        this.path = path;
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getObjet() {
        return Objet;
    }

    public void setObjet(String Objet) {
        this.Objet = Objet;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getObjectif() {
        return Objectif;
    }

    public void setObjectif(String Objectif) {
        this.Objectif = Objectif;
    }

    public int getNb_participants() {
        return nb_participants;
    }

    public void setNb_participants(int nb_participants) {
        this.nb_participants = nb_participants;
    }

    public float getCout_hj() {
        return cout_hj;
    }

    public Formations(int Id, String Objet, String Type, String Objectif, int nb_participants, float cout_hj, int nb_jour, float cout_fin, Date date_reelle, Date date_prevu, String path, String categorie) {
        this.Id = Id;
        this.Objet = Objet;
        this.Type = Type;
        this.Objectif = Objectif;
        this.nb_participants = nb_participants;
        this.cout_hj = cout_hj;
        this.nb_jour = nb_jour;
        this.cout_fin = cout_fin;
        this.date_reelle = date_reelle;
        this.date_prevu = date_prevu;
        this.path = path;
        this.categorie = categorie;
    }

    public void setCout_hj(float cout_hj) {
        this.cout_hj = cout_hj;
    }

    public int getNb_jour() {
        return nb_jour;
    }

    public void setNb_jour(int nb_jour) {
        this.nb_jour = nb_jour;
    }

    public float getCout_fin() {
        return cout_fin;
    }

    public void setCout_fin(float cout_fin) {
        this.cout_fin = cout_fin;
    }

    public Date getDate_reelle() {
        return date_reelle;
    }

    public void setDate_reelle(Date date_reelle) {
        this.date_reelle = date_reelle;
    }

    public Date getDate_prevu() {
        return date_prevu;
    }

    public void setDate_prevu(Date date_prevu) {
        this.date_prevu = date_prevu;
    }
  
}

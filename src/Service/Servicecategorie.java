/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entities.categorie;
import Entities.reclamation;

import Services.IServicecategorie;
import Utils.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author rania
 */
public class Servicecategorie implements IServicecategorie{
     Connection cnx;

    public Servicecategorie() {
        cnx=cnx=Connexion.getInstance().getConnexion();
    }
    

    @Override
    public void ajouter_categorie(categorie c) {
        try {
            Statement stm=cnx.createStatement(); 
            String query="INSERT INTO categorie (nom,type,description) VALUES ('"+c.getNom()+"','"+c.getType()+"','"+c.getDescription()+"')";
             Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
alert.setTitle("Confirmation Dialog");
alert.setHeaderText("Confirmation ");
alert.setContentText("Etes vous sur de vouloir ajouter cette categorie ?");

Optional<ButtonType> result = alert.showAndWait();
if (result.get() == ButtonType.OK){
    stm.executeUpdate(query); 
    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
            alert2.setTitle("Ajout");
            alert2.setHeaderText("Categorie ajoutée");
            alert2.setContentText("La categorie a été ajouter avec success!");
            alert2.showAndWait();}
            
        } catch (SQLException ex) {
            Logger.getLogger(Servicecategorie.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     
    }

    @Override
    public ObservableList<categorie> Afficher_categorie() {
        ObservableList<categorie>categories=FXCollections.observableArrayList();
 
        try {
             Statement  stm;
             stm= cnx.createStatement();
             String query="Select * from `categorie`";
             ResultSet rst=stm.executeQuery(query); 
             while (rst.next()){
                categorie c =new categorie();
                 c.setId_categorie(rst.getInt("id_categorie"));
                 c.setNom(rst.getString("nom"));
                  c.setType(rst.getString("type"));
                 c.setDescription(rst.getString("description"));
                 categories.add(c);
                     
             }
                  
        } catch (SQLException ex) {
            Logger.getLogger(Servicereclamation.class.getName()).log(Level.SEVERE, null, ex);
        }
         return categories;
}

    @Override
    public void supprimer_categorie(int id_categorie) {
         try {
            Statement stm=cnx.createStatement();
            String query=" Delete FROM categorie where id_categorie='"+id_categorie+"'";
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
alert.setTitle("Confirmation Dialog");
alert.setHeaderText("Confirmation ");
alert.setContentText("Etes vous sur de vouloir supprimer cette categorie?");

Optional<ButtonType> result = alert.showAndWait();
if (result.get() == ButtonType.OK){
    stm.executeUpdate(query);
    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
            alert2.setTitle("Suppression");
            alert2.setHeaderText("Categorie Supprimé");
            alert2.setContentText("La categorie a été supprimer avec success!");
            alert2.showAndWait();}
        } catch (SQLException ex) {
            Logger.getLogger(Servicecategorie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier_categorie(categorie c) {
         try {

        PreparedStatement ps;

        ps=cnx.prepareStatement("UPDATE  categorie set `nom`=?,`type`=?,`description`=? where id_categorie="+c.getId_categorie());
        ps.setString(1, c.getNom());
        ps.setString(2,c.getType());
        ps.setString(3,c.getDescription());
        ps.executeUpdate();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Update");
            alert.setHeaderText("Categorie Modifiée");
            alert.setContentText("La categorie a été modifier avec success!");
            alert.showAndWait();
             System.out.println("modifier");
//alert.showAndWait();
    } catch (SQLException ex) {
        Logger.getLogger(Servicereclamation.class.getName()).log(Level.SEVERE, null, ex);
    }

    
    
}

    public ObservableList<categorie> triASC() {
ObservableList<categorie>categories=FXCollections.observableArrayList();
 
        try {
             Statement  stm;
             stm= cnx.createStatement();
             String query="Select * from `categorie` ORDER BY nom ASC";
             ResultSet rst=stm.executeQuery(query); 
             while (rst.next()){
                 categorie c=new categorie();
                 c.setId_categorie(rst.getInt("id_categorie"));
                 c.setNom(rst.getString("nom"));
                  c.setType(rst.getString("type"));
                 c.setDescription(rst.getString("description"));
                 categories.add(c);
                     
             }
                  
        } catch (SQLException ex) {
            Logger.getLogger(Servicereclamation.class.getName()).log(Level.SEVERE, null, ex);
        }
         return categories;    }

    public ObservableList<categorie> triDSC() {
        ObservableList<categorie>categories=FXCollections.observableArrayList();
 
        try {
             Statement  stm;
             stm= cnx.createStatement();
             String query="Select * from `categorie` ORDER BY nom DESC";
             ResultSet rst=stm.executeQuery(query); 
             while (rst.next()){
                 categorie c=new categorie();
                 c.setId_categorie(rst.getInt("id_categorie"));
                 c.setNom(rst.getString("nom"));
                  c.setType(rst.getString("type"));
                 c.setDescription(rst.getString("description"));
                 categories.add(c);
                     
             }
                  
        } catch (SQLException ex) {
            Logger.getLogger(Servicereclamation.class.getName()).log(Level.SEVERE, null, ex);
        }
         return categories;
    }

    public ObservableList<categorie> search(String input) {
        ObservableList<categorie>categories=FXCollections.observableArrayList();
 
        try {
             Statement  stm;
             stm= cnx.createStatement();
             String query="SELECT * "
                     + "FROM categorie "
                     + " where nom like '%"+input+"%' "
                     + "or description like '%"+input+"%' "
                     + "or type like '%"+input+"%'";
             ResultSet rst=stm.executeQuery(query);
             while (rst.next()){
                 categorie c=new categorie();
                 c.setId_categorie(rst.getInt("id_categorie"));
                 c.setNom(rst.getString("nom"));
                  c.setType(rst.getString("type"));
                 c.setDescription(rst.getString("description"));
                 categories.add(c);
                     
             }
                  
        } catch (SQLException ex) {
            Logger.getLogger(Servicereclamation.class.getName()).log(Level.SEVERE, null, ex);
        }
         return categories;
}
    public ObservableList<categorie> Get_Categories()
    {
        ObservableList<categorie> formationstab=FXCollections.observableArrayList();
    try {
        Statement stm=cnx.createStatement();
        String Query="select id_categorie,nom from categorie ";


        ResultSet rs=stm.executeQuery(Query);
        categorie form;
        while(rs.next())
        {
        form=new categorie(rs.getInt("id_categorie"),rs.getString("nom"));
            //form.setObjet(rs.getString("Objet"));
            formationstab.add(form); //public formeval(String Objet, String Type, String Objectif, int nb_participants, float cout_hj, int nb_jour, float cout_fin, int note, String rapport)
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(Servicecategorie.class.getName()).log(Level.SEVERE, null, ex);
    }
        return formationstab;
        
        
    }
    
    
}

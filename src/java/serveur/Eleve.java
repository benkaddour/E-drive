/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

/**
 *
 * @author Sénthène
 */
public class Eleve extends Utilisateur{
    
    private int nbHeureCours;

    public Eleve(String n, String p, int tel, String m, String a, String d, int c, String u, String mdp, int age, int nbc) {
        super(n, p, tel, m, a, d, c, u, mdp, age);
        nbHeureCours = nbc;
    }

   

  
   
    
}

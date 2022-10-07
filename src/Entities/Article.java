/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author jacqu
 */
public class Article
{
    private String titreArticle;
    private int nbFeuillets;

    public Article(String unTitre, int unNb)
    {
        titreArticle = unTitre;
        nbFeuillets = unNb;
    }

    /**
     * @return the titreArticle
     */
    public String getTitreArticle() {
        return titreArticle;
    }

    /**
     * @return the nbFeuillets
     */
    public int getNbFeuillets() {
        return nbFeuillets;
    }
}

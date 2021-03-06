package fr.univ_amu.iut.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NamedQueries({
        @NamedQuery(name = "RegionAcademique.findAll", query = "SELECT p FROM RegionAcademique p"),
        @NamedQuery(name = "RegionAcademique.findById", query = "SELECT p FROM RegionAcademique p WHERE p.id = :id"),
})
@Entity
public class RegionAcademique implements Serializable {

    private static List<RegionAcademique> INSTANCES = new ArrayList<>();
    @Transient
    public static RegionAcademique AuvergneRhoneAlpes = new RegionAcademique("Région académique Auvergne-Rhône-Alpes");
    @Transient
    public static RegionAcademique BourgogneFrancheComte = new RegionAcademique("Région académique Bourgogne-Franche-Comté");
    @Transient
    public static RegionAcademique Bretagne = new RegionAcademique("Région académique Bretagne");
    @Transient
    public static RegionAcademique CentreValDeLoire = new RegionAcademique("Région académique Centre-Val de Loire");
    @Transient
    public static RegionAcademique Corse = new RegionAcademique("Région académique Corse");
    @Transient
    public static RegionAcademique GrandEst = new RegionAcademique("Région académique Grand Est");
    @Transient
    public static RegionAcademique Guadeloupe = new RegionAcademique("Région académique Guadeloupe");
    @Transient
    public static RegionAcademique Guyane = new RegionAcademique("Région académique Guyane");
    @Transient
    public static RegionAcademique HautsDeFrance = new RegionAcademique("Région académique Hauts-de-France");
    @Transient
    public static RegionAcademique IleDeFrance = new RegionAcademique("Région académique Île-de-France");
    @Transient
    public static RegionAcademique Martinique = new RegionAcademique("Région académique Martinique");
    @Transient
    public static RegionAcademique Normandie = new RegionAcademique("Région académique Normandie");
    @Transient
    public static RegionAcademique NouvelleAquitaine = new RegionAcademique("Région académique Nouvelle-Aquitaine");
    @Transient
    public static RegionAcademique Occitanie = new RegionAcademique("Région académique Occitanie");
    @Transient
    public static RegionAcademique PaysDeLaLoire = new RegionAcademique("Région académique Pays de la Loire");
    @Transient
    public static RegionAcademique ProvenceAlpesCoteDAzur = new RegionAcademique("Région académique Provence-Alpes-Côte d'Azur");
    @Transient
    public static RegionAcademique Reunion = new RegionAcademique("Région académique La Réunion");
    @Transient
    public static RegionAcademique Mayotte = new RegionAcademique("Région académique Mayotte");

    @Id
    @GeneratedValue
    int id;

    @Column(unique = true)
    String nom;

    public RegionAcademique() {

    }

    public RegionAcademique(String nom) {
        INSTANCES.add(this);
        this.nom = nom;
    }

    public static List<RegionAcademique> toutes(){
        return INSTANCES;
    }

    public static RegionAcademique getById(int id){
        for(RegionAcademique regionAcademique : INSTANCES){
            if(regionAcademique.id == id)return regionAcademique;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }


    @Override
    public String toString() {
        return "RegionAcademique{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionAcademique that = (RegionAcademique) o;

        if (id != that.id) return false;
        return nom.equals(that.nom);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nom.hashCode();
        return result;
    }
}

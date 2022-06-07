package fr.univ_amu.iut.test;

import java.util.ArrayList;
import java.util.List;

import fr.univ_amu.iut.dao.DAOUsage;
import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Discipline;
import fr.univ_amu.iut.model.Niveau;
import fr.univ_amu.iut.model.Thematique;
import fr.univ_amu.iut.model.Usage;

public class DAOUsageTest implements DAOUsage{

    @Override
    public boolean delete(Usage obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Usage> findAll() {
        List<Usage> usages = new ArrayList<>();
        for( int i = 0; i < 69 ; i++){
            Usage tmp = new Usage();
            tmp.setNom(String.valueOf(i));
            tmp.setDiscipline(Discipline.Technologie);
            tmp.setNiveau(Niveau.Tous);
            tmp.setDescription("je suis un commentaire tres long mais surtout tres utile, je sert a tester l'interface graphique et la mettre au bout de ses limtes");
            usages.add(tmp);
        }
        return usages;
    }

    @Override
    public Usage getById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean insert(Usage obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean update(Usage obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Usage> findByCriterias(Thematique thematique, Discipline discipline, Academie academie) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Usage> findByName(String substring) {
        // TODO Auto-generated method stub
        return null;
    }

    
}

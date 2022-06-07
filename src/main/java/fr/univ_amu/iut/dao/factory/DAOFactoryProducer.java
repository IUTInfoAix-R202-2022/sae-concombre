package fr.univ_amu.iut.dao.factory;

import fr.univ_amu.iut.dao.jpa.DAOFactoryJPA;
import fr.univ_amu.iut.test.DAOFactoryTest;

public class DAOFactoryProducer {
    public static DAOFactory getFactory(DAOType type) {
        return switch (type){
            case JPA -> new DAOFactoryJPA("gestionUsagesPU");
            case JPA_MEMORY -> new DAOFactoryJPA("gestionUsagesPUMemory");
            case TEST -> new DAOFactoryTest();
            default -> throw new IllegalArgumentException();
        };
    }
}
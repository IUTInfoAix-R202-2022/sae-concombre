package fr.univ_amu.iut;

import fr.univ_amu.iut.dao.DAOAcademie;
import fr.univ_amu.iut.dao.DAOUsage;
import fr.univ_amu.iut.dao.factory.DAOFactory;
import fr.univ_amu.iut.dao.factory.DAOFactoryProducer;
import fr.univ_amu.iut.dao.factory.DAOType;
import fr.univ_amu.iut.dao.jpa.DAOFactoryJPA;
import fr.univ_amu.iut.model.*;


public class DataMain {
	
	
	/*
	Code utilitaire que nous avons utilisé pendant le développement de l'application, afin de remplir la base de donnée
	**SUPPRIMER LES TABLES DE LA BASE DE DONNEES AVANT D'EXECUTER**
	 */
	public static void main(String[] args) {

		DAOFactory daoFactory = DAOFactoryProducer.getFactory(DAOType.JPA);
		DAOUsage daoUsage = daoFactory.createDAOUsage();

		Usage usage0 = new Usage();
		usage0.setNom(" Histoire en jeux");
		usage0.addRessource(new Ressource(" Histoire en jeux", "https://www.youtube.com/channel/UCRThjUeXnxL_BKUhqJv5XBg ", "Chaîne YouTube"));
		Discipline disci0 = Discipline.HistoireGeographie;
		usage0.setDiscipline(disci0);
		usage0.setThematique(Thematique.Ludification);
		usage0.setAcademie(Academie.ClermontFerrand);
		usage0.setNiveau(Niveau.SecondDegre);
		usage0.setDescription("Chargé de mission auprès de la DANE autour des questions de ludicisation de l'enseignement, et des usages de la réalité augmentée et de la réalité virtuelle.  ");
		usage0.addActeur(new Acteur("William BROU", "Chargé de mission DANE"));
		daoUsage.insert(usage0);
		/* __________________________________________________ */
		Usage usage1 = new Usage();
		usage1.setNom("Jeu vidéo et histoire");
		usage1.addRessource(new Ressource("Jeu vidéo et histoire", "https://jeuvideohistoire.com/ ", "Blog"));
		Discipline disci1 = Discipline.HistoireGeographie;
		usage1.setDiscipline(disci1);
		usage1.setThematique(Thematique.Ludification);
		usage1.setAcademie(Academie.Creteil);
		usage1.setNiveau(Niveau.SecondDegre);
		usage1.setDescription("Enseignant en histoire-géographie, doctorant en sciences de l'éducation, chercheur associé à la BnF");
		usage1.addActeur(new Acteur("Romain VINCENT ", "Enseignant chercheur"));
		daoUsage.insert(usage1);
		/* __________________________________________________ */
		Usage usage2 = new Usage();
		usage2.setNom("Enseigner avec les séries TV");
		usage2.addRessource(new Ressource("Enseigner avec les séries TV", "https://disciplines.ac-toulouse.fr/hgemc/travailler-avec-les-series-americans-et-space-force-pour-etudier-les-fondements-et-les  ", "Scénarios pédagogiques"));
		Discipline disci2 = Discipline.HistoireGeographie;
		usage2.setDiscipline(disci2);
		usage2.setThematique(Thematique.Ludification);
		usage2.setAcademie(Academie.Toulouse);
		usage2.setNiveau(Niveau.SecondDegre);
		usage2.setDescription("Perinne Gourio est IAN HG de l'académie");
		usage2.addActeur(new Acteur("Perrine GOURIO", "Groupe de travail de l’académie de Toulouse (IAN + IA-IPR)"));
		daoUsage.insert(usage2);
		/* __________________________________________________ */
		Usage usage3 = new Usage();
		usage3.setNom("Gamifier la classe");
		usage3.addRessource(new Ressource("Gamifier la classe", "https://www4.ac-nancy-metz.fr/physique/peda_inversee.php#game", "Jeux numériques "));
		Discipline disci3 = Discipline.PhysiqueChimie;
		usage3.setDiscipline(disci3);
		usage3.setThematique(Thematique.Ludification);
		usage3.setAcademie(Academie.NancyMetz);
		usage3.setNiveau(Niveau.SecondDegre);
		usage3.setDescription("À la suite des TraAM, publication par l'académie de 31 jeux (pratique importante dans l'académie)");
		usage3.addActeur(new Acteur("Florence DENEUVE", "IAN Nancy-Metz"));
		daoUsage.insert(usage3);
		/* __________________________________________________ */
		Usage usage4 = new Usage();
		usage4.setNom("Escape games en EMI");
		usage4.addRessource(new Ressource("Escape games en EMI", "https://cdi.ac-dijon.fr/spip.php?rubrique56", "Jeux numériques "));
		Discipline disci4 = Discipline.Mathematiques;
		usage4.setDiscipline(disci4);
		usage4.setThematique(Thematique.Ludification);
		usage4.setAcademie(Academie.Dijon);
		usage4.setNiveau(Niveau.SecondDegre);
		usage4.setDescription("Page qui regroupe des liens  vers une dizaine de jeux.");
		usage4.addActeur(new Acteur("Non précisé", "Enseignants de l'académie"));
		daoUsage.insert(usage4);
		/* __________________________________________________ */
		Usage usage5 = new Usage();
		usage5.setNom("4 exemples de jeux pédagogiques en économie et gestion");
		usage5.addRessource(new Ressource("4 exemples de jeux pédagogiques en économie et gestion", "https://eco-gestion.spip.ac-rouen.fr/?-Jeux-d-evasion-Escape-games-", "Jeux numériques "));
		Discipline disci5 = Discipline.EconomieGestion;
		usage5.setDiscipline(disci5);
		usage5.setThematique(Thematique.Ludification);
		usage5.setAcademie(Academie.Normandie);
		usage5.setNiveau(Niveau.SecondDegre);
		usage5.setDescription("Page de présentation du pôle de compétences https://eco-gestion.spip.ac-rouen.fr/?Le-pole-de-competences-Economie-Gestion");
		usage5.addActeur(new Acteur("Voir Commentaires", "Pôle de compétences en ecogest"));
		daoUsage.insert(usage5);
		/* __________________________________________________ */
		Usage usage6 = new Usage();
		usage6.setNom("Flanders Lane, création d’une ville virtuelle ");
		usage6.addRessource(new Ressource("Flanders Lane, création d’une ville virtuelle ", "https://interlangues.discipline.ac-lille.fr/actu-interlangues/flanders-lane-2", "Projet de simulation globale"));
		Discipline disci6 = Discipline.LangueVivante;
		usage6.setDiscipline(disci6);
		usage6.setThematique(Thematique.Ludification);
		usage6.setAcademie(Academie.Lille);
		usage6.setNiveau(Niveau.SecondDegre);
		usage6.setDescription("Article sur le projet dans VNI : https://www.vousnousils.fr/2015/10/26/classe-inversee-tache-complexe-anglais-577593");
		usage6.addActeur(new Acteur("Sébastien FRANC", "Professeur d'anglais en lycée"));
		daoUsage.insert(usage6);
		/* __________________________________________________ */
		Usage usage7 = new Usage();
		usage7.setNom("It's English o'Clock");
		usage7.addRessource(new Ressource("It's English o'Clock", "https://itsenglishoclock.com/", "Site Perso"));
		Discipline disci7 = Discipline.LangueVivante;
		usage7.setDiscipline(disci7);
		usage7.setThematique(Thematique.Ludification);
		usage7.setAcademie(Academie.Versailles);
		usage7.setNiveau(Niveau.SecondDegre);
		usage7.setDescription("À voir en particulier : roue des rituels et jeux");
		usage7.addActeur(new Acteur("Charlie ROLLO", "Professeur d'anglais "));
		daoUsage.insert(usage7);
		/* __________________________________________________ */
		Usage usage8 = new Usage();
		usage8.setNom("Défis Académique Langues Inter-établissements");
		usage8.addRessource(new Ressource("Défis Académique Langues Inter-établissements", "https://www.pedagogie.ac-nice.fr/portail-de-langues/index.php/ressources-interlangues/traam ", "Jeux numériques "));
		Discipline disci8 = Discipline.LangueVivante;
		usage8.setDiscipline(disci8);
		usage8.setThematique(Thematique.Ludification);
		usage8.setAcademie(Academie.Nice);
		usage8.setNiveau(Niveau.SecondDegre);
		usage8.setDescription("Brigitte CARRERE est l'IA-IPR qui a coordonné le projet");
		usage8.addActeur(new Acteur("Brigitte CARRERE", "Groupe TraAM"));
		daoUsage.insert(usage8);
		/* __________________________________________________ */
		Usage usage9 = new Usage();
		usage9.setNom("Applications Académiques");
		usage9.addRessource(new Ressource("Applications Académiques", "https://mathematiques.ac-dijon.fr/spip.php?article196", "Applications"));
		Discipline disci9 = Discipline.Mathematiques;
		usage9.setDiscipline(disci9);
		usage9.setThematique(Thematique.Ludification);
		usage9.setAcademie(Academie.Dijon);
		usage9.setNiveau(Niveau.SecondDegre);
		usage9.setDescription("Ensemble d’applications développées par un enseignant, disponibles dans tous les stores (tablettes et ordi). Très prisée de la communauté des profs de maths. Gratuit.");
		usage9.addActeur(new Acteur("Christophe AUCLAIR", "Professeur de maths"));
		daoUsage.insert(usage9);
		/* __________________________________________________ */
		Usage usage10 = new Usage();
		usage10.setNom("Brochure.Mathematiques revisités au cycle 4");
		usage10.addRessource(new Ressource("Brochure.Mathematiques revisités au cycle 4", "https://maths.ac-creteil.fr/spip.php?article231", "Brochure"));
		Discipline disci10 = Discipline.Mathematiques;
		usage10.setDiscipline(disci10);
		usage10.setThematique(Thematique.Ludification);
		usage10.setAcademie(Academie.Creteil);
		usage10.setNiveau(Niveau.SecondDegre);
		usage10.setDescription("Brochure présentant les travaux d’un groupe de réflexion académique autour du jeu.");
		usage10.addActeur(new Acteur("Nicolas LEMOINE ", "Groupe de reflexion académique autour du jeu"));
		usage10.addActeur(new Acteur(" Cyril MICHAUD", "Groupe de reflexion académique autour du jeu"));
		daoUsage.insert(usage10);
		/* __________________________________________________ */
		Usage usage11 = new Usage();
		usage11.setNom("Mathador");
		usage11.addRessource(new Ressource("Mathador", "https://blog.mathador.fr/eric-trouillot/", "Jeu numérique"));
		Discipline disci11 = Discipline.Mathematiques;
		usage11.setDiscipline(disci11);
		usage11.setThematique(Thematique.Ludification);
		usage11.setAcademie(Academie.Bordeaux);
		usage11.setNiveau(Niveau.Tous);
		usage11.setDescription("Jeu connu pour travailler le calcul mental ");
		usage11.addActeur(new Acteur("Éric TROUILLOT", "Professeur de maths au collège"));
		daoUsage.insert(usage11);
		/* __________________________________________________ */
		Usage usage12 = new Usage();
		usage12.setNom("Ensemble des ressources des Travaux Académiques Mutualisés produits par le groupe GTICE");
		usage12.addRessource(new Ressource("Ensemble des ressources des Travaux Académiques Mutualisés produits par le groupe GTICE", "https://physique-chimie.enseigne.ac-lyon.fr/spip/spip.php?rubrique418 ", "Divers"));
		Discipline disci12 = Discipline.PhysiqueChimie;
		usage12.setDiscipline(disci12);
		usage12.setThematique(Thematique.Programmation);
		usage12.setAcademie(Academie.Lyon);
		usage12.setNiveau(Niveau.SecondDegre);
		usage12.setDescription("A produit de nombreuses activités très différentes pendant les TRAAM sur la partie programmation, de nombreuses utilisations dans de nombreux domaines différents et en utilisant différents langages.");
		usage12.addActeur(new Acteur("Sarah ROQUES", "Groupe GT TraAM et IAN "));
		daoUsage.insert(usage12);
		/* __________________________________________________ */
		Usage usage13 = new Usage();
		usage13.setNom("Initiation au langage Python");
		usage13.addRessource(new Ressource("Initiation au langage Python", "https://phychim.ac-versailles.fr/spip.php?article1069", "Tutoriels"));
		Discipline disci13 = Discipline.PhysiqueChimie;
		usage13.setDiscipline(disci13);
		usage13.setThematique(Thematique.Programmation);
		usage13.setAcademie(Academie.Versailles);
		usage13.setNiveau(Niveau.SecondDegre);
		usage13.setDescription("Production de tutoriels vidéo pour la prise en main de Python ");
		usage13.addActeur(new Acteur("Non précisé", "Groupe TraAM"));
		daoUsage.insert(usage13);
		/* __________________________________________________ */
		Usage usage14 = new Usage();
		usage14.setNom("Prise en main du langage Python");
		usage14.addRessource(new Ressource("Prise en main du langage Python", "https://www.ac-paris.fr/portail/jcms/p1_1885031/formation-groupe-lycee-mars-avril-2019-prise-en-main-du-langage-python?cid=p1_106394&portal=piapp1_59010", "Support de formation"));
		Discipline disci14 = Discipline.PhysiqueChimie;
		usage14.setDiscipline(disci14);
		usage14.setThematique(Thematique.Programmation);
		usage14.setAcademie(Academie.Paris);
		usage14.setNiveau(Niveau.SecondDegre);
		usage14.setDescription("Kit de survie Python avec de nombreuses activités");
		usage14.addActeur(new Acteur("Non précisé", "Formateurs groupe lycée"));
		daoUsage.insert(usage14);
		/* __________________________________________________ */
		Usage usage15 = new Usage();
		usage15.setNom("Des « escape games » en ligne pour stimuler la curiosité des élèves et favoriser les apprentissages en classe de Seconde");
		usage15.addRessource(new Ressource("Des « escape games » en ligne pour stimuler la curiosité des élèves et favoriser les apprentissages en classe de Seconde", "https://ses.spip.ac-rouen.fr/IMG/pdf/synthese.pdf", "Escape games"));
		Discipline disci15 = Discipline.PhysiqueChimie;
		usage15.setDiscipline(disci15);
		usage15.setThematique(Thematique.Ludification);
		usage15.setAcademie(Academie.Normandie);
		usage15.setNiveau(Niveau.SecondDegre);
		usage15.setDescription("En complément, bilan des TraAM : https://view.genial.ly/5ebe55008e243b0d5a32be9d");
		usage15.addActeur(new Acteur("Non précisé", "Groupe TraAM"));
		daoUsage.insert(usage15);
		/* __________________________________________________ */
		Usage usage16 = new Usage();
		usage16.setNom("Continuité pédagogique - Quelques ressources");
		usage16.addRessource(new Ressource("Continuité pédagogique - Quelques ressources", "https://www.ac-grenoble.fr/disciplines/spc/articles.php?lng=fr&pg=133", "Scénarios pédagogiques"));
		Discipline disci16 = Discipline.PhysiqueChimie;
		usage16.setDiscipline(disci16);
		usage16.setThematique(Thematique.EnseignerADistance);
		usage16.setAcademie(Academie.Grenoble);
		usage16.setNiveau(Niveau.SecondDegre);
		usage16.setDescription("Travail de qualité sur l’utilisation des ENT spécifiques à la discipline et de nombreuses activités proposées en hybride. Remy Besset IAN de l’académie enseigne au collège et peut répondre à de nombreuses questions sur l’utilisation des ENT en hybride");
		usage16.addActeur(new Acteur("Remy BESSET", "IAN PC Grenoble"));
		daoUsage.insert(usage16);
		/* __________________________________________________ */
		Usage usage17 = new Usage();
		usage17.setNom("Continuité pédagogique et hybridation");
		usage17.addRessource(new Ressource("Continuité pédagogique et hybridation", "https://www.ac-clermont.fr/disciplines/index.php?id=13700", "Point didactique et scénarios pédagogiques"));
		Discipline disci17 = Discipline.HistoireGeographie;
		usage17.setDiscipline(disci17);
		usage17.setThematique(Thematique.EnseignerADistance);
		usage17.setAcademie(Academie.ClermontFerrand);
		usage17.setNiveau(Niveau.SecondDegre);
		usage17.setDescription("");
		usage17.addActeur(new Acteur("Anne-Sophie MAHIDDINE", "Groupe de travail de l’académie de Clermont (IAN + IA-IPR)"));
		daoUsage.insert(usage17);
		/* __________________________________________________ */
		Usage usage18 = new Usage();
		usage18.setNom("Propositions de séquences 100% à distance");
		usage18.addRessource(new Ressource("Propositions de séquences 100% à distance", "https://histoire.ac-versailles.fr/spip.php?rubrique320", "Scénarios pédagogiques"));
		Discipline disci18 = Discipline.HistoireGeographie;
		usage18.setDiscipline(disci18);
		usage18.setThematique(Thematique.EnseignerADistance);
		usage18.setAcademie(Academie.Versailles);
		usage18.setNiveau(Niveau.SecondDegre);
		usage18.setDescription("Julian OGUER est le IAN de l'académie, référent du GEP qui a produit de nombreuses séances 100% à distance");
		usage18.addActeur(new Acteur("Julian OGUER", "GEP HG Versailles"));
		daoUsage.insert(usage18);
		/* __________________________________________________ */
		Usage usage19 = new Usage();
		usage19.setNom("Le CDI Hors les murs en 2020");
		usage19.addRessource(new Ressource("Le CDI Hors les murs en 2020", "https://documentation.ac-versailles.fr/spip.php?article567", "Bilan du GEP"));
		Discipline disci19 = Discipline.PhysiqueChimie;
		usage19.setDiscipline(disci19);
		usage19.setThematique(Thematique.EnseignerADistance);
		usage19.setAcademie(Academie.Versailles);
		usage19.setNiveau(Niveau.SecondDegre);
		usage19.setDescription("Bilan du GEP documentation 2019-2020");
		usage19.addActeur(new Acteur("Anne-Lise DUPONT ", "GEP documentation Versailles"));
		usage19.addActeur(new Acteur(" Caroline JAN ", "GEP documentation Versailles"));
		usage19.addActeur(new Acteur(" Daniela BRUN", "GEP documentation Versailles"));
		daoUsage.insert(usage19);
		/* __________________________________________________ */
		Usage usage20 = new Usage();
		usage20.setNom("Mettre en œuvre un enseignement hybride en SVT");
		usage20.addRessource(new Ressource("Mettre en œuvre un enseignement hybride en SVT", "https://svt.ac-versailles.fr/spip.php?article1130", "Point didactique "));
		Discipline disci20 = Discipline.ScienceEtVieDeLaTerre;
		usage20.setDiscipline(disci20);
		usage20.setThematique(Thematique.EnseignerADistance);
		usage20.setAcademie(Academie.Versailles);
		usage20.setNiveau(Niveau.SecondDegre);
		usage20.setDescription("Article du site adadémique disciplinaire SVT");
		usage20.addActeur(new Acteur("Bruno BOUCHER ", "Non précisé "));
		usage20.addActeur(new Acteur(" Laurent GUERRE ", "Non précisé "));
		usage20.addActeur(new Acteur(" Mélanie FENAERT", "Non précisé "));
		daoUsage.insert(usage20);
		/* __________________________________________________ */
		Usage usage21 = new Usage();
		usage21.setNom("Mettre à disposition des élèves des ressources et leur en faire créer  grâce à Glide");
		usage21.addRessource(new Ressource("Mettre à disposition des élèves des ressources et leur en faire créer  grâce à Glide", "https://anglais.spip.ac-rouen.fr/spip.php?article665", "Turotiel et scénarios pédagogiques"));
		Discipline disci21 = Discipline.LangueVivante;
		usage21.setDiscipline(disci21);
		usage21.setThematique(Thematique.SExercerSentrainer);
		usage21.setAcademie(Academie.Normandie);
		usage21.setNiveau(Niveau.SecondDegre);
		usage21.setDescription("");
		usage21.addActeur(new Acteur("Laurence HAQUET", "IAN LV Rouen "));
		daoUsage.insert(usage21);
		/* __________________________________________________ */
		Usage usage22 = new Usage();
		usage22.setNom("Enseigner avec les images satellites");
		usage22.addRessource(new Ressource("Enseigner avec les images satellites", "https://geoimage.cnes.fr/fr", "Scénarios pédagogiques"));
		Discipline disci22 = Discipline.HistoireGeographie;
		usage22.setDiscipline(disci22);
		usage22.setThematique(Thematique.RealiteVirtuelle);
		usage22.setAcademie(Academie.Toulouse);
		usage22.setNiveau(Niveau.Tous);
		usage22.setDescription("Groupe de travail Géoimage (partenariat Education nationale /CNES), du 1er degré à la classe préparatoire");
		usage22.addActeur(new Acteur("Non précisé ", "Groupe de travail GéoImages"));
		daoUsage.insert(usage22);
		/* __________________________________________________ */
		Usage usage23 = new Usage();
		usage23.setNom("Mettre en oeuvre la réalité virtuelle et augmentée en classe");
		usage23.addRessource(new Ressource("Mettre en oeuvre la réalité virtuelle et augmentée en classe", "https://svt.discipline.ac-lille.fr/ressources/traams/realite-augmentee-en-sciences-experimentales/mettre-en-oeuvre-la-realite-virtuelle-et-augmentee-en-classe", "Scénario pédagogique"));
		Discipline disci23 = Discipline.ScienceEtVieDeLaTerre;
		usage23.setDiscipline(disci23);
		usage23.setThematique(Thematique.RealiteVirtuelle);
		usage23.setAcademie(Academie.Lille);
		usage23.setNiveau(Niveau.SecondDegre);
		usage23.setDescription("");
		usage23.addActeur(new Acteur("Non précisé ", "Groupe TraAM"));
		daoUsage.insert(usage23);
		/* __________________________________________________ */
		Usage usage24 = new Usage();
		usage24.setNom("La lithothèque");
		usage24.addRessource(new Ressource("La lithothèque", " https://lithotheque.ac-montpellier.fr/geoduc", "Site Internet"));
		Discipline disci24 = Discipline.ScienceEtVieDeLaTerre;
		usage24.setDiscipline(disci24);
		usage24.setThematique(Thematique.RealiteVirtuelle);
		usage24.setAcademie(Academie.Montpellier);
		usage24.setNiveau(Niveau.SecondDegre);
		usage24.setDescription("'Le site ''Lithothèque Languedoc-Roussillon'', de l’Académie de Montpellier, met à disposition d’un large public des descriptions de sites géologiques régionaux remarquables.'");
		usage24.addActeur(new Acteur("Ludovic DELORME", "Groupe de professeurs de SVT de l'académie"));
		daoUsage.insert(usage24);
		/* __________________________________________________ */
		Usage usage25 = new Usage();
		usage25.setNom("Apports de la Réalité virtuelle et de la Réalité Augmentée en SVT, au collège");
		usage25.addRessource(new Ressource("Apports de la Réalité virtuelle et de la Réalité Augmentée en SVT, au collège", "https://svt.ac-creteil.fr/?Apports-de-la-Realite-virtuelle-et-de-la-Realite-Augmentee-en-SVT-au-college", "Scénarios pédagogiques"));
		Discipline disci25 = Discipline.ScienceEtVieDeLaTerre;
		usage25.setDiscipline(disci25);
		usage25.setThematique(Thematique.RealiteVirtuelle);
		usage25.setAcademie(Academie.Creteil);
		usage25.setNiveau(Niveau.SecondDegre);
		usage25.setDescription("'En complément synthèse des TraAM et notamment le thème 2 ''intégration de la réalité augmentée et de la réalité virtuelle en sciences expérimentales'' https://view.genial.ly/5c8f5f6b6f346c7226375a22'");
		usage25.addActeur(new Acteur("Non précisé ", "Groupe TraAM"));
		daoUsage.insert(usage25);
		/* __________________________________________________ */
		Usage usage26 = new Usage();
		usage26.setNom("Différenciation ");
		usage26.addRessource(new Ressource("Différenciation ", "https://www.ac-clermont.fr/disciplines/index.php?id=11069", "Ressources et nombreux scénarios pédagogiques "));
		Discipline disci26 = Discipline.HistoireGeographie;
		usage26.setDiscipline(disci26);
		usage26.setThematique(Thematique.DifferenciationPedagogique);
		usage26.setAcademie(Academie.ClermontFerrand);
		usage26.setNiveau(Niveau.SecondDegre);
		usage26.setDescription("");
		usage26.addActeur(new Acteur("Anne-Sophie MAHIDDINE", "IAN et pôle de compétences numériques "));
		daoUsage.insert(usage26);
		/* __________________________________________________ */
		Usage usage27 = new Usage();
		usage27.setNom("Adapter son enseignement aux élèves à besoins particuliers");
		usage27.addRessource(new Ressource("Adapter son enseignement aux élèves à besoins particuliers", "https://hist-geo.spip.ac-rouen.fr/spip.php?rubrique565", "Scénarios pédagogiques"));
		Discipline disci27 = Discipline.HistoireGeographie;
		usage27.setDiscipline(disci27);
		usage27.setThematique(Thematique.EcoleInclusive);
		usage27.setAcademie(Academie.Normandie);
		usage27.setNiveau(Niveau.SecondDegre);
		usage27.setDescription("");
		usage27.addActeur(new Acteur("Non précisé ", "Enseignants de l'académie"));
		daoUsage.insert(usage27);
		/* __________________________________________________ */
		Usage usage28 = new Usage();
		usage28.setNom("Le dispositif Twictado");
		usage28.addRessource(new Ressource("Le dispositif Twictado", "https://dane.ac-creteil.fr/spip.php?page=article&id_article=751", "Article de présentation du dispositif"));
		Discipline disci28 = Discipline.LangueVivante;
		usage28.setDiscipline(disci28);
		usage28.setThematique(Thematique.ReseauxSociaux);
		usage28.setAcademie(Academie.Creteil);
		usage28.setNiveau(Niveau.SecondDegre);
		usage28.setDescription("Déclinaison en espagnol du dispositif Twictée");
		usage28.addActeur(new Acteur("Sabine KITTEN ", "Professeures d’espagnol de l’académie de Créteil."));
		usage28.addActeur(new Acteur(" Celine CORTÈS ", "Professeures d’espagnol de l’académie de Créteil."));
		usage28.addActeur(new Acteur(" Imma IBANEZ", "Professeures d’espagnol de l’académie de Créteil."));
		daoUsage.insert(usage28);
		/* __________________________________________________ */
		Usage usage29 = new Usage();
		usage29.setNom("SPOC physique-chimie et numérique");
		usage29.addRessource(new Ressource("SPOC physique-chimie et numérique", "https://www.ac-clermont.fr/actualite/spoc-physique-chimie-et-numerique-2020-06-12/?tx_ttnews%5BbackPid%5D=3200", "Cours en ligne"));
		Discipline disci29 = Discipline.PhysiqueChimie;
		usage29.setDiscipline(disci29);
		usage29.setThematique(Thematique.FormationAuxOutilsNumeriques);
		usage29.setAcademie(Academie.ClermontFerrand);
		usage29.setNiveau(Niveau.SecondDegre);
		usage29.setDescription("Les professeurs de physique-chimie de l’académie se sont vu proposer de développer leur maitrise des usages pédagogiques du numérique pour la réalisation d'expériences scientifiques avec smartphone en classe et l'évaluation avec l’outil numérique.");
		usage29.addActeur(new Acteur("Delphine PALLIER ", "IA-IPR référente et le pôle de compétences de physique-chimie"));
		usage29.addActeur(new Acteur(" Christine BIDEUX ", "IA-IPR référente et le pôle de compétences de physique-chimie"));
		usage29.addActeur(new Acteur(" Pierre MARTY", "IA-IPR référente et le pôle de compétences de physique-chimie"));
		daoUsage.insert(usage29);
		/* __________________________________________________ */
		Usage usage30 = new Usage();
		usage30.setNom("PhiloNum");
		usage30.addRessource(new Ressource("PhiloNum", "https://disciplines.ac-toulouse.fr/philosophie/numerique/philonum-base-de-donnees-collaborative-d-outils-numeriques-et-de-retours-d-experience-de", "Base de données"));
		Discipline disci30 = Discipline.Philosophie;
		usage30.setDiscipline(disci30);
		usage30.setThematique(Thematique.FormationAuxOutilsNumeriques);
		usage30.setAcademie(Academie.Toulouse);
		usage30.setNiveau(Niveau.SecondDegre);
		usage30.setDescription("Base de données collaborative qui recense et classe les outils numériques qu’utilisent les professeurs de philosophie selon leurs intérêts pédagogiques.");
		usage30.addActeur(new Acteur("3 professeurs de l'académie ", "Professeurs de philosophie de l'académie de Toulouse "));
		daoUsage.insert(usage30);
		/* __________________________________________________ */
		Usage usage31 = new Usage();
		usage31.setNom("Philo-Labo");
		usage31.addRessource(new Ressource("Philo-Labo", "https://philo-labo.fr/accueil/", "Site internet de partage de pratiques numériques."));
		Discipline disci31 = Discipline.Philosophie;
		usage31.setDiscipline(disci31);
		usage31.setThematique(Thematique.FormationAuxOutilsNumeriques);
		usage31.setAcademie(Academie.Poitiers);
		usage31.setNiveau(Niveau.SecondDegre);
		usage31.setDescription("Philo-labo.fr est un lieu de partage de ressources et d'outils");
		usage31.addActeur(new Acteur("François ÉLIE", "IAN philosophie de l'académie"));
		daoUsage.insert(usage31);
		/* __________________________________________________ */
		Usage usage32 = new Usage();
		usage32.setNom("@a_happy_teacher_true_story");
		usage32.addRessource(new Ressource("@a_happy_teacher_true_story", "https://linktr.ee/a_happy_teacher_true_story", "Site d'un collègue de LV qui propose de nombreux tutoriels "));
		Discipline disci32 = Discipline.LangueVivante;
		usage32.setDiscipline(disci32);
		usage32.setThematique(Thematique.FormationAuxOutilsNumeriques);
		usage32.setAcademie(Academie.Montpellier);
		usage32.setNiveau(Niveau.SecondDegre);
		usage32.setDescription("");
		usage32.addActeur(new Acteur("Nicolas GAUBE", "Professeur de LV"));
		daoUsage.insert(usage32);
		/* __________________________________________________ */
		Usage usage33 = new Usage();
		usage33.setNom("Johann NALLET (Chaîne YouTube)");
		usage33.addRessource(new Ressource("Johann NALLET (Chaîne YouTube)", "https://www.youtube.com/channel/UC8pCnomr8VIuW8x6wHXsYxA/videos", "Chaîne Youtube"));
		Discipline disci33 = Discipline.HistoireGeographie;
		usage33.setDiscipline(disci33);
		usage33.setThematique(Thematique.FormationAuxOutilsNumeriques);
		usage33.setAcademie(Academie.Poitiers);
		usage33.setNiveau(Niveau.SecondDegre);
		usage33.setDescription("Nombreux tutoriels très bien faits et qui peuvent servir à d'autres disciplines.");
		usage33.addActeur(new Acteur("Johann NALLET", "Professeur d'HG"));
		daoUsage.insert(usage33);
		/* __________________________________________________ */
		Usage usage34 = new Usage();
		usage34.setNom("Festival des webradios scolaires");
		usage34.addRessource(new Ressource("Festival des webradios scolaires", "https://histoire.ac-versailles.fr/spip.php?rubrique284", "Festival"));
		Discipline disci34 = Discipline.HistoireGeographie;
		usage34.setDiscipline(disci34);
		usage34.setThematique(Thematique.WebRadio);
		usage34.setAcademie(Academie.Versailles);
		usage34.setNiveau(Niveau.SecondDegre);
		usage34.setDescription("Ce festival organisé depuis plusieurs années propose de réaliser une émission de radio consacrée à une thématique ancrée dans l’actualité et liée à l’histoire, la géographie ou l’enseignement moral et civique.");
		usage34.addActeur(new Acteur("Frank FONSA", "GEP HG Versailles"));
		daoUsage.insert(usage34);
		/* __________________________________________________ */
		Usage usage35 = new Usage();
		usage35.setNom("Webradio des Rendez-vous de l'Histoire à Blois");
		usage35.addRessource(new Ressource("Webradio des Rendez-vous de l'Histoire à Blois", "https://www.ac-orleans-tours.fr/pedagogie/hg_ec/enseigner/enseigner_autrement/webradio_des_rendez_vous_de_lhistoire_a_blois/", "Webradio"));
		Discipline disci35 = Discipline.HistoireGeographie;
		usage35.setDiscipline(disci35);
		usage35.setThematique(Thematique.WebRadio);
		usage35.setAcademie(Academie.OrleansTours);
		usage35.setNiveau(Niveau.SecondDegre);
		usage35.setDescription("Depuis 2010, à l'occasion des Rendez-vous de l'Histoire de Blois, des enseignants de l'académie préparent avec leurs élèves une émission consacrée au thème du festival, en lien avec les programmes.");
		usage35.addActeur(new Acteur("Eric FARDEL", "Enseignants HG de l'académie"));
		daoUsage.insert(usage35);
		/* __________________________________________________ */
		Usage usage36 = new Usage();
		usage36.setNom("Colloque Interstices ");
		usage36.addRessource(new Ressource("Colloque Interstices ", (String)null, "Colloque"));
		Discipline disci36 = Discipline.LangueVivante;
		usage36.setDiscipline(disci36);
		usage36.setThematique(Thematique.TravailEntrePairs);
		usage36.setAcademie(Academie.Dijon);
		usage36.setNiveau(Niveau.SecondDegre);
		usage36.setDescription("practicelangues@gmail.com");
		usage36.addActeur(new Acteur("Cathia GAITA-KINACI", "Présidente du colloque"));
		daoUsage.insert(usage36);
		/* __________________________________________________ */
		Usage usage37 = new Usage();
		usage37.setNom("Ludification : les TraAM de l'académie d'Aix-Marseille ");
		usage37.addRessource(new Ressource("Ludification : les TraAM de l'académie d'Aix-Marseille ", " https://www.pedagogie.ac-aix-marseille.fr/jcms/c_10880672/fr/ludification-les-traam-de-l-academie-d-aix-marseille-st2s-biotechnologies-et-lpro", "Scénarios pédagogiques"));
		Discipline disci37 = Discipline.ScienceEtVieDeLaTerre;
		usage37.setDiscipline(disci37);
		usage37.setThematique(Thematique.Ludification);
		usage37.setAcademie(Academie.AixMarseille);
		usage37.setNiveau(Niveau.SecondDegre);
		usage37.setDescription("Page qui regroupe plusieurs scénarios sur des jeux sérieux");
		usage37.addActeur(new Acteur("Non précisé ", "Groupe TraAM"));
		daoUsage.insert(usage37);
		/* __________________________________________________ */
		Usage usage38 = new Usage();
		usage38.setNom("Pédagogie activé et différenciée");
		usage38.addRessource(new Ressource("Pédagogie activé et différenciée", "https://www.pedagogie.ac-aix-marseille.fr/jcms/c_10880668/fr/pedagogie-actives-et-differenciees-les-traams-academiques", "Scénarios pédagogiques"));
		Discipline disci38 = Discipline.ScienceEtVieDeLaTerre;
		usage38.setDiscipline(disci38);
		usage38.setThematique(Thematique.ClasseInversee);
		usage38.setAcademie(Academie.AixMarseille);
		usage38.setNiveau(Niveau.SecondDegre);
		usage38.setDescription("Page qui recense plusieurs scénarios de classe inversée");
		usage38.addActeur(new Acteur("Non précisé ", "Groupe TraAM"));
		daoUsage.insert(usage38);
		/* __________________________________________________ */
		Usage usage39 = new Usage();
		usage39.setNom("TraAM pédagogie active et différenciée");
		usage39.addRessource(new Ressource("TraAM pédagogie active et différenciée", "https://ww2.ac-poitiers.fr/biochimie/spip.php?article409", "Scénarios pédagogiques"));
		Discipline disci39 = Discipline.Francais;
		usage39.setDiscipline(disci39);
		usage39.setThematique(Thematique.ClasseInversee);
		usage39.setAcademie(Academie.Poitiers);
		usage39.setNiveau(Niveau.SecondDegre);
		usage39.setDescription("Page qui recense plusieurs scénarios de classe inversée");
		usage39.addActeur(new Acteur("Non précisé ", "Groupe TraAM "));
		daoUsage.insert(usage39);
		/* __________________________________________________ */
		Usage usage40 = new Usage();
		usage40.setNom("Propositions pédagogiques en arts plastiques pendant le confinement 2020");
		usage40.addRessource(new Ressource("Propositions pédagogiques en arts plastiques pendant le confinement 2020", "https://pedagogie.ac-montpellier.fr/propositions-pedagogiques-en-arts-plastiques-pendant-le-confinement-2020", "Scénarios pédagogiques"));
		Discipline disci40 = Discipline.HistoireGeographie;
		usage40.setDiscipline(disci40);
		usage40.setThematique(Thematique.EnseignerADistance);
		usage40.setAcademie(Academie.Montpellier);
		usage40.setNiveau(Niveau.SecondDegre);
		usage40.setDescription("");
		usage40.addActeur(new Acteur("Nombreux auteurs", "Professeurs Arts plastiques"));
		daoUsage.insert(usage40);
		/* __________________________________________________ */
		Usage usage41 = new Usage();
		usage41.setNom("Propositions et mise en partage de séquences");
		usage41.addRessource(new Ressource("Propositions et mise en partage de séquences", "https://www.ac-orleans-tours.fr/pedagogie/arts_plastiques/ressources/enseignement_a_distance/propositions_et_mise_en_partage_de_sequences/", "Scénarios pédagogiques"));
		Discipline disci41 = Discipline.HistoireGeographie;
		usage41.setDiscipline(disci41);
		usage41.setThematique(Thematique.EnseignerADistance);
		usage41.setAcademie(Academie.OrleansTours);
		usage41.setNiveau(Niveau.SecondDegre);
		usage41.setDescription("Ressources enseignement à distance : Propositions académiques de pistes, fiches, séquences, concours, défis.");
		usage41.addActeur(new Acteur("Nombreux auteurs", "Professeurs Arts plastiques"));
		daoUsage.insert(usage41);
		/* __________________________________________________ */
		Usage usage42 = new Usage();
		usage42.setNom("Arts plastiques et expressions numériques");
		usage42.addRessource(new Ressource("Arts plastiques et expressions numériques", "https://view.genial.ly/5c3f2a07a4eaa03097dcca2c", "Références croisant arts plastiques et numérique avec une structuration basée sur des couples de notions en articulation avec des problématiques."));
		Discipline disci42 = Discipline.HistoireGeographie;
		usage42.setDiscipline(disci42);
		usage42.setThematique(Thematique.FormationAuxOutilsNumeriques);
		usage42.setAcademie(Academie.Amiens);
		usage42.setNiveau(Niveau.SecondDegre);
		usage42.setDescription("Comment penser les arts plastiques au regard des expressions numériques ?");
		usage42.addActeur(new Acteur("Clément CHERVIER ", "Groupe de recherche numérique en arts plastiques"));
		usage42.addActeur(new Acteur("  Gautier DIRSON ", "Groupe de recherche numérique en arts plastiques"));
		usage42.addActeur(new Acteur(" Thomas FAUQUEMBERGUE ", "Groupe de recherche numérique en arts plastiques"));
		usage42.addActeur(new Acteur(" Cécile HARLEAUX ", "Groupe de recherche numérique en arts plastiques"));
		usage42.addActeur(new Acteur(" Nicolas HOTIN ", "Groupe de recherche numérique en arts plastiques"));
		usage42.addActeur(new Acteur(" Jacques M ARCEL ", "Groupe de recherche numérique en arts plastiques"));
		usage42.addActeur(new Acteur(" François QUILLARD", "Groupe de recherche numérique en arts plastiques"));
		daoUsage.insert(usage42);
		/* __________________________________________________ */
		Usage usage43 = new Usage();
		usage43.setNom("Le numérique en FLS : bilans, perspectives");
		usage43.addRessource(new Ressource("Le numérique en FLS : bilans, perspectives", "https://www.ac-paris.fr/portail/jcms/p2_2298853/le-numerique-en-fls-bilans-perspectives-ouverture-d-un-magistere", "Parcours M@gistère"));
		Discipline disci43 = Discipline.Francais;
		usage43.setDiscipline(disci43);
		usage43.setThematique(Thematique.FormationAuxOutilsNumeriques);
		usage43.setAcademie(Academie.Paris);
		usage43.setNiveau(Niveau.SecondDegre);
		usage43.setDescription("");
		usage43.addActeur(new Acteur("Julien FUMEY ", "CASNAV"));
		usage43.addActeur(new Acteur(" Gaelle ANDRÉE MOROIS ", "CASNAV"));
		usage43.addActeur(new Acteur(" Cécile MASSARD ", "CASNAV"));
		usage43.addActeur(new Acteur(" Alice le BIHAN", "CASNAV"));
		daoUsage.insert(usage43);
		/* __________________________________________________ */
		Usage usage44 = new Usage();
		usage44.setNom("Le Réseau des Lettres");
		usage44.addRessource(new Ressource("Le Réseau des Lettres", "https://lettres-modernes.discip.ac-caen.fr/spip.php?article773", "Site internet avec travaux d'élèves et ressources pédagogiques "));
		Discipline disci44 = Discipline.Francais;
		usage44.setDiscipline(disci44);
		usage44.setThematique(Thematique.TravailEntrePairs);
		usage44.setAcademie(Academie.Normandie);
		usage44.setNiveau(Niveau.SecondDegre);
		usage44.setDescription("Projet pour renouveler les pratiques de lecture et les modalités de réception des œuvres par delà les murs de la classe et les frontières académiques.");
		usage44.addActeur(new Acteur("Grégory DEVIN ", "3 IAN lettres"));
		usage44.addActeur(new Acteur(" Cyril MISTRORIGO ", "3 IAN lettres"));
		usage44.addActeur(new Acteur(" Lionel VIGUIER", "3 IAN lettres"));
		daoUsage.insert(usage44);
		/* __________________________________________________ */
		Usage usage45 = new Usage();
		usage45.setNom("Création et programmation avec Raspberry Pi => EPSBOX");
		usage45.addRessource(new Ressource("Création et programmation avec Raspberry Pi => EPSBOX", "https://epsbox.free.fr/#page-content", "Site Internet"));
		Discipline disci45 = Discipline.LangueVivante;
		usage45.setDiscipline(disci45);
		usage45.setThematique(Thematique.TravailEntrePairs);
		usage45.setAcademie(Academie.Montpellier);
		usage45.setNiveau(Niveau.SecondDegre);
		usage45.setDescription("La boite à ressources numériques pour l'EPS");
		usage45.addActeur(new Acteur("François FONTANY ", "Professeurs d'EPS"));
		usage45.addActeur(new Acteur(" Yannick DARTOIS", "Professeurs d'EPS"));
		daoUsage.insert(usage45);
		/* __________________________________________________ */
		Usage usage46 = new Usage();
		usage46.setNom("EPSilon");
		usage46.addRessource(new Ressource("EPSilon", "https://eps.ac-versailles.fr/spip.php?article138", "Application EPS"));
		Discipline disci46 = Discipline.LangueVivante;
		usage46.setDiscipline(disci46);
		usage46.setThematique(Thematique.DifferenciationPedagogique);
		usage46.setAcademie(Academie.Versailles);
		usage46.setNiveau(Niveau.SecondDegre);
		usage46.setDescription("Application EPS Versailles pour créer des parcours");
		usage46.addActeur(new Acteur("Non précisé", "Professeurs d'EPS"));
		daoUsage.insert(usage46);
		/* __________________________________________________ */
		Usage usage47 = new Usage();
		usage47.setNom("Ressource s pédagogiques numériques");
		usage47.addRessource(new Ressource("Ressource s pédagogiques numériques", "https://sante-social.ac-amiens.fr/257-ressources-pedagogiques-numeriques.html", "Scénarios TraAM"));
		Discipline disci47 = Discipline.ScienceEtVieDeLaTerre;
		usage47.setDiscipline(disci47);
		usage47.setThematique(Thematique.Ludification);
		usage47.setAcademie(Academie.Amiens);
		usage47.setNiveau(Niveau.SecondDegre);
		usage47.setDescription("Conception de plusieurs jeux sérieux");
		usage47.addActeur(new Acteur("Non précisé", "Groupe TraAM"));
		daoUsage.insert(usage47);
		/* __________________________________________________ */
		Usage usage48 = new Usage();
		usage48.setNom("MoocHG");
		usage48.addRessource(new Ressource("MoocHG", "https://hg.ac-besancon.fr/category/moochgb/", "Mooc "));
		Discipline disci48 = Discipline.HistoireGeographie;
		usage48.setDiscipline(disci48);
		usage48.setThematique(Thematique.TravailEntrePairs);
		usage48.setAcademie(Academie.Besancon);
		usage48.setNiveau(Niveau.SecondDegre);
		usage48.setDescription("Mooc organisé depuis plusieurs années par des enseignants pour les enseignants sur les pratiques numériques ");
		usage48.addActeur(new Acteur("Philippe SALLET", "Collectif d’enseignants "));
		daoUsage.insert(usage48);
		/* __________________________________________________ */

	}
}
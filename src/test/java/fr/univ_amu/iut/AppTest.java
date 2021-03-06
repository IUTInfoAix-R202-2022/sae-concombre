package fr.univ_amu.iut;

import fr.univ_amu.iut.ui.fenetrePrincipale.Controller;
import fr.univ_amu.iut.ui.fenetreResultats.TableEntry;
import fr.univ_amu.iut.model.Discipline;
import fr.univ_amu.iut.model.Niveau;
import fr.univ_amu.iut.model.Thematique;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(ApplicationExtension.class)
public class AppTest {

    Stage stage;

    @BeforeEach
    void setUpClass() throws Exception {
        ApplicationTest.launch(AppMain.class, "--testMode=true");
    }

    @Start
    public void start(Stage stage) throws Exception {
        this.stage = stage;
    }

    @Test
    public void test_should_never_fail() {
        assertThat(true).isTrue();
    }

    @Test
    void should_initialize_stage_is_showing() {
        assertThat(stage.isShowing()).isTrue();
    }

    @Test
    void title_is_correct() {
        assertThat(stage.getTitle()).isEqualTo("Carte des académie");
    }

    @Test
    void boutons_ajoutes() {
        Pane disciplinesPane = (Pane) stage.getScene().lookup("#discipline");
        Pane thematiquesPane = (Pane) stage.getScene().lookup("#thematique");

        assertThat(disciplinesPane.getChildren().size()).isEqualTo(Discipline.toutes().size());
        assertThat(thematiquesPane.getChildren().size()).isEqualTo(Thematique.toutes().size());

        for(int i=0;i<disciplinesPane.getChildren().size();i++){
            String actualtext = ((Button)disciplinesPane.getChildren().get(i)).getText();
            String expectedText = Discipline.toutes().get(i).getNom();
            assertThat(actualtext).isEqualTo(expectedText);
        }
        for(int i=0;i<thematiquesPane.getChildren().size();i++){
            String actualtext = ((Button)thematiquesPane.getChildren().get(i)).getText();
            String expectedText = Thematique.toutes().get(i).getNom();
            assertThat(actualtext).isEqualTo(expectedText);
        }
    }

    @Test
    void search_should_open_window(FxRobot robot) {
        Pane disciplinesPane = (Pane) stage.getScene().lookup("#discipline");
        Pane thematiquesPane = (Pane) stage.getScene().lookup("#thematique");
        Node recherche = stage.getScene().lookup("#recherche");

        robot.clickOn(disciplinesPane.getChildren().get(1));
        robot.clickOn(thematiquesPane.getChildren().get(0));


        int windowsCount = Stage.getWindows().size();
        robot.clickOn(recherche);
        assertThat(Stage.getWindows().size()).isEqualTo(windowsCount+1);
    }
    @Test
    void search_window_should_have_1_result(FxRobot robot) {
        Pane disciplinesPane = (Pane) stage.getScene().lookup("#discipline");
        Pane thematiquesPane = (Pane) stage.getScene().lookup("#thematique");
        Node recherche = stage.getScene().lookup("#recherche");

        robot.clickOn(disciplinesPane.getChildren().get(1));
        robot.clickOn(thematiquesPane.getChildren().get(0));


        int windowsCount = Stage.getWindows().size();
        robot.clickOn(recherche);

        Scene resultScene = Stage.getWindows().get(windowsCount).getScene();
        TableView<?> table = (TableView<?>) resultScene.lookup("#table");
        assertThat(table.getItems().size()).isEqualTo(1);
    }

    @Test
    void search_window_result_should_be_shown(FxRobot robot) {
        Pane disciplinesPane = (Pane) stage.getScene().lookup("#discipline");
        Pane thematiquesPane = (Pane) stage.getScene().lookup("#thematique");
        Node recherche = stage.getScene().lookup("#recherche");

        robot.clickOn(disciplinesPane.getChildren().get(1));
        robot.clickOn(thematiquesPane.getChildren().get(0));

        robot.clickOn(recherche);

        Scene resultScene = Stage.getWindows().get(1).getScene();
        TableView<TableEntry> table = (TableView<TableEntry>) resultScene.lookup("#table");
        TableEntry entry = table.getItems().get(0);

        assertThat(entry.getNom()).isEqualTo("Usage spécial 1");
        assertThat(entry.getDescription()).isEqualTo("Un usage très simple, pour un test de recherche");
        assertThat(entry.getDiscipline()).isEqualTo(Discipline.PhysiqueChimie.getNom());
        assertThat(entry.getThematique()).isEqualTo(Thematique.ClasseInversee.getNom());
        assertThat(entry.getNiveau()).isEqualTo(Niveau.PremierDegre.getNom());
    }

    /* Ce test s'appui sur des fonctionnalités non fixées de TestFX (= qui peuvent changer)
    tels que la position de la souris au début du test
    Ce test peut donc faire des faux négatifs
     */
    @Test
    public void button_background_changes_on_click(FxRobot robot){
        Pane disciplinesPane = (Pane) stage.getScene().lookup("#discipline");
        Button button = (Button) disciplinesPane.getChildren().get(0);
        Button button2 = (Button) disciplinesPane.getChildren().get(1);

        assertThat(button.getBackground()).isEqualTo(Controller.btNormalBackground);
        robot.clickOn(button);
        assertThat(button.getBackground()).isEqualTo(Controller.btSelectedBackground);
        robot.clickOn(button);
        assertThat(button.getBackground()).isEqualTo(Controller.btHoverBackground);
        robot.clickOn(button2);
        assertThat(button.getBackground()).isEqualTo(Controller.btNormalBackground);
    }
}


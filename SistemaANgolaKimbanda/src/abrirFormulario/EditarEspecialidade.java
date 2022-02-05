/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirFormulario;

import controller.EditarEspecialidadeController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Especialidade;

/**
 *
 * @author wanzambi
 */
public class EditarEspecialidade extends Application {

    private static Stage stage; //Uma janela

    public EditarEspecialidade(Especialidade pd) {
        EditarEspecialidadeController.setEv(pd);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/EditarEspecialidade.fxml"));
        Scene scene = new Scene(root);
        //ou se você quiser remover todos os três, então use
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        //
        setStage(stage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        EditarEspecialidade.stage = stage;
    }

}

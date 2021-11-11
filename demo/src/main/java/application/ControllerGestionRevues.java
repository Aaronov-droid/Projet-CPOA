package application;

import fabrique.DAOFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerGestionRevues {

    public void initialize(){
        DAOFactory dao = ControllerAccueil.daoF;
    }

    @FXML
    protected void click_btn_retour(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("GestionRevue.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

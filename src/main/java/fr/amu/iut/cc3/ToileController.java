package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    @FXML
    private Button btnTracer;
    @FXML
    private Button btnVider;
    @FXML
    private TextField comp1;
    @FXML
    private TextField comp2;
    @FXML
    private TextField comp3;
    @FXML
    private TextField comp4;
    @FXML
    private TextField comp5;
    @FXML
    private TextField comp6;
    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;
    private TextField sourceOfEvent;

    @FXML
    private Label Erreur1;
    @FXML
    private Label Erreur2;
    @FXML
    private Circle comp1C;
    @FXML
    private Circle comp2C;
    @FXML
    private Circle comp3C;
    @FXML
    private Circle comp4C;
    @FXML
    private Circle comp5C;
    @FXML
    private Circle comp6C;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }





    @FXML
    public void Cercle1 (ActionEvent event ){
        sourceOfEvent = (TextField) event.getSource();
        int axe = GridPane.getRowIndex(sourceOfEvent)+1;
        double valeur= Integer.parseInt(sourceOfEvent.getText());
        verification(valeur);
        int centreX = getXRadarChart(valeur , axe);
        int centreY = getYRadarChart(valeur, axe);
        comp1C.setCenterX(centreX);
        comp1C.setCenterY(centreY);
        comp1C.setVisible(true);

    }
    @FXML
    public void Cercle2 (ActionEvent event ){
        sourceOfEvent = (TextField) event.getSource();
        int axe = GridPane.getRowIndex(sourceOfEvent)+1;
        double valeur= Integer.parseInt(sourceOfEvent.getText());
        verification(valeur);
        int centreX = getXRadarChart(valeur , axe);
        int centreY = getYRadarChart(valeur, axe);
        comp2C.setCenterX(centreX);
        comp2C.setCenterY(centreY);
        comp2C.setVisible(true);

    }
    @FXML
    public void Cercle3 (ActionEvent event ){
        sourceOfEvent = (TextField) event.getSource();
        int axe = GridPane.getRowIndex(sourceOfEvent)+1;
        double valeur= Integer.parseInt(sourceOfEvent.getText());
        verification(valeur);
        int centreX = getXRadarChart(valeur , axe);
        int centreY = getYRadarChart(valeur, axe);
        comp3C.setCenterX(centreX);
        comp3C.setCenterY(centreY);
        comp3C.setVisible(true);

    }
    @FXML
    public void Cercle4 (ActionEvent event ){
        sourceOfEvent = (TextField) event.getSource();
        int axe = GridPane.getRowIndex(sourceOfEvent)+1;
        double valeur= Integer.parseInt(sourceOfEvent.getText());
        verification(valeur);
        int centreX = getXRadarChart(valeur , axe);
        int centreY = getYRadarChart(valeur, axe);
        comp4C.setCenterX(centreX);
        comp4C.setCenterY(centreY);
        comp4C.setVisible(true);

    }
    @FXML
    public void Cercle5 (ActionEvent event ){
        sourceOfEvent = (TextField) event.getSource();
        int axe = GridPane.getRowIndex(sourceOfEvent)+1;
        double valeur= Integer.parseInt(sourceOfEvent.getText());
        verification(valeur);
        int centreX = getXRadarChart(valeur , axe);
        int centreY = getYRadarChart(valeur, axe);
        comp5C.setCenterX(centreX);
        comp5C.setCenterY(centreY);
        comp5C.setVisible(true);

    }
    @FXML
    public void Cercle6 (ActionEvent event ){
        sourceOfEvent = (TextField) event.getSource();
        int axe = GridPane.getRowIndex(sourceOfEvent)+1;
        double valeur= Integer.parseInt(sourceOfEvent.getText());
        verification(valeur);
        int centreX = getXRadarChart(valeur , axe);
        int centreY = getYRadarChart(valeur, axe);
        comp6C.setCenterX(centreX);
        comp6C.setCenterY(centreY);
        comp6C.setVisible(true);
    }

public void verification(double valeur){
    if(valeur > 20)  {

        Erreur1.setVisible(true);
        Erreur2.setVisible(true);

    }
}

    @FXML
    public void BtnVider (ActionEvent event){

    }


}

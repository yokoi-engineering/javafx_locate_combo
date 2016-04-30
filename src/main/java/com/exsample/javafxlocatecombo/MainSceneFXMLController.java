package com.exsample.javafxlocatecombo;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainSceneFXMLController implements Initializable {

    @FXML
    private ComboBox<ParakeetEnum> comboParakeet;
    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<ParakeetEnum> list = FXCollections.observableArrayList(ParakeetEnum.values());
        comboParakeet.getItems().addAll(list);
        comboParakeet.valueProperty().addListener((ObservableValue<? extends ParakeetEnum> observable, ParakeetEnum oldValue, ParakeetEnum newValue) -> {
            if (Objects.nonNull(newValue)) {
                label.setText(newValue.name());
            }
        });
    }

}

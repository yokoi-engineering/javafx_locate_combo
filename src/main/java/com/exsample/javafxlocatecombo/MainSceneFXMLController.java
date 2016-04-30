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
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class MainSceneFXMLController implements Initializable {

    @FXML
    private ComboBox<ParakeetEnum> comboParakeet;
    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Callback<ListView<ParakeetEnum>, ListCell<ParakeetEnum>> cellFactory
                = (ListView<ParakeetEnum> param) -> new ListCell<ParakeetEnum>() {
            @Override
            protected void updateItem(ParakeetEnum item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null && !empty) {
                    setText(item.getName());
                }
            }
        };
        ObservableList<ParakeetEnum> list
                = FXCollections.observableArrayList(ParakeetEnum.values());
        comboParakeet.getItems().addAll(list);
        comboParakeet.setButtonCell(cellFactory.call(null));
        comboParakeet.setCellFactory(cellFactory);
        comboParakeet.valueProperty().addListener((
                ObservableValue<? extends ParakeetEnum> observable,
                ParakeetEnum oldValue, ParakeetEnum newValue) -> {
            if (Objects.nonNull(newValue)) {
                label.setText(newValue.getName());
            }
        });
    }

}

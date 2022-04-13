package pl.lublin.wsei.java.cwiczenia.lab3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {
    public Label lbFile;
    public ImageView imgMiniaturka;
    public Button btnPokazInfografike;
    public TextField txtAdresStrony;
    public Button btnPrzejdzDoStrony;

    FileChooser fileChooser = new FileChooser();
    FileChooser.ExtensionFilter xmlFilter = new FileChooser.ExtensionFilter("Pliki XML (*.xml)", "*.xml");

    public ListView lstInfografiki;
    ObservableList<String> tytuly = FXCollections.observableArrayList();
    GusInfoGraphicList igList;

    @FXML
    public void initialize() {
        fileChooser.getExtensionFilters().add(xmlFilter);
    }

    public void btnOpenFileAction(ActionEvent actionEvent) {
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            igList = new GusInfoGraphicList(file.getAbsolutePath());
            lbFile.setText(file.getAbsolutePath());

            for(Infografika ig: igList.infografiki) {
                tytuly.add(ig.tytul);
            }

            lstInfografiki.setItems(tytuly);
        } else {
            lbFile.setText("Proszę wczytać plik ...");
        }
    }
}
package SongLibrary.ControllerTing;


//import SongLibrary.Model.Song;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.collections.ObservableList;

public class SongLibController {

    @FXML TextField addAlbum;
    @FXML TextField addArtist;
    @FXML Button addBut;
    @FXML TextField addName;
    @FXML
     Text addTit;
    @FXML TextField addYear;
    @FXML Button delete;
    @FXML TextField editAlbum;
    @FXML TextField editArtist;
    @FXML Button editBut;
    @FXML TextField editName;
    @FXML
     Text editTit;
    @FXML   TextField editYear;
    @FXML  ListView<String> list;
    @FXML   Text title;
    
    

 //private observableList <String> obsList;

    private ObservableList<String> obsList = FXCollections.observableArrayList();
    
    String file = 

    public void add(ActionEvent e) {
        System.out.println("add");
    }

    public void edit(ActionEvent e) {
        System.out.println("edit");
    }

    public void delete(ActionEvent e) {
        System.out.println("delete");
    }
}

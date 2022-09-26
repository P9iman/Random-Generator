import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class MainSceneController
{

    @FXML
    private ImageView diceIMG;

    @FXML
    private ImageView coinIMG;

    @FXML
    private ImageView numberIMG;

    @FXML
    private Button diceRollBtn;

    @FXML
    private Button coinFlipBtn;

    @FXML
    private Button randomNumbBtn;


    public MainSceneController() {
    }   


    @FXML
    void openCoinFlipWindow(ActionEvent event) 
    {
        
    }

    @FXML
    void openDiceRollWindow(ActionEvent event) {
       DiceController diceCon = new DiceController(); 
    }

    @FXML
    void openRandomNumberWindow(ActionEvent event) {

    }

}

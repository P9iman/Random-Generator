import java.io.IOException;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class DiceController 
{
    

    public DiceController() 
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Fxml Files/DiceScene.fxml"));
            Scene scene = new Scene(root); 
            Stage stage = new Stage();
            stage.setTitle("Dice Roll");
            stage.setScene(scene);
            stage.show(); 
        } catch (IOException e) {
            System.err.println("Das hat nicht geklappt :(");
        }
        
    }


    @FXML
    private Button rollDiceBtn;

    @FXML
    private ImageView diceResultImg;

    @FXML
    private Button closeBtn;

    @FXML
    private Label diceResultLabel;

    @FXML
    void closeDiceWindow(ActionEvent event)
    {

    }

    @FXML
    void rollTheDice(ActionEvent event) {

    }


    

    /**
     * Rolls a dice with n sides and returns the result.
     * 
     * @param sides The preferred number of sides
     * @return A number between 1 and n(inclusive)
     */
    public int diceRoll(int sides)
    {
        Random rand = new Random(); 
        int result = rand.nextInt(sides)+1; 
        return result;  
    }

    /**
     * Rolls a dice with 6 sides and returns the result. 
     * 
     * @return A number between 1 and 6(inclusive) 
     */
    public int diceRoll()
    {
        return this.diceRoll(6); 
    }




}


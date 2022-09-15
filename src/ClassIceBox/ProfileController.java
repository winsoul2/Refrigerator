package ClassIceBox;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class ProfileController {

    @FXML
    private Button Back;

    @FXML
    private ImageView H;

    //ปุ่มสำหรับไปยัง Menu
    @FXML
    public void Back(ActionEvent event){
        try {
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene scene = new Scene(fxmlLoader);
            Stage stage = (Stage) Back.getScene().getWindow();
            stage.setTitle("Menu");
            stage.setScene(scene);

        } catch (Exception e){
            System.out.println("Can not load ICEBOX window");
        }
    }


    @FXML
    public void initialize(){

        H.setImage(new Image("Profile/H.jpg"));
        File file1 = new File("RefrigeratorData.csv");
        try{

            if(!file1.exists()){
                file1.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

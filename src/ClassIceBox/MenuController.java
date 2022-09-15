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

public class MenuController {

    @FXML
    private ImageView A;
    @FXML
    private Button Openicebox;
    @FXML
    private Button Profile;


    //ปุ่มสำหรับไปยัง ICEBOX
    @FXML
    public void OpenButton(ActionEvent event){
        try {
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("ICEBOX.fxml"));
            Scene scene = new Scene(fxmlLoader);
            Stage stage = (Stage) Openicebox.getScene().getWindow();
            stage.setTitle("ICEBOX");
            stage.setScene(scene);

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    //ปุ่มสำหรับไปยัง Profile
    @FXML
    public void Profile(ActionEvent event){
        try {
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Profile.fxml"));
            Scene scene = new Scene(fxmlLoader);
            Stage stage = (Stage) Profile.getScene().getWindow();
            stage.setTitle("Profile");
            stage.setScene(scene);

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }




    @FXML
    public void initialize(){

        A.setImage(new Image("Profile/A.jpg"));
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

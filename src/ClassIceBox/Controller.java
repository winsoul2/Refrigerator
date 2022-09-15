package ClassIceBox;

import java.awt.*;
import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class Controller {

    @FXML
    private DatePicker Day;
    @FXML
    private DatePicker DayCold;

    @FXML
    private Label NotIn,NotInCold;

    @FXML
    private Button Out1,Out2;


    @FXML
    ComboBox<String> comboBoxUnit;
    @FXML
    ComboBox<String> comboBoxSlot;
    @FXML
    ComboBox<String> comboBoxUnitCold;
    @FXML
    ComboBox<String> comboBoxSlotCold;

    @FXML
    ComboBox<String> comboBoxOut1,comboBoxOut2,comboBoxOutCold1,comboBoxOutCold2;



    @FXML
    private Button Back1,Back2,Back3,Back4,Back5,Back6;


    //TextField ของช่องเเช่เย็น
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField unitTextField;
    @FXML
    private TextField  AmountTextField;




    //TextField ของช่องเเช่เเข็ง
    @FXML
    private TextField NameTextFieldCold;
    @FXML
    private TextField unitTextFieldCold;
    @FXML
    private TextField AmountTextFieldCold;



    @FXML
    private TextField Out;

    // TextField หน้าช่องเย็น
    @FXML
    private Label Name1,Name2,Name3,Name4,Name5,Name6;
    @FXML
    private ImageView pic1,pic2,pic3,pic4,pic5,pic6;
    @FXML
    private Label Type1,Type2,Type3,Type4,Type5,Type6;
    @FXML
    private Label Time1,Time2,Time3,Time4,Time5,Time6;
    @FXML
    private Label Unit1,Unit2,Unit3,Unit4,Unit5,Unit6;
    @FXML
    private Label Exp1,Exp2,Exp3,Exp4,Exp5,Exp6;

    // TextField หน้าช่องเเข็ง
    @FXML
    private Label NameCold1,NameCold2;
    @FXML
    private ImageView piccold1,piccold2;
    @FXML
    private Label TypeCold1,TypeCold2;
    @FXML
    private Label TimeCold1,TimeCold2;
    @FXML
    private Label UnitCold1,UnitCold2;
    @FXML
    private Label ExpCold1,ExpCold2;


    //เเสดงผล
    @FXML
    private TableView<ClassFood> View;
    @FXML
    private TableColumn<ClassFood, String> ViewName;
    @FXML
    private TableColumn<ClassFood, String> ViewType;
    @FXML
    private TableColumn<ClassFood, String> ViewTime;

    @FXML
    private TableColumn<ClassFood, String> ViewUnit;
    @FXML
    private TableColumn<ClassFood, String> ViewExp;
    @FXML
    private TableColumn<ClassFood, String> ViewAmount;


    //ปุ่มเเสดงผม
    @FXML private Button View1,View2,View3,View4,View5,View6;
    @FXML private Button ViewCold1,ViewCold2;





    //ปุ่มกลับไปหน้า Menu
    @FXML
    public void Back1(ActionEvent event){
        try {
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene scene = new Scene(fxmlLoader);
            Stage stage = (Stage) Back1.getScene().getWindow();
            stage.setTitle("Menu");
            stage.setScene(scene);

        } catch (Exception e){
            System.out.println("Can not load ICEBOX window");
        }
    }
    @FXML
    public void Back2(ActionEvent event){
        try {
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene scene = new Scene(fxmlLoader);
            Stage stage = (Stage) Back2.getScene().getWindow();
            stage.setTitle("Menu");
            stage.setScene(scene);

        } catch (Exception e){
            System.out.println("Can not load ICEBOX window");
        }
    }@FXML
    public void Back3(ActionEvent event){
        try {
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene scene = new Scene(fxmlLoader);
            Stage stage = (Stage) Back3.getScene().getWindow();
            stage.setTitle("Menu");
            stage.setScene(scene);

        } catch (Exception e){
            System.out.println("Can not load ICEBOX window");
        }
    }@FXML
    public void Back4(ActionEvent event){
        try {
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene scene = new Scene(fxmlLoader);
            Stage stage = (Stage) Back4.getScene().getWindow();
            stage.setTitle("Menu");
            stage.setScene(scene);

        } catch (Exception e){
            System.out.println("Can not load ICEBOX window");
        }
    }@FXML
    public void Back5(ActionEvent event){
        try {
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene scene = new Scene(fxmlLoader);
            Stage stage = (Stage) Back5.getScene().getWindow();
            stage.setTitle("Menu");
            stage.setScene(scene);

        } catch (Exception e){
            System.out.println("Can not load ICEBOX window");
        }
    }@FXML
    public void Back6(ActionEvent event){
        try {
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene scene = new Scene(fxmlLoader);
            Stage stage = (Stage) Back6.getScene().getWindow();
            stage.setTitle("Menu");
            stage.setScene(scene);

        } catch (Exception e){
            System.out.println("Can not load ICEBOX window");
        }
    }




    //ปุ่ม Clear ช่องเย็น
    @FXML
    public void handleClearButton(ActionEvent event) {
        NameTextField.setText("");
        unitTextField.setText("");
        AmountTextField.setText("");
        comboBoxUnit.setValue(null);
        comboBoxSlot.setValue(null);


    }

    //ปุ่ม Clear ช่องเเข็ง
    @FXML
    public void handleClearButtonCold(ActionEvent event) {
        NameTextFieldCold.setText("");
        unitTextFieldCold.setText("");
        AmountTextFieldCold.setText("");
        comboBoxUnitCold.setValue(null);
        comboBoxSlotCold.setValue(null);





    }





    //เก็บรูป
    @FXML
    ImageView Image1;
    @FXML
    ImageView Image2;

    // ปุ่ามเพิ่มรุป
    @FXML
    Button addpic1;
    @FXML
    Button addpic2;

    @FXML
    public void handle(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        // SET FILECHOOSER INITIAL DIRECTORY
        chooser.setInitialDirectory(new File(System.getProperty("user.dir")));
        // DEFINE ACCEPTABLE FILE EXTENSION
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("images PNG JPG", "*.png", "*.jpg"));
        // GET FILE FROM FILECHOOSER WITH JAVAFX COMPONENT WINDOW
        File file = chooser.showOpenDialog(addpic1.getScene().getWindow());
        if (file != null) {
            try {
                // CREATE FOLDER IF NOT EXIST
                File destDir = new File("images");
                destDir.mkdirs();
                // RENAME FILE
                String[] fileSplit = file.getName().split("\\.");
                String filename = LocalDate.now() + "_" + System.currentTimeMillis() + "." + fileSplit[fileSplit.length - 1];
                Path target = FileSystems.getDefault().getPath(destDir.getAbsolutePath() + System.getProperty("file.separator") + filename);
                // COPY WITH FLAG REPLACE FILE IF FILE IS EXIST
                Files.copy(file.toPath(), target, StandardCopyOption.REPLACE_EXISTING);
                // SET NEW FILE PATH TO IMAGE
                Image1.setImage(new Image(target.toUri().toString()));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //ส่วนเก็บ combobox
    public void initialize(){
       comboBoxUnit.getItems().addAll("ของหวาน","อาหารสด","เครื่องดื่ม","ขนม","อาหารสำเสร็จรูป");
       comboBoxSlot.getItems().addAll("1","2","3","4","5","6");
       comboBoxUnitCold.getItems().addAll("ของหวาน","เครื่องดื่ม","ขนม","อาหารสำเสร็จรูป");
       comboBoxSlotCold.getItems().addAll("1","2");


       comboBoxOut1.getItems().addAll("1","2","3","4","5","6");
       comboBoxOutCold1.getItems().addAll("1","2");


       try {

           Label[] Name = {Name1,Name2,Name3,Name4,Name5,Name6};
           ImageView[] Pic = {pic1,pic2,pic3,pic4,pic5,pic6};
           Label[] Type =  {Type1,Type2,Type3,Type4,Type5,Type6};
           Label[] Time = {Time1,Time2,Time3,Time4,Time5,Time6};
           Label[] Unit = {Unit1,Unit2,Unit3,Unit4,Unit5,Unit6};
           Label[] Exp = {Exp1,Exp2,Exp3,Exp4,Exp5,Exp6};

           Label[] NameCold = {NameCold1,NameCold2};
           ImageView[] PicCold = {piccold1,piccold2};
           Label[] TypeCold = {TypeCold1,TypeCold2};
           Label[] TimeCold = {TimeCold1,TimeCold2};
           Label[] UnitCold = {UnitCold1,UnitCold2};
           Label[] ExpCold = {ExpCold1,ExpCold2};


           FileReader file = new FileReader("RefrigeratorData.csv");
           BufferedReader reader = new BufferedReader(file);
           String line = null;


           while ((line = reader.readLine()) != null){
               String[] data = line.split(",");
               ClassFood food = new ClassFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]);
               String A = data[6];
               String B = data[7];
               int C = 999;
               if (food.getSelect().equals("normal") ){
                   int y = Integer.parseInt(A);
                   int x = Integer.parseInt(A) - 1;
                   if (LocalDate.now().isBefore(LocalDate.parse(food.getExp()))){
                       String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(food.getFirst()), LocalDate.now()));
                       if(Integer.parseInt(p) < C){
                           Name[x].setText(y +"  "+ food.getName());
                           Type[x].setText("ประเภทอาหาร : " + food.getType());
                           Time[x].setText("เวลาอยู่ในตู้เย็น : " + p + "  วัน");
                           Unit[x].setText("ปริมาณ : " + food.getAmount() + "  " + food.getUnitName());
                           Exp[x].setText("วันหมดอายุ : " + food.getExp());
                       }
                   }

               }

               else {
                   int y = Integer.parseInt(A);
                   int x = Integer.parseInt(A) - 1;
                   if (LocalDate.now().isBefore(LocalDate.parse(food.getExp()))) {
                       String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(food.getFirst()), LocalDate.now()));
                       if (Integer.parseInt(p) < C) {
                           NameCold[x].setText(y + "  " + food.getName());
                           TypeCold[x].setText("ประเภทอาหาร : " + food.getType());
                           TimeCold[x].setText("เวลาอยู่ในตู้เย็น : " + p + "  วัน");
                           UnitCold[x].setText("ปริมาณ : " + food.getAmount() + "  " + food.getUnitName());
                           ExpCold[x].setText("วันหมดอายุ : " + food.getExp());
                       }

                   }
               }


           }
           reader.close();
       } catch (IOException x ){
           System.err.println(x.getMessage());
    }
    }




    //ปุ่มเพิ่ม เย็น 1
    @FXML
    public void AddFood(ActionEvent event){
        NotIn.setOpacity(0);
        String select = "normal";
        ChilledFood food = new ChilledFood(NameTextField.getText(),comboBoxUnit.getSelectionModel().getSelectedItem().toString(),AmountTextField.getText(),
                unitTextField.getText(),Day.getValue().toString(),addpic1.getText(),comboBoxSlot.getSelectionModel().getSelectedItem().toString(),select);

        try {
            FileReader file1 = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file1);
            String line = null;

            int k = 0 ;
            while((line = reader.readLine()) != null ){
                String[] data = line.split(",");

                if (food.getSlot().equals(data[6]) && data[7].equals("normal") ){
                    k += 1 ;
                    if(food.getType().equals(data[1])){
                        try{

                            FileWriter file = new FileWriter("RefrigeratorData.csv",true);
                            BufferedWriter writer = new BufferedWriter(file);
                            writer.write(food.toString());
                            writer.newLine();
                            writer.flush();
                            if (writer != null){
                                writer.close();

                            }
                            break;

                        } catch (IOException x ){
                            System.err.println(x.getMessage());
                        }

                    }
                    else{
                        k += 10 ;

                    }


                }

                else {
                    k += 2 ;
                    try{
                        FileWriter file = new FileWriter("RefrigeratorData.csv",true);
                        BufferedWriter writer = new BufferedWriter(file);
                        writer.write(food.toString());
                        writer.newLine();
                        writer.flush();
                        if (writer != null){
                            writer.close();

                        }

                    } catch (IOException x ){
                        System.err.println(x.getMessage());

                    }
                    break;
                }

            }
            if (k == 0 ){
                try{
                    FileWriter file = new FileWriter("RefrigeratorData.csv",true);
                    BufferedWriter writer = new BufferedWriter(file);
                    writer.write(food.toString());
                    writer.newLine();
                    writer.flush();
                    if (writer != null){
                        writer.close();

                    }

                } catch (IOException x ){
                    System.err.println(x.getMessage());
                }

            }

            if(k == 10 ){
                NotIn.setOpacity(1);
            }

        } catch (IOException x){
            System.err.println(x.getMessage());
        }




        //อ่านใหม่อีกรอบ
        try {
            Label[] Name = {Name1,Name2,Name3,Name4,Name5,Name6};
            ImageView[] Pic = {pic1,pic2,pic3,pic4,pic5,pic6};
            Label[] Type =  {Type1,Type2,Type3,Type4,Type5,Type6};
            Label[] Time = {Time1,Time2,Time3,Time4,Time5,Time6};
            Label[] Unit = {Unit1,Unit2,Unit3,Unit4,Unit5,Unit6};
            Label[] Exp = {Exp1,Exp2,Exp3,Exp4,Exp5,Exp6};

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;
            int C = 999;

            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");
                ChilledFood food1 = new ChilledFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]);
                String A = data[6];

                int y = Integer.parseInt(A);
                int x = Integer.parseInt(A) - 1;
                if (LocalDate.now().isBefore(LocalDate.parse(food1.getExp())) && food1.getSelect().equals("normal")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(food1.getFirst()), LocalDate.now()));
                    if(Integer.parseInt(p) < C){
                        Name[x].setText(y +"  "+ food1.getName());
                        Type[x].setText("ประเภทอาหาร : " + food1.getType());
                        Time[x].setText("เวลาอยู่ในตู้เย็น : " + p + "  วัน");
                        Unit[x].setText("ปริมาณ : " + food1.getAmount() + "  " + food1.getUnitName());
                        Exp[x].setText("วันหมดอายุ : " + food1.getExp());
                    }
                }

            }
        } catch (IOException x ){
            System.err.println(x.getMessage());
        }


    }


    //เพิ่ม ช่องเเข็ง 1
    @FXML
    public void AddFoodCold(ActionEvent event) {
        NotInCold.setOpacity(0);
        String select = "cold";
        FrozenFood food = new FrozenFood(NameTextFieldCold.getText(), comboBoxUnitCold.getSelectionModel().getSelectedItem().toString(), AmountTextFieldCold.getText(),
                unitTextFieldCold.getText(), DayCold.getValue().toString(), addpic2.getText(), comboBoxSlotCold.getSelectionModel().getSelectedItem().toString(), select);
        try {
            FileReader file1 = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file1);
            String line = null;

            int k = 0 ;

            while((line = reader.readLine()) != null ){
                String[] data = line.split(",");


                if (food.getSlot().equals(data[6]) && data[7].equals("cold")){
                    k += 1 ;

                    if(food.getType().equals(data[1])){

                        try{

                            FileWriter file = new FileWriter("RefrigeratorData.csv",true);
                            BufferedWriter writer = new BufferedWriter(file);
                            writer.write(food.toString());
                            writer.newLine();
                            writer.flush();
                            if (writer != null){
                                writer.close();

                            }
                            break;

                        } catch (IOException x ){
                            System.err.println(x.getMessage());
                        }

                    }
                    else{
                        k += 10 ;

                    }



                }

                else {
                    k += 2 ;

                    try{
                        FileWriter file = new FileWriter("RefrigeratorData.csv",true);
                        BufferedWriter writer = new BufferedWriter(file);
                        writer.write(food.toString());
                        writer.newLine();
                        writer.flush();
                        if (writer != null){
                            writer.close();

                        }

                    } catch (IOException x ){
                        System.err.println(x.getMessage());

                    }
                    break;
                }

            }
            if (k == 0 ){

                try{
                    FileWriter file = new FileWriter("RefrigeratorData.csv",true);
                    BufferedWriter writer = new BufferedWriter(file);
                    writer.write(food.toString());
                    writer.newLine();
                    writer.flush();
                    if (writer != null){
                        writer.close();

                    }

                } catch (IOException x ){
                    System.err.println(x.getMessage());
                }

            }
            if(k == 10 ){
                NotInCold.setOpacity(1);
            }
        } catch (IOException x){
            System.err.println(x.getMessage());
        }


        //อ่านใหม่อีกรอบ
        try {
            Label[] NameCold = {NameCold1, NameCold2};
            ImageView[] PicCold = {piccold1, piccold2};
            Label[] TypeCold = {TypeCold1, TypeCold2};
            Label[] TimeCold = {TimeCold1, TimeCold2};
            Label[] UnitCold = {UnitCold1, UnitCold2};
            Label[] ExpCold = {ExpCold1, ExpCold2};

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;
            int C = 999;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                FrozenFood food2 = new FrozenFood(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]);
                String A = data[6];

                int y = Integer.parseInt(A);
                int x = Integer.parseInt(A) - 1;
                if (LocalDate.now().isBefore(LocalDate.parse(food2.getExp())) && food2.getSelect().equals("cold")) {
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(food2.getFirst()), LocalDate.now()));
                    if(Integer.parseInt(p) < C){
                        NameCold[x].setText(y +"  "+ food2.getName());
                        TypeCold[x].setText("ประเภทอาหาร : " + food2.getType());
                        TimeCold[x].setText("เวลาอยู่ในตู้เย็น : " + p + "  วัน");
                        UnitCold[x].setText("ปริมาณ : " + food2.getAmount() + "  " + food2.getUnitName());
                        ExpCold[x].setText("วันหมดอายุ : " + food2.getExp());
                    }
                }

            }
        } catch (IOException x) {
            System.err.println(x.getMessage());
        }


    }

    //ปุ่มเช็คของ
    public void View1 (ActionEvent event){
        try {

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;


            ArrayList<String> Name = new ArrayList<>();
            ArrayList<String> Type = new ArrayList<>();
            ArrayList<String> Time= new ArrayList<>();
            ArrayList<String> Amount = new ArrayList<>();
            ArrayList<String> Unit = new ArrayList<>();
            ArrayList<String> Exp = new ArrayList<>();

            int n = 0 ;
            ObservableList<ClassFood> list = FXCollections.observableArrayList();

            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");

                ChilledFood ViewFood = new ChilledFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                if (ViewFood.getSlot().equals("1")  && ViewFood.getSelect().equals("normal")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(ViewFood.getFirst()), LocalDate.now()));
                    list.add(new ClassFood(data[0],data[1],data[2],data[3],p,data[4]));

                }


            }

            ViewName.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Name"));
            ViewType.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Type"));
            ViewAmount.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Amount"));
            ViewUnit.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("UnitName"));
            ViewTime.setCellValueFactory(new PropertyValueFactory<ClassFood, String >("Time"));
            ViewExp.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Exp"));

            View.setItems(list);




        } catch (IOException x ){
            System.err.println(x.getMessage());
        }

    }

    public void View2 (ActionEvent event){
        try {

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;


            ArrayList<String> Name = new ArrayList<>();
            ArrayList<String> Type = new ArrayList<>();
            ArrayList<String> Time= new ArrayList<>();
            ArrayList<String> Amount = new ArrayList<>();
            ArrayList<String> Unit = new ArrayList<>();
            ArrayList<String> Exp = new ArrayList<>();

            int n = 0 ;
            ObservableList<ClassFood> list = FXCollections.observableArrayList();

            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");

                ChilledFood ViewFood = new ChilledFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                if (ViewFood.getSlot().equals("2")  && ViewFood.getSelect().equals("normal")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(ViewFood.getFirst()), LocalDate.now()));
                    list.add(new ClassFood(data[0],data[1],data[2],data[3],p,data[4]));


                }


            }

            ViewName.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Name"));
            ViewType.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Type"));
            ViewAmount.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Amount"));
            ViewUnit.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("UnitName"));
            ViewTime.setCellValueFactory(new PropertyValueFactory<ClassFood, String >("Time"));
            ViewExp.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Exp"));

            View.setItems(list);




        } catch (IOException x ){
            System.err.println(x.getMessage());
        }

    }
    public void View3 (ActionEvent event){
        try {

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;


            ArrayList<String> Name = new ArrayList<>();
            ArrayList<String> Type = new ArrayList<>();
            ArrayList<String> Time= new ArrayList<>();
            ArrayList<String> Amount = new ArrayList<>();
            ArrayList<String> Unit = new ArrayList<>();
            ArrayList<String> Exp = new ArrayList<>();

            int n = 0 ;
            ObservableList<ClassFood> list = FXCollections.observableArrayList();

            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");

                ChilledFood ViewFood = new ChilledFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                if (ViewFood.getSlot().equals("3")  && ViewFood.getSelect().equals("normal")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(ViewFood.getFirst()), LocalDate.now()));
                    list.add(new ClassFood(data[0],data[1],data[2],data[3],p,data[4]));


                }


            }

            ViewName.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Name"));
            ViewType.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Type"));
            ViewAmount.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Amount"));
            ViewUnit.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("UnitName"));
            ViewTime.setCellValueFactory(new PropertyValueFactory<ClassFood, String >("Time"));
            ViewExp.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Exp"));

            View.setItems(list);




        } catch (IOException x ){
            System.err.println(x.getMessage());
        }

    }

    public void View4 (ActionEvent event){
        try {

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;


            ArrayList<String> Name = new ArrayList<>();
            ArrayList<String> Type = new ArrayList<>();
            ArrayList<String> Time= new ArrayList<>();
            ArrayList<String> Amount = new ArrayList<>();
            ArrayList<String> Unit = new ArrayList<>();
            ArrayList<String> Exp = new ArrayList<>();

            int n = 0 ;
            ObservableList<ClassFood> list = FXCollections.observableArrayList();

            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");

                ChilledFood ViewFood = new ChilledFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                if (ViewFood.getSlot().equals("4")  && ViewFood.getSelect().equals("normal")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(ViewFood.getFirst()), LocalDate.now()));
                    list.add(new ClassFood(data[0],data[1],data[2],data[3],p,data[4]));


                }


            }

            ViewName.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Name"));
            ViewType.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Type"));
            ViewAmount.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Amount"));
            ViewUnit.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("UnitName"));
            ViewTime.setCellValueFactory(new PropertyValueFactory<ClassFood, String >("Time"));
            ViewExp.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Exp"));

            View.setItems(list);




        } catch (IOException x ){
            System.err.println(x.getMessage());
        }

    }

    public void View5 (ActionEvent event){
        try {

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;


            ArrayList<String> Name = new ArrayList<>();
            ArrayList<String> Type = new ArrayList<>();
            ArrayList<String> Time= new ArrayList<>();
            ArrayList<String> Amount = new ArrayList<>();
            ArrayList<String> Unit = new ArrayList<>();
            ArrayList<String> Exp = new ArrayList<>();

            int n = 0 ;
            ObservableList<ClassFood> list = FXCollections.observableArrayList();

            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");

                ChilledFood ViewFood = new ChilledFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                if (ViewFood.getSlot().equals("5")  && ViewFood.getSelect().equals("normal")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(ViewFood.getFirst()), LocalDate.now()));
                    list.add(new ClassFood(data[0],data[1],data[2],data[3],p,data[4]));


                }


            }

            ViewName.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Name"));
            ViewType.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Type"));
            ViewAmount.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Amount"));
            ViewUnit.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("UnitName"));
            ViewTime.setCellValueFactory(new PropertyValueFactory<ClassFood, String >("Time"));
            ViewExp.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Exp"));

            View.setItems(list);




        } catch (IOException x ){
            System.err.println(x.getMessage());
        }

    }

    public void View6 (ActionEvent event){
        try {

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;


            ArrayList<String> Name = new ArrayList<>();
            ArrayList<String> Type = new ArrayList<>();
            ArrayList<String> Time= new ArrayList<>();
            ArrayList<String> Amount = new ArrayList<>();
            ArrayList<String> Unit = new ArrayList<>();
            ArrayList<String> Exp = new ArrayList<>();

            int n = 0 ;
            ObservableList<ClassFood> list = FXCollections.observableArrayList();

            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");

                ChilledFood ViewFood = new ChilledFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                if (ViewFood.getSlot().equals("6")  && ViewFood.getSelect().equals("normal")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(ViewFood.getFirst()), LocalDate.now()));
                    list.add(new ClassFood(data[0],data[1],data[2],data[3],p,data[4]));


                }


            }

            ViewName.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Name"));
            ViewType.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Type"));
            ViewAmount.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Amount"));
            ViewUnit.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("UnitName"));
            ViewTime.setCellValueFactory(new PropertyValueFactory<ClassFood, String >("Time"));
            ViewExp.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Exp"));

            View.setItems(list);




        } catch (IOException x ){
            System.err.println(x.getMessage());
        }

    }

    public void ViewCold1 (ActionEvent event){
        try {

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;


            ArrayList<String> Name = new ArrayList<>();
            ArrayList<String> Type = new ArrayList<>();
            ArrayList<String> Time= new ArrayList<>();
            ArrayList<String> Amount = new ArrayList<>();
            ArrayList<String> Unit = new ArrayList<>();
            ArrayList<String> Exp = new ArrayList<>();

            int n = 0 ;
            ObservableList<ClassFood> list = FXCollections.observableArrayList();

            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");

                ChilledFood ViewFood = new ChilledFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                if (ViewFood.getSlot().equals("1")  && ViewFood.getSelect().equals("cold")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(ViewFood.getFirst()), LocalDate.now()));
                    list.add(new ClassFood(data[0],data[1],data[2],data[3],p,data[4]));


                }


            }

            ViewName.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Name"));
            ViewType.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Type"));
            ViewAmount.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Amount"));
            ViewUnit.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("UnitName"));
            ViewTime.setCellValueFactory(new PropertyValueFactory<ClassFood, String >("Time"));
            ViewExp.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Exp"));

            View.setItems(list);




        } catch (IOException x ){
            System.err.println(x.getMessage());
        }

    }

    public void ViewCold2 (ActionEvent event){
        try {

            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;


            ArrayList<String> Name = new ArrayList<>();
            ArrayList<String> Type = new ArrayList<>();
            ArrayList<String> Time= new ArrayList<>();
            ArrayList<String> Amount = new ArrayList<>();
            ArrayList<String> Unit = new ArrayList<>();
            ArrayList<String> Exp = new ArrayList<>();

            int n = 0 ;
            ObservableList<ClassFood> list = FXCollections.observableArrayList();

            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");

                ChilledFood ViewFood = new ChilledFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                if (ViewFood.getSlot().equals("2")  && ViewFood.getSelect().equals("cold")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(ViewFood.getFirst()), LocalDate.now()));
                    list.add(new ClassFood(data[0],data[1],data[2],data[3],p,data[4]));


                }


            }

            ViewName.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Name"));
            ViewType.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Type"));
            ViewAmount.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Amount"));
            ViewUnit.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("UnitName"));
            ViewTime.setCellValueFactory(new PropertyValueFactory<ClassFood, String >("Time"));
            ViewExp.setCellValueFactory(new PropertyValueFactory<ClassFood, String>("Exp"));

            View.setItems(list);




        } catch (IOException x ){
            System.err.println(x.getMessage());
        }

    }








    // combobox เอาออก (ช่องอาหาร)
    public void selectout1 (ActionEvent actionEvent) throws IOException {
        String A = comboBoxOut1.getValue().toString();
        comboBoxOut2.getItems().clear();
        try {
            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;
            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");
                if(data[6].equals(A) && data[7].equals("normal")){
                    comboBoxOut2.getItems().addAll(data[0]);

                }
            }
        } catch (IOException x ) {
            System.err.println(x.getMessage());
        }
    }

    // combobox เอาออก (ช่องอาหารเเข็ง)
    public void selectout2 (ActionEvent actionEvent) throws IOException {
        String A = comboBoxOutCold1.getValue().toString();
        comboBoxOutCold2.getItems().clear();
        try {
            FileReader file = new FileReader("RefrigeratorData.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = null;
            while ((line = reader.readLine()) != null){
                String[] data = line.split(",");
                if(data[6].equals(A) && data[7].equals("cold")){
                    comboBoxOutCold2.getItems().addAll(data[0]);

                }
            }
        } catch (IOException x ) {
            System.err.println(x.getMessage());
        }
    }


    //ปุ่มเอาออกเย็น
    public void Out1(ActionEvent actionEvent) throws IOException {


        File file = new File("RefrigeratorData.csv");


        BufferedReader reader = new BufferedReader( new FileReader(file));

        String line = null;
        int x = 0 ;

        ArrayList < ClassFood > foods = new ArrayList<>();
        while ((line = reader.readLine()) != null){
            String[] data = line.split(",");
            if(data[0].equals(comboBoxOut2.getValue().toString()) && x == 0 && data[7].equals("normal") ){
                x += 1 ;

            }
            else {
                foods.add(new ClassFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]));


            }

        }
        BufferedWriter writer = new BufferedWriter( new FileWriter(file));

        for(ClassFood food : foods  ){
            writer.write(food.getName() +"," + food.getType()+","+food.getAmount()+","+food.getUnitName()+","+food.getExp()+","+food.getPic()+","+food.getSlot()+","+food.getSelect()+","+food.getFirst());
            writer.newLine();



        }

        writer.flush();
        writer.close();
        reader.close();

        comboBoxOut2.getItems().clear();
        try {
            Label[] Name = {Name1,Name2,Name3,Name4,Name5,Name6};
            ImageView[] Pic = {pic1,pic2,pic3,pic4,pic5,pic6};
            Label[] Type =  {Type1,Type2,Type3,Type4,Type5,Type6};
            Label[] Time = {Time1,Time2,Time3,Time4,Time5,Time6};
            Label[] Unit = {Unit1,Unit2,Unit3,Unit4,Unit5,Unit6};
            Label[] Exp = {Exp1,Exp2,Exp3,Exp4,Exp5,Exp6};

            int u = Name.length;
            int i = 0;
            while(i < u){
                Name[i].setText(i+1 +"  ");
                Type[i].setText("ประเภทอาหาร : ");
                Time[i].setText("เวลาอยู่ในตู้เย็น : ");
                Unit[i].setText("ปริมาณ : ");
                Exp[i].setText("วันหมดอายุ : ");
                i += 1;
            }

            FileReader file1 = new FileReader("RefrigeratorData.csv");
            BufferedReader reader1 = new BufferedReader(file1);
            String line1 = null;
            int C = 999;

            while ((line1 = reader1.readLine()) != null){
                String[] data = line1.split(",");
                ClassFood food1 = new ClassFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]);
                String A = data[6];
                if(data[6].equals(comboBoxOut1.getValue().toString()) && data[7].equals("normal")){
                    comboBoxOut2.getItems().add(data[0]);

                }

                int y = Integer.parseInt(A);
                int t = Integer.parseInt(A) - 1;
                if (LocalDate.now().isBefore(LocalDate.parse(food1.getExp())) && food1.getSelect().equals("normal")){
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(food1.getFirst()), LocalDate.now()));
                    if(Integer.parseInt(p) < C){
                        Name[t].setText(y +"  "+ food1.getName());
                        Type[t].setText("ประเภทอาหาร : " + food1.getType());
                        Time[t].setText("เวลาอยู่ในตู้เย็น : " + p + "  วัน");
                        Unit[t].setText("ปริมาณ : " + food1.getAmount() + "  " + food1.getUnitName());
                        Exp[t].setText("วันหมดอายุ : " + food1.getExp());
                    }
                }

            }
        } catch (IOException r ){
            System.err.println(r.getMessage());
        }





    }

    //ปุ่มเอาออกเเข็ง
    public void Out2(ActionEvent actionEvent) throws IOException {


        File file = new File("RefrigeratorData.csv");


        BufferedReader reader = new BufferedReader( new FileReader(file));

        String line = null;
        int x = 0 ;

        ArrayList < ClassFood > foods = new ArrayList<>();
        while ((line = reader.readLine()) != null){
            String[] data = line.split(",");
            if(data[0].equals(comboBoxOutCold2.getValue().toString()) && x == 0 && data[7].equals("cold") ){
                x += 1 ;

            }
            else {
                foods.add(new ClassFood(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]));


            }

        }
        BufferedWriter writer = new BufferedWriter( new FileWriter(file));

        for(ClassFood food : foods  ){
            writer.write(food.getName() +"," + food.getType()+","+food.getAmount()+","+food.getUnitName()+","+food.getExp()+","+food.getPic()+","+food.getSlot()+","+food.getSelect()+","+food.getFirst());
            writer.newLine();



        }

        writer.flush();
        writer.close();
        reader.close();

        comboBoxOutCold2.getItems().clear();
        try {
            Label[] NameCold = {NameCold1, NameCold2};
            ImageView[] PicCold = {piccold1, piccold2};
            Label[] TypeCold = {TypeCold1, TypeCold2};
            Label[] TimeCold = {TimeCold1, TimeCold2};
            Label[] UnitCold = {UnitCold1, UnitCold2};
            Label[] ExpCold = {ExpCold1, ExpCold2};

            int u = NameCold.length;
            int i = 0;
            while(i < u){
                NameCold[i].setText(i+1 +"  ");
                TypeCold[i].setText("ประเภทอาหาร : ");
                TimeCold[i].setText("เวลาอยู่ในตู้เย็น : ");
                UnitCold[i].setText("ปริมาณ : ");
                ExpCold[i].setText("วันหมดอายุ : ");
                i += 1;
            }

            FileReader file2 = new FileReader("RefrigeratorData.csv");
            BufferedReader reader2 = new BufferedReader(file2);
            String line2 = null;
            int C = 999;


            while ((line2 = reader2.readLine()) != null) {
                String[] data = line2.split(",");
                ClassFood food2 = new ClassFood(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]);
                String A = data[6];

                if(data[6].equals(comboBoxOutCold1.getValue().toString()) && data[7].equals("cold")){
                    comboBoxOutCold2.getItems().add(data[0]);

                }

                int y = Integer.parseInt(A);
                int e = Integer.parseInt(A) - 1;
                if (LocalDate.now().isBefore(LocalDate.parse(food2.getExp())) && food2.getSelect().equals("cold")) {
                    String p = String.valueOf(ChronoUnit.DAYS.between(LocalDate.parse(food2.getFirst()), LocalDate.now()));
                    if(Integer.parseInt(p) < C){
                        NameCold[e].setText(y +"  "+ food2.getName());
                        TypeCold[e].setText("ประเภทอาหาร : " + food2.getType());
                        TimeCold[e].setText("เวลาอยู่ในตู้เย็น : " + p + "  วัน");
                        UnitCold[e].setText("ปริมาณ : " + food2.getAmount() + "  " + food2.getUnitName());
                        ExpCold[e].setText("วันหมดอายุ : " + food2.getExp());
                    }
                }

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }





    }

}



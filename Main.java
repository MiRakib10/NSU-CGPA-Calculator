package nsu_cgpa;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label heading = new Label("..NSU CGPA CALCULATOR..");
        Label lc1 = new Label("COURSE NO");
        Label lc2 = new Label("COURSE NAME");
        Label lc3 = new Label(" COURSE CREADIT");
        Label lc4 = new Label("COURSE GRADE");

        HBox hb1 = new HBox(20, heading);
        hb1.setAlignment(Pos.TOP_CENTER);

        HBox hb2 = new HBox(20, lc1, lc2, lc3, lc4);
        hb2.setAlignment(Pos.BASELINE_CENTER);

        //Couurse 1 info
        Label level1 = new Label("COURSE 1:");
        ComboBox<String> course1 = new ComboBox<>();

        course1.getItems().add("ENG 102");
        course1.getItems().add("ENG 103");
        course1.getItems().add("ENG 111");
        course1.getItems().add("PHI 101");
        course1.getItems().add("PHI 104");
        course1.getItems().add("LBA 101");
        course1.getItems().add("LBA 102");
        course1.getItems().add("POL 101");
        course1.getItems().add("POL 104");
        course1.getItems().add("ECO 101");
        course1.getItems().add("ECO 104");
        course1.getItems().add("SOC 101");
        course1.getItems().add("ENV 203");
        course1.getItems().add("GEO 205");
        course1.getItems().add("ANT 101");
        course1.getItems().add("BIO 103");
        course1.getItems().add("MAT 116");
        course1.getItems().add("MAT 120");
        course1.getItems().add("MAT 125");
        course1.getItems().add("MAT 130");
        course1.getItems().add("MAT 250");
        course1.getItems().add("MAT 350");
        course1.getItems().add("MAT 361");
        course1.getItems().add("PHY 107");
        course1.getItems().add("PHY 108");
        course1.getItems().add("CHE 101");
        course1.getItems().add("EEE 452");
        course1.getItems().add("CEE 110");
        course1.getItems().add("CSE 115");
        course1.getItems().add("CSE 115L");
        course1.getItems().add("CSE 215");
        course1.getItems().add("CSE 215L");
        course1.getItems().add("CSE 173");
        course1.getItems().add("CSE 225");
        course1.getItems().add("CSE 225L");
        course1.getItems().add("CSE 231");
        course1.getItems().add("CSE 231L");
        course1.getItems().add("CSE 299");
        course1.getItems().add("EEE 141");
        course1.getItems().add("EEE 141L");
        course1.getItems().add("EEE 111");
        course1.getItems().add("EEE 111L");
        course1.getItems().add("CSE 311");
        course1.getItems().add("CSE 311L");
        course1.getItems().add("CSE 323");
        course1.getItems().add("CSE 327");
        course1.getItems().add("CSE 331");
        course1.getItems().add("CSE 331L");
        course1.getItems().add("CSE 332");
        course1.getItems().add("CSE 373");
        course1.getItems().add("CSE 325");
        course1.getItems().add("CSE 498");
        course1.getItems().add("CSE 499A");
        course1.getItems().add("CSE 499B");
        course1.getItems().add("CSE 417");
        course1.getItems().add("CSE 401");
        course1.getItems().add("CSE 418");
        course1.getItems().add("CSE 426");
        course1.getItems().add("CSE 473");
        course1.getItems().add("CSE 491");
        course1.getItems().add("CSE 411");
        course1.getItems().add("CSE 424");
        course1.getItems().add("CSE 427");
        course1.getItems().add("CSE 428");
        course1.getItems().add("CSE 429");
        course1.getItems().add("CSE 492");
        course1.getItems().add("CSE 422");
        course1.getItems().add("CSE 438");
        course1.getItems().add("CSE 482");
        course1.getItems().add("CSE 485");
        course1.getItems().add("CSE 486");
        course1.getItems().add("CSE 493");
        course1.getItems().add("CSE 433");
        course1.getItems().add("CSE 435");
        course1.getItems().add("CSE 413");
        course1.getItems().add("CSE 414");
        course1.getItems().add("CSE 494");
        course1.getItems().add("CSE 419");
        course1.getItems().add("CSE 440");
        course1.getItems().add("CSE 445");
        course1.getItems().add("CSE 465");
        course1.getItems().add("CSE 467");
        course1.getItems().add("CSE 468");
        course1.getItems().add("CSE 470");
        course1.getItems().add("CSE 495");
        course1.getItems().add("CSE 446");
        course1.getItems().add("CSE 447");
        course1.getItems().add("CSE 448");
        course1.getItems().add("CSE 449");
        course1.getItems().add("CSE 496");

        ComboBox<String> credit1 = new ComboBox<>();
        credit1.setPrefSize(100, 1);
        credit1.getItems().add("3.0");
        credit1.getItems().add("1.5");
        credit1.getItems().add("1.0");
        credit1.getItems().add("0.0");

        ComboBox<String> grade1 = new ComboBox<>();
        grade1.setPrefSize(100, 1);
        grade1.getItems().add("A");
        grade1.getItems().add("A-");
        grade1.getItems().add("B+");
        grade1.getItems().add("B");
        grade1.getItems().add("B-");
        grade1.getItems().add("C+");
        grade1.getItems().add("C");
        grade1.getItems().add("C-");
        grade1.getItems().add("D+");
        grade1.getItems().add("D");
        grade1.getItems().add("F");

        HBox hbcl1 = new HBox(10, level1, course1, credit1, grade1);
        hbcl1.setAlignment(Pos.BASELINE_CENTER);

        //Couurse 2 info
        Label level2 = new Label("COURSE 2:");
        ComboBox<String> course2 = new ComboBox<>();

        course2.getItems().add("ENG 102");
        course2.getItems().add("ENG 103");
        course2.getItems().add("ENG 111");
        course2.getItems().add("PHI 101");
        course2.getItems().add("PHI 104");
        course2.getItems().add("LBA 101");
        course2.getItems().add("LBA 102");
        course2.getItems().add("POL 101");
        course2.getItems().add("POL 104");
        course2.getItems().add("ECO 101");
        course2.getItems().add("ECO 104");
        course2.getItems().add("SOC 101");
        course2.getItems().add("ENV 203");
        course2.getItems().add("GEO 205");
        course2.getItems().add("ANT 101");
        course2.getItems().add("BIO 103");
        course2.getItems().add("MAT 116");
        course2.getItems().add("MAT 120");
        course2.getItems().add("MAT 125");
        course2.getItems().add("MAT 130");
        course2.getItems().add("MAT 250");
        course2.getItems().add("MAT 350");
        course2.getItems().add("MAT 361");
        course2.getItems().add("PHY 107");
        course2.getItems().add("PHY 108");
        course2.getItems().add("CHE 101");
        course2.getItems().add("EEE 452");
        course2.getItems().add("CEE 110");
        course2.getItems().add("CSE 115");
        course2.getItems().add("CSE 115L");
        course2.getItems().add("CSE 215");
        course2.getItems().add("CSE 215L");
        course2.getItems().add("CSE 173");
        course2.getItems().add("CSE 225");
        course2.getItems().add("CSE 225L");
        course2.getItems().add("CSE 231");
        course2.getItems().add("CSE 231L");
        course2.getItems().add("CSE 299");
        course2.getItems().add("EEE 141");
        course2.getItems().add("EEE 141L");
        course2.getItems().add("EEE 111");
        course2.getItems().add("EEE 111L");
        course2.getItems().add("CSE 311");
        course2.getItems().add("CSE 311L");
        course2.getItems().add("CSE 323");
        course2.getItems().add("CSE 327");
        course2.getItems().add("CSE 331");
        course2.getItems().add("CSE 331L");
        course2.getItems().add("CSE 332");
        course2.getItems().add("CSE 373");
        course2.getItems().add("CSE 325");
        course2.getItems().add("CSE 498");
        course2.getItems().add("CSE 499A");
        course2.getItems().add("CSE 499B");
        course2.getItems().add("CSE 417");
        course2.getItems().add("CSE 401");
        course2.getItems().add("CSE 418");
        course2.getItems().add("CSE 426");
        course2.getItems().add("CSE 473");
        course2.getItems().add("CSE 491");
        course2.getItems().add("CSE 411");
        course2.getItems().add("CSE 424");
        course2.getItems().add("CSE 427");
        course2.getItems().add("CSE 428");
        course2.getItems().add("CSE 429");
        course2.getItems().add("CSE 492");
        course2.getItems().add("CSE 422");
        course2.getItems().add("CSE 438");
        course2.getItems().add("CSE 482");
        course2.getItems().add("CSE 485");
        course2.getItems().add("CSE 486");
        course2.getItems().add("CSE 493");
        course2.getItems().add("CSE 433");
        course2.getItems().add("CSE 435");
        course2.getItems().add("CSE 413");
        course2.getItems().add("CSE 414");
        course2.getItems().add("CSE 494");
        course2.getItems().add("CSE 419");
        course2.getItems().add("CSE 440");
        course2.getItems().add("CSE 445");
        course2.getItems().add("CSE 465");
        course2.getItems().add("CSE 467");
        course2.getItems().add("CSE 468");
        course2.getItems().add("CSE 470");
        course2.getItems().add("CSE 495");
        course2.getItems().add("CSE 446");
        course2.getItems().add("CSE 447");
        course2.getItems().add("CSE 448");
        course2.getItems().add("CSE 449");
        course2.getItems().add("CSE 496");
        ComboBox<String> credit2 = new ComboBox<>();
        credit2.setPrefSize(100, 1);
        credit2.getItems().add("3.0");
        credit2.getItems().add("1.5");
        credit2.getItems().add("1.0");
        credit2.getItems().add("0.0");

        ComboBox<String> grade2 = new ComboBox<>();
        grade2.setPrefSize(100, 1);
        grade2.getItems().add("A");
        grade2.getItems().add("A-");
        grade2.getItems().add("B+");
        grade2.getItems().add("B");
        grade2.getItems().add("B-");
        grade2.getItems().add("C+");
        grade2.getItems().add("C");
        grade2.getItems().add("C-");
        grade2.getItems().add("D+");
        grade2.getItems().add("D");
        grade2.getItems().add("F");

        HBox hbcl2 = new HBox(10, level2, course2, credit2, grade2);
        hbcl2.setAlignment(Pos.BASELINE_CENTER);

        //Couurse 3 info
        Label level3 = new Label("COURSE 3:");
        ComboBox<String> course3 = new ComboBox<>();

        course3.getItems().add("ENG 103");
        course3.getItems().add("ENG 111");
        course3.getItems().add("PHI 101");
        course3.getItems().add("PHI 104");
        course3.getItems().add("LBA 101");
        course3.getItems().add("LBA 102");
        course3.getItems().add("POL 101");
        course3.getItems().add("POL 104");
        course3.getItems().add("ECO 101");
        course3.getItems().add("ECO 104");
        course3.getItems().add("SOC 101");
        course3.getItems().add("ENV 203");
        course3.getItems().add("GEO 205");
        course3.getItems().add("ANT 101");
        course3.getItems().add("BIO 103");
        course3.getItems().add("MAT 116");
        course3.getItems().add("MAT 120");
        course3.getItems().add("MAT 125");
        course3.getItems().add("MAT 130");
        course3.getItems().add("MAT 250");
        course3.getItems().add("MAT 350");
        course3.getItems().add("MAT 361");
        course3.getItems().add("PHY 107");
        course3.getItems().add("PHY 108");
        course3.getItems().add("CHE 101");
        course3.getItems().add("EEE 452");
        course3.getItems().add("CEE 110");
        course3.getItems().add("CSE 115");
        course3.getItems().add("CSE 115L");
        course3.getItems().add("CSE 215");
        course3.getItems().add("CSE 215L");
        course3.getItems().add("ENG 102");
        course3.getItems().add("CSE 173");
        course3.getItems().add("CSE 225");
        course3.getItems().add("CSE 225L");
        course3.getItems().add("CSE 231");
        course3.getItems().add("CSE 231L");
        course3.getItems().add("CSE 299");
        course3.getItems().add("EEE 141");
        course3.getItems().add("EEE 141L");
        course3.getItems().add("EEE 111");
        course3.getItems().add("EEE 111L");
        course3.getItems().add("CSE 311");
        course3.getItems().add("CSE 311L");
        course3.getItems().add("CSE 323");
        course3.getItems().add("CSE 327");
        course3.getItems().add("CSE 331");
        course3.getItems().add("CSE 331L");
        course3.getItems().add("CSE 332");
        course3.getItems().add("CSE 373");
        course3.getItems().add("CSE 325");
        course3.getItems().add("CSE 498");
        course3.getItems().add("CSE 499A");
        course3.getItems().add("CSE 499B");
        course3.getItems().add("CSE 417");
        course3.getItems().add("CSE 401");
        course3.getItems().add("CSE 418");
        course3.getItems().add("CSE 426");
        course3.getItems().add("CSE 473");
        course3.getItems().add("CSE 491");
        course3.getItems().add("CSE 411");
        course3.getItems().add("CSE 424");
        course3.getItems().add("CSE 427");
        course3.getItems().add("CSE 428");
        course3.getItems().add("CSE 429");
        course3.getItems().add("CSE 492");
        course3.getItems().add("CSE 422");
        course3.getItems().add("CSE 438");
        course3.getItems().add("CSE 482");
        course3.getItems().add("CSE 485");
        course3.getItems().add("CSE 486");
        course3.getItems().add("CSE 493");
        course3.getItems().add("CSE 433");
        course3.getItems().add("CSE 435");
        course3.getItems().add("CSE 413");
        course3.getItems().add("CSE 414");
        course3.getItems().add("CSE 494");
        course3.getItems().add("CSE 419");
        course3.getItems().add("CSE 440");
        course3.getItems().add("CSE 445");
        course3.getItems().add("CSE 465");
        course3.getItems().add("CSE 467");
        course3.getItems().add("CSE 468");
        course3.getItems().add("CSE 470");
        course3.getItems().add("CSE 495");
        course3.getItems().add("CSE 446");
        course3.getItems().add("CSE 447");
        course3.getItems().add("CSE 448");
        course3.getItems().add("CSE 449");
        course3.getItems().add("CSE 496");

        ComboBox<String> credit3 = new ComboBox<>();
        credit3.setPrefSize(100, 1);
        credit3.getItems().add("3.0");
        credit3.getItems().add("1.5");
        credit3.getItems().add("1.0");
        credit3.getItems().add("0.0");

        ComboBox<String> grade3 = new ComboBox<>();
        grade3.setPrefSize(100, 1);
        grade3.getItems().add("A");
        grade3.getItems().add("A-");
        grade3.getItems().add("B+");
        grade3.getItems().add("B");
        grade3.getItems().add("B-");
        grade3.getItems().add("C+");
        grade3.getItems().add("C");
        grade3.getItems().add("C-");
        grade3.getItems().add("D+");
        grade3.getItems().add("D");
        grade3.getItems().add("F");

        HBox hbcl3 = new HBox(10, level3, course3, credit3, grade3);
        hbcl3.setAlignment(Pos.BASELINE_CENTER);

        //Couurse 4 info
        Label c4 = new Label("COURSE 4:");
        ComboBox<String> course4 = new ComboBox<>();

        course4.getItems().add("ENG 102");
        course4.getItems().add("ENG 103");
        course4.getItems().add("ENG 111");
        course4.getItems().add("PHI 101");
        course4.getItems().add("PHI 104");
        course4.getItems().add("LBA 101");
        course4.getItems().add("LBA 102");
        course4.getItems().add("POL 101");
        course4.getItems().add("POL 104");
        course4.getItems().add("ECO 101");
        course4.getItems().add("ECO 104");
        course4.getItems().add("SOC 101");
        course4.getItems().add("ENV 203");
        course4.getItems().add("GEO 205");
        course4.getItems().add("ANT 101");
        course4.getItems().add("BIO 103");
        course4.getItems().add("MAT 116");
        course4.getItems().add("MAT 120");
        course4.getItems().add("MAT 125");
        course4.getItems().add("MAT 130");
        course4.getItems().add("MAT 250");
        course4.getItems().add("MAT 350");
        course4.getItems().add("MAT 361");
        course4.getItems().add("PHY 107");
        course4.getItems().add("PHY 108");
        course4.getItems().add("CHE 101");
        course4.getItems().add("EEE 452");
        course4.getItems().add("CEE 110");
        course4.getItems().add("CSE 173");
        course4.getItems().add("CSE 115");
        course4.getItems().add("CSE 115L");
        course4.getItems().add("CSE 215");
        course4.getItems().add("CSE 215L");
        course4.getItems().add("CSE 225");
        course4.getItems().add("CSE 225L");
        course4.getItems().add("CSE 231");
        course4.getItems().add("CSE 231L");
        course4.getItems().add("CSE 299");
        course4.getItems().add("EEE 141");
        course4.getItems().add("EEE 141L");
        course4.getItems().add("EEE 111");
        course4.getItems().add("EEE 111L");
        course4.getItems().add("CSE 311");
        course4.getItems().add("CSE 311L");
        course4.getItems().add("CSE 323");
        course4.getItems().add("CSE 327");
        course4.getItems().add("CSE 331");
        course4.getItems().add("CSE 331L");
        course4.getItems().add("CSE 332");
        course4.getItems().add("CSE 373");
        course4.getItems().add("CSE 325");
        course4.getItems().add("CSE 498");
        course4.getItems().add("CSE 499A");
        course4.getItems().add("CSE 499B");
        course4.getItems().add("CSE 417");
        course4.getItems().add("CSE 401");
        course4.getItems().add("CSE 418");
        course4.getItems().add("CSE 426");
        course4.getItems().add("CSE 473");
        course4.getItems().add("CSE 491");
        course4.getItems().add("CSE 411");
        course4.getItems().add("CSE 424");
        course4.getItems().add("CSE 427");
        course4.getItems().add("CSE 428");
        course4.getItems().add("CSE 429");
        course4.getItems().add("CSE 492");
        course4.getItems().add("CSE 422");
        course4.getItems().add("CSE 438");
        course4.getItems().add("CSE 482");
        course4.getItems().add("CSE 485");
        course4.getItems().add("CSE 486");
        course4.getItems().add("CSE 493");
        course4.getItems().add("CSE 433");
        course4.getItems().add("CSE 435");
        course4.getItems().add("CSE 413");
        course4.getItems().add("CSE 414");
        course4.getItems().add("CSE 494");
        course4.getItems().add("CSE 419");
        course4.getItems().add("CSE 440");
        course4.getItems().add("CSE 445");
        course4.getItems().add("CSE 465");
        course4.getItems().add("CSE 467");
        course4.getItems().add("CSE 468");
        course4.getItems().add("CSE 470");
        course4.getItems().add("CSE 495");
        course4.getItems().add("CSE 446");
        course4.getItems().add("CSE 447");
        course4.getItems().add("CSE 448");
        course4.getItems().add("CSE 449");
        course4.getItems().add("CSE 496");

        ComboBox<String> credit4 = new ComboBox<>();
        credit4.setPrefSize(100, 1);
        credit4.getItems().add("3.0");
        credit4.getItems().add("1.5");
        credit4.getItems().add("1.0");
        credit4.getItems().add("0.0");

        ComboBox<String> grade4 = new ComboBox<>();
        grade4.setPrefSize(100, 1);
        grade4.getItems().add("A");
        grade4.getItems().add("A-");
        grade4.getItems().add("B+");
        grade4.getItems().add("B");
        grade4.getItems().add("B-");
        grade4.getItems().add("C+");
        grade4.getItems().add("C");
        grade4.getItems().add("C-");
        grade4.getItems().add("D+");
        grade4.getItems().add("D");
        grade4.getItems().add("F");

        HBox hbcl4 = new HBox(10, c4, course4, credit4, grade4);
        hbcl4.setAlignment(Pos.BASELINE_CENTER);

        //Couurse 5 info
        Label level5 = new Label("COURSE 5:");
        ComboBox<String> course5 = new ComboBox<>();

        course5.getItems().add("ENG 102");
        course5.getItems().add("ENG 103");
        course5.getItems().add("ENG 111");
        course5.getItems().add("PHI 101");
        course5.getItems().add("PHI 104");
        course5.getItems().add("LBA 101");
        course5.getItems().add("LBA 102");
        course5.getItems().add("POL 101");
        course5.getItems().add("POL 104");
        course5.getItems().add("ECO 101");
        course5.getItems().add("ECO 104");
        course5.getItems().add("SOC 101");
        course5.getItems().add("ENV 203");
        course5.getItems().add("GEO 205");
        course5.getItems().add("ANT 101");
        course5.getItems().add("BIO 103");
        course5.getItems().add("MAT 116");
        course5.getItems().add("MAT 120");
        course5.getItems().add("MAT 125");
        course5.getItems().add("MAT 130");
        course5.getItems().add("MAT 250");
        course5.getItems().add("MAT 350");
        course5.getItems().add("MAT 361");
        course5.getItems().add("PHY 107");
        course5.getItems().add("PHY 108");
        course5.getItems().add("CHE 101");
        course5.getItems().add("EEE 452");
        course5.getItems().add("CEE 110");
        course5.getItems().add("CSE 173");
        course5.getItems().add("CSE 115");
        course5.getItems().add("CSE 115L");
        course5.getItems().add("CSE 215");
        course5.getItems().add("CSE 215L");
        course5.getItems().add("CSE 225");
        course5.getItems().add("CSE 225L");
        course5.getItems().add("CSE 231");
        course5.getItems().add("CSE 231L");
        course5.getItems().add("CSE 299");
        course5.getItems().add("EEE 141");
        course5.getItems().add("EEE 141L");
        course5.getItems().add("EEE 111");
        course5.getItems().add("EEE 111L");
        course5.getItems().add("CSE 311");
        course5.getItems().add("CSE 311L");
        course5.getItems().add("CSE 323");
        course5.getItems().add("CSE 327");
        course5.getItems().add("CSE 331");
        course5.getItems().add("CSE 331L");
        course5.getItems().add("CSE 332");
        course5.getItems().add("CSE 373");
        course5.getItems().add("CSE 325");
        course5.getItems().add("CSE 498");
        course5.getItems().add("CSE 499A");
        course5.getItems().add("CSE 499B");
        course5.getItems().add("CSE 417");
        course5.getItems().add("CSE 401");
        course5.getItems().add("CSE 418");
        course5.getItems().add("CSE 426");
        course5.getItems().add("CSE 473");
        course5.getItems().add("CSE 491");
        course5.getItems().add("CSE 411");
        course5.getItems().add("CSE 424");
        course5.getItems().add("CSE 427");
        course5.getItems().add("CSE 428");
        course5.getItems().add("CSE 429");
        course5.getItems().add("CSE 492");
        course5.getItems().add("CSE 422");
        course5.getItems().add("CSE 438");
        course5.getItems().add("CSE 482");
        course5.getItems().add("CSE 485");
        course5.getItems().add("CSE 486");
        course5.getItems().add("CSE 493");
        course5.getItems().add("CSE 433");
        course5.getItems().add("CSE 435");
        course5.getItems().add("CSE 413");
        course5.getItems().add("CSE 414");
        course5.getItems().add("CSE 494");
        course5.getItems().add("CSE 419");
        course5.getItems().add("CSE 440");
        course5.getItems().add("CSE 445");
        course5.getItems().add("CSE 465");
        course5.getItems().add("CSE 467");
        course5.getItems().add("CSE 468");
        course5.getItems().add("CSE 470");
        course5.getItems().add("CSE 495");
        course5.getItems().add("CSE 446");
        course5.getItems().add("CSE 447");
        course5.getItems().add("CSE 448");
        course5.getItems().add("CSE 449");
        course5.getItems().add("CSE 496");

        ComboBox<String> credit5 = new ComboBox<>();
        credit5.setPrefSize(100, 1);
        credit5.getItems().add("3.0");
        credit5.getItems().add("1.5");
        credit5.getItems().add("1.0");
        credit5.getItems().add("0.0");

        ComboBox<String> grade5 = new ComboBox<>();
        grade5.setPrefSize(100, 1);
        grade5.getItems().add("A");
        grade5.getItems().add("A-");
        grade5.getItems().add("B+");
        grade5.getItems().add("B");
        grade5.getItems().add("B-");
        grade5.getItems().add("C+");
        grade5.getItems().add("C");
        grade5.getItems().add("C-");
        grade5.getItems().add("D+");
        grade5.getItems().add("D");
        grade5.getItems().add("F");

        HBox hbcl5 = new HBox(10, level5, course5, credit5, grade5);
        hbcl5.setAlignment(Pos.BASELINE_CENTER);

        Button SHOW_CGPA = new Button();
        SHOW_CGPA.setText("SHOW CGPA");
        HBox hbend = new HBox(SHOW_CGPA);
        hbend.setAlignment(Pos.BASELINE_CENTER);

        SHOW_CGPA.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String cr1 = credit1.getValue();
                String cr2 = credit2.getValue();
                String cr3 = credit3.getValue();
                String cr4 = credit4.getValue();
                String cr5 = credit5.getValue();

                String c1grade = grade1.getValue();
                String c2grade = grade2.getValue();
                String c3grade = grade3.getValue();
                String c4grade = grade4.getValue();
                String c5grade = grade5.getValue();

                String Choice1 = course1.getValue();
                String Choice2 = course2.getValue();
                String Choice3 = course3.getValue();
                String Choice4 = course4.getValue();
                String Choice5 = course5.getValue();

                String[] choice = {Choice1, Choice2, Choice3, Choice4, Choice5};
                String[] credits = {cr1, cr2, cr3, cr4, cr5};
                String[] grades = {c1grade, c2grade, c3grade, c4grade, c5grade};

                CalculationParts cg = new CalculationParts(grades, credits);
                DecimalFormat d = new DecimalFormat("#.##");
                double finalCgpa = cg.cgpa();

                try {
                    File file = new File("INFORMATION.txt");
                    file.createNewFile();
                    FileWriter fwrite = new FileWriter("INFORMATION.txt");
                    for (int i = 0; i < choice.length; i++) {
                        fwrite.write(choice[i] + " " + credits[i] + " " + grades[i] + "\n");
                    }
                    fwrite.write("CGPA :" + finalCgpa);
                    fwrite.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("CGPA");
                alert.setHeaderText("Your Average CGPA is : " + d.format(finalCgpa));
                alert.show();
            }
        });

        VBox display = new VBox(10, hb1, hb2, hbcl1, hbcl2, hbcl3, hbcl4, hbcl5, hbend);

        Scene scene = new Scene(display, 600, 350);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}

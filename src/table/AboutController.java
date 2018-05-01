package table;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AboutController {
	@FXML
	TextField text ;
	//private int num = 0;
	public static int num = 0;
	
	public void textHandle(ActionEvent e) throws IOException {
		int num = Integer.parseInt(text.getText());
		this.num = num;
		Parent about_page = FXMLLoader.load(getClass().getResource("Grid.fxml"));
		Scene about_scene = new Scene(about_page);
		Stage about_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		about_stage.setScene(about_scene);
		about_stage.show();
	}
	public static int getInt() {
		return num;
	}
}

package table;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SudokuController {
	@FXML
	Label start;
	@FXML
	Label about;
	@FXML
	Label scoreboard;

	private AboutView view = new AboutView();

	public void ClickHandle(MouseEvent e) throws IOException {

		Parent about_page = FXMLLoader.load(getClass().getResource("AboutSudoku.fxml"));
		Scene about_scene = new Scene(about_page);
		Stage about_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		about_stage.setScene(about_scene);
		about_stage.show();
		

	}
}

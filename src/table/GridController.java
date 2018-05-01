package table;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class GridController extends AboutController {
	@FXML
	AnchorPane pane;

	public void initialize() {
		AboutController something2 = new AboutController();
		System.out.println(something2.getInt());
		int num = 6;
		Label label = new Label("Kuy");
		Label label2 = new Label("Kuy2");
		Label label3 = new Label("Kuy3");
		GridPane something = createGrid(something2.getInt());
		something.setGridLinesVisible(true);
		something.add(label, 0, 0);

		//something.add(label2, 1, 0);
		//something.add(label3, 6, 6);
		pane.getChildren().add(something);
		
	}
	
	public GridPane createGrid(int num) {
		GridPane gridpane = new GridPane();
		for (int i = 0; i < num; i++) {
            ColumnConstraints column = new ColumnConstraints(100);
            gridpane.getColumnConstraints().add(column);
            RowConstraints rows = new RowConstraints(100);
            gridpane.getRowConstraints().add(rows);
            
        }
		
		return gridpane;
	}
}

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class ClearHandler implements EventHandler<ActionEvent> {
    private TextField data;

    public ClearHandler(TextField data) {
        this.data = data;
    }

    @Override
    public void handle(ActionEvent event) {
        data.setText("");
    }
}

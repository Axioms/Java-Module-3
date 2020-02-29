import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class DeleteHandler implements EventHandler<ActionEvent> {
    private TextField data;

    public DeleteHandler(TextField data) {
        this.data = data;
    }

    @Override
    public void handle(ActionEvent event) {
        String prevVal = data.getText();
        if(prevVal.length() > 0) {
            data.setText(prevVal.substring(0, prevVal.length() - 1));
        }
    }
}

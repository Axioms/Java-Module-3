import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class ButtonHandler implements EventHandler<ActionEvent> {
    private String value;
    private TextField data;

    public ButtonHandler(String value, TextField data) {
        this.value = value;
        this.data = data;
    }

    @Override
    public void handle(ActionEvent event) {
        if(data.getText().equals("0")) {
            data.setText(value);
        }

        else {
            data.setText(data.getText() + value);
        }
    }
}

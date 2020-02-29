import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class SubmitHandler implements EventHandler<ActionEvent> {

    private TextField data;

    public SubmitHandler(TextField data) {
        this.data = data;
    }

    @Override
    public void handle(ActionEvent event) {
        String value = data.getText();
        double total;
        if(value.indexOf("/") > 0) {
            String[] temp = value.split("/");

            if(temp.length == 2) {
                if(!temp[1].equals("0")) {
                    total = Double.parseDouble(temp[0]) / Double.parseDouble(temp[1]);
                    data.setText("" + total);
                }

                else {
                    data.setText("Can't Divide by 0");
                }
            }
        }

        else if(value.indexOf("*") > 0) {
            String[] temp = value.split("\\*");

            if(temp.length == 2) {
                total = Double.parseDouble(temp[0]) * Double.parseDouble(temp[1]);
                data.setText("" + total);
            }
        }

        else if(value.indexOf("+") > 0) {
            String[] temp = value.split("\\+");
            if(temp.length == 2) {
                total = Double.parseDouble(temp[0]) + Double.parseDouble(temp[1]);
                data.setText("" + total);
            }
        }

        else if(value.indexOf("-") > 0) {
            String[] temp = value.split("-");
            if(temp.length == 2) {
                total = Double.parseDouble(temp[0]) - Double.parseDouble(temp[1]);
                data.setText("" + total);
            }
        }
    }
}

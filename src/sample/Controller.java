package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label Ispis;
    public TextField UnosLabela;

    public static int sumaCifara(int n){
        int s = 0;
        while(n != 0){
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public void SubmitAction(ActionEvent actionEvent) {
        int n;
        String output="";
        n=Integer.parseInt(UnosLabela.getText());
        for(int i = 1; i <= n; i++){
            if(i % sumaCifara(i) == 0) {
                String str1 = Integer.toString(i);
                output = (output + str1 + " ");
            }
        }
        Ispis.setText(output);
    }
}

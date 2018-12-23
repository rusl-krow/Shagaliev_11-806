package sample.animations;

import javafx.animation.TranslateTransition;
import  javafx.scene.Node;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class Shake {
    private TranslateTransition tt;

    public  Shake(Node node){
        tt = new TranslateTransition(Duration.millis(80), node);
        tt.setFromX(0f);
        tt.setByX(10f);
        tt.setCycleCount(3);
        tt.setAutoReverse(true);
    }

    public void playAnim()
    {
        tt.playFromStart();
    }
}

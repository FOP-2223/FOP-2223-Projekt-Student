package projekt;

import javafx.application.Application;
import projekt.gui.MyApplication;

@SuppressWarnings("unused")
public class GUIProjektImpl implements Projekt {
    @Override
    public void start() {
        Application.launch(MyApplication.class);
    }
}

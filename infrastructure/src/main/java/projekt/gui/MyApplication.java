package projekt.gui;

import javafx.application.Application;
import javafx.stage.Stage;
import projekt.gui.scene.MainMenuScene;
import projekt.gui.scene.SceneSwitcher;

public class MyApplication extends javafx.application.Application {

    public static void launch(String[] args) {
        Application.launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        MainMenuScene scene = (MainMenuScene) SceneSwitcher.loadScene(SceneSwitcher.SceneType.MAIN_MENU, primaryStage);
        scene.init();
    }
}

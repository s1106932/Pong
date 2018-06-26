package client.scenes;

import javafx.scene.Scene;

public class SceneController {

    private SceneModel sceneModel;

    public SceneController(SceneModel sceneModel){
        this.sceneModel = sceneModel;
    }

    public void changeScene(Scene scene){
        sceneModel.changeScene(scene);
    }

}

package archi_log_projet;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class View extends Application {

	public static void main(String[] args) {
		System.out.println( "Main method inside Thread : " +  Thread.currentThread().getName());
		launch(args);
	}	        


	public void start(Stage stage) throws Exception {

		System.out.println( "Start method inside Thread : " +  Thread.currentThread().getName());

		/////stage.setWidth(1280);
		/////stage.setHeight(720);
		// met un titre dans la fen�tre
		/////stage.setTitle("Architecture Logiciel Projet");

		// la racine du sceneGraph est le root
		Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.GREY);
        stage.setScene(scene);
        ToolBar tb = new ToolBar();
        root.getChildren().add(tb);
		/* cr�ation du soleil
        Circle sun = new Circle(60, Color.web("yellow", 0.8));
        sun.setCenterX(600);
        sun.setCenterY(100);
		 */


		// cr�ation d'un �l�ment plus complexe, le panneau
		/////Group sign = new Group();
		/////sign.setTranslateX(150);
		/////sign.setTranslateY(200);
		// Attention les coordonn�es sont celles du panneau, pas de la sc�ne
		/*Text text = new Text(10, 30, "Hello world!");
        text.setFont(new Font(80));
        text.setFill(Color.WHITE);
        // le rep�re utilis� est celui du panneau
        Rectangle panel = new Rectangle( 0, -50, 500, 110);
        panel.setFill(Color.DARKBLUE);
        // composer l'�l�ment plus complexe
        sign.getChildren().add(panel);
        sign.getChildren().add(text);

        // ajout de tous les �l�ments de la sc�ne
        /*root.getChildren().add(sun);
        root.getChildren().add(ground);
        root.getChildren().add(sign);*/

		// ajout de la sc�ne sur l'estrade
		//stage.setScene(scene);
		// ouvrir le rideau
		stage.show();
	}
}

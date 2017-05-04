package controller;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.sun.javafx.geom.Rectangle;

import java.awt.Color;
import java.awt.Point;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import model.Rect;
import model.SaveGroupeShape;
import model.IShape;
import view.DrawShapeFX;

public class WindowController implements Initializable {

		DrawShapeFX draw;


		@FXML
		private Button save;

		@FXML
		private Button load;

		@FXML
		private Button undo;

		@FXML
	private Button redo;

		@FXML
		private Button trash;

		@FXML
		private AnchorPane dashboard;
		private SaveGroupeShape dashboardGroup;

		@FXML
		private AnchorPane mainPane;
		private SaveGroupeShape mainPaneGroup;

		private ArrayList<IShape> dashboardShape;
		private ArrayList<IShape> shapeMainPane;
		private ArrayList<IShape> shapeFx;

		public WindowController(){}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			System.out.println("test");

			dashboardShape = new ArrayList<IShape>();
			shapeMainPane = new ArrayList<IShape>();
			draw = DrawShapeFX.getInstance();

			initDashboard();

			save.setOnAction((event)-> {
				System.out.println("button save");
				});

			load.setOnAction((event)-> {
				System.out.println("button load");
				});

			undo.setOnAction((event)-> {
				System.out.println("button undo");
				});

			redo.setOnAction((event)-> {
				System.out.println("button redo");
				});

			trash.setOnAction((event)-> {
				System.out.println("button trash");
				});

			draw();



	        dashboard.setOnDragDetected(new EventHandler <MouseEvent>() {
	            public void handle(MouseEvent event) {
	                /* drag was detected, start drag-and-drop gesture*/
	                System.out.println("onDragDetected");

	                /* allow any transfer mode */
	                Dragboard db = dashboard.startDragAndDrop(TransferMode.ANY);

	                /* put a string on dragboard */
	                ClipboardContent content = new ClipboardContent();
	                content.putString("Test");
	                db.setContent(content);

	                event.consume();
	            }
	        });


			mainPane.setOnDragEntered(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* the drag-and-drop gesture entered the target */
	                System.out.println("onDragEntered");
	                /* show to the user that it is an actual gesture target */
	                if (event.getGestureSource() != mainPane &&
	                        event.getDragboard().hasString()) {
	                	//dropPane.setFill(Color.GREEN);
	                }

	                event.consume();
	            }
	        });


	        mainPane.setOnDragOver(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* data is dragged over the target */
	                System.out.println("onDragOver");

	                /* accept it only if it is  not dragged from the same node
	                 * and if it has a string data */
	                if (event.getGestureSource() != mainPane &&
	                        event.getDragboard().hasString()) {
	                    /* allow for both copying and moving, whatever user chooses */
	                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
	                }

	                event.consume();
	            }
	        });

			mainPane.setOnDragExited(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* mouse moved away, remove the graphical cues */
	            	//dropPane.setFill(Color.BLACK);

	                event.consume();
	            }
	        });

	        dashboard.setOnDragDropped(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* data dropped */
	                System.out.println("onDragDropped");
	                /* if there is a string data on dashboard, read it and use it */
	                Dragboard db = event.getDragboard();
	                boolean success = false;
	                if (db.hasString()) {
	                   // dashboard.setText(db.getString());
	                    success = true;
	                }
	                /* let the source know whether the string was successfully
	                 * transferred and used */
	                event.setDropCompleted(success);

	                event.consume();
	            }
	        });

	        mainPane.setOnDragDone(new EventHandler <DragEvent>() {
	            public void handle(DragEvent event) {
	                /* the drag-and-drop gesture ended */
	                System.out.println("onDragDone");
	                /* if the data was successfully moved, clear it */
	                if (event.getTransferMode() == TransferMode.MOVE) {
	                   // mainPane.setText("");
	                }

	                event.consume();
	            }
	        });


			System.out.println("tamere");

		}

		public void initDashboard(){

			Rect r = new Rect(new Point(20,20),50,30,Color.blue);
			dashboardShape.add(r);

		}

		public void draw(){
			for (IShape s : dashboardShape){
				draw.Draw(s, dashboard);
			}
		}
}

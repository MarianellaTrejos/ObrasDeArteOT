package Interface;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Window extends Application{
    
    private final int WIDTH = 800;
    private final int HEIGHT = 700;
    private Pane pane;
    private Scene scene;
    private Canvas canvas;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Graphics");
        initComponents(primaryStage);
        primaryStage.show();
    }

    //inicializo componentes
    private void initComponents(Stage primaryStage) {
        //creo el pane y el scene para el primary stage
        this.pane = new Pane();
        this.scene = new Scene(this.pane, WIDTH, HEIGHT);
        
        //lienzo para pintar
        this.canvas = new Canvas(WIDTH, HEIGHT);
        this.pane.getChildren().add(this.canvas);
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        draw(gc,10, 10, 150, 150,1);
        
        primaryStage.setScene(this.scene);
    }

    private int draw(GraphicsContext gc , int x1, int y1, int x2, int y2,int count) {
        if(count<=2000)
        if(x1<500&&y1==10){
            
        gc.strokeRect(x1, y1, x2, y2);
        return draw(gc, x1+10, y1, x2, y2,count+1);
        }else if(x1==500&y1<500){
            gc.strokeRect(x1, y1, x2, y2);
        return draw(gc, x1, y1+10, x2, y2,count+1);
        }else if(x1>10&&y1==500){
            gc.strokeRect(x1, y1, x2, y2);
        return draw(gc, x1-10, y1, x2, y2,count+1);
        }else if(x1==10&&y1>10){
            gc.strokeRect(x1, y1, x2, y2);
        return draw(gc, x1, y1-10, x2, y2,count+1);
        }
        return -1;
       
    }

}

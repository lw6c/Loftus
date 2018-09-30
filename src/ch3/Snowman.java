package ch3;

/* Revise the Snowman application in the following ways:
 * Add a third button.
 * Move the sun to the upper-right side of the picture.
 * Display your name in the upper-left corner of the picture.
 * Shift the entire snowman 40 pixels to the right. */
//Project 3.10

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class Snowman extends Application {
    public void start(Stage primaryStage) {
        Text text = new Text(10, 10, "YOUR NAME");
        Ellipse base = new Ellipse(80, 210, 80, 60);
        base.setFill(Color.WHITE);
        Ellipse middle = new Ellipse(80, 130, 50, 40);
        middle.setFill(Color.WHITE);
        Circle head = new Circle(80, 70, 30);
        head.setFill(Color.WHITE);
        Circle rightEye = new Circle(70, 60, 5);
        Circle leftEye = new Circle(90, 60, 5);
        Line mouth = new Line(70, 80, 90, 80);
        Circle topButton = new Circle(80, 120, 6);
        topButton.setFill(Color.RED);
        Circle middleButton = new Circle(80, 140, 6);
        middleButton.setFill(Color.RED);
        Circle bottomButton = new Circle(80, 160, 6);
        bottomButton.setFill(Color.RED);
        Line leftArm = new Line(110, 130, 160, 130);
        leftArm.setStrokeWidth(3);
        Line rightArm = new Line(50, 130, 0, 100);
        rightArm.setStrokeWidth(3);
        Rectangle stovepipe = new Rectangle(60, 0, 40, 50);
        Rectangle brim = new Rectangle(50, 45, 60, 5);
        Group hat = new Group(stovepipe, brim);
        hat.setTranslateX(10);
        hat.setRotate(15);
        Group snowman = new Group(base, middle, head, leftEye, rightEye,
                mouth, topButton, bottomButton, leftArm, rightArm, hat);
        snowman.setTranslateX(210);
        snowman.setTranslateY(50);
        Circle sun = new Circle(450, 50, 30);
        sun.setFill(Color.GOLD);
        Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.STEELBLUE);
        Group root = new Group(ground, sun, snowman, text);
        Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);
        primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
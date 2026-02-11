package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(5);
        Square square = new Square(4);
        
        Renderer renderer1 = new Renderer(rectangle);
        renderer1.draw();
        
        Renderer renderer2 = new Renderer(circle);
        renderer2.draw();
        
        Renderer renderer3 = new Renderer(square);
        renderer3.draw();
    }
}

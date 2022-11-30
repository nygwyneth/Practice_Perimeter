import java.util.*;

public class Main {
    
    Scanner in = new Scanner(System.in);
    static Main main = new Main();

    private int length, width, perimeter;

    public static void main(String[] args) throws Exception {
        main.startProgram();
    }

    public void startProgram() {
        queryLengthWidth();
        System.out.println("Perimeter: " + getPerimeter() + " inches");
    }

    public void queryLengthWidth() {
        System.out.print("Enter value of length: ");
        length = in.nextInt();
        System.out.print("Enter value of width: ");
        width = in.nextInt();

        main.setPerimeter(length, width);
    }

    public void setPerimeter(int length, int width) {
        perimeter = (length * 2) + (width * 2);
    }

    public int getPerimeter() {
        return perimeter;
    }
}
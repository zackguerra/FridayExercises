package Week1.Classes;

public class Rectangle {
    private int width = 1;
    private int height = 1;
    private String color = "Blue";

    /****  CONSTRUCTOR  ****/

    public Rectangle(int width, int height, String color) {
        if (width>=1){
            this.width = width;
        }else{
            System.out.println("The width must be grater than 0.Default value (1) ");
        }
        if (height>=1){
            this.height = height;
        }else{
            System.out.println("The height must be grater than 0.Default value (1) ");
        }
        if (color.length() >= 2){
            this.color = Character.toString(color.charAt(0)).toUpperCase()+color.substring(1,color.length());
        }else{
            System.out.println("The color must be longer that 2 characters. Default value (Blue)");
        }
    }

    /****  GETTERS  ****/
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
    /****  SETTERS  ****/
    public void setWidth(int width) {
        if (width>=1){
            this.width = width;
        }else{
            System.out.println("The width must be grater than 0.That rectangle has the value of "+this.width);
        }
    }

    public void setHeight(int height) {
        if (height>=1){
            this.height = height;
        }else{
            System.out.println("The height must be grater than 0.That rectangle has the value of "+this.height);
        }
    }

    public void setColor(String color) {
        if (color.length() >= 2){
            this.color = Character.toString(color.charAt(0)).toUpperCase()+color.substring(1,color.length());
        }else{
            System.out.println("The color must be longer that 2 characters. That rectangle has the value of "+this.color);
        }
    }
    /****  METHODS  ****/

    public void draw(){
        String letter = Character.toString(this.color.charAt(0));
        for (int y = 0; y<this.height;y++){
            for(int x = 0;x<this.width; x++){
                System.out.print(letter);
            }
            System.out.println("");
        }

    }
}
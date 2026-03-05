public class Shape {
    private int[] sides; // store sides/radius as integers
    private String shapeType; // "circle", "rectangle", "triangle"
    private StringToNumber strToNum = new StringToNumber();

    // --- Circle constructors ---
    public Shape(int radius) {
        this.sides = new int[] { radius };
        this.shapeType = "circle";
    }

    public Shape(String radiusStr) {
        this.sides = new int[] { strToNum.convert(radiusStr) };
        this.shapeType = "circle";
    }

    // --- Rectangle constructors ---
    public Shape(int width, int height) {
        this.sides = new int[] { width, height };
        this.shapeType = "rectangle";
    }

    public Shape(String widthStr, String heightStr) {
        this.sides = new int[] { strToNum.convert(widthStr), strToNum.convert(heightStr) };
        this.shapeType = "rectangle";
    }

    // --- Triangle constructors ---
    public Shape(int side1, int side2, int side3) {
        this.sides = new int[] { side1, side2, side3 };
        this.shapeType = "triangle";
    }

    public Shape(String side1Str, String side2Str, String side3Str) {
        this.sides = new int[] { strToNum.convert(side1Str), strToNum.convert(side2Str), strToNum.convert(side3Str) };
        this.shapeType = "triangle";
    }

    // --- Perimeter ---
    public void perimeter() {
        double p = 0;
        switch (shapeType) {
            case "circle":
                p = 2 * Math.PI * sides[0];
                System.out.println("This circle has a perimeter of " + p);
                break;
            case "rectangle":
                p = 2 * (sides[0] + sides[1]);
                System.out.println("This rectangle has a perimeter of " + (int)p);
                break;
            case "triangle":
                p = sides[0] + sides[1] + sides[2];
                System.out.println("This triangle has a perimeter of " + (int)p);
                break;
        }
    }

    // --- Area ---
    public void area() {
        double a = 0;
        switch (shapeType) {
            case "circle":
                a = Math.PI * Math.pow(sides[0], 2);
                System.out.println("This circle has an area of " + a);
                break;
            case "rectangle":
                a = sides[0] * sides[1];
                System.out.println("This rectangle has an area of " + (int)a);
                break;
            case "triangle":
                double s = (sides[0] + sides[1] + sides[2]) / 2.0; // semi-perimeter
                a = Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
                System.out.println("This triangle has an area of " + a);
                break;
        }
    }
}

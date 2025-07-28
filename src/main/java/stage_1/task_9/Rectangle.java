package stage_1.task_9;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        if (height > 0) {
            return height;
        }
        return 0;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        if (width > 0) {
            return width;
        }
        return 0;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}


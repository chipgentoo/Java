package HomeWork.Part_2.F_Work6.work1;

public abstract class Shape implements ShapeImpl{

    int height;
    int width;

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }
}

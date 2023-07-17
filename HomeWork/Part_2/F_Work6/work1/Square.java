package HomeWork.Part_2.F_Work6.work1;

// Квадрат
public class Square extends Rectangle {

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        // повторное использование написанного кода
        this.setHeight(width);
    }
    // getters & setters в классе Shape!
}

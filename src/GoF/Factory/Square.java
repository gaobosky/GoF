package GoF.Factory;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:31
 * @Version 1.0
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}

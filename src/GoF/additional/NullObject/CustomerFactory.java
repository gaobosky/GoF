package GoF.additional.NullObject;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:07
 * @Version 1.0
 */
public class CustomerFactory {
    public static final String[] names = {"Rob","Joe","Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}

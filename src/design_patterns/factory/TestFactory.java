package design_patterns.factory;

/**
 * @author : Sachintha Nishajith <snishajith@gmail.com>
 * @since : 5/4/2021
 **/
public class TestFactory {
    public static void main(String[] args) {
        Mobile mobile = MobileFactory.getInstance().getMobile(MobileFactory.MobileType.APPLE);
        mobile.specification();
    }
}

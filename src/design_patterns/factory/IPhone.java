package design_patterns.factory;

/**
 * @author : Sachintha Nishajith <snishajith@gmail.com>
 * @since : 5/4/2021
 **/
public class IPhone implements Mobile {
    @Override
    public void specification() {
        System.out.println("IPhone has IOS and it is expensive");
    }
}

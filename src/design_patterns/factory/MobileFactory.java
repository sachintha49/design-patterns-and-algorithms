package design_patterns.factory;

/**
 * @author : Sachintha Nishajith <snishajith@gmail.com>
 * @since : 5/4/2021
 **/
public class MobileFactory {
    private static MobileFactory mobileFactory;

    private MobileFactory(){}

    public enum MobileType {
        SAMSUNG,APPLE,SONY
    }

    public static MobileFactory getInstance(){
        return mobileFactory == null ? mobileFactory = new MobileFactory() : mobileFactory;
    }

    public <T> T getMobile(MobileType type){
        switch (type){
            case SONY:
                return (T) new Sony();
            case APPLE:
                return (T) new IPhone();
            case SAMSUNG:
                return (T) new Samsung();
            default:
                return null;
        }
    }
}

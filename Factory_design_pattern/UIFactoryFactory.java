package Factory_design_pattern;

public class UIFactoryFactory {
    public static UIfactory getUIfactoryForPlatform(String platform){
//        the responsibility of this class is create objects for each platform//
        if (platform.equals("Android")){
            return new Androidfactory();
        }
        else {
            return new IOSfatory();
        }
    }
}

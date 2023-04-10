package Factory_design_pattern;

public class Flutter {
    //    here we will create some methods  set theme & setrefresh rate//
    public void setTheme() {
        System.out.println("seting theme for all os");
    }

    public void setRefreshrate() {
        System.out.println("refreshing for all os");
    }

    //    Practical Factory method//
    public UIfactory createUIfactory(String platform) {
        return UIFactoryFactory.getUIfactoryForPlatform(platform);

    }
}






//    Abstract factory method violates OCP coz cant modify it for windows platform//
//    public UIfactory createUIfactory(String platform){
//        if (platform.equals("Andoroid")){
//            return new Androidfactory();
//        }
//        else {
//            return new IOSfatory();
//        }



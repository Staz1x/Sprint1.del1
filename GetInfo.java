package sprint1.inlämningar.inlämning1;

public class GetInfo {

    public static String showInfo(Info allInfo) {
        return allInfo.getName() + " behöver " + allInfo.amount() + " liter " + allInfo.waterType()+ " om dagen";
    }

}

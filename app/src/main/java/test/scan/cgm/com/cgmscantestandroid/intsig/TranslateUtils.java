package test.scan.cgm.com.cgmscantestandroid.intsig;

/**
 * Created on 1/4/2018.
 */

public class TranslateUtils {
    public static String commentMsg(int var0) {
        String var1 = null;
        switch (var0) {
            case -3:
                var1 = "Exceeded time limit";
                break;
            case -2:
                var1 = "Package name is incorrect";
                break;
            case -1:
                var1 = "AppKEY error";
                break;
            case 0:
                var1 = "Initialization successful\n";
                break;
            case 101:
                var1 = "Package name is incorrect";
                break;
            case 102:
                var1 = "AppKEY error";
                break;
            case 103:
                var1 = "Exceeded time limit";
                break;
            case 104:
                var1 = "Equipment limit reached";
                break;
            case 201:
                var1 = "Signed wrong";
                break;
            case 202:
                var1 = "Other mistakes";
                break;
            case 203:
                var1 = "Server Error\n";
                break;
            case 204:
                var1 = "Network Error";
                break;
            case 205:
                var1 = "Package name / signature error";
        }

        return var1;
    }
}

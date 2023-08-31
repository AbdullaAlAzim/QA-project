package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
    @DataProvider(name = "validCredentials")
    public static Object datasetOne() {
        Object[][] validObjects = {
                {"cserion0@gmail.com","@cseriyon15"}
        };
        return validObjects;
    }

    @DataProvider(name = "invalidCredentials")
    public static Object datasetTwo(){
        Object[][] objects = {
                {"abc12@gmail.com","12345"},
                {"hgfhgfcasfds.com","12345"},
                {"casfdscom","5645",}
        };
        return objects;
    }
}

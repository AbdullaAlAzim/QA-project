package utilities;
import org.testng.annotations.DataProvider;


public class DataSet {

    @DataProvider(name = "invalidCredentials")
    public  static  Object  dataset(){

        Object[][] Objects = {

                {"standard_user", "secret_sauc"},
                {"standard_use", "secret_sauce"},
                {" standard_user", "secret_sauce"},


        };
        return Objects;

    }
}

package regressionTest;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;
import regression.Search;

public class TestSearch extends Search {

    @Test(priority = 1)
    public  void serch() {
        search();

return;
    }

    @Test(priority = 2)
    public void carmodels(){
        searchMotors();

    }

    @Test(priority = 3)
    public void searchCarmodels() {
        super.searchCarmodels();
    }

    @Test
public void testmouseHovers(){
        testmouseHover();
    }

}

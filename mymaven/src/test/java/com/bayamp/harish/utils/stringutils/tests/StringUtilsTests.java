package com.bayamp.harish.utils.stringutils.tests;

import com.bayamp.harish.utils.StringUtils;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class StringUtilsTests {
    
    @Test
    public void positiveTest() {
        String input = "harish";
        String reverse = StringUtils.reverseString(input);
        Reporter.log("The reverse of input string :" + input +" is :" + reverse,true);
    }

}

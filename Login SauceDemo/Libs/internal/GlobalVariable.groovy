package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object str_url
     
    /**
     * <p></p>
     */
    public static Object str_id
     
    /**
     * <p></p>
     */
    public static Object str_pass
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            str_url = selectedVariables['str_url']
            str_id = selectedVariables['str_id']
            str_pass = selectedVariables['str_pass']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

package test.com.Pearl; 

import com.Pearl.ClientRegister;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class ClientRegisterTest { 

@Test
public void testGetGoldClients() {
    ClientRegister testAClient = new ClientRegister();
    List<String> myActualVar = Arrays.asList() ;
    List<String> testOutput = testAClient.getGoldClients();
    Assert.assertEquals(testOutput, myActualVar);
} 

@Test
public void testGetPremiumClients() throws Exception {
    ClientRegister testAClient = new ClientRegister();
    List<String> myActualVar = Arrays.asList() ;
    List<String> testOutput = testAClient.getPremiumClients();
    Assert.assertEquals(testOutput, myActualVar);
} 

@Test
public void testGetPlatinumClients() throws Exception {
    ClientRegister testAClient = new ClientRegister();
    List<String> myActualVar = Arrays.asList() ;
    List<String> testOutput = testAClient.getPlatinumClients();
    Assert.assertEquals(testOutput, myActualVar);

}
} 

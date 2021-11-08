package test.com.Pearl; 

import com.Pearl.PrivateClientsRegister;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PrivateClientsRegisterTest {

@Test
public void testGetPrivateMem()  {
    PrivateClientsRegister testPriClient = new PrivateClientsRegister();
    List<String> myActualVar = Arrays.asList() ;
    List<String> testOutput = testPriClient.getPrivateMem();
    Assert.assertEquals(testOutput, myActualVar);
} 


} 

package test.com.Pearl; 

import com.Pearl.CorporateClientsRegister;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CorporateClientsRegisterTest { 

@Test
public void testGetCorporateMem() throws Exception {
    CorporateClientsRegister testCorpClient = new CorporateClientsRegister();
    List<String> myActualVar = Arrays.asList() ;
    List<String> testOutput = testCorpClient.getCorporateMem();
    Assert.assertEquals(testOutput, myActualVar);
}


} 

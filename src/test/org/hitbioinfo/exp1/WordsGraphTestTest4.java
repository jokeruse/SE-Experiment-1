package test.org.hitbioinfo.exp1;
import org.hitbioinfo.exp1.WordsGraph;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
* WordsGraphTest Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 13, 2017</pre> 
* @version 1.0 
*/ 
public class WordsGraphTestTest4 {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: calcshortestpath() 
* 
*/ 
@Test
public void testCalcshortestpath() throws Exception { 
//TODO: Test goes here...
    WordsGraph testGraph = new WordsGraph("Nowadays, more and more college students @@@ permanent and security and more want to look for college security more. now winter is coming.");
        String[] result = testGraph.calcshortestpath("a", "more");
        System.out.println(result[0]);
        Assert.assertEquals("No 'a' in the graph!", result[0]);
} 


} 

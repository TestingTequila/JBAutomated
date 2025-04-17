package tdd;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsConcept {
    public int sum(int a, int b)
    {
        return (a + b);
    }
    public  boolean hasJob(String nameOfPerson)
    {
        boolean hasJob = false;
        if(nameOfPerson.equals("Jason"))
        {
            hasJob=true;
        }
        return hasJob;
    }

    @Test
    public  void testAddition1()
    {
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(sum(12,7), 20);
        System.out.println("testAddition1 :This is my Test Case 1");
        sa.assertAll();
    }

    @Test
    public  void testAddition2()
    {
        Assert.assertEquals(hasJob("Jason"), true);
    }

    @Test
    public  void testAddition3()
    {
        Assert.assertNotEquals(sum(12,7), 20);
    }

    @Test
    public  void testAddition4()
    {
        Assert.assertNotEquals(hasJob("Jason"), false);
    }

    @Test
    public  void testAddition5()
    {
        Assert.assertTrue(hasJob("Jason"));
    }

    @Test
    public  void testAddition6()
    {
        Assert.assertFalse(hasJob("Mercy"));
    }

    @Test
    public  void testAddition7()
    {
        Assert.assertTrue(hasJob("Mercy"));
    }

    @Test
    public  void testAddition8()
    {
       if(hasJob("Mercy"))
       {
           System.out.println("Jason has a Job");
       }
       else
       {
           System.out.println("Jason did not have a Job");
       }
    }


}

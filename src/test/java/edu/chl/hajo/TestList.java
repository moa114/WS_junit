package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @Test
    public void testAdd() {
        List l = new List();
        l.add(100);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
    }


    @Test
    public void testRemove() {
        List l = new List();
        l.add(100);
         int i= l.remove();                        // Call method to test
        assertTrue(l.getLength() == 0);// The logical check
        assertTrue(i==100);
    }


    @Test
    public void testget() {
        List l = new List();
        l.add(100);
        l.add(200);
        l.add(3);
        l.add(400);
        l.add(500);

        int i= l.get(2);                        // Call method to test
        assertTrue(i == 3);  // The logical check
    }


    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List l = new List();
        l.add(100);
        l.get(1); // Exception!!!
    }

    @Test
    public void testCopy() {
        List l = new List();
        l.add(100);
        l.add(200);
        l.add(3);
        l.add(400);
        l.add(500);
        List m = l.copy();

        for( int i= 0; i <l.getLength(); i++){
           assertTrue( m.get(i)==l.get(i));
        }
    }
    
    @BeforeClass
    public static void beforeClass(){  //First of all
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){  // Last of all
        System.out.println("After class");
    }

    @Before
    public void before(){  //Before each test method
        System.out.println("Before");
    }

    @After
    public void after(){  //After each test method
        System.out.println("After");
    }

}

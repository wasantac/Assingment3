/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author walte
 */
public class MeldableHeapTest {
    
    public MeldableHeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEmpty method, of class MeldableHeap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        MeldableHeap instance = new MeldableHeap();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of makeEmpty method, of class MeldableHeap.
     */
    @Test
    public void testMakeEmpty() {
        System.out.println("makeEmpty");
        MeldableHeap instance = new MeldableHeap();
        instance.makeEmpty();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getSize method, of class MeldableHeap.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        MeldableHeap instance = new MeldableHeap();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of add method, of class MeldableHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int x = 0;
        MeldableHeap instance = new MeldableHeap();
        instance.add(x);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of remove method, of class MeldableHeap.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        MeldableHeap instance = new MeldableHeap();
        int expResult = 0;
        int result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of remove method, of class MeldableHeap.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int u = 0;
        MeldableHeap instance = new MeldableHeap();
        int expResult = 0;
        int result = instance.remove(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of meld method, of class MeldableHeap.
     */
    @Test
    public void testMeld() {
        System.out.println("meld");
        Node q1 = null;
        Node q2 = null;
        MeldableHeap instance = new MeldableHeap();
        Node expResult = null;
        Node result = instance.meld(q1, q2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of displayHeap method, of class MeldableHeap.
     */
    @Test
    public void testDisplayHeap() {
        System.out.println("displayHeap");
        MeldableHeap instance = new MeldableHeap();
        instance.displayHeap();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

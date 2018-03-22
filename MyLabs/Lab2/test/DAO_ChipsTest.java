/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stu-ist109
 */
public class DAO_ChipsTest {

    public DAO_ChipsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of print method, of class DAO_Chips.
     */
    @Test
    public void testPrint() {
        try {
            System.out.println("print");
            String string = "";
            DAO_Chips.print(string);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {

fail("The test case is a prototype.");
    }}

    /**
     * Test of getChips method, of class DAO_Chips.
     */
    @Test
    public void testGetChips() throws Exception {
        try {
            System.out.println("getChips");
            int id = 0;
            DAO_Chips instance = new DAO_Chips();
            Chips expResult = null;
//            Chips result = instance.getChips(id);
          //  assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (DAO_ChipsException _GEN_UCE_NAME_1) {

fail("The test case is a prototype.");
    }}

    /**
     * Test of addChips method, of class DAO_Chips.
     */
    @Test
    public void testAddChips() throws DAO_ChipsException {
        try {
            System.out.println("addChips");
            Chips ft = null;
            DAO_Chips instance = new DAO_Chips();
//            instance.addChips(ft);
            // TODO review the generated test code and remove the default call to fail.
        } catch (DAO_ChipsException _GEN_UCE_NAME_1) {

fail("The test case is a prototype.");
    }}

    /**
     * Test of removeChips method, of class DAO_Chips.
     */
    @Test
    public void testRemoveChips() throws DAO_ChipsException {
        try {
            System.out.println("removeChips");
            int id = 0;
            DAO_Chips instance = new DAO_Chips();
            instance.removeChips(id);
            // TODO review the generated test code and remove the default call to fail.
        } catch (DAO_ChipsException _GEN_UCE_NAME_1) {

fail("The test case is a prototype.");
    }}

    /**
     * Test of insert method, of class DAO_Chips.
     */


    /**
     * Test of select method, of class DAO_Chips.
     */
    @Test
    public void testSelect() throws DAO_ChipsException {
        try {
            System.out.println("select");
            int id = 0;
            DAO_Chips instance = new DAO_Chips();
            Chips expResult = null;
            Chips result = instance.select(id);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (DAO_ChipsException _GEN_UCE_NAME_1) {

fail("The test case is a prototype.");
    }}

}
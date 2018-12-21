package com.company;



import org.junit.Before;

import org.junit.Test;


import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class LinkedListTests {
    LinkedList<String> linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList<>();
        linkedList.add("1212");
        linkedList.add("1233");
        linkedList.add("2132");
    }

    @Test
    public void gettingElementTest() {
        String expected = "1212";
        String actual = (String) linkedList.get(0).getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void isNumberContainsTest() {
        assertTrue(linkedList.contains("1212"));
    }

    @Test
    public void sizeTest() {
        int expected = 3;
        int actual = linkedList.size();
        assertEquals(expected, actual);
    }

    @Test
    public void addingTest() {
        linkedList.add("Some text", 3);
        String expected = "Some text";
        String actual = (String) linkedList.get(3).getValue();
        assertEquals(expected, actual);
    }
}
package org.JUnitTest.listOperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class ListOperationsTest {
    public ListOperations listManager;
    public List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListOperations();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(list, 7);
        assertTrue(list.contains(7));
    }

    @Test
    void testRemoveElement() {
        listManager.addElement(list, 10);
        listManager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        assertEquals(2, listManager.getSize(list));
        listManager.removeElement(list, 1);
        assertEquals(1, listManager.getSize(list));
    }

}
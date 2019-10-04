package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTest {
    private LinkedList list;
    private LinkedList list1;

    @BeforeEach
    void setUp(){
        this.list = new LinkedList();
        this.list1 = new LinkedList();

        this.list.addLast(3);
        this.list.addLast(5);
        this.list.addLast(7);
    }

    @Test
    void sizeTest(){
        assertEquals(3, this.list.size());
        assertEquals(0, this.list1.size());
    }

    @Test
    void addFirst(){
        this.list.add(0, 10);
        assertEquals(4, this.list.size());
    }

    @Test
    void removeLast(){
        assertArrayEquals(new int[]{3,5,7}, this.list.toArray());
        this.list.remove(this.list.size()-1);
        assertArrayEquals(new int[]{3,5}, this.list.toArray());
    }

    @Test
    void removeFirst(){
        assertArrayEquals(new int[]{3,5,7}, this.list.toArray());
        this.list.remove(0);
        assertArrayEquals(new int[]{5,7}, this.list.toArray());
    }

    @Test
    void removeIllegalIndex(){
        this.list.remove(-1);
        assertArrayEquals(new int[]{5,7}, this.list.toArray());
        this.list.remove(100000);
        assertArrayEquals(new int[]{5,7}, this.list.toArray());
    }




}
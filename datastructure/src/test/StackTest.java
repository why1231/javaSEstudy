package test;

import main.datasutructure.Stack;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    Stack stack = new Stack();

    @Before
    public void before(){

    }
    @After
    public void after(){

    }
    @Test
    public void pushTest(){
        Assert.assertEquals(1,stack.push(1));

    }

    @Test
    public void popTest(){
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(1,stack.pop());
    }
}

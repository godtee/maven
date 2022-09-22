package com.wangbj;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd(){
        App hello = new App();
        int res = hello.add(10,20);
        Assert.assertEquals(30,res);

    }


}

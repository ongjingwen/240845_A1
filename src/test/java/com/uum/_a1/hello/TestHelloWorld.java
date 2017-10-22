/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a1.hello;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author user
 */
public class TestHelloWorld {
    @Test
    public void testHello(){
         HelloWorld hw= new HelloWorld();
        hw.sayHello("zhamri");
        Assert.assertEquals("Hello zhamri","Hello zhamri" );
    }
}

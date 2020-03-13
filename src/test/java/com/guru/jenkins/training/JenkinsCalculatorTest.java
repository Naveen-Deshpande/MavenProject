package com.guru.jenkins.training;

import org.junit.Test;

import static org.junit.Assert.*;

public class JenkinsCalculatorTest {

    @Test
    public  void test_add(){
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(15,myCalc.addnum(10,5));
    }

    @Test
    public void test_multiply(){
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(50,myCalc.multiplynum(10,5));
    }

}
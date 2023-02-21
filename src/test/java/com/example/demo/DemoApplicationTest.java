package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTest {

    public static Logger logger = LoggerFactory.getLogger(DemoApplicationTest.class);
    @Test
    public void contextLoads() {
        logger.info("Test case executed");
        logger.info("Test case executed second log statetemnt");
        assertEquals(true, true);
    }

}
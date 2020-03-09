package com.mai.lock;

import com.mai.lock.controller.ScannerDigits;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LockApplicationTests {

    @Test
    public void contextLoads() {
        ScannerDigits scannerDigits = new ScannerDigits();
        scannerDigits.digitsToWrite();
    }

}

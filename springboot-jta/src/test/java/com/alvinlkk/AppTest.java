package com.alvinlkk;

import static org.junit.Assert.assertTrue;

import com.alvinlkk.service.TransactionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple JtaApp.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Autowired
    private TransactionService transactionService;

    @Test
    public void testTransaction() {
        transactionService.save();
    }
}

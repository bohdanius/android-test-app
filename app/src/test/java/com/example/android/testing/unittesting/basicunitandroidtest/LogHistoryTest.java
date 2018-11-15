package com.example.android.testing.unittesting.basicunitandroidtest;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogHistoryTest {

    private LogHistory instance = new LogHistory();
    @Test
    public void describeContents() {
    assertEquals(0, instance.describeContents() );
    }

    @Test
    public void getData() {
        assertNotNull(instance.getData() );

    }

}
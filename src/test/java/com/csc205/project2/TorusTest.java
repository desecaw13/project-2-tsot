package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TorusTest {

    private Torus torus;

    @BeforeEach
    public void setUp() {
        torus = new Torus(6.0, 3.0);
    }

    @Test
    void getMajorRadius() {
        assertEquals(6.0, torus.getMajorRadius());
    }

    @Test
    void setMajorRadius() {
        torus.setMajorRadius(4.0);
        assertEquals(4.0, torus.getMajorRadius());
    }

    @Test
    void getMinorRadius() {
        assertEquals(3.0, torus.getMinorRadius());
    }

    @Test
    void setMinorRadius() {
        torus.setMinorRadius(2.0);
        assertEquals(2.0, torus.getMinorRadius());
    }

    @Test
    void surfaceArea() {
        assertEquals(710.6115168784338, torus.surfaceArea(), 0.0001);
    }

    @Test
    void volume() {
        assertEquals(1065.9172753176508, torus.volume(), 0.0001);
    }

    @Test
    void testToString() {
        String expected = "Torus {major radius=6.0, minor radius=3.0, surface area=710.6115168784338, volume=1065.9172753176508}";
        assertEquals(expected, torus.toString());
    }
}

package com.masterclass.section_02;
import com.masterclass.section_02.MeasurementConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeasurementConverterTest {

    @Test
    void testConvertToCentimetersInchesOnly() {
        assertEquals(172.72, MeasurementConverter.convertToCentimeters(68), 0.01);
        assertEquals(0.0, MeasurementConverter.convertToCentimeters(0), 0.01);
        assertEquals(2.54, MeasurementConverter.convertToCentimeters(1), 0.01);
        assertEquals(101.6, MeasurementConverter.convertToCentimeters(40), 0.01);
    }

    @Test
    void testConvertToCentimetersFeetAndInches() {
        assertEquals(172.72, MeasurementConverter.convertToCentimeters(5, 8), 0.01);
        assertEquals(0.0, MeasurementConverter.convertToCentimeters(0, 0), 0.01);
        assertEquals(30.48, MeasurementConverter.convertToCentimeters(1, 0), 0.01);
        assertEquals(157.48, MeasurementConverter.convertToCentimeters(5, 2), 0.01);
    }

    @Test
    void testConvertToCentimetersBoundaryConditions() {
        assertEquals(30.48, MeasurementConverter.convertToCentimeters(0, 12), 0.01);
        assertEquals(0.0, MeasurementConverter.convertToCentimeters(0, 0), 0.01);
        assertEquals(2.54, MeasurementConverter.convertToCentimeters(0, 1), 0.01);
        assertEquals(246.38, MeasurementConverter.convertToCentimeters(8, 1), 0.01);
    }
}

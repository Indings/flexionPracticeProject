package com.example.flexionPraciceProject.unit;
import com.example.service.TriangleAnalysis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleAnalysisUnitTests {

    TriangleAnalysis triangleAnalysis = new TriangleAnalysis();
    float [] rightScalene = new float[]{3,4,5};
    float [] acuteIsosceles = new float[] {100,20,100};
    float [] obtuseScalene = new float[]{1.7f,1.5f,2.8f};
    float [] equilateral = new float[]{3,3,3};
    float [] notATriangle = new float[]{1000,4,15};
/*
Edge Cases! maybe look at "almost" cases - almost right triangle, etc.
 */
    @Test
    void testRealTriangle(){
        assertEquals("Not a triangle", triangleAnalysis.identifyTriangle(notATriangle));
    }
    @Test
    void testRight() {
        assertEquals("Right", triangleAnalysis.identifyAngleType(rightScalene[0],rightScalene[1],rightScalene[2]));
    }
    @Test
    void testAcute(){
        assertEquals("Acute", triangleAnalysis.identifyAngleType(acuteIsosceles[0],acuteIsosceles[1],acuteIsosceles[2]));
    }
    @Test
    void testObtuse(){
        assertEquals("Obtuse",triangleAnalysis.identifyAngleType(obtuseScalene[0],obtuseScalene[1],obtuseScalene[2]));
    }
    @Test
    void testEquilateral(){
        assertEquals("Equilateral", triangleAnalysis.identifySideType(equilateral[0],equilateral[1],equilateral[2]));
    }
    @Test
    void testScalene(){
        assertEquals("Scalene", triangleAnalysis.identifySideType(obtuseScalene[0],obtuseScalene[1],obtuseScalene[2]));
    }
    @Test
    void testIsosceles(){
        assertEquals("Isosceles", triangleAnalysis.identifySideType(acuteIsosceles[0],acuteIsosceles[1],acuteIsosceles[2]));
    }
}

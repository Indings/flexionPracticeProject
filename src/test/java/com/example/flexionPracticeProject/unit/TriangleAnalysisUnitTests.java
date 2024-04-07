package com.example.flexionPracticeProject.unit;
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
    float [] degenerateTriangle = new float[]{5,5,10};
    float [] negativeSideLenTriangle = new float[]{3,4,-5};

    @Test
    void test_Real_Triangle(){
        assertEquals("Not a triangle", triangleAnalysis.identifyTriangle(notATriangle));
    }
    @Test
    void test_Degenerate_Triangle() {assertEquals("Not a triangle",triangleAnalysis.identifyTriangle(degenerateTriangle));}
    @Test
    void test_Negative_Side_Length() {assertEquals("Not a triangle", triangleAnalysis.identifyTriangle(negativeSideLenTriangle));}
    @Test
    void test_Right() {
        assertEquals("Right", triangleAnalysis.identifyAngleType(rightScalene[0],rightScalene[1],rightScalene[2]));
    }
    @Test
    void test_Acute(){
        assertEquals("Acute", triangleAnalysis.identifyAngleType(acuteIsosceles[0],acuteIsosceles[1],acuteIsosceles[2]));
    }
    @Test
    void test_Obtuse(){
        assertEquals("Obtuse",triangleAnalysis.identifyAngleType(obtuseScalene[0],obtuseScalene[1],obtuseScalene[2]));
    }
    @Test
    void test_Equilateral(){
        assertEquals("Equilateral", triangleAnalysis.identifySideType(equilateral[0],equilateral[1],equilateral[2]));
    }
    @Test
    void test_Scalene(){
        assertEquals("Scalene", triangleAnalysis.identifySideType(obtuseScalene[0],obtuseScalene[1],obtuseScalene[2]));
    }
    @Test
    void test_Isosceles(){
        assertEquals("Isosceles", triangleAnalysis.identifySideType(acuteIsosceles[0],acuteIsosceles[1],acuteIsosceles[2]));
    }
}

package com.example.service;
import java.util.*;

public class TriangleAnalysis {
    public String identifyTriangle (float[] sideLengths){
        String triangleType = "";
        Arrays.sort(sideLengths);
        float a = sideLengths[0]; float b = sideLengths[1]; float c = sideLengths[2];
        if(isATriangle(a,b,c)){
           triangleType = identifyAngleType(a,b,c);
           triangleType += " " + identifySideType(a,b,c);
           return triangleType;
        }
        return "Not a triangle";
    }

    private boolean isATriangle (float a, float b, float c){
        return a+b > c && a+c > b && b+c>a;
    }

    public String identifyAngleType(float a, float b, float c){
        float aSquare = (float)Math.pow(a,2); float bSquare = (float)Math.pow(b,2); float cSquare = (float)Math.pow(c,2);
        if(cSquare == aSquare+bSquare){
            return "Right";
        }
        else if(cSquare > aSquare+bSquare){
            return "Obtuse";
        }
        else if(cSquare < aSquare+bSquare){
            return "Acute";
        }
        return "";
    }

    public String identifySideType(float a, float b, float c){

        if(a==b && b==c){
            return "Equilateral";
        }
        else if(a == b || b == c || a==c ){
            return "Isosceles";
        }
        else if(a != b && b!=c){
            return"Scalene";
        }


        return "";
    }


}

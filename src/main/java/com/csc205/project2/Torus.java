package com.csc205.project2;

public class Torus extends Shape {
    private double majorRadius;
    private double minorRadius;

    public Torus() {
        majorRadius = 1.0;
        minorRadius = 1.0;
    }

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    @Override
    public double surfaceArea() {
        return 4.0 * Math.PI * Math.PI * majorRadius * minorRadius;
    }

    @Override
    public double volume() {
        return 2.0 * Math.PI * Math.PI * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Torus {");
        sb.append("major radius=").append(majorRadius);
        sb.append(", minor radius=").append(minorRadius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

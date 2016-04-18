package com.test5.com;

/**
 * Created by Ivan on 3/3/2016.
 */
public class Screen {
    private int resolution;
    private int rangeOfColors;

    public Screen(int resolution, int rangeOfColors) {
        this.resolution = resolution;
        this.rangeOfColors = rangeOfColors;
    }

    public int getResolution() {
        return resolution;
    }

    public int getRangeOfColors() {
        return rangeOfColors;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setRangeOfColors(int rangeOfColors) {
        this.rangeOfColors = rangeOfColors;
    }

    public void changeResolution(int n){
        resolution = resolution/n;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "resolution=" + resolution +
                ", rangeOfColors=" + rangeOfColors +
                '}';
    }
}

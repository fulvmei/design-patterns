package com.fulvmei.designpatterns.struct.flyweight;

import java.util.HashMap;

public class ColorFactory {

    private static final HashMap<String, Color> colorMap = new HashMap<String, Color>();

    public static Color getColor(String name) {
        Color color = colorMap.get(name);
        if (color == null) {
            color = new Color(name);
            colorMap.put(name, color);
        }
        return color;
    }
}

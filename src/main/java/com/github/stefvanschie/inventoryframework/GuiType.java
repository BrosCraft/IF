package com.github.stefvanschie.inventoryframework;

public enum GuiType {

    DEFAULT(9, 6),
    DROPPER(3, 3),
    HOPPER(5, 1);

    private final int maxLength;
    private final int maxHeight;

    GuiType(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}

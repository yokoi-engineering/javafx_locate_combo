package com.exsample.javafxlocatecombo;

public enum ParakeetEnum {
    PEACH_FACED_LOVEBIRD("key.PeachFacedLovebird"),
    COCKATIEL("key.Cockatiel"),
    BUDGERIGAR("key.Budgerigar");

    final private String resourceKey;

    private ParakeetEnum(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    public String getResourceKey() {
        return resourceKey;
    }
}

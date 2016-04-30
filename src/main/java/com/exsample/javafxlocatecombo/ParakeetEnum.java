package com.exsample.javafxlocatecombo;

public enum ParakeetEnum {
    PEACH_FACED_LOVEBIRD("小桜インコ"),
    COCKATIEL("オカメインコ"),
    BUDGERIGAR("セキセイインコ");

    final private String name;

    private ParakeetEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

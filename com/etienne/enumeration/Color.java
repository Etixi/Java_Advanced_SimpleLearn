package com.etienne.enumeration;

enum Color {
    RED("red"), GREEN("green"), BLUE("blue");

    private String value;

    // constructeur
    Color(String value) {
        this.value = value;
    }

    // Getter
    public String getValue(){
        return value;
    }


}

package com.unpri.charactermanager.model;

public class Character {
    private String name;
    private CharacterType type;
    private int level;

    // 1. Constructor Default (Tanpa Parameter)
    public Character() {
    }

    // 2. Constructor Berparameter (Sesuai pemanggilan di Main.java)
    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    // Getter dan Setter Lengkap
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Method toString() untuk menampilkan informasi objek
    @Override
    public String toString() {
        return "Character{name='" + name + "', type=" + type + ", level=" + level + "}";
    }
}
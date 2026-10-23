package com.unpri.charactermanager.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {
    private List<Character> characterList;

    // Constructor
    public CharacterManager() {
        this.characterList = new ArrayList<>();
    }

    // Method untuk menambah karakter
    public void addCharacter(Character character) {
        characterList.add(character);
    }

    // Method untuk menampilkan semua karakter
    public void displayAllCharacters() {
        if (characterList.isEmpty()) {
            System.out.println("Belum ada karakter yang terdaftar.");
        } else {
            for (Character c : characterList) {
                System.out.println(c);
            }
        }
    }

    // Getter untuk daftar karakter
    public List<Character> getCharacterList() {
        return characterList;
    }
}
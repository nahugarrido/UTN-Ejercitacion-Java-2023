package org.example.modelos;

public class Anagrama {
    Anagrama() {

    }

    public boolean esAnagrama(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        if (palabra1.length() == 0) {
            return true;
        }

        int[] arr = new int[26];

        for (int i = 0; i < palabra1.length(); i++) {
            arr[palabra1.charAt(i) - 'a']++;
            arr[palabra2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

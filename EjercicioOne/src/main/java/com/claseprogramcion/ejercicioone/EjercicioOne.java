package com.claseprogramcion.ejercicioone;

public class EjercicioOne {

    public static void main(String[] args) {

        Character homero = new Character("Homero", 39, 'M', "a la grande le puse cuca");
        homero.saySomething();

        Character bart = new Character("Bartolomeo", 10, 'M', "ay caramba");
        bart.saySomething();

    }

    static class Character {

        String name;
        int age;
        char gender;
        String phrase;

        public Character(String name, int age, char gender, String phrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.phrase = phrase;
        }

        void saySomething() {
            System.out.println(this.phrase);
        }
    }
}

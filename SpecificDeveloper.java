package ru.corruptzero;

public class SpecificDeveloper implements Developer{
    String specialty;
    int age;
    String name;
    Gender gender;

    @Override
    public void writeCode() {
        System.out.println(specialty + " developer writes code...");
    }
}

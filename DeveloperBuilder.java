package ru.corruptzero;

public interface DeveloperBuilder {
    DeveloperBuilder setName(String name);
    DeveloperBuilder setAge(int age);
    DeveloperBuilder setGender(Gender gender);
    DeveloperBuilder setSpecialty(String specialty);
    Developer build();

}

package ru.corruptzero;

public class DeveloperBuilderImpl implements DeveloperBuilder{
    SpecificDeveloper developer = new SpecificDeveloper();
    @Override
    public DeveloperBuilder setName(String name) {
        developer.name = name;
        return this;
    }

    @Override
    public DeveloperBuilder setAge(int age) {
        developer.age = age;
        return this;
    }

    @Override
    public DeveloperBuilder setGender(Gender gender) {
        developer.gender = gender;
        return this;
    }

    @Override
    public DeveloperBuilder setSpecialty(String specialty) {
        developer.specialty = specialty;
        return this;
    }

    @Override
    public Developer build() {
        return developer;
    }
}

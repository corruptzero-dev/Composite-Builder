package ru.corruptzero;

public class Main {

    public static void main(String[] args) {
	    Team team = new Team();

        Developer javaDeveloper = new DeveloperBuilderImpl()
                .setName("Marcus")
                .setAge(20)
                .setGender(Gender.MALE)
                .setSpecialty("Java")
                .build();
        Developer cppDeveloper = new DeveloperBuilderImpl()
                .setName("John")
                .setAge(26)
                .setGender(Gender.MALE)
                .setSpecialty("C++")
                .build();

        team.addDeveloper(javaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}

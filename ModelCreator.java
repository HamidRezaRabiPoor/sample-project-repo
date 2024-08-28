
public class ModelCreator {
    PracticeBundle practiceBundle = new PracticeBundle();


    public PracticeBundle getPracticeBundle() {
        return setPracticeBundle(this.practiceBundle);
    }

    public PracticeBundle setPracticeBundle (PracticeBundle practiceBundle) {
        String name = "Hamid Reza";
        String family = "Rabi Poor";
        int age = 39;
        practiceBundle.setName(name);
        practiceBundle.setFamily(family);
        practiceBundle.setAge(age);
        this.practiceBundle = practiceBundle;
        return practiceBundle;
    }
}





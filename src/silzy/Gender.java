package silzy;

public enum Gender {
    MALE("He", "His", "Is"),
    FEMALE("She", "Her", "Is"),
    NON_BINARY("They", "Their", "Are");

    private final String nominativePronoun;
    private final String possessivePronoun;
    private final String toBeForm;

    Gender(String nominativePronoun, String possessivePronoun, String toBeForm) {
        this.nominativePronoun = nominativePronoun;
        this.possessivePronoun = possessivePronoun;
        this.toBeForm = toBeForm;
    }

    public String getNominativePronoun() {
        return nominativePronoun;
    }

    public String getPossessivePronoun(){
        return possessivePronoun;
    }


    public String getToBeForm(){
        return toBeForm;
    }
}

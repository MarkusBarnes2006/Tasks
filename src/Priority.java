public enum Priority {
    LOW("low urgency"),
    MEDIUM("medium urgency"),
    HIGH("high urgency");

    private final String description;

    Priority(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}





package edu04.HomeWork05;

public enum Breed {
    LABRADOR("Labrador"),
    FRENCH_BULLDOG("French Bulldog"),
    GERMAN_SHEPHERD("German Shepherd"),
    GOLDEN_RETRIEVER("Golden Retriever");

    private final String breedReadable;

    Breed(String breedReadable) {
        this.breedReadable = breedReadable;
    }

    public String getReadableName() {
        return this.breedReadable;
    }
}

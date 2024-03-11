package denys.serdiuk.homework3;

public enum Breed {
	BULLDOG("French Bulldog"),
	LABRADOR("Golden Retriever"),
	BEAGLE("Beagle"),
	SHEPHERD("German Shepard");

	private final String name;

	Breed(String name) {
		this.name = name;
	}
}

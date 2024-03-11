package denys.serdiuk.homework3;

import java.util.Objects;

public class Dog {
	private String name;
	private int age;
	private String breed;

	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public static String checkNames(Dog[] dogs) {
		for (int i = 0; i < dogs.length; i++) {
			String dogsName = dogs[i].name;
			for (int j = i + 1; j < dogs.length; j++) {
				if (dogsName.equalsIgnoreCase(dogs[j].getName())) {
					return dogs[i] + " has a duplicate!";
				}
			}
		}
		return "All names are unique!";
	}

	public static String getOldestDog(Dog[] dogs) {
		int biggestAge = dogs[0].getAge();
		String oldestDog = dogs[0].getName();
		for (int i = 0; i < dogs.length; i++) {
			if (biggestAge < dogs[i].getAge()) {
				biggestAge = dogs[i].getAge();
				oldestDog = dogs[i].getName();
			}
		}
		return oldestDog + " is the oldest dog!";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(breed, other.breed) && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("Chak", 14, Breed.BULLDOG.name());
		Dog dog2 = new Dog("Surik", 20, Breed.LABRADOR.name());
		Dog dog3 = new Dog("Tom", 20, Breed.LABRADOR.name());

		Dog[] dogs = { dog1, dog2, dog3 };

		System.out.println(getOldestDog(dogs));
		System.out.println(checkNames(dogs));

	}
}

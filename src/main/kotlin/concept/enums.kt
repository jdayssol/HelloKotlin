package concept

/**
 * Create an enum called concept.Animals and add the following types:
 * CAT, DOG, RAT, BIRD, HAMSTER
 */
enum class Animals {
    CAT, DOG, RAT, BIRD, HAMSTER;
}

/**
 * Create another enum called concept.Cage and add the following:
 * SMALL, MEDIUM, LARGE
 */
enum class Cage {
    SMALL, MEDIUM, LARGE
}
/**
 * Write a function named concept.addAnimalToCage that takes a animal and concept.Cage and print
 * out the animal and the cage that it will be in
 */
fun addAnimalToCage(animal : Animals, cage : Cage){
    println(animal.name + " is in the " + cage.name + " cage")
}

/**
 * Call concept.addAnimalToCage multiple times with different animals and cages
 * Try to use the appropriate cage size for the animal
 */
fun main(args: Array<String>) {
    addAnimalToCage(Animals.BIRD , Cage.SMALL)
    addAnimalToCage(Animals.CAT , Cage.MEDIUM)
}

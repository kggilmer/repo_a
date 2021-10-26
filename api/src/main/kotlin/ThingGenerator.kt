typealias SomeThings = List<Thing>

interface ThingGenerator {

    fun generate(input: String): Thing?

    fun generateThings(): SomeThings
}
typealias SomeThings = List<Thing>

class TreeGenerator : ThingGenerator {

    override fun generate(input: String): Thing? {
        return Thing("Tree of $input")
    }

    override fun generateThings(): SomeThings {
        return listOf(generate("pine")!!, generate("oak")!!)
    }
}
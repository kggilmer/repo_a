

class TreeGenerator : ThingGenerator {
    override fun generate(input: String): Thing? {
        return Thing("Pine")
    }

    override fun generateThings(): SomeThings {
        return listOf(Thing("Oak"))
    }
}
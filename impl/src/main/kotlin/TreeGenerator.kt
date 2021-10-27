

class AnotherTreeGenerator : ThingGenerator {
    private val treeGenerator = TreeGenerator()

    override fun generate(input: String): Thing? {
        return treeGenerator.generate(input)
    }

    override fun generateThings(): SomeThings {
        return treeGenerator.generateThings()
    }
}
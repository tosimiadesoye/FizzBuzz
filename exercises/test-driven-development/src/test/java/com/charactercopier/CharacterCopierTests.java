

@DisplayName("The character copire should")

public class CharacterCopierTests {
    @Test
    @DisplayName("copy a character from the source to the destination")

    void copy FromSourceToDestination() {
        final SourceSpy source = new SourceSpy();
        final DestinationSpy destination = new DestinationSpy();
        final CharacterCopier copier = new CharacterCopier(source, destination);

        copier.copy();

        assertTrue(source.wasCalled());
        assertTrue(destination.wasCalled());
    }

}

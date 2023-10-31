package com.charactercopier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The character copire should")

public class CharacterCopierTests {
    @Test
    @DisplayName("copy a character from the source to the destination")

    void copyFromSourceToDestination() {
        final SourceFake source = new SourceFake();
        final DestinationSpy destination = new DestinationSpy();
        final CharacterCopier copier = new CharacterCopier(source, destination);

        copier.copy();

        assertTrue(source.wasCalled());
        assertTrue(destination.wasCalled());
        assertEquals("a", destination.recordedCharacter());
    }

}

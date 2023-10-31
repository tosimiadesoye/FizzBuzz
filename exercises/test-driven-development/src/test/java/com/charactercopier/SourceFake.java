package com.charactercopier;

import java.util.List;

public class SourceFake implements Source {

    private Integer numberOfCalls = 0;
    private final List<String> characters = List.of("a","b","c","/n");


    @Override
    public String getCharacter() {
        final String character = this.characters.get(this.numberOfCalls);
        this.numberOfCalls = this.numberOfCalls + 1;
        return character;

    }

    Boolean wasCalled(){

        return this.numberOfCalls > 0;
        
    }
    
}

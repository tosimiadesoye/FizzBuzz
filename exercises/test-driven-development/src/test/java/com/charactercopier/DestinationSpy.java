
package com.charactercopier;

interface Destination {
    void setCharacter (final String character);
}

public class DestinationSpy implements Destination {

    private Integer numberOfCalls = 0;
    private String recordedCharacter;

    @java.lang.Override
    public void setCharacter(String character) {
        this.numberOfCalls = this.numberOfCalls +1;
        this.recordedCharacter = character;
    }

    Boolean wasCalled(){
        return  this.numberOfCalls > 0;
        
    }

    String recordedCharacter(){
        return this.recordedCharacter;
    }


}
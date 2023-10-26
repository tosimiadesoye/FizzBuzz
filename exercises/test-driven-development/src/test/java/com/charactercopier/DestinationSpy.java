
interface Destination {
    void setCharacter (final String character);
}

public class DestinationSpy implements Destination {

    private Integer numberOfCalls = 0;

    @java.lang.Override
    public void setCharacter(String character) {
        this.numberOfCalls = this.numberOfCalls +1;
    }

    Boolean wasCalled(){
        return  this.numberOfCalls > 0;
    }
}
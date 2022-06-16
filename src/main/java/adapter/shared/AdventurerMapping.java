package adapter.shared;

import core.adventurer.models.orientation.*;

public class AdventurerMapping {

    Orientation getOrientation(char orientation){
        switch (orientation){
            case 'S' :
                return new South();
            case 'N':
                return new North();
            case 'E':
                return new East();
            case 'W':
                return new West();
        }
        //TODO throw exception
        return null;
    }

    char getOrientation(Orientation orientation){
        if( orientation instanceof South ) {
            return 'S';
        }
        else if( orientation instanceof East ) {
            return 'E';
        }
        else if( orientation instanceof North ) {
            return 'N';
        }
        else if( orientation instanceof West ) {
            return 'W';
        }
        //TODO throw exception
        return ' ';
    }
}

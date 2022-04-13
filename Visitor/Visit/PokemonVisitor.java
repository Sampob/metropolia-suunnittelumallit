package Visitor.Visit;

import Visitor.State.CharizardState;
import Visitor.State.CharmanderState;
import Visitor.State.CharmeleonState;
import Visitor.State.DittoState;

public class PokemonVisitor implements StateVisitor {

    @Override
    public int visitState(CharmanderState state) {
        return 10;
    }

    @Override
    public int visitState(CharmeleonState state) {
        return 20;
    }

    @Override
    public int visitState(CharizardState state) {
        return 100;
    }

    @Override
    public int visitState(DittoState state) {
        return 120;
    }

}

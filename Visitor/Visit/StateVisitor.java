package Visitor.Visit;

import Visitor.State.CharizardState;
import Visitor.State.CharmanderState;
import Visitor.State.CharmeleonState;

public interface StateVisitor {
    int visitState(CharmanderState state);

    int visitState(CharmeleonState state);

    int visitState(CharizardState state);

}

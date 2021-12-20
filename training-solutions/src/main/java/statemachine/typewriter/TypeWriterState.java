package statemachine.typewriter;

public enum TypeWriterState {
    CAPS_LOCK_ON {
        @Override
        TypeWriterState next() {
            return CAPS_LOCK_OFF;
        }
    },
    CAPS_LOCK_OFF {
        @Override
        TypeWriterState next() {
            return CAPS_LOCK_ON;
        }
    };

    abstract TypeWriterState next();
}

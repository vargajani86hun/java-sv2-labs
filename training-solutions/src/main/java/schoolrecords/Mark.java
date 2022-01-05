package schoolrecords;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        checkEmptySubject(subject);
        checkEmptyTutor(tutor);
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        this(MarkType.valueOf(markType), subject, tutor);
    }

    @Override
    public String toString() {
        return markType.toString();
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    private void checkEmptySubject(Subject subject) {
        if (subject == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }

    private void checkEmptyTutor(Tutor tutor) {
        if (tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }
}

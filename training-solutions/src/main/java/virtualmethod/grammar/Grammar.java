package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb phVerb = new PhrasalVerb("mos", "el");
        Verb phVerbWSuffix = new PhrasalVerbWithSuffix("dob", "ki", "áll");

        Preposition preposition = new PhrasalVerb("vár", "ki");
        Preposition prepWSuffix = new PhrasalVerbWithSuffix("száll", "le", "ít");

        PhrasalVerb phrasalVerb = new PhrasalVerb("ül", "fel");
        PhrasalVerb phrasalVerbWSuffix = new PhrasalVerbWithSuffix(
                "ül", "fel", "tet");

        Suffix suffix = new PhrasalVerbWithSuffix("szed", "be", "et");

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix(
                "vág", "el", "tat");

        System.out.println(phVerb.getWord());
        System.out.println(phVerbWSuffix.getWord() + "\n");

        System.out.println(preposition.getPreposition() + ", " + preposition.getWholeWord());
        System.out.println(prepWSuffix.getPreposition() + ", " + prepWSuffix.getWholeWord() + "\n");

        System.out.println(phrasalVerb.getPreposition() + " + " + phrasalVerb.getWord() +
                " = " + phrasalVerb.getWholeWord());
        System.out.println(phrasalVerbWSuffix.getPreposition() + " + " +
                phrasalVerbWSuffix.getWord() + " = " + phrasalVerbWSuffix.getWholeWord() + "\n");

        System.out.println(suffix.getSuffix() + "\n");

        System.out.println(phrasalVerbWithSuffix.getPreposition() + " + " + phrasalVerbWithSuffix.getWord() +
                " + " + phrasalVerbWithSuffix.getSuffix() + " = " + phrasalVerbWithSuffix.getWholeWord());
    }
}

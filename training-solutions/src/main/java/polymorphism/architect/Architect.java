package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan planSketch = new SketchPlan(234, "Társas ház");
        Plan planPermit = new PermitPlan(468, "Irodaház",
                "Golden Office", "Érd, Ipar utca 17.");
        Plan planConstruction = new ConstructionPlan(881, "Busz pályaudvar",
                "Volán Zrt.", "Debrecen, Petőfi tér 1", 43);

        SketchPlan sketchPlan = new SketchPlan(234, "Társas ház");
        SketchPlan permitSketchPlan = new PermitPlan(468, "Irodaház",
                "Golden Office", "Érd, Ipar utca 17.");
        SketchPlan constructionSketchPlan = new ConstructionPlan(881, "Busz pályaudvar",
                "Volán Zrt.", "Debrecen, Petőfi tér 1", 43);

        Header permitPlanHeader = new PermitPlan(468, "Irodaház",
                "Golden Office", "Érd, Ipar utca 17.");
        Header constructionPlanHeader = new ConstructionPlan(881, "Busz pályaudvar",
                "Volán Zrt.", "Debrecen, Petőfi tér 1", 43);

        PermitPlan permitPlan = new PermitPlan(468, "Irodaház",
                "Golden Office", "Érd, Ipar utca 17.");
        PermitPlan constructionPermitPlan = new ConstructionPlan(881, "Busz pályaudvar",
                "Volán Zrt.", "Debrecen, Petőfi tér 1", 43);

        ConstructionPlan constructionPlan = new ConstructionPlan(881, "Busz pályaudvar",
                "Volán Zrt.", "Debrecen, Petőfi tér 1", 43);

        System.out.println(planSketch.getPagesOfDocumentation() + ", " +
                planPermit.getPagesOfDocumentation() + ", " +
                planConstruction.getPagesOfDocumentation() + "\n");

        System.out.println(sketchPlan.getTitle() + ": " + sketchPlan.getPagesOfDocumentation());
        System.out.println(permitSketchPlan.getTitle() + ": " + permitSketchPlan.getPagesOfDocumentation());
        System.out.println(constructionSketchPlan.getTitle() + ": " + constructionSketchPlan.getPagesOfDocumentation());
        System.out.println();

        System.out.println("Építtető: " + permitPlanHeader.getNameOfClient() + ", helyszín: " +
                permitPlanHeader.getAddressOfBuilding());
        System.out.println("Építtető: " + constructionPlanHeader.getNameOfClient() + ", helyszín: " +
                constructionPlanHeader.getAddressOfBuilding());
        System.out.println();

        System.out.println(permitPlan.getHeader());
        System.out.println(permitPlan.getTitle() + ", " + permitPlan.getPagesOfDocumentation() +
                "\nÉpíttető: " + permitPlan.getNameOfClient() + ", helyszín: " +
                permitPlan.getAddressOfBuilding());
        System.out.println(constructionPermitPlan.getHeader());
        System.out.println(constructionPermitPlan.getTitle() + ", " + constructionPermitPlan.getPagesOfDocumentation() +
                "\nÉpíttető: " + constructionPermitPlan.getNameOfClient() + ", helszín: " +
                constructionPermitPlan.getAddressOfBuilding());
        System.out.println();

        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getTitle() + ", " + constructionPlan.getPagesOfDocumentation() +
                "\nÉpíttető: " + constructionPlan.getNameOfClient() + ", helyszín: " +
                constructionPlan.getAddressOfBuilding() + "\nTervrajzok: " +
                constructionPlan.getSheetsOfConstructionDrawings() + "db");
    }
}

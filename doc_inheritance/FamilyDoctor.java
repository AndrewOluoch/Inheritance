package doc_inheritance;

public class FamilyDoctor extends Doctor {
    private String makesHouseCalls;

    public FamilyDoctor(String worksAtHospital, String makesHouseCalls) {
        super(worksAtHospital);
        this.makesHouseCalls = makesHouseCalls;
    }

    public void giveAdvice() {
        System.out.println();
    }

    public String toString() {
        return "FamilyDoctor{makesHouseCalls='" + this.makesHouseCalls + '\'' + '}';
    }
}

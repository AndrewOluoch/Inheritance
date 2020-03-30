package doc_inheritance;

public class Surgeon extends Doctor {
    private String makesHouseCalls;

    public Surgeon(String worksAtHospital, String makesHouseCalls) {
        super(worksAtHospital);
        this.makesHouseCalls = makesHouseCalls;
    }

    public void makeIncisions() {
        System.out.println();
    }

    public String toString() {
        return "Surgeon{makesHouseCalls='" + this.makesHouseCalls + '\'' + '}';
    }
}
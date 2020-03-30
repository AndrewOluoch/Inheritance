package doc_inheritance;

public class Doctor {
    public String worksAtHospital;

    public Doctor(String worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    public void treatPatient() {
        System.out.println();
    }

    public String toString() {
        return "Doctor{worksAtHospital='" + this.worksAtHospital + '\'' + '}';
    }
}
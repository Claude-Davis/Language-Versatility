public interface Animal {
    private String name;
    private int age;
    private char sex;
    private float weight;
    private float height;
    private Boolean has_owner;


    void registerPatient();

    void checkinGuest();

    void pullPatientRecords();

    void updatePatientRecords();
}

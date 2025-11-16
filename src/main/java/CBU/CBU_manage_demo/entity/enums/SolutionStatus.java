package CBU.CBU_manage_demo.entity.enums;

public enum SolutionStatus {
    SOLVING(1, "해결중"),
    SUCCESS(2, "해결"),
    FAIL(3, "실패");

    private final int statusLevel;
    private final String statusDescription;

    SolutionStatus(int statusLevel, String statusDescription) {
        this.statusLevel = statusLevel;
        this.statusDescription = statusDescription;
    }

    public int getStatusLevel(){
        return statusLevel;
    }

    public String getStatusDescription(){
        return statusDescription;
    }
}

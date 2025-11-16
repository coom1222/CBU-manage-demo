package CBU.CBU_manage_demo.entity.enums;

public enum ProblemGrade {
    BRONZE(1, "브론즈"),
    SILVER(2, "실버"),
    GOLD(3,"골드"),
    PLATINUM(3,"플레티넘"),
    DIAMOND(3,"다이아");

    private final int problemLevel;
    private final String problemDescription;

    ProblemGrade(int problemLevel, String problemDescription) {
        this.problemLevel = problemLevel;
        this.problemDescription = problemDescription;
    }

    public int getProblemLevel() {
        return problemLevel;
    }

    public String getProblemDescription() {
        return problemDescription;
    }
}

package CBU.CBU_manage_demo.entity.enums;

public enum Role {
    GUEST(1, "손님"), LOGIN(2, "동아리 회원"), ADMIN(3,"관리자");

    private final int level;
    private final String description;

    Role(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}

package CBU.CBU_manage_demo.entity;

import CBU.CBU_manage_demo.entity.enums.SolutionStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "Solution")
public class Solution{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long solutionId;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String codContent;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SolutionStatus status; // 예: SOLVING, SUCCESS, FAILED

}
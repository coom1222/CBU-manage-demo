package CBU.CBU_manage_demo.entity;

import CBU.CBU_manage_demo.entity.enums.ProblemGrade;
import jakarta.persistence.*;

@Entity
@Table(name = "Problem")
public class Problem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    public String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    public String content;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String inputDescription;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String outputDescription;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProblemGrade grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "platformId")
    private Platform platform;

}

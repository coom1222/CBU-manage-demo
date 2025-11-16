package CBU.CBU_manage_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Platform")
public class Platform {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long platformId;

    @Column(nullable = false, unique = true)
    private String platformName;
}

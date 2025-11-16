package CBU.CBU_manage_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Category")
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(nullable = false, unique = true)
    private String categoryName;
}

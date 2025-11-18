package CBU.CBU_manage_demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name="Post")
// Soft Delete 설정
@SQLDelete(sql = "UPDATE Post SET deleted_at = current_timestamp WHERE post_id = ?")
@Where(clause = "deleted_at is null")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_id")
    private Long id;

    private Long userId;

    private String title;

    private String content;

    private LocalDateTime deletedAt;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private int category;

    public Post(Long userId, String title, String content, int category) {
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.category = category;
        this.createdAt = LocalDateTime.now();
    }
}


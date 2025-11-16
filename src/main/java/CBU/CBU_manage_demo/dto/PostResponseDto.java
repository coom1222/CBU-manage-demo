package CBU.CBU_manage_demo.dto;

import CBU.CBU_manage_demo.entity.Post;
import lombok.Getter;

import java.time.LocalDateTime;
// 클라이언트에게 응답으로 보낼 게시글 정보를 담을 DTO
@Getter
public class PostResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final Long userId;
    private final int category;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public PostResponseDto(Post entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.userId = entity.getUserId();
        this.category = entity.getCategory();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdatedAt();
    }
}

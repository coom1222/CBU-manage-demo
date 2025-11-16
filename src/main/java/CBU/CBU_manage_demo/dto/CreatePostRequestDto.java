package CBU.CBU_manage_demo.dto;

import CBU.CBU_manage_demo.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 생성 요청 시 클라이언트가 보내는 데이터를 담을 DTO
@Getter
@NoArgsConstructor
public class CreatePostRequestDto {

    private String title;
    private String content;
    private int category;
    private Long userId;

    public Post toEntity() {
        return new Post(userId, title, content, category);
    }
}

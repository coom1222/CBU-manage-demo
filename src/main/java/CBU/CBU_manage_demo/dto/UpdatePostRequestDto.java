package CBU.CBU_manage_demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdatePostRequestDto {
    private String title;
    private String content;
    private int category;
}

package CBU.CBU_manage_demo.controller;

import CBU.CBU_manage_demo.dto.CreatePostRequestDto;
import CBU.CBU_manage_demo.dto.PostResponseDto;
import CBU.CBU_manage_demo.dto.UpdatePostRequestDto;
import CBU.CBU_manage_demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    // Create Post
    @PostMapping
    public ResponseEntity<Long> create(@RequestBody CreatePostRequestDto requestDto) {
        Long postId = postService.create(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(postId);
    }

    // 단건 조회
    @GetMapping("/{postId}")
    public ResponseEntity<PostResponseDto> findById(@PathVariable Long postId) {
        PostResponseDto responseDto = postService.findById(postId);
        return ResponseEntity.ok(responseDto);
    }

    // 전체 조회
    @GetMapping
    public ResponseEntity<List<PostResponseDto>> findAll() {
        List<PostResponseDto> responseDtoList = postService.findAll();
        return ResponseEntity.ok(responseDtoList);
    }

    // Update Post
    @PatchMapping("/{postId}")
    public ResponseEntity<Long> update(@PathVariable Long postId, @RequestBody UpdatePostRequestDto requestDto) {
        Long updatedPostId = postService.update(postId, requestDto);
        return ResponseEntity.ok(updatedPostId);
    }

    // Delete Post
    @DeleteMapping("/{postId}")
    public ResponseEntity<Void> delete(@PathVariable Long postId) {
        postService.delete(postId);
        return ResponseEntity.noContent().build();
    }
}


package CBU.CBU_manage_demo.service;

import CBU.CBU_manage_demo.dto.CreatePostRequestDto;
import CBU.CBU_manage_demo.dto.PostResponseDto;
import CBU.CBU_manage_demo.dto.UpdatePostRequestDto;
import CBU.CBU_manage_demo.entity.Post;
import CBU.CBU_manage_demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Long create(CreatePostRequestDto requestDto) {
        Post post = requestDto.toEntity();
        Post savedPost = postRepository.save(post);
        return savedPost.getId();
    }

    @Transactional()
    public PostResponseDto findById(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + postId));

        return new PostResponseDto(post);
    }

    @Transactional()
    public List<PostResponseDto> findAll() {
        List<Post> posts = postRepository.findAll();

        return posts.stream()
                .map(PostResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long update(Long postId, UpdatePostRequestDto requestDto) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + postId));

        post.setTitle(requestDto.getTitle());
        post.setContent(requestDto.getContent());
        post.setCategory(requestDto.getCategory());
        post.setUpdatedAt(LocalDateTime.now());

        return postId;
    }

    @Transactional
    public void delete(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + postId));

        postRepository.delete(post);
    }
}

// UserProfile.java
@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String age;
    private String gender;
    private String diagnosis;

    // Getters and setters
}

// VideoFeedback.java
@Entity
public class VideoFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String videoId;
    private boolean liked;

    // Getters and setters
}

// UserRepository.java
public interface UserRepository extends JpaRepository<UserProfile, Long> {}

// FeedbackRepository.java
public interface FeedbackRepository extends JpaRepository<VideoFeedback, Long> {}

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping("/submitQuestionnaire")
    public ResponseEntity<String> submitQuestionnaire(@RequestBody UserProfile userProfile) {
        userRepository.save(userProfile);
        return ResponseEntity.ok("Questionnaire Submitted");
    }

    @PostMapping("/submitFeedback")
    public ResponseEntity<String> submitFeedback(@RequestBody VideoFeedback feedback) {
        feedbackRepository.save(feedback);
        return ResponseEntity.ok("Feedback Submitted");
    }
}



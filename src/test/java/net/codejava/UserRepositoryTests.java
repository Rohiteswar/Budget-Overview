package net.codejava;
import static org.assertj.core.api.Assertions.assertThat;
 
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository repo;
    
    @Autowired
    private HistoryRepository heRepo;
     
    // test methods go below
//    @Test
//    public void testCreateUser() {
//        User user = new User();
//        user.setEmail("karun@gmail.com");
//        user.setPassword("karun1126");
//        user.setName("KarunKumar");
//        user.setPhone("9515165652");
//         
//        User savedUser = repo.save(user);
//         
//        User existUser = entityManager.find(User.class, savedUser.getId());
//         
//        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
//        assertThat(user.getName()).isEqualTo(existUser.getName());    
//    }
//    
//    @Test
//    public void testHistory() {
//    	History  history = new History();
//    	history.setType("Desktop Application");
//    	history.setTime("3 months");
//    	history.setTeam("100 members");
//    	history.setBudget("30000");
//    	
//    	History savedHistory = heRepo.save(history);
//    	
//    }
//    
//    @Test
//    public void testFindUserByEmail()
//    {
//    	String email = "kumar@gmail.com";
//    	User user = repo.findByEmail(email);
//    	assertThat(user).isNotNull();
//    }
    
    
}
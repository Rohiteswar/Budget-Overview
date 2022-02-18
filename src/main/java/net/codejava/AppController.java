package net.codejava;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 
@Controller
public class AppController {
 
    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private FeedbackRepository feedRepo;
    
    @Autowired
    private ApplyProjectRepository ApRepo;
    
    @Autowired
    private TestimonialRepository teRepo;
    
    @Autowired
    private TechniquesRepository techRepo;
    
    @Autowired
    private HistoryRepository heRepo;
    
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/about")
    public String viewAboutPage() {
        return "about";
    }
    
    @GetMapping("/admin")
    public String viewAdminPage() {
        return "admin_login";
    }
    
    @GetMapping("/main")
    public String viewAdminMainPage() {
        return "admin";
    }
    
    @GetMapping("/techniques")
    public String viewTechniquesPage(Model model) {
    	List<Techniques> listTechniques = techRepo.findAll();
    	model.addAttribute("listTechniques", listTechniques);
    	model.addAttribute("techniques", new Techniques());
        return "techniques";
    }

    
    @GetMapping("/contact")
    public String viewContactPage(Model model) {
    	model.addAttribute("feedback", new Feedback());
        return "contact";
    }
    
    @GetMapping("/history")
    public String viewSimilarProjectPage(Model model) {
    	List<History> listHistory = heRepo.findAll();
    	model.addAttribute("listHistory", listHistory);
    	model.addAttribute("history", new History());
        return "similar";
    }
    
    @GetMapping("/services")
    public String viewServicePage() {
        return "services";
    }
    
    @GetMapping("/testimonial")
    public String viewTestimonialPage(Model model) {
    	model.addAttribute("testimonial", new Testimonial());
        return "testimonials";
    }
    
    @GetMapping("/apply")
    public String viewApplyProjectPage(Model model) {
    	model.addAttribute("apply", new ApplyProject());
        return "apply_project";
    }
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "signup_form";
    }
    
    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
    	userRepo.save(user);     
        return "register_success";
    }
    
    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "users";
    }
    
    @GetMapping("/user")
    public String listUser(Model model) {
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "user";
    }
    
    @PostMapping("/process_feedback")
    public String processFeedback(Feedback feedback) {
    	feedRepo.save(feedback);     
        return "users";
    }
    
    @PostMapping("/process_apply")
    public String processFeedback(ApplyProject applyproject) {
    	ApRepo.save(applyproject);     
        return "services";
    }
    
    @PostMapping("/process_testimonial")
    public String processTestimonial(Testimonial testimonial) {
    	teRepo.save(testimonial);     
        return "testimonials";
    }
   
}
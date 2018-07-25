package database.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import DB.Group;
//import DB.GroupRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private StudentRepository studentRepository;
//    private GroupRepository groupRepository;

	@GetMapping(path="/addStudent") // Map ONLY GET Requests
	public @ResponseBody String addNewStudent (@RequestParam String name
			, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Student n = new Student();
		n.setName(name);
		n.setEmail(email);
		studentRepository.save(n);
		return "Saved";
	}

//    @GetMapping(path="/addGroup")
//    public @ResponseBody String addNewGroup (@RequestParam String name, @RequestParam String email) {
//        Group n = new Group();
//        n.setName(name);
//        n.setEmail(email);
//        groupRepository.save(n);
//        return "Saved";
//    }

	@GetMapping(path="/allStudents")
	public @ResponseBody Iterable<Student> getAllStudents() {
		// This returns a JSON or XML with the users
		return studentRepository.findAll();
	}

//    @GetMapping(path="/allGroups")
//    public @ResponseBody Iterable<Group> getAllGroups() {
//        // This returns a JSON or XML with the users
//        return groupRepository.findAll();
//    }
}

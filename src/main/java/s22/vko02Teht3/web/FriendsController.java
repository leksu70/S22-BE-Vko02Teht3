package s22.vko02Teht3.web;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import s22.vko02Teht3.domain.Friend;

@Controller
public class FriendsController {
	
	public ArrayList<Friend> friends;

	@GetMapping("/index")
	public String getController(Model model) {
		
		// GET alustaa listan
		friends = new ArrayList<Friend>();
		
		// Lisätään modeliin
		model.addAttribute("friend", new Friend());
		return "index";
	}
	
	@PostMapping("/index")
	public String postController(
			@Valid Friend friend, 
			BindingResult bindingResult,
			Model model) {
		
		//System.out.print("length: " + friend.getName().length());
		// Jos ei virheitä
		if( !bindingResult.hasErrors() && friend.getName().length() != 0) {
			// Lisätään listaan
			friends.add(friend);
		}
				
		// Lisätään modeliin
		model.addAttribute("friends", friends);
		return "result";
		
	}
}

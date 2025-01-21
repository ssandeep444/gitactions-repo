package com.example.swag;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GitActController {
	
	@GetMapping("/")
	public String getM() {
		return "welcome to GIT Actions";
	}
	
	
//	echo "# gitactions-repo" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/ssandeep444/gitactions-repo.git
//	git push -u origin main

}

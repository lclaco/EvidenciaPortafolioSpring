/**
 * 
 */
package com.cft.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Infoseg
 *
 */

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}

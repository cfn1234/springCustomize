package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * 〈功能详细描述〉
 * com.test
 *
 * @author caofengnian 2019/4/29 0029 13:50
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
public class HelloController {


	@GetMapping("/hello")
	public String hello(){

		return null;
	}

}

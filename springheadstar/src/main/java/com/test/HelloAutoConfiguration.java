package com.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <br>
 * 〈功能详细描述〉
 * com.test
 *
 * @author caofengnian 2019/4/29 0029 11:21
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Configuration
@ConditionalOnWebApplication //web应用才生效
public class HelloAutoConfiguration  extends WebMvcConfigurerAdapter {
//@ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true)
	/**
	 * <p>Title:</p>
	 * <p>Description:重写增加自定义拦截器的注册，某一个拦截器需要先注册进来，才能工作</p>
	 * param[1]: null
	 * return:
	 * exception:
	 * date:2018/4/18 0018 下午 17:29
	 * author:段美林[duanml@neusoft.com]
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addWebRequestInterceptor(new SpringInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}

}

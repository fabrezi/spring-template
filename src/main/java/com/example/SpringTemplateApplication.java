package com.example;

import com.example.springtemplate.UserEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(
		repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class,
		basePackageClasses = UserEntity.class)
public class SpringTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTemplateApplication.class, args);
	}

}

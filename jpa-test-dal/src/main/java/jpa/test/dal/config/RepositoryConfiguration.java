package jpa.test.dal.config;

import jpa.test.model.pojo.AdApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
//@EntityScan(basePackageClasses = {AdApplication.class})
//@MapperScan(basePackages = "com.bangdao.adserving.common.dal.mapper")
public class RepositoryConfiguration {

}

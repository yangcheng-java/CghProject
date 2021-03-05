package cn.ekgc.cgh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>智慧公务车信息平台-系统功能 Consumer 启动类</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class CghSystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(CghSystemConsumerStarter.class,args);
	}
}

package top.buukle.activiti.web;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan({"top.buukle.activiti.dao","top.buukle.common.mvc"})
@SpringBootApplication(scanBasePackages={"top.buukle.*"},exclude = SecurityAutoConfiguration.class)
@EnableFeignClients(basePackages = {"top.buukle.*"})
@EnableRedisHttpSession
@EnableTransactionManagement
public class ActivitiApplication {
    private static volatile boolean RUNNING = true;
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ActivitiApplication.class, args);
        System.out.println("启动成功");
        synchronized (ActivitiApplication.class) {
            while (RUNNING) {
                try {
                    ActivitiApplication.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    SpringApplication.exit(context);
                }
            }
        }
    }
}

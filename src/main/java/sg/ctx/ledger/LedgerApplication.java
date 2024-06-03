package sg.ctx.ledger;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author yumiao
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableScheduling
@MapperScan("sg.ctx.ledger.repository")
@ComponentScan("sg.ctx")
public class LedgerApplication implements ApplicationRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(LedgerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LedgerApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info("Ledger application v2 start ...");
    }

}

package br.com.category.template;

@SpringBootApplication
@EnableFeignClients
@Slf4j
public class Application {
    public static void main(final String[] args){
        SpringApplication.run(Application.class, args);
    }
}
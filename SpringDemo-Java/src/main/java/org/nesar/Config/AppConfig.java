package org.nesar.Config;

import org.nesar.Computer;
import org.nesar.Desktop;
import org.nesar.Laptop;
import org.nesar.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.nesar")
public class AppConfig {

//    @Bean
//    public Programmer programmer(Computer com) {
//        Programmer programmer = new Programmer();
//        programmer.setAge(25);
//        programmer.setCom(com);
//        return programmer;
//    }

//    @Bean
//    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean()
//    @Scope("prototype")
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}

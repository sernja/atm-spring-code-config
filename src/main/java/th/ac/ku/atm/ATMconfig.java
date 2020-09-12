package th.ac.ku.atm;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class ATMconfig {

    @Bean
    public DataSource dataSource(){
        return new DataSourceDB();
    }

    @Bean
    public Bank bank(){
        return new Bank("My bank", dataSource());
    }

    @Bean
    public ATM atm(){
        return new ATM(bank());
    }
}

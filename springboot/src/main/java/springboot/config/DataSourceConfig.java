package springboot.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
@Configurable
public class DataSourceConfig  {
//   @Bean
//   public DataSource dataSource(){
//
//      SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//      return dataSource;
//
//   }
   @Bean
   public JdbcTemplate ptppmcJdbcTemplate(DataSource dataSource) {
      return new JdbcTemplate(dataSource);
   }

}

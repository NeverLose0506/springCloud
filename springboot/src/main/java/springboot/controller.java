package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private JdbcTemplate jdbcTemplate;
  @GetMapping("/ll")
    public Object s(){
       return jdbcTemplate.queryForMap("SELECT * from property_bill LIMIT 1");
    }
}

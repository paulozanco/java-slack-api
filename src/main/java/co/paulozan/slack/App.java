package co.paulozan.slack;

import co.pauloza.slack.domain.HealthCheck;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 */
public class App {


  public static void main(String[] args) {
    try {
      HealthCheck bean = new HealthCheck();
      String result = new ObjectMapper().writeValueAsString(bean);
      System.out.println(result);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

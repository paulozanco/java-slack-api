package co.pauloza.slack.domain;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Map;
import lombok.Data;

/**
 * Created by pzanco on 11/06/17.
 */

@Data
public class HealthCheck {

  @Data
  @JsonRootName(value = "args")
  class Arguments {

    private Map<String, String> properties;

    @JsonAnyGetter
    public Map<String, String> getProperties() {
      return properties;
    }

  }

  private String status;
  private String message;
  private Arguments args;

}

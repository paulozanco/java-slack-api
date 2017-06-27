package co.paulozan.slack.domain;

import co.paulozan.slack.parser.JsonParser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;
import lombok.Data;

/**
 * Created by pzanco on 26/06/17.
 */
@Data
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelsRequest {

  @Data
  @JsonInclude(Include.NON_NULL)
  @JsonIgnoreProperties(ignoreUnknown = true)
  public class History{
    private final String token;
    private final String channel;

    public Map<String, Object> toMap() throws Exception{
      return JsonParser.toMap(this);
    }
  }

}

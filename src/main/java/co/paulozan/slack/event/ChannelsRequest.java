package co.paulozan.slack.event;

import co.paulozan.slack.parser.JsonParser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Builder
@Data
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelsRequest {

  @Builder
  @Value
  public static class History {

    String token;
    String channel;

    public Map<String, Object> toMap() throws Exception {
      return JsonParser.toMap(this);
    }
  }

}

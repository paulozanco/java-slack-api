package co.paulozan.slack;

import co.pauloza.slack.domain.HealthCheck;
import feign.Headers;
import feign.RequestLine;

/**
 * Created by pzanco on 11/06/17.
 */
public interface API {

  @RequestLine("/api.test")
  @Headers("Content-Type: application/x-www-form-urlencoded")
  public HealthCheck test();

}

/*
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 *   The full license can be found online at http://www.gnu.org/copyleft/gpl.html
 *
 */

package co.paulozan.slack.domain;

/**
 * Created by pzanco on 17/06/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

/*
{
        "token": "XXYYZZ",
        "team_id": "TXXXXXXXX",
        "api_app_id": "AXXXXXXXXX",
        "event": {
                "type": "name_of_event",
                "event_ts": "1234567890.123456",
                "user": "UXXXXXXX1",
                ...
        },
        "type": "event_callback",
        "authed_users": [
                "UXXXXXXX1",
                "UXXXXXXX2"
        ],
        "event_id": "Ev08MFMKH6",
        "event_time": 1234567890
}
 */


@Data
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

  private String challenge;
  private String token;
  @JsonProperty("team_id")
  private String teamId;
  @JsonProperty("api_app_id")
  private String apiAppId;
  private Event event;
  private String type;
  private String channel;
  private String user;
  private String text;
  private String ts;
  @JsonProperty("authed_users")
  private List<String> authedUsers;
  @JsonProperty("event_id")
  private String eventId;
  @JsonProperty("event_time")
  private String eventTime;

}

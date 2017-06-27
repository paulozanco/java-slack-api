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
    "ok": true,
    "latest": "1358547726.000003",
    "messages": [
        {
            "type": "message",
            "ts": "1358546515.000008",
            "user": "U2147483896",
            "text": "Hello"
        },
        {
            "type": "message",
            "ts": "1358546515.000007",
            "user": "U2147483896",
            "text": "World",
            "is_starred": true,
            "reactions": [
                {
                    "name": "space_invader",
                    "count": 3,
                    "users": [ "U1", "U2", "U3" ]
                },
                {
                    "name": "sweet_potato",
                    "count": 5,
                    "users": [ "U1", "U2", "U3", "U4", "U5" ]
                }
            ]
                    },
        {
            "type": "something_else",
            "ts": "1358546515.000007",
            "wibblr": true
        }
    ],
    "has_more": false
}
*/

@Data
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelsResponse {

  private Boolean ok;
  private String error;
  private List<Message> messages;
  @JsonProperty("has_more")
  private Boolean hasMore;

}

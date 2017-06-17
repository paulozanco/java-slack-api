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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/*
 {
 "id": "T654321",
 "name": "Librarian Society of Soledad",
 "domain": "libsocos",
 "enterprise_id": "E234567",
 "enterprise_name": "Intercontinental Librarian Society"
 }
*/
@Data
@JsonInclude(Include.NON_NULL)
public class Team {

  private String id;
  private String name;
  private String domain;
  @JsonProperty("enterprise_id")
  private String enterpriseId;
  @JsonProperty("enterprise_name")
  private String enterpriseName;

}

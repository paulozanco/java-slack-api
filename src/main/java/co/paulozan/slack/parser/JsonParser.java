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

package co.paulozan.slack.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by pzanco on 18/06/17.
 */
public class JsonParser {

  private static Logger logger = LoggerFactory.getLogger(JsonParser.class);

  public static ObjectMapper mapper = new ObjectMapper();

  public static Optional<Object> readValue(String json, Class valueType) {
    try {
      logger.debug("Received json string to parser [{}] of type {}",json,valueType);
      Object object = mapper.readValue(json, valueType);
      return Optional.fromNullable(object);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return Optional.fromNullable(null);
    }
  }

}
